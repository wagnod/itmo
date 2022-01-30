// Generated from D:/study/MT/ParserGenerator/src/main/grammar\Grammar.g4 by ANTLR 4.9.2
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
	 * Visit a parse tree produced by {@link GrammarParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(GrammarParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#grammarName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarName(GrammarParser.GrammarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(GrammarParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFields(GrammarParser.FieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(GrammarParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRules(GrammarParser.RulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarRule(GrammarParser.GrammarRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#terminalRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminalRule(GrammarParser.TerminalRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#syntaxRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntaxRule(GrammarParser.SyntaxRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(GrammarParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNames(GrammarParser.NamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(GrammarParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#typedArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedArg(GrammarParser.TypedArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(GrammarParser.CodeContext ctx);
}