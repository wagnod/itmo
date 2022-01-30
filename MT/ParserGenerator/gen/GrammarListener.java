// Generated from D:/study/MT/ParserGenerator/src/main/grammar\Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(GrammarParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(GrammarParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#grammarName}.
	 * @param ctx the parse tree
	 */
	void enterGrammarName(GrammarParser.GrammarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#grammarName}.
	 * @param ctx the parse tree
	 */
	void exitGrammarName(GrammarParser.GrammarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(GrammarParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(GrammarParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#fields}.
	 * @param ctx the parse tree
	 */
	void enterFields(GrammarParser.FieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#fields}.
	 * @param ctx the parse tree
	 */
	void exitFields(GrammarParser.FieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(GrammarParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(GrammarParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(GrammarParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(GrammarParser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void enterGrammarRule(GrammarParser.GrammarRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void exitGrammarRule(GrammarParser.GrammarRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#terminalRule}.
	 * @param ctx the parse tree
	 */
	void enterTerminalRule(GrammarParser.TerminalRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#terminalRule}.
	 * @param ctx the parse tree
	 */
	void exitTerminalRule(GrammarParser.TerminalRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#syntaxRule}.
	 * @param ctx the parse tree
	 */
	void enterSyntaxRule(GrammarParser.SyntaxRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#syntaxRule}.
	 * @param ctx the parse tree
	 */
	void exitSyntaxRule(GrammarParser.SyntaxRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(GrammarParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(GrammarParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#names}.
	 * @param ctx the parse tree
	 */
	void enterNames(GrammarParser.NamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#names}.
	 * @param ctx the parse tree
	 */
	void exitNames(GrammarParser.NamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(GrammarParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(GrammarParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#typedArg}.
	 * @param ctx the parse tree
	 */
	void enterTypedArg(GrammarParser.TypedArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#typedArg}.
	 * @param ctx the parse tree
	 */
	void exitTypedArg(GrammarParser.TypedArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(GrammarParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(GrammarParser.CodeContext ctx);
}