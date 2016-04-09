// Generated from PuppyScript.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PuppyScriptParser}.
 */
public interface PuppyScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PuppyScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PuppyScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppyScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PuppyScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppyScriptParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(PuppyScriptParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppyScriptParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(PuppyScriptParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppyScriptParser#optStatementList}.
	 * @param ctx the parse tree
	 */
	void enterOptStatementList(PuppyScriptParser.OptStatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppyScriptParser#optStatementList}.
	 * @param ctx the parse tree
	 */
	void exitOptStatementList(PuppyScriptParser.OptStatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppyScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PuppyScriptParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppyScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PuppyScriptParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppyScriptParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(PuppyScriptParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppyScriptParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(PuppyScriptParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppyScriptParser#optElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterOptElseStatement(PuppyScriptParser.OptElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppyScriptParser#optElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitOptElseStatement(PuppyScriptParser.OptElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppyScriptParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(PuppyScriptParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppyScriptParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(PuppyScriptParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppyScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PuppyScriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppyScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PuppyScriptParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppyScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PuppyScriptParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppyScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PuppyScriptParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppyScriptParser#optExprList}.
	 * @param ctx the parse tree
	 */
	void enterOptExprList(PuppyScriptParser.OptExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppyScriptParser#optExprList}.
	 * @param ctx the parse tree
	 */
	void exitOptExprList(PuppyScriptParser.OptExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppyScriptParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(PuppyScriptParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppyScriptParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(PuppyScriptParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppyScriptParser#assignOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignOperator(PuppyScriptParser.AssignOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppyScriptParser#assignOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignOperator(PuppyScriptParser.AssignOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppyScriptParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(PuppyScriptParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppyScriptParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(PuppyScriptParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppyScriptParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(PuppyScriptParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppyScriptParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(PuppyScriptParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppyScriptParser#lambdaCall}.
	 * @param ctx the parse tree
	 */
	void enterLambdaCall(PuppyScriptParser.LambdaCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppyScriptParser#lambdaCall}.
	 * @param ctx the parse tree
	 */
	void exitLambdaCall(PuppyScriptParser.LambdaCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppyScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(PuppyScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppyScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(PuppyScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppyScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PuppyScriptParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppyScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PuppyScriptParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppyScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(PuppyScriptParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppyScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(PuppyScriptParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppyScriptParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(PuppyScriptParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppyScriptParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(PuppyScriptParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppyScriptParser#optArgList}.
	 * @param ctx the parse tree
	 */
	void enterOptArgList(PuppyScriptParser.OptArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppyScriptParser#optArgList}.
	 * @param ctx the parse tree
	 */
	void exitOptArgList(PuppyScriptParser.OptArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppyScriptParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(PuppyScriptParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppyScriptParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(PuppyScriptParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppyScriptParser#optId}.
	 * @param ctx the parse tree
	 */
	void enterOptId(PuppyScriptParser.OptIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppyScriptParser#optId}.
	 * @param ctx the parse tree
	 */
	void exitOptId(PuppyScriptParser.OptIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppyScriptParser#optIdList}.
	 * @param ctx the parse tree
	 */
	void enterOptIdList(PuppyScriptParser.OptIdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppyScriptParser#optIdList}.
	 * @param ctx the parse tree
	 */
	void exitOptIdList(PuppyScriptParser.OptIdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppyScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(PuppyScriptParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppyScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(PuppyScriptParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PuppyScriptParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(PuppyScriptParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PuppyScriptParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(PuppyScriptParser.AssignContext ctx);
}