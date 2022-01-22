// Generated from D:/study/MT/AutomaticAnalyzerGen/src/main/grammar\Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Bool=1, Break=2, Char=3, Continue=4, Do=5, Double=6, Else=7, Float=8, 
		For=9, If=10, Int=11, Long=12, Return=13, Short=14, Void=15, While=16, 
		Switch=17, Case=18, Default=19, Dot=20, LeftParen=21, RightParen=22, LeftBracket=23, 
		RightBracket=24, LeftBrace=25, RightBrace=26, Less=27, NotGreater=28, 
		Greater=29, NotLess=30, Plus=31, Minus=32, Mul=33, Div=34, Mod=35, Assign=36, 
		PlusAssign=37, MinusAssign=38, MulAssign=39, DivAssign=40, ModAssign=41, 
		And=42, Or=43, Not=44, Equal=45, NotEqual=46, Colon=47, Semicolon=48, 
		Comma=49, ID=50, StringLiteral=51, Number=52, Whitespace=53, Newline=54, 
		BlockComment=55, LineComment=56;
	public static final int
		RULE_tree = 0, RULE_primaryExpression = 1, RULE_postfixExpression = 2, 
		RULE_expressionList = 3, RULE_unaryExpression = 4, RULE_unaryOperator = 5, 
		RULE_multiplicativeExpression = 6, RULE_additiveExpression = 7, RULE_relationalExpression = 8, 
		RULE_equalityExpression = 9, RULE_andExpression = 10, RULE_orExpression = 11, 
		RULE_expression = 12, RULE_assignmentOperator = 13, RULE_declaration = 14, 
		RULE_initDeclarator = 15, RULE_type = 16, RULE_declarator = 17, RULE_functionArgs = 18, 
		RULE_argDeclaration = 19, RULE_statement = 20, RULE_codeBlock = 21, RULE_caseBlock = 22, 
		RULE_blockItemList = 23, RULE_blockItem = 24, RULE_expressionStatement = 25, 
		RULE_ifBlock = 26, RULE_switchBlock = 27, RULE_caseStatement = 28, RULE_iterationBlock = 29, 
		RULE_forCondition = 30, RULE_forExpression = 31, RULE_forDeclaration = 32, 
		RULE_jumpStatement = 33, RULE_translationUnit = 34, RULE_function = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"tree", "primaryExpression", "postfixExpression", "expressionList", "unaryExpression", 
			"unaryOperator", "multiplicativeExpression", "additiveExpression", "relationalExpression", 
			"equalityExpression", "andExpression", "orExpression", "expression", 
			"assignmentOperator", "declaration", "initDeclarator", "type", "declarator", 
			"functionArgs", "argDeclaration", "statement", "codeBlock", "caseBlock", 
			"blockItemList", "blockItem", "expressionStatement", "ifBlock", "switchBlock", 
			"caseStatement", "iterationBlock", "forCondition", "forExpression", "forDeclaration", 
			"jumpStatement", "translationUnit", "function"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bool'", "'break'", "'char'", "'continue'", "'do'", "'double'", 
			"'else'", "'float'", "'for'", "'if'", "'int'", "'long'", "'return'", 
			"'short'", "'void'", "'while'", "'switch'", "'case'", "'default'", "'.'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", "'>'", "'>='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'&&'", "'||'", "'!'", "'=='", "'!='", "':'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Bool", "Break", "Char", "Continue", "Do", "Double", "Else", "Float", 
			"For", "If", "Int", "Long", "Return", "Short", "Void", "While", "Switch", 
			"Case", "Default", "Dot", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "Less", "NotGreater", "Greater", "NotLess", 
			"Plus", "Minus", "Mul", "Div", "Mod", "Assign", "PlusAssign", "MinusAssign", 
			"MulAssign", "DivAssign", "ModAssign", "And", "Or", "Not", "Equal", "NotEqual", 
			"Colon", "Semicolon", "Comma", "ID", "StringLiteral", "Number", "Whitespace", 
			"Newline", "BlockComment", "LineComment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TreeContext extends ParserRuleContext {
		public TranslationUnitContext code;
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public TreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TreeContext tree() throws RecognitionException {
		TreeContext _localctx = new TreeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Void) | (1L << ID))) != 0)) {
				{
				setState(72);
				((TreeContext)_localctx).code = translationUnit(0);
				}
			}

			setState(75);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public List<TerminalNode> StringLiteral() { return getTokens(GrammarParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(GrammarParser.StringLiteral, i);
		}
		public TerminalNode Number() { return getToken(GrammarParser.Number, 0); }
		public TerminalNode LeftParen() { return getToken(GrammarParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(GrammarParser.RightParen, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primaryExpression);
		try {
			int _alt;
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(78); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(77);
						match(StringLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(80); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(Number);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(LeftParen);
				setState(84);
				expression();
				setState(85);
				match(RightParen);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(GrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(GrammarParser.RightParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode Dot() { return getToken(GrammarParser.Dot, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(91);
			primaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(93);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(94);
						match(LeftParen);
						setState(96);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << ID) | (1L << StringLiteral) | (1L << Number))) != 0)) {
							{
							setState(95);
							expressionList(0);
							}
						}

						setState(98);
						match(RightParen);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(99);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(100);
						match(Dot);
						setState(101);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	 
		public ExpressionListContext() { }
		public void copyFrom(ExpressionListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionListAss1Context extends ExpressionListContext {
		public ExpressionListContext args;
		public ExpressionContext expr;
		public TerminalNode Comma() { return getToken(GrammarParser.Comma, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListAss1Context(ExpressionListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpressionListAss1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpressionListAss1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpressionListAss1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListNextLevelContext extends ExpressionListContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListNextLevelContext(ExpressionListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterListNextLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitListNextLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitListNextLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		return expressionList(0);
	}

	private ExpressionListContext expressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, _parentState);
		ExpressionListContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ListNextLevelContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(108);
			expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionListAss1Context(new ExpressionListContext(_parentctx, _parentState));
					((ExpressionListAss1Context)_localctx).args = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expressionList);
					setState(110);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(111);
					match(Comma);
					setState(112);
					((ExpressionListAss1Context)_localctx).expr = expression();
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unaryExpression);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case ID:
			case StringLiteral:
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				postfixExpression(0);
				}
				break;
			case Plus:
			case Minus:
			case Not:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				unaryOperator();
				setState(120);
				unaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(GrammarParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(GrammarParser.Minus, 0); }
		public TerminalNode Not() { return getToken(GrammarParser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << Not))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	 
		public MultiplicativeExpressionContext() { }
		public void copyFrom(MultiplicativeExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MulOperationContext extends MultiplicativeExpressionContext {
		public MultiplicativeExpressionContext exp1;
		public Token op;
		public UnaryExpressionContext exp2;
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode Mul() { return getToken(GrammarParser.Mul, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Div() { return getToken(GrammarParser.Div, 0); }
		public TerminalNode Mod() { return getToken(GrammarParser.Mod, 0); }
		public MulOperationContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMulOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMulOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMulOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExpressionNextLevelContext extends MultiplicativeExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MulExpressionNextLevelContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMulExpressionNextLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMulExpressionNextLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMulExpressionNextLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MulExpressionNextLevelContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(127);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(138);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MulOperationContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						((MulOperationContext)_localctx).exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(129);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(130);
						((MulOperationContext)_localctx).op = match(Mul);
						setState(131);
						((MulOperationContext)_localctx).exp2 = unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MulOperationContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						((MulOperationContext)_localctx).exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(132);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(133);
						((MulOperationContext)_localctx).op = match(Div);
						setState(134);
						((MulOperationContext)_localctx).exp2 = unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new MulOperationContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						((MulOperationContext)_localctx).exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(135);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(136);
						((MulOperationContext)_localctx).op = match(Mod);
						setState(137);
						((MulOperationContext)_localctx).exp2 = unaryExpression();
						}
						break;
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	 
		public AdditiveExpressionContext() { }
		public void copyFrom(AdditiveExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddExpressionNextLevelContext extends AdditiveExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AddExpressionNextLevelContext(AdditiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAddExpressionNextLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAddExpressionNextLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAddExpressionNextLevel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddOperationContext extends AdditiveExpressionContext {
		public AdditiveExpressionContext exp1;
		public Token op;
		public MultiplicativeExpressionContext exp2;
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode Plus() { return getToken(GrammarParser.Plus, 0); }
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode Minus() { return getToken(GrammarParser.Minus, 0); }
		public AddOperationContext(AdditiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAddOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAddOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAddOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AddExpressionNextLevelContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(144);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(152);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new AddOperationContext(new AdditiveExpressionContext(_parentctx, _parentState));
						((AddOperationContext)_localctx).exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(146);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(147);
						((AddOperationContext)_localctx).op = match(Plus);
						setState(148);
						((AddOperationContext)_localctx).exp2 = multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AddOperationContext(new AdditiveExpressionContext(_parentctx, _parentState));
						((AddOperationContext)_localctx).exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(149);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(150);
						((AddOperationContext)_localctx).op = match(Minus);
						setState(151);
						((AddOperationContext)_localctx).exp2 = multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	 
		public RelationalExpressionContext() { }
		public void copyFrom(RelationalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelOperationContext extends RelationalExpressionContext {
		public RelationalExpressionContext exp1;
		public Token op;
		public AdditiveExpressionContext exp2;
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode Less() { return getToken(GrammarParser.Less, 0); }
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode NotGreater() { return getToken(GrammarParser.NotGreater, 0); }
		public TerminalNode Greater() { return getToken(GrammarParser.Greater, 0); }
		public TerminalNode NotLess() { return getToken(GrammarParser.NotLess, 0); }
		public RelOperationContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRelOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRelOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRelOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelExpressionNextLevelContext extends RelationalExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public RelExpressionNextLevelContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRelExpressionNextLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRelExpressionNextLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRelExpressionNextLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelExpressionNextLevelContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(158);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(172);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new RelOperationContext(new RelationalExpressionContext(_parentctx, _parentState));
						((RelOperationContext)_localctx).exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(160);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(161);
						((RelOperationContext)_localctx).op = match(Less);
						setState(162);
						((RelOperationContext)_localctx).exp2 = additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelOperationContext(new RelationalExpressionContext(_parentctx, _parentState));
						((RelOperationContext)_localctx).exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(163);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(164);
						((RelOperationContext)_localctx).op = match(NotGreater);
						setState(165);
						((RelOperationContext)_localctx).exp2 = additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelOperationContext(new RelationalExpressionContext(_parentctx, _parentState));
						((RelOperationContext)_localctx).exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(166);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(167);
						((RelOperationContext)_localctx).op = match(Greater);
						setState(168);
						((RelOperationContext)_localctx).exp2 = additiveExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelOperationContext(new RelationalExpressionContext(_parentctx, _parentState));
						((RelOperationContext)_localctx).exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(169);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(170);
						((RelOperationContext)_localctx).op = match(NotLess);
						setState(171);
						((RelOperationContext)_localctx).exp2 = additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	 
		public EqualityExpressionContext() { }
		public void copyFrom(EqualityExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualityExpressionNextLevelContext extends EqualityExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionNextLevelContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEqualityExpressionNextLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEqualityExpressionNextLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEqualityExpressionNextLevel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityOperationContext extends EqualityExpressionContext {
		public EqualityExpressionContext exp1;
		public Token op;
		public RelationalExpressionContext exp2;
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode Equal() { return getToken(GrammarParser.Equal, 0); }
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode NotEqual() { return getToken(GrammarParser.NotEqual, 0); }
		public EqualityOperationContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEqualityOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEqualityOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEqualityOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EqualityExpressionNextLevelContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(178);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(186);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityOperationContext(new EqualityExpressionContext(_parentctx, _parentState));
						((EqualityOperationContext)_localctx).exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(180);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(181);
						((EqualityOperationContext)_localctx).op = match(Equal);
						setState(182);
						((EqualityOperationContext)_localctx).exp2 = relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityOperationContext(new EqualityExpressionContext(_parentctx, _parentState));
						((EqualityOperationContext)_localctx).exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(183);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(184);
						((EqualityOperationContext)_localctx).op = match(NotEqual);
						setState(185);
						((EqualityOperationContext)_localctx).exp2 = relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
	 
		public AndExpressionContext() { }
		public void copyFrom(AndExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndOperationContext extends AndExpressionContext {
		public AndExpressionContext exp1;
		public Token op;
		public EqualityExpressionContext ex2;
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode And() { return getToken(GrammarParser.And, 0); }
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndOperationContext(AndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAndOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAndOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAndOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionNextContext extends AndExpressionContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionNextContext(AndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAndExpressionNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAndExpressionNext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAndExpressionNext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AndExpressionNextContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(192);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndOperationContext(new AndExpressionContext(_parentctx, _parentState));
					((AndOperationContext)_localctx).exp1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(194);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(195);
					((AndOperationContext)_localctx).op = match(And);
					setState(196);
					((AndOperationContext)_localctx).ex2 = equalityExpression(0);
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OrExpressionContext extends ParserRuleContext {
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
	 
		public OrExpressionContext() { }
		public void copyFrom(OrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrExpressionNextContext extends OrExpressionContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public OrExpressionNextContext(OrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOrExpressionNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOrExpressionNext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOrExpressionNext(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrOperationContext extends OrExpressionContext {
		public OrExpressionContext exp1;
		public Token op;
		public AndExpressionContext exp2;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode Or() { return getToken(GrammarParser.Or, 0); }
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public OrOperationContext(OrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOrOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOrOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOrOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		return orExpression(0);
	}

	private OrExpressionContext orExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, _parentState);
		OrExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_orExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new OrExpressionNextContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(203);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrOperationContext(new OrExpressionContext(_parentctx, _parentState));
					((OrOperationContext)_localctx).exp1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_orExpression);
					setState(205);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(206);
					((OrOperationContext)_localctx).op = match(Or);
					setState(207);
					((OrOperationContext)_localctx).exp2 = andExpression(0);
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionListAssContext extends ExpressionContext {
		public UnaryExpressionContext exp1;
		public AssignmentOperatorContext op;
		public ExpressionContext exp2;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListAssContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpressionListAss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpressionListAss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpressionListAss(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionNextContext extends ExpressionContext {
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public ExpressionNextContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpressionNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpressionNext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpressionNext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ExpressionNextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				orExpression(0);
				}
				break;
			case 2:
				_localctx = new ExpressionListAssContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				((ExpressionListAssContext)_localctx).exp1 = unaryExpression();
				setState(215);
				((ExpressionListAssContext)_localctx).op = assignmentOperator();
				setState(216);
				((ExpressionListAssContext)_localctx).exp2 = expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(GrammarParser.Assign, 0); }
		public TerminalNode PlusAssign() { return getToken(GrammarParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(GrammarParser.MinusAssign, 0); }
		public TerminalNode DivAssign() { return getToken(GrammarParser.DivAssign, 0); }
		public TerminalNode MulAssign() { return getToken(GrammarParser.MulAssign, 0); }
		public TerminalNode ModAssign() { return getToken(GrammarParser.ModAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << MulAssign) | (1L << DivAssign) | (1L << ModAssign))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext t;
		public InitDeclaratorContext decl;
		public TerminalNode Semicolon() { return getToken(GrammarParser.Semicolon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InitDeclaratorContext initDeclarator() {
			return getRuleContext(InitDeclaratorContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			((DeclarationContext)_localctx).t = type();
			setState(223);
			((DeclarationContext)_localctx).decl = initDeclarator();
			setState(224);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorContext extends ParserRuleContext {
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
	 
		public InitDeclaratorContext() { }
		public void copyFrom(InitDeclaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitDeclNextLevelContext extends InitDeclaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitDeclNextLevelContext(InitDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInitDeclNextLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInitDeclNextLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitInitDeclNextLevel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitDeclEqContext extends InitDeclaratorContext {
		public DeclaratorContext e1;
		public ExpressionContext e2;
		public TerminalNode Assign() { return getToken(GrammarParser.Assign, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitDeclEqContext(InitDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInitDeclEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInitDeclEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitInitDeclEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_initDeclarator);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new InitDeclNextLevelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				declarator(0);
				}
				break;
			case 2:
				_localctx = new InitDeclEqContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				((InitDeclEqContext)_localctx).e1 = declarator(0);
				setState(228);
				match(Assign);
				setState(229);
				((InitDeclEqContext)_localctx).e2 = expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Void() { return getToken(GrammarParser.Void, 0); }
		public TerminalNode Char() { return getToken(GrammarParser.Char, 0); }
		public TerminalNode Short() { return getToken(GrammarParser.Short, 0); }
		public TerminalNode Int() { return getToken(GrammarParser.Int, 0); }
		public TerminalNode Long() { return getToken(GrammarParser.Long, 0); }
		public TerminalNode Float() { return getToken(GrammarParser.Float, 0); }
		public TerminalNode Double() { return getToken(GrammarParser.Double, 0); }
		public TerminalNode Bool() { return getToken(GrammarParser.Bool, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Void) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode LeftParen() { return getToken(GrammarParser.LeftParen, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(GrammarParser.RightParen, 0); }
		public FunctionArgsContext functionArgs() {
			return getRuleContext(FunctionArgsContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		return declarator(0);
	}

	private DeclaratorContext declarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, _parentState);
		DeclaratorContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_declarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(236);
				match(ID);
				}
				break;
			case LeftParen:
				{
				setState(237);
				match(LeftParen);
				setState(238);
				declarator(0);
				setState(239);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarator);
					setState(243);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(244);
					match(LeftParen);
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Void) | (1L << ID))) != 0)) {
						{
						setState(245);
						functionArgs(0);
						}
					}

					setState(248);
					match(RightParen);
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionArgsContext extends ParserRuleContext {
		public FunctionArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgs; }
	 
		public FunctionArgsContext() { }
		public void copyFrom(FunctionArgsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgsNextContext extends FunctionArgsContext {
		public ArgDeclarationContext argDeclaration() {
			return getRuleContext(ArgDeclarationContext.class,0);
		}
		public ArgsNextContext(FunctionArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArgsNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArgsNext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArgsNext(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgsCommaContext extends FunctionArgsContext {
		public FunctionArgsContext exp1;
		public FunctionArgsContext exp2;
		public TerminalNode Comma() { return getToken(GrammarParser.Comma, 0); }
		public List<FunctionArgsContext> functionArgs() {
			return getRuleContexts(FunctionArgsContext.class);
		}
		public FunctionArgsContext functionArgs(int i) {
			return getRuleContext(FunctionArgsContext.class,i);
		}
		public ArgsCommaContext(FunctionArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArgsComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArgsComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArgsComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgsContext functionArgs() throws RecognitionException {
		return functionArgs(0);
	}

	private FunctionArgsContext functionArgs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FunctionArgsContext _localctx = new FunctionArgsContext(_ctx, _parentState);
		FunctionArgsContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_functionArgs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ArgsNextContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(255);
			argDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgsCommaContext(new FunctionArgsContext(_parentctx, _parentState));
					((ArgsCommaContext)_localctx).exp1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_functionArgs);
					setState(257);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(258);
					match(Comma);
					setState(259);
					((ArgsCommaContext)_localctx).exp2 = functionArgs(2);
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgDeclarationContext extends ParserRuleContext {
		public TypeContext t;
		public Token argName;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ArgDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArgDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArgDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArgDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgDeclarationContext argDeclaration() throws RecognitionException {
		ArgDeclarationContext _localctx = new ArgDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_argDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			((ArgDeclarationContext)_localctx).t = type();
			setState(266);
			((ArgDeclarationContext)_localctx).argName = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public boolean ignore;
		public ExpressionStatementContext e;
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public IterationBlockContext iterationBlock() {
			return getRuleContext(IterationBlockContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statement);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				codeBlock();
				}
				break;
			case LeftParen:
			case Plus:
			case Minus:
			case Not:
			case Semicolon:
			case ID:
			case StringLiteral:
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				((StatementContext)_localctx).e = expressionStatement();
				((StatementContext)_localctx).ignore =  ((StatementContext)_localctx).e.ignore;
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				ifBlock();
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				switchBlock();
				}
				break;
			case Do:
			case For:
			case While:
				enterOuterAlt(_localctx, 5);
				{
				setState(274);
				iterationBlock();
				}
				break;
			case Break:
			case Continue:
			case Return:
				enterOuterAlt(_localctx, 6);
				{
				setState(275);
				jumpStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeBlockContext extends ParserRuleContext {
		public boolean ignore;
		public BlockItemListContext scopedCode;
		public TerminalNode LeftBrace() { return getToken(GrammarParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(GrammarParser.RightBrace, 0); }
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_codeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(LeftBrace);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Break) | (1L << Char) | (1L << Continue) | (1L << Do) | (1L << Double) | (1L << Float) | (1L << For) | (1L << If) | (1L << Int) | (1L << Long) | (1L << Return) | (1L << Short) | (1L << Void) | (1L << While) | (1L << Switch) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Semicolon) | (1L << ID) | (1L << StringLiteral) | (1L << Number))) != 0)) {
				{
				setState(279);
				((CodeBlockContext)_localctx).scopedCode = blockItemList(0);
				}
			}

			setState(282);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseBlockContext extends ParserRuleContext {
		public boolean ignore;
		public Token name;
		public ExpressionContext exp;
		public BlockItemListContext scopedCode;
		public CaseBlockContext stat;
		public TerminalNode Colon() { return getToken(GrammarParser.Colon, 0); }
		public TerminalNode Case() { return getToken(GrammarParser.Case, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CaseBlockContext caseBlock() {
			return getRuleContext(CaseBlockContext.class,0);
		}
		public TerminalNode Default() { return getToken(GrammarParser.Default, 0); }
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCaseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCaseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCaseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_caseBlock);
		int _la;
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Case:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				((CaseBlockContext)_localctx).name = match(Case);
				setState(285);
				((CaseBlockContext)_localctx).exp = expression();
				setState(286);
				match(Colon);
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Break) | (1L << Char) | (1L << Continue) | (1L << Do) | (1L << Double) | (1L << Float) | (1L << For) | (1L << If) | (1L << Int) | (1L << Long) | (1L << Return) | (1L << Short) | (1L << Void) | (1L << While) | (1L << Switch) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Semicolon) | (1L << ID) | (1L << StringLiteral) | (1L << Number))) != 0)) {
					{
					setState(287);
					((CaseBlockContext)_localctx).scopedCode = blockItemList(0);
					}
				}

				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Case || _la==Default) {
					{
					setState(290);
					((CaseBlockContext)_localctx).stat = caseBlock();
					}
				}

				}
				break;
			case Default:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				((CaseBlockContext)_localctx).name = match(Default);
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << ID) | (1L << StringLiteral) | (1L << Number))) != 0)) {
					{
					setState(294);
					((CaseBlockContext)_localctx).exp = expression();
					}
				}

				setState(297);
				match(Colon);
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Break) | (1L << Char) | (1L << Continue) | (1L << Do) | (1L << Double) | (1L << Float) | (1L << For) | (1L << If) | (1L << Int) | (1L << Long) | (1L << Return) | (1L << Short) | (1L << Void) | (1L << While) | (1L << Switch) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Semicolon) | (1L << ID) | (1L << StringLiteral) | (1L << Number))) != 0)) {
					{
					setState(298);
					((CaseBlockContext)_localctx).scopedCode = blockItemList(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockItemListContext extends ParserRuleContext {
		public boolean ignore;
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
	 
		public BlockItemListContext() { }
		public void copyFrom(BlockItemListContext ctx) {
			super.copyFrom(ctx);
			this.ignore = ctx.ignore;
		}
	}
	public static class BlockItemListNewLineContext extends BlockItemListContext {
		public BlockItemContext blockItem() {
			return getRuleContext(BlockItemContext.class,0);
		}
		public BlockItemListNewLineContext(BlockItemListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlockItemListNewLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlockItemListNewLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlockItemListNewLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockItemListNContext extends BlockItemListContext {
		public BlockItemListContext list;
		public BlockItemContext item;
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public BlockItemContext blockItem() {
			return getRuleContext(BlockItemContext.class,0);
		}
		public BlockItemListNContext(BlockItemListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlockItemListN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlockItemListN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlockItemListN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		return blockItemList(0);
	}

	private BlockItemListContext blockItemList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, _parentState);
		BlockItemListContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_blockItemList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BlockItemListNewLineContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(304);
			blockItem();
			}
			_ctx.stop = _input.LT(-1);
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockItemListNContext(new BlockItemListContext(_parentctx, _parentState));
					((BlockItemListNContext)_localctx).list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_blockItemList);
					setState(306);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(307);
					((BlockItemListNContext)_localctx).item = blockItem();
					((BlockItemListNContext)_localctx).list.ignore = ((BlockItemListNContext)_localctx).item.ignore;
					}
					} 
				}
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BlockItemContext extends ParserRuleContext {
		public boolean ignore;
		public StatementContext e;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlockItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlockItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlockItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_blockItem);
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				((BlockItemContext)_localctx).e = statement();
				((BlockItemContext)_localctx).ignore =  ((BlockItemContext)_localctx).e.ignore;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public boolean ignore;
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	 
		public ExpressionStatementContext() { }
		public void copyFrom(ExpressionStatementContext ctx) {
			super.copyFrom(ctx);
			this.ignore = ctx.ignore;
		}
	}
	public static class ExprEmptyContext extends ExpressionStatementContext {
		public TerminalNode Semicolon() { return getToken(GrammarParser.Semicolon, 0); }
		public ExprEmptyContext(ExpressionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExprEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExprEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExprEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMeaningfulContext extends ExpressionStatementContext {
		public ExpressionContext e;
		public TerminalNode Semicolon() { return getToken(GrammarParser.Semicolon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprMeaningfulContext(ExpressionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExprMeaningful(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExprMeaningful(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExprMeaningful(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expressionStatement);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case Plus:
			case Minus:
			case Not:
			case ID:
			case StringLiteral:
			case Number:
				_localctx = new ExprMeaningfulContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				((ExprMeaningfulContext)_localctx).e = expression();
				setState(322);
				match(Semicolon);
				}
				break;
			case Semicolon:
				_localctx = new ExprEmptyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				match(Semicolon);
				((ExprEmptyContext)_localctx).ignore =  true;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBlockContext extends ParserRuleContext {
		public ExpressionContext condition;
		public CodeBlockContext ifCode;
		public CodeBlockContext elseCode;
		public TerminalNode If() { return getToken(GrammarParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(GrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(GrammarParser.RightParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public TerminalNode Else() { return getToken(GrammarParser.Else, 0); }
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(If);
			setState(329);
			match(LeftParen);
			setState(330);
			((IfBlockContext)_localctx).condition = expression();
			setState(331);
			match(RightParen);
			setState(332);
			((IfBlockContext)_localctx).ifCode = codeBlock();
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(333);
				match(Else);
				setState(334);
				((IfBlockContext)_localctx).elseCode = codeBlock();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public ExpressionContext condition;
		public CaseStatementContext switchCode;
		public TerminalNode Switch() { return getToken(GrammarParser.Switch, 0); }
		public TerminalNode LeftParen() { return getToken(GrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(GrammarParser.RightParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_switchBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(Switch);
			setState(338);
			match(LeftParen);
			setState(339);
			((SwitchBlockContext)_localctx).condition = expression();
			setState(340);
			match(RightParen);
			setState(341);
			((SwitchBlockContext)_localctx).switchCode = caseStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseStatementContext extends ParserRuleContext {
		public CaseBlockContext code;
		public TerminalNode LeftBrace() { return getToken(GrammarParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(GrammarParser.RightBrace, 0); }
		public CaseBlockContext caseBlock() {
			return getRuleContext(CaseBlockContext.class,0);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_caseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(LeftBrace);
			setState(344);
			((CaseStatementContext)_localctx).code = caseBlock();
			setState(345);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationBlockContext extends ParserRuleContext {
		public Token name;
		public ExpressionContext e1;
		public CodeBlockContext code;
		public ForConditionContext forCond;
		public TerminalNode LeftParen() { return getToken(GrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(GrammarParser.RightParen, 0); }
		public TerminalNode While() { return getToken(GrammarParser.While, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode For() { return getToken(GrammarParser.For, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public TerminalNode Do() { return getToken(GrammarParser.Do, 0); }
		public IterationBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIterationBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIterationBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIterationBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationBlockContext iterationBlock() throws RecognitionException {
		IterationBlockContext _localctx = new IterationBlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_iterationBlock);
		try {
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				((IterationBlockContext)_localctx).name = match(While);
				setState(348);
				match(LeftParen);
				setState(349);
				((IterationBlockContext)_localctx).e1 = expression();
				setState(350);
				match(RightParen);
				setState(351);
				((IterationBlockContext)_localctx).code = codeBlock();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				((IterationBlockContext)_localctx).name = match(For);
				setState(354);
				match(LeftParen);
				setState(355);
				((IterationBlockContext)_localctx).forCond = forCondition();
				setState(356);
				match(RightParen);
				setState(357);
				((IterationBlockContext)_localctx).code = codeBlock();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				((IterationBlockContext)_localctx).name = match(Do);
				setState(360);
				((IterationBlockContext)_localctx).code = codeBlock();
				setState(361);
				match(While);
				setState(362);
				match(LeftParen);
				setState(363);
				((IterationBlockContext)_localctx).e1 = expression();
				setState(364);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForConditionContext extends ParserRuleContext {
		public ForDeclarationContext d;
		public ForExpressionContext e1;
		public ForExpressionContext e2;
		public ExpressionContext assignExpr;
		public List<TerminalNode> Semicolon() { return getTokens(GrammarParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(GrammarParser.Semicolon, i);
		}
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitForCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_forCondition);
		int _la;
		try {
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Void) | (1L << ID))) != 0)) {
					{
					setState(368);
					((ForConditionContext)_localctx).d = forDeclaration();
					}
				}

				setState(371);
				match(Semicolon);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << ID) | (1L << StringLiteral) | (1L << Number))) != 0)) {
					{
					setState(372);
					((ForConditionContext)_localctx).e1 = forExpression(0);
					}
				}

				setState(375);
				match(Semicolon);
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << ID) | (1L << StringLiteral) | (1L << Number))) != 0)) {
					{
					setState(376);
					((ForConditionContext)_localctx).e2 = forExpression(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << ID) | (1L << StringLiteral) | (1L << Number))) != 0)) {
					{
					setState(379);
					((ForConditionContext)_localctx).assignExpr = expression();
					}
				}

				setState(382);
				match(Semicolon);
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << ID) | (1L << StringLiteral) | (1L << Number))) != 0)) {
					{
					setState(383);
					((ForConditionContext)_localctx).e1 = forExpression(0);
					}
				}

				setState(386);
				match(Semicolon);
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << ID) | (1L << StringLiteral) | (1L << Number))) != 0)) {
					{
					setState(387);
					((ForConditionContext)_localctx).e2 = forExpression(0);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForExpressionContext extends ParserRuleContext {
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
	 
		public ForExpressionContext() { }
		public void copyFrom(ForExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForExprNextLevelContext extends ForExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForExprNextLevelContext(ForExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterForExprNextLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitForExprNextLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitForExprNextLevel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForExpr1Context extends ForExpressionContext {
		public ForExpressionContext forExprList;
		public ExpressionContext assignExpr;
		public TerminalNode Comma() { return getToken(GrammarParser.Comma, 0); }
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForExpr1Context(ForExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterForExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitForExpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitForExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		return forExpression(0);
	}

	private ForExpressionContext forExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, _parentState);
		ForExpressionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_forExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ForExprNextLevelContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(393);
			expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ForExpr1Context(new ForExpressionContext(_parentctx, _parentState));
					((ForExpr1Context)_localctx).forExprList = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_forExpression);
					setState(395);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(396);
					match(Comma);
					setState(397);
					((ForExpr1Context)_localctx).assignExpr = expression();
					}
					} 
				}
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ForDeclarationContext extends ParserRuleContext {
		public TypeContext t;
		public InitDeclaratorContext initDecl;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InitDeclaratorContext initDeclarator() {
			return getRuleContext(InitDeclaratorContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitForDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_forDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			((ForDeclarationContext)_localctx).t = type();
			setState(404);
			((ForDeclarationContext)_localctx).initDecl = initDeclarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
	 
		public JumpStatementContext() { }
		public void copyFrom(JumpStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JumpContinueContext extends JumpStatementContext {
		public TerminalNode Continue() { return getToken(GrammarParser.Continue, 0); }
		public TerminalNode Semicolon() { return getToken(GrammarParser.Semicolon, 0); }
		public JumpContinueContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJumpContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJumpContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJumpContinue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JumpReturnContext extends JumpStatementContext {
		public ExpressionContext returnValue;
		public TerminalNode Return() { return getToken(GrammarParser.Return, 0); }
		public TerminalNode Semicolon() { return getToken(GrammarParser.Semicolon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpReturnContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJumpReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJumpReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJumpReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JumpBreakContext extends JumpStatementContext {
		public TerminalNode Break() { return getToken(GrammarParser.Break, 0); }
		public TerminalNode Semicolon() { return getToken(GrammarParser.Semicolon, 0); }
		public JumpBreakContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJumpBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJumpBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJumpBreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_jumpStatement);
		int _la;
		try {
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Continue:
				_localctx = new JumpContinueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(Continue);
				setState(407);
				match(Semicolon);
				}
				break;
			case Break:
				_localctx = new JumpBreakContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(Break);
				setState(409);
				match(Semicolon);
				}
				break;
			case Return:
				_localctx = new JumpReturnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(410);
				match(Return);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << ID) | (1L << StringLiteral) | (1L << Number))) != 0)) {
					{
					setState(411);
					((JumpReturnContext)_localctx).returnValue = expression();
					}
				}

				setState(414);
				match(Semicolon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TranslationUnitContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTranslationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		return translationUnit(0);
	}

	private TranslationUnitContext translationUnit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, _parentState);
		TranslationUnitContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_translationUnit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(418);
			function();
			}
			_ctx.stop = _input.LT(-1);
			setState(424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TranslationUnitContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_translationUnit);
					setState(420);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(421);
					function();
					}
					} 
				}
				setState(426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TypeContext returnType;
		public DeclaratorContext definition;
		public CodeBlockContext code;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			((FunctionContext)_localctx).returnType = type();
			setState(428);
			((FunctionContext)_localctx).definition = declarator(0);
			setState(429);
			((FunctionContext)_localctx).code = codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 3:
			return expressionList_sempred((ExpressionListContext)_localctx, predIndex);
		case 6:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 7:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 8:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 9:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 10:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 11:
			return orExpression_sempred((OrExpressionContext)_localctx, predIndex);
		case 17:
			return declarator_sempred((DeclaratorContext)_localctx, predIndex);
		case 18:
			return functionArgs_sempred((FunctionArgsContext)_localctx, predIndex);
		case 23:
			return blockItemList_sempred((BlockItemListContext)_localctx, predIndex);
		case 31:
			return forExpression_sempred((ForExpressionContext)_localctx, predIndex);
		case 34:
			return translationUnit_sempred((TranslationUnitContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressionList_sempred(ExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean orExpression_sempred(OrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarator_sempred(DeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean functionArgs_sempred(FunctionArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean blockItemList_sempred(BlockItemListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean forExpression_sempred(ForExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean translationUnit_sempred(TranslationUnitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u01b2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\5\2L\n\2\3\2\3\2\3\3\6\3Q\n\3\r\3\16"+
		"\3R\3\3\3\3\3\3\3\3\3\3\3\3\5\3[\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4c\n\4"+
		"\3\4\3\4\3\4\3\4\7\4i\n\4\f\4\16\4l\13\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5t"+
		"\n\5\f\5\16\5w\13\5\3\6\3\6\3\6\3\6\5\6}\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u008d\n\b\f\b\16\b\u0090\13\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u009b\n\t\f\t\16\t\u009e\13\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00af\n\n\f"+
		"\n\16\n\u00b2\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00bd"+
		"\n\13\f\13\16\13\u00c0\13\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c8\n\f\f\f"+
		"\16\f\u00cb\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00d3\n\r\f\r\16\r\u00d6"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\5\16\u00dd\n\16\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00ea\n\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00f4\n\23\3\23\3\23\3\23\5\23\u00f9\n\23\3\23\7"+
		"\23\u00fc\n\23\f\23\16\23\u00ff\13\23\3\24\3\24\3\24\3\24\3\24\3\24\7"+
		"\24\u0107\n\24\f\24\16\24\u010a\13\24\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\5\26\u0117\n\26\3\27\3\27\5\27\u011b\n\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\5\30\u0123\n\30\3\30\5\30\u0126\n\30\3\30\3"+
		"\30\5\30\u012a\n\30\3\30\3\30\5\30\u012e\n\30\5\30\u0130\n\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\7\31\u0139\n\31\f\31\16\31\u013c\13\31\3\32"+
		"\3\32\3\32\3\32\5\32\u0142\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u0149\n"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0152\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0171"+
		"\n\37\3 \5 \u0174\n \3 \3 \5 \u0178\n \3 \3 \5 \u017c\n \3 \5 \u017f\n"+
		" \3 \3 \5 \u0183\n \3 \3 \5 \u0187\n \5 \u0189\n \3!\3!\3!\3!\3!\3!\7"+
		"!\u0191\n!\f!\16!\u0194\13!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\5#\u019f\n#"+
		"\3#\5#\u01a2\n#\3$\3$\3$\3$\3$\7$\u01a9\n$\f$\16$\u01ac\13$\3%\3%\3%\3"+
		"%\3%\2\17\6\b\16\20\22\24\26\30$&\60@F&\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\5\4\2!\"..\3\2&+\t\2\3\3\5\5"+
		"\b\b\n\n\r\16\20\21\64\64\2\u01c7\2K\3\2\2\2\4Z\3\2\2\2\6\\\3\2\2\2\b"+
		"m\3\2\2\2\n|\3\2\2\2\f~\3\2\2\2\16\u0080\3\2\2\2\20\u0091\3\2\2\2\22\u009f"+
		"\3\2\2\2\24\u00b3\3\2\2\2\26\u00c1\3\2\2\2\30\u00cc\3\2\2\2\32\u00dc\3"+
		"\2\2\2\34\u00de\3\2\2\2\36\u00e0\3\2\2\2 \u00e9\3\2\2\2\"\u00eb\3\2\2"+
		"\2$\u00f3\3\2\2\2&\u0100\3\2\2\2(\u010b\3\2\2\2*\u0116\3\2\2\2,\u0118"+
		"\3\2\2\2.\u012f\3\2\2\2\60\u0131\3\2\2\2\62\u0141\3\2\2\2\64\u0148\3\2"+
		"\2\2\66\u014a\3\2\2\28\u0153\3\2\2\2:\u0159\3\2\2\2<\u0170\3\2\2\2>\u0188"+
		"\3\2\2\2@\u018a\3\2\2\2B\u0195\3\2\2\2D\u01a1\3\2\2\2F\u01a3\3\2\2\2H"+
		"\u01ad\3\2\2\2JL\5F$\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7\2\2\3N\3\3\2"+
		"\2\2OQ\7\65\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S[\3\2\2\2T[\7"+
		"\66\2\2UV\7\27\2\2VW\5\32\16\2WX\7\30\2\2X[\3\2\2\2Y[\7\64\2\2ZP\3\2\2"+
		"\2ZT\3\2\2\2ZU\3\2\2\2ZY\3\2\2\2[\5\3\2\2\2\\]\b\4\1\2]^\5\4\3\2^j\3\2"+
		"\2\2_`\f\4\2\2`b\7\27\2\2ac\5\b\5\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2di\7"+
		"\30\2\2ef\f\3\2\2fg\7\26\2\2gi\7\64\2\2h_\3\2\2\2he\3\2\2\2il\3\2\2\2"+
		"jh\3\2\2\2jk\3\2\2\2k\7\3\2\2\2lj\3\2\2\2mn\b\5\1\2no\5\32\16\2ou\3\2"+
		"\2\2pq\f\3\2\2qr\7\63\2\2rt\5\32\16\2sp\3\2\2\2tw\3\2\2\2us\3\2\2\2uv"+
		"\3\2\2\2v\t\3\2\2\2wu\3\2\2\2x}\5\6\4\2yz\5\f\7\2z{\5\n\6\2{}\3\2\2\2"+
		"|x\3\2\2\2|y\3\2\2\2}\13\3\2\2\2~\177\t\2\2\2\177\r\3\2\2\2\u0080\u0081"+
		"\b\b\1\2\u0081\u0082\5\n\6\2\u0082\u008e\3\2\2\2\u0083\u0084\f\5\2\2\u0084"+
		"\u0085\7#\2\2\u0085\u008d\5\n\6\2\u0086\u0087\f\4\2\2\u0087\u0088\7$\2"+
		"\2\u0088\u008d\5\n\6\2\u0089\u008a\f\3\2\2\u008a\u008b\7%\2\2\u008b\u008d"+
		"\5\n\6\2\u008c\u0083\3\2\2\2\u008c\u0086\3\2\2\2\u008c\u0089\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\17\3\2\2"+
		"\2\u0090\u008e\3\2\2\2\u0091\u0092\b\t\1\2\u0092\u0093\5\16\b\2\u0093"+
		"\u009c\3\2\2\2\u0094\u0095\f\4\2\2\u0095\u0096\7!\2\2\u0096\u009b\5\16"+
		"\b\2\u0097\u0098\f\3\2\2\u0098\u0099\7\"\2\2\u0099\u009b\5\16\b\2\u009a"+
		"\u0094\3\2\2\2\u009a\u0097\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\21\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0"+
		"\b\n\1\2\u00a0\u00a1\5\20\t\2\u00a1\u00b0\3\2\2\2\u00a2\u00a3\f\6\2\2"+
		"\u00a3\u00a4\7\35\2\2\u00a4\u00af\5\20\t\2\u00a5\u00a6\f\5\2\2\u00a6\u00a7"+
		"\7\36\2\2\u00a7\u00af\5\20\t\2\u00a8\u00a9\f\4\2\2\u00a9\u00aa\7\37\2"+
		"\2\u00aa\u00af\5\20\t\2\u00ab\u00ac\f\3\2\2\u00ac\u00ad\7 \2\2\u00ad\u00af"+
		"\5\20\t\2\u00ae\u00a2\3\2\2\2\u00ae\u00a5\3\2\2\2\u00ae\u00a8\3\2\2\2"+
		"\u00ae\u00ab\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1"+
		"\3\2\2\2\u00b1\23\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\b\13\1\2\u00b4"+
		"\u00b5\5\22\n\2\u00b5\u00be\3\2\2\2\u00b6\u00b7\f\4\2\2\u00b7\u00b8\7"+
		"/\2\2\u00b8\u00bd\5\22\n\2\u00b9\u00ba\f\3\2\2\u00ba\u00bb\7\60\2\2\u00bb"+
		"\u00bd\5\22\n\2\u00bc\u00b6\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bd\u00c0\3"+
		"\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\25\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c2\b\f\1\2\u00c2\u00c3\5\24\13\2\u00c3\u00c9\3"+
		"\2\2\2\u00c4\u00c5\f\3\2\2\u00c5\u00c6\7,\2\2\u00c6\u00c8\5\24\13\2\u00c7"+
		"\u00c4\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\27\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\b\r\1\2\u00cd\u00ce"+
		"\5\26\f\2\u00ce\u00d4\3\2\2\2\u00cf\u00d0\f\3\2\2\u00d0\u00d1\7-\2\2\u00d1"+
		"\u00d3\5\26\f\2\u00d2\u00cf\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3"+
		"\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\31\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00dd\5\30\r\2\u00d8\u00d9\5\n\6\2\u00d9\u00da\5\34\17\2\u00da\u00db"+
		"\5\32\16\2\u00db\u00dd\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dc\u00d8\3\2\2\2"+
		"\u00dd\33\3\2\2\2\u00de\u00df\t\3\2\2\u00df\35\3\2\2\2\u00e0\u00e1\5\""+
		"\22\2\u00e1\u00e2\5 \21\2\u00e2\u00e3\7\62\2\2\u00e3\37\3\2\2\2\u00e4"+
		"\u00ea\5$\23\2\u00e5\u00e6\5$\23\2\u00e6\u00e7\7&\2\2\u00e7\u00e8\5\32"+
		"\16\2\u00e8\u00ea\3\2\2\2\u00e9\u00e4\3\2\2\2\u00e9\u00e5\3\2\2\2\u00ea"+
		"!\3\2\2\2\u00eb\u00ec\t\4\2\2\u00ec#\3\2\2\2\u00ed\u00ee\b\23\1\2\u00ee"+
		"\u00f4\7\64\2\2\u00ef\u00f0\7\27\2\2\u00f0\u00f1\5$\23\2\u00f1\u00f2\7"+
		"\30\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00ed\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f4"+
		"\u00fd\3\2\2\2\u00f5\u00f6\f\3\2\2\u00f6\u00f8\7\27\2\2\u00f7\u00f9\5"+
		"&\24\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fc\7\30\2\2\u00fb\u00f5\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3"+
		"\2\2\2\u00fd\u00fe\3\2\2\2\u00fe%\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101"+
		"\b\24\1\2\u0101\u0102\5(\25\2\u0102\u0108\3\2\2\2\u0103\u0104\f\3\2\2"+
		"\u0104\u0105\7\63\2\2\u0105\u0107\5&\24\4\u0106\u0103\3\2\2\2\u0107\u010a"+
		"\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\'\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010b\u010c\5\"\22\2\u010c\u010d\7\64\2\2\u010d)\3\2\2"+
		"\2\u010e\u0117\5,\27\2\u010f\u0110\5\64\33\2\u0110\u0111\b\26\1\2\u0111"+
		"\u0117\3\2\2\2\u0112\u0117\5\66\34\2\u0113\u0117\58\35\2\u0114\u0117\5"+
		"<\37\2\u0115\u0117\5D#\2\u0116\u010e\3\2\2\2\u0116\u010f\3\2\2\2\u0116"+
		"\u0112\3\2\2\2\u0116\u0113\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2"+
		"\2\2\u0117+\3\2\2\2\u0118\u011a\7\33\2\2\u0119\u011b\5\60\31\2\u011a\u0119"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\7\34\2\2"+
		"\u011d-\3\2\2\2\u011e\u011f\7\24\2\2\u011f\u0120\5\32\16\2\u0120\u0122"+
		"\7\61\2\2\u0121\u0123\5\60\31\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2"+
		"\2\u0123\u0125\3\2\2\2\u0124\u0126\5.\30\2\u0125\u0124\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0130\3\2\2\2\u0127\u0129\7\25\2\2\u0128\u012a\5\32\16"+
		"\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d"+
		"\7\61\2\2\u012c\u012e\5\60\31\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2"+
		"\2\u012e\u0130\3\2\2\2\u012f\u011e\3\2\2\2\u012f\u0127\3\2\2\2\u0130/"+
		"\3\2\2\2\u0131\u0132\b\31\1\2\u0132\u0133\5\62\32\2\u0133\u013a\3\2\2"+
		"\2\u0134\u0135\f\3\2\2\u0135\u0136\5\62\32\2\u0136\u0137\b\31\1\2\u0137"+
		"\u0139\3\2\2\2\u0138\u0134\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013b\61\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e"+
		"\5*\26\2\u013e\u013f\b\32\1\2\u013f\u0142\3\2\2\2\u0140\u0142\5\36\20"+
		"\2\u0141\u013d\3\2\2\2\u0141\u0140\3\2\2\2\u0142\63\3\2\2\2\u0143\u0144"+
		"\5\32\16\2\u0144\u0145\7\62\2\2\u0145\u0149\3\2\2\2\u0146\u0147\7\62\2"+
		"\2\u0147\u0149\b\33\1\2\u0148\u0143\3\2\2\2\u0148\u0146\3\2\2\2\u0149"+
		"\65\3\2\2\2\u014a\u014b\7\f\2\2\u014b\u014c\7\27\2\2\u014c\u014d\5\32"+
		"\16\2\u014d\u014e\7\30\2\2\u014e\u0151\5,\27\2\u014f\u0150\7\t\2\2\u0150"+
		"\u0152\5,\27\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\67\3\2\2"+
		"\2\u0153\u0154\7\23\2\2\u0154\u0155\7\27\2\2\u0155\u0156\5\32\16\2\u0156"+
		"\u0157\7\30\2\2\u0157\u0158\5:\36\2\u01589\3\2\2\2\u0159\u015a\7\33\2"+
		"\2\u015a\u015b\5.\30\2\u015b\u015c\7\34\2\2\u015c;\3\2\2\2\u015d\u015e"+
		"\7\22\2\2\u015e\u015f\7\27\2\2\u015f\u0160\5\32\16\2\u0160\u0161\7\30"+
		"\2\2\u0161\u0162\5,\27\2\u0162\u0171\3\2\2\2\u0163\u0164\7\13\2\2\u0164"+
		"\u0165\7\27\2\2\u0165\u0166\5> \2\u0166\u0167\7\30\2\2\u0167\u0168\5,"+
		"\27\2\u0168\u0171\3\2\2\2\u0169\u016a\7\7\2\2\u016a\u016b\5,\27\2\u016b"+
		"\u016c\7\22\2\2\u016c\u016d\7\27\2\2\u016d\u016e\5\32\16\2\u016e\u016f"+
		"\7\30\2\2\u016f\u0171\3\2\2\2\u0170\u015d\3\2\2\2\u0170\u0163\3\2\2\2"+
		"\u0170\u0169\3\2\2\2\u0171=\3\2\2\2\u0172\u0174\5B\"\2\u0173\u0172\3\2"+
		"\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\7\62\2\2\u0176"+
		"\u0178\5@!\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2"+
		"\2\u0179\u017b\7\62\2\2\u017a\u017c\5@!\2\u017b\u017a\3\2\2\2\u017b\u017c"+
		"\3\2\2\2\u017c\u0189\3\2\2\2\u017d\u017f\5\32\16\2\u017e\u017d\3\2\2\2"+
		"\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\7\62\2\2\u0181\u0183"+
		"\5@!\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0186\7\62\2\2\u0185\u0187\5@!\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187\u0189\3\2\2\2\u0188\u0173\3\2\2\2\u0188\u017e\3\2\2\2\u0189"+
		"?\3\2\2\2\u018a\u018b\b!\1\2\u018b\u018c\5\32\16\2\u018c\u0192\3\2\2\2"+
		"\u018d\u018e\f\3\2\2\u018e\u018f\7\63\2\2\u018f\u0191\5\32\16\2\u0190"+
		"\u018d\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193A\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0196\5\"\22\2\u0196\u0197"+
		"\5 \21\2\u0197C\3\2\2\2\u0198\u0199\7\6\2\2\u0199\u01a2\7\62\2\2\u019a"+
		"\u019b\7\4\2\2\u019b\u01a2\7\62\2\2\u019c\u019e\7\17\2\2\u019d\u019f\5"+
		"\32\16\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a2\7\62\2\2\u01a1\u0198\3\2\2\2\u01a1\u019a\3\2\2\2\u01a1\u019c\3"+
		"\2\2\2\u01a2E\3\2\2\2\u01a3\u01a4\b$\1\2\u01a4\u01a5\5H%\2\u01a5\u01aa"+
		"\3\2\2\2\u01a6\u01a7\f\3\2\2\u01a7\u01a9\5H%\2\u01a8\u01a6\3\2\2\2\u01a9"+
		"\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01abG\3\2\2\2"+
		"\u01ac\u01aa\3\2\2\2\u01ad\u01ae\5\"\22\2\u01ae\u01af\5$\23\2\u01af\u01b0"+
		"\5,\27\2\u01b0I\3\2\2\2\61KRZbhju|\u008c\u008e\u009a\u009c\u00ae\u00b0"+
		"\u00bc\u00be\u00c9\u00d4\u00dc\u00e9\u00f3\u00f8\u00fd\u0108\u0116\u011a"+
		"\u0122\u0125\u0129\u012d\u012f\u013a\u0141\u0148\u0151\u0170\u0173\u0177"+
		"\u017b\u017e\u0182\u0186\u0188\u0192\u019e\u01a1\u01aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}