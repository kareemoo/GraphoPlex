// Generated from Ql.g4 by ANTLR 4.7.2
package com.server.graph_db.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QlParser}.
 */
public interface QlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QlParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(QlParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(QlParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#crud_command}.
	 * @param ctx the parse tree
	 */
	void enterCrud_command(QlParser.Crud_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#crud_command}.
	 * @param ctx the parse tree
	 */
	void exitCrud_command(QlParser.Crud_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#vertex_command}.
	 * @param ctx the parse tree
	 */
	void enterVertex_command(QlParser.Vertex_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#vertex_command}.
	 * @param ctx the parse tree
	 */
	void exitVertex_command(QlParser.Vertex_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#edge_command}.
	 * @param ctx the parse tree
	 */
	void enterEdge_command(QlParser.Edge_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#edge_command}.
	 * @param ctx the parse tree
	 */
	void exitEdge_command(QlParser.Edge_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#index_command}.
	 * @param ctx the parse tree
	 */
	void enterIndex_command(QlParser.Index_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#index_command}.
	 * @param ctx the parse tree
	 */
	void exitIndex_command(QlParser.Index_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(QlParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(QlParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(QlParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(QlParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(QlParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(QlParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#create_vertex}.
	 * @param ctx the parse tree
	 */
	void enterCreate_vertex(QlParser.Create_vertexContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#create_vertex}.
	 * @param ctx the parse tree
	 */
	void exitCreate_vertex(QlParser.Create_vertexContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#create_edge}.
	 * @param ctx the parse tree
	 */
	void enterCreate_edge(QlParser.Create_edgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#create_edge}.
	 * @param ctx the parse tree
	 */
	void exitCreate_edge(QlParser.Create_edgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#create_index}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index(QlParser.Create_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#create_index}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index(QlParser.Create_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#delete_vertex}.
	 * @param ctx the parse tree
	 */
	void enterDelete_vertex(QlParser.Delete_vertexContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#delete_vertex}.
	 * @param ctx the parse tree
	 */
	void exitDelete_vertex(QlParser.Delete_vertexContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#delete_edge}.
	 * @param ctx the parse tree
	 */
	void enterDelete_edge(QlParser.Delete_edgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#delete_edge}.
	 * @param ctx the parse tree
	 */
	void exitDelete_edge(QlParser.Delete_edgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#delete_index}.
	 * @param ctx the parse tree
	 */
	void enterDelete_index(QlParser.Delete_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#delete_index}.
	 * @param ctx the parse tree
	 */
	void exitDelete_index(QlParser.Delete_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#update_vertex}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_vertex(QlParser.Update_vertexContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#update_vertex}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_vertex(QlParser.Update_vertexContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#update_edge}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_edge(QlParser.Update_edgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#update_edge}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_edge(QlParser.Update_edgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#sourceId}.
	 * @param ctx the parse tree
	 */
	void enterSourceId(QlParser.SourceIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#sourceId}.
	 * @param ctx the parse tree
	 */
	void exitSourceId(QlParser.SourceIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#destinationId}.
	 * @param ctx the parse tree
	 */
	void enterDestinationId(QlParser.DestinationIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#destinationId}.
	 * @param ctx the parse tree
	 */
	void exitDestinationId(QlParser.DestinationIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#set_clause}.
	 * @param ctx the parse tree
	 */
	void enterSet_clause(QlParser.Set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#set_clause}.
	 * @param ctx the parse tree
	 */
	void exitSet_clause(QlParser.Set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#set_item}.
	 * @param ctx the parse tree
	 */
	void enterSet_item(QlParser.Set_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#set_item}.
	 * @param ctx the parse tree
	 */
	void exitSet_item(QlParser.Set_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(QlParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(QlParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(QlParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(QlParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(QlParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(QlParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(QlParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(QlParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(QlParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(QlParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(QlParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(QlParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#database_command}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_command(QlParser.Database_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#database_command}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_command(QlParser.Database_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#create_database}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database(QlParser.Create_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#create_database}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database(QlParser.Create_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#delete_database}.
	 * @param ctx the parse tree
	 */
	void enterDelete_database(QlParser.Delete_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#delete_database}.
	 * @param ctx the parse tree
	 */
	void exitDelete_database(QlParser.Delete_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#drop_database}.
	 * @param ctx the parse tree
	 */
	void enterDrop_database(QlParser.Drop_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#drop_database}.
	 * @param ctx the parse tree
	 */
	void exitDrop_database(QlParser.Drop_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#switch_database}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_database(QlParser.Switch_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#switch_database}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_database(QlParser.Switch_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#get_curr_database}.
	 * @param ctx the parse tree
	 */
	void enterGet_curr_database(QlParser.Get_curr_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#get_curr_database}.
	 * @param ctx the parse tree
	 */
	void exitGet_curr_database(QlParser.Get_curr_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#switch_database_to_default}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_database_to_default(QlParser.Switch_database_to_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#switch_database_to_default}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_database_to_default(QlParser.Switch_database_to_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#drop_default_database}.
	 * @param ctx the parse tree
	 */
	void enterDrop_default_database(QlParser.Drop_default_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#drop_default_database}.
	 * @param ctx the parse tree
	 */
	void exitDrop_default_database(QlParser.Drop_default_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(QlParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(QlParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#match_query}.
	 * @param ctx the parse tree
	 */
	void enterMatch_query(QlParser.Match_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#match_query}.
	 * @param ctx the parse tree
	 */
	void exitMatch_query(QlParser.Match_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(QlParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(QlParser.StartContext ctx);
}