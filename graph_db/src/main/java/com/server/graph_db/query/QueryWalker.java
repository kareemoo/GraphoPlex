package com.server.graph_db.query;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ErrorNode;

import com.server.graph_db.database.GlobalDatabaseService;
import com.server.graph_db.index.GlobalSecondaryIndexManager;
import com.server.graph_db.parser.QlBaseListener;
import com.server.graph_db.parser.QlParser.Create_databaseContext;
import com.server.graph_db.parser.QlParser.Create_edgeContext;
import com.server.graph_db.parser.QlParser.Create_indexContext;
import com.server.graph_db.parser.QlParser.Create_vertexContext;
import com.server.graph_db.parser.QlParser.Crud_commandContext;
import com.server.graph_db.parser.QlParser.Database_commandContext;
import com.server.graph_db.parser.QlParser.Delete_databaseContext;
import com.server.graph_db.parser.QlParser.Delete_edgeContext;
import com.server.graph_db.parser.QlParser.Delete_indexContext;
import com.server.graph_db.parser.QlParser.Delete_vertexContext;
import com.server.graph_db.parser.QlParser.DestinationIdContext;
import com.server.graph_db.parser.QlParser.Drop_databaseContext;
import com.server.graph_db.parser.QlParser.Drop_default_databaseContext;
import com.server.graph_db.parser.QlParser.IdContext;
import com.server.graph_db.parser.QlParser.LabelContext;
import com.server.graph_db.parser.QlParser.PropertiesContext;
import com.server.graph_db.parser.QlParser.PropertyContext;
import com.server.graph_db.parser.QlParser.Set_clauseContext;
import com.server.graph_db.parser.QlParser.Set_itemContext;
import com.server.graph_db.parser.QlParser.SourceIdContext;
import com.server.graph_db.parser.QlParser.Switch_databaseContext;
import com.server.graph_db.parser.QlParser.Switch_database_to_defaultContext;
import com.server.graph_db.parser.QlParser.Update_edgeContext;
import com.server.graph_db.parser.QlParser.Update_vertexContext;
import com.server.graph_db.query.crud.CrudQuery;
import com.server.graph_db.query.crud.crudcommands.edgecommands.CreateEdgeCommand;
import com.server.graph_db.query.crud.crudcommands.edgecommands.DeleteEdgeCommand;
import com.server.graph_db.query.crud.crudcommands.edgecommands.UpdateEdgeCommand;
import com.server.graph_db.query.crud.crudcommands.indexcommands.CreateIndexCommand;
import com.server.graph_db.query.crud.crudcommands.indexcommands.DeleteIndexCommand;
import com.server.graph_db.query.crud.crudcommands.vertexcommands.CreateVertexCommand;
import com.server.graph_db.query.crud.crudcommands.vertexcommands.DeleteVertexCommand;
import com.server.graph_db.query.crud.crudcommands.vertexcommands.UpdateVertexCommand;
import com.server.graph_db.query.databaseconfig.DatabaseConfigQuery;
import com.server.graph_db.query.databaseconfig.databaseconfigcommands.CreateDatabaseCommand;
import com.server.graph_db.query.databaseconfig.databaseconfigcommands.DeleteDatabaseCommand;
import com.server.graph_db.query.databaseconfig.databaseconfigcommands.DropDatabaseCommand;
import com.server.graph_db.query.databaseconfig.databaseconfigcommands.DropDefaultCommand;
import com.server.graph_db.query.databaseconfig.databaseconfigcommands.SwitchDatabaseCommand;
import com.server.graph_db.query.databaseconfig.databaseconfigcommands.SwitchToDefaultCommand;
import com.server.graph_db.vertex.GlobalVertexService;

public class QueryWalker extends QlBaseListener {

    Query query;
    Map<String, String> ruleMapping = new HashMap<String, String>();

    GlobalVertexService globalVertexService;
    GlobalSecondaryIndexManager  globalSecondaryIndexManager;
    GlobalDatabaseService globalDatabaseService;

    public QueryWalker(GlobalVertexService globalVertexService, GlobalSecondaryIndexManager globalSecondaryIndexManager, GlobalDatabaseService globalDatabaseService) {
        this.globalVertexService = globalVertexService;
        this.globalSecondaryIndexManager = globalSecondaryIndexManager;
        this.globalDatabaseService = globalDatabaseService;
    }

    @Override
    public void enterCrud_command(Crud_commandContext ctx) {
        query = new CrudQuery(globalVertexService, globalSecondaryIndexManager);
    }

    @Override
    public void enterDatabase_command(Database_commandContext ctx) {
        query = new DatabaseConfigQuery(globalDatabaseService);
    }

    @Override
    public void exitCreate_vertex(Create_vertexContext ctx) {
        // create builder for create vertex command
        IdContext idContext = ctx.id();
        CreateVertexCommand.Builder builder = new CreateVertexCommand.Builder(idContext.getText());
        LabelContext labelContext = ctx.label();
        if (labelContext != null) {
            builder.setLabel(labelContext.getText());
        }
        PropertiesContext propertiesContext = ctx.properties();
        if (propertiesContext != null) {
            // get the context of property
            List<PropertyContext> propertyContext = propertiesContext.property();
            Map<String, String> properties = new HashMap<String, String>();
            for (PropertyContext property : propertyContext) {
                properties.put(property.key().getText(), property.value().getText());
            }
            builder.setProperties(properties);
        }

        // add the command to the query
        query.setCommand(builder.build());
    }

    @Override
    public void exitUpdate_vertex(Update_vertexContext ctx) {
        // get id , label and set clause 
        IdContext idContext = ctx.id();
        Set_clauseContext setClauseContext = ctx.set_clause();

        Map<String, String> properties = new HashMap<String, String>();
        //loop on set items
        List<Set_itemContext> setItemContexts = setClauseContext.set_item();
        for (Set_itemContext setItemContext : setItemContexts) {
            properties.put(setItemContext.key().getText(), setItemContext.value().getText());
        }

        // create builder for update vertex command
        UpdateVertexCommand.Builder builder = new UpdateVertexCommand.Builder(idContext.getText(), properties);
        query.setCommand(builder.build());
    }

    @Override
    public void exitDelete_vertex(Delete_vertexContext ctx) {
        IdContext idContext = ctx.id();
        query.setCommand(new DeleteVertexCommand(idContext.getText()));
    }

    @Override
    public void exitCreate_edge(Create_edgeContext ctx) {
        SourceIdContext sourceIdContext = ctx.sourceId();
        DestinationIdContext destinationIdContext = ctx.destinationId();
        String label = ctx.label()==null?"":ctx.label().getText();
        CreateEdgeCommand.Builder builder = new CreateEdgeCommand.Builder(sourceIdContext.getText(), destinationIdContext.getText(), label );
        PropertiesContext propertiesContext = ctx.properties();
        if(propertiesContext!=null){
        List<PropertyContext> propertyContext = propertiesContext.property();
        Map<String, String> properties = new HashMap<String, String>();
        for (PropertyContext property : propertyContext) {
            properties.put(property.key().getText(), property.value().getText());
        }

        builder.setProperties(properties);
        }

        query.setCommand(builder.build());
    }

    @Override
    public void exitUpdate_edge(Update_edgeContext ctx) {
        String sourceId = ctx.sourceId().getText();
        String destinationId = ctx.destinationId().getText();
        Set_clauseContext setClauseContext = ctx.set_clause();
        Map<String, String> properties = new HashMap<String, String>();
        //loop on set items
        List<Set_itemContext> setItemContexts = setClauseContext.set_item();
        for (Set_itemContext setItemContext : setItemContexts) {
            properties.put(setItemContext.key().getText(), setItemContext.value().getText());
        }
        String label = ctx.label()==null?"":ctx.label().getText();

        UpdateEdgeCommand.Builder builder = new UpdateEdgeCommand.Builder(sourceId, destinationId, label, properties);
        query.setCommand(builder.build());

    }

    @Override
    public void exitDelete_edge(Delete_edgeContext ctx) {
        String sourceId = ctx.sourceId().getText();
        String destinationId = ctx.destinationId().getText();
        String label = ctx.label()==null?"":ctx.label().getText();

        DeleteEdgeCommand.Builder builder = new DeleteEdgeCommand.Builder(sourceId, destinationId, label);
        query.setCommand(builder.build());
    }

    @Override
    public void exitCreate_index(Create_indexContext ctx) {
        String key = ctx.key().getText();
        CreateIndexCommand.Builder builder = new CreateIndexCommand.Builder(key);
        query.setCommand(builder.build());
    }

    @Override
    public void exitDelete_index(Delete_indexContext ctx) {
        String key = ctx.key().getText();
        DeleteIndexCommand.Builder builder = new DeleteIndexCommand.Builder(key);
        query.setCommand(builder.build());
    }

    @Override
    public void exitCreate_database(Create_databaseContext ctx) {
        String databaseName = ctx.database_name().getText();
        CreateDatabaseCommand createDatabaseCommand = new CreateDatabaseCommand(databaseName);
        query.setCommand(createDatabaseCommand);
    }

    @Override
    public void exitDelete_database(Delete_databaseContext ctx) {
        String databaseName = ctx.database_name().getText();
        DeleteDatabaseCommand deleteDatabaseCommand = new DeleteDatabaseCommand(databaseName);
        query.setCommand(deleteDatabaseCommand);
    }

    @Override
    public void exitSwitch_database(Switch_databaseContext ctx) {
        String databaseName = ctx.database_name().getText();
        SwitchDatabaseCommand switchDatabaseCommand = new SwitchDatabaseCommand(databaseName);
        query.setCommand(switchDatabaseCommand);
    }

    @Override
    public void exitDrop_database(Drop_databaseContext ctx) {
        String databaseName = ctx.database_name().getText();
        DropDatabaseCommand dropDatabaseCommand = new DropDatabaseCommand(databaseName);
        query.setCommand(dropDatabaseCommand);
    }

    @Override
    public void exitSwitch_database_to_default(Switch_database_to_defaultContext ctx) {
        SwitchToDefaultCommand switchToDefaultDatabaseCommand = new SwitchToDefaultCommand();
        query.setCommand(switchToDefaultDatabaseCommand);
    }

    @Override
    public void exitDrop_default_database(Drop_default_databaseContext ctx) {
        DropDefaultCommand dropDefaultDatabaseCommand = new DropDefaultCommand();
        query.setCommand(dropDefaultDatabaseCommand);
    }

    



    // throw error when cannot match the query
    @Override
    public void visitErrorNode(ErrorNode node) {
        throw new RuntimeException("Syntax error in query");
    }

    public Query getQuery() {
        return query;
    }

}