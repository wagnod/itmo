// Generated from D:/study/MT/AutomaticAnalyzerGen/src/main/grammar\Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#tree}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTree(GrammarParser.TreeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(GrammarParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(GrammarParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionListAss1}
	 * labeled alternative in {@link GrammarParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionListAss1(GrammarParser.ExpressionListAss1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code listNextLevel}
	 * labeled alternative in {@link GrammarParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListNextLevel(GrammarParser.ListNextLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(GrammarParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(GrammarParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulOperation}
	 * labeled alternative in {@link GrammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOperation(GrammarParser.MulOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExpressionNextLevel}
	 * labeled alternative in {@link GrammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpressionNextLevel(GrammarParser.MulExpressionNextLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpressionNextLevel}
	 * labeled alternative in {@link GrammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpressionNextLevel(GrammarParser.AddExpressionNextLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addOperation}
	 * labeled alternative in {@link GrammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOperation(GrammarParser.AddOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relOperation}
	 * labeled alternative in {@link GrammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOperation(GrammarParser.RelOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relExpressionNextLevel}
	 * labeled alternative in {@link GrammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpressionNextLevel(GrammarParser.RelExpressionNextLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpressionNextLevel}
	 * labeled alternative in {@link GrammarParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpressionNextLevel(GrammarParser.EqualityExpressionNextLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityOperation}
	 * labeled alternative in {@link GrammarParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityOperation(GrammarParser.EqualityOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andOperation}
	 * labeled alternative in {@link GrammarParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOperation(GrammarParser.AndOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpressionNext}
	 * labeled alternative in {@link GrammarParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpressionNext(GrammarParser.AndExpressionNextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpressionNext}
	 * labeled alternative in {@link GrammarParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpressionNext(GrammarParser.OrExpressionNextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orOperation}
	 * labeled alternative in {@link GrammarParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOperation(GrammarParser.OrOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionNext}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNext(GrammarParser.ExpressionNextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionListAss}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionListAss(GrammarParser.ExpressionListAssContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(GrammarParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(GrammarParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initDeclNextLevel}
	 * labeled alternative in {@link GrammarParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclNextLevel(GrammarParser.InitDeclNextLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initDeclEq}
	 * labeled alternative in {@link GrammarParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclEq(GrammarParser.InitDeclEqContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(GrammarParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argsNext}
	 * labeled alternative in {@link GrammarParser#functionArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsNext(GrammarParser.ArgsNextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argsComma}
	 * labeled alternative in {@link GrammarParser#functionArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsComma(GrammarParser.ArgsCommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#argDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgDeclaration(GrammarParser.ArgDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#codeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(GrammarParser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#caseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBlock(GrammarParser.CaseBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockItemListNewLine}
	 * labeled alternative in {@link GrammarParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemListNewLine(GrammarParser.BlockItemListNewLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockItemListN}
	 * labeled alternative in {@link GrammarParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemListN(GrammarParser.BlockItemListNContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(GrammarParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMeaningful}
	 * labeled alternative in {@link GrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMeaningful(GrammarParser.ExprMeaningfulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEmpty}
	 * labeled alternative in {@link GrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEmpty(GrammarParser.ExprEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(GrammarParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(GrammarParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(GrammarParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#iterationBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationBlock(GrammarParser.IterationBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(GrammarParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forExprNextLevel}
	 * labeled alternative in {@link GrammarParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExprNextLevel(GrammarParser.ForExprNextLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forExpr1}
	 * labeled alternative in {@link GrammarParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpr1(GrammarParser.ForExpr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#forDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDeclaration(GrammarParser.ForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jumpContinue}
	 * labeled alternative in {@link GrammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpContinue(GrammarParser.JumpContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jumpBreak}
	 * labeled alternative in {@link GrammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpBreak(GrammarParser.JumpBreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jumpReturn}
	 * labeled alternative in {@link GrammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpReturn(GrammarParser.JumpReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(GrammarParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(GrammarParser.FunctionContext ctx);
}