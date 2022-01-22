// Generated from D:/study/MT/AutomaticAnalyzerGen/src/main/grammar\Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Bool", "Break", "Char", "Continue", "Do", "Double", "Else", "Float", 
			"For", "If", "Int", "Long", "Return", "Short", "Void", "While", "Switch", 
			"Case", "Default", "Dot", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "Less", "NotGreater", "Greater", "NotLess", 
			"Plus", "Minus", "Mul", "Div", "Mod", "Assign", "PlusAssign", "MinusAssign", 
			"MulAssign", "DivAssign", "ModAssign", "And", "Or", "Not", "Equal", "NotEqual", 
			"Colon", "Semicolon", "Comma", "ID", "Schar", "StringLiteral", "Sign", 
			"Digit", "NonDigit", "DigitSequence", "FractionalConst", "DecimalConst", 
			"Number", "Whitespace", "Newline", "BlockComment", "LineComment"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u018c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+"+
		"\3+\3+\3,\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\63\7\63\u0136\n\63\f\63\16\63\u0139\13\63\3\64\3\64\3\65"+
		"\3\65\7\65\u013f\n\65\f\65\16\65\u0142\13\65\3\65\3\65\3\66\3\66\3\67"+
		"\3\67\38\38\39\69\u014d\n9\r9\169\u014e\3:\5:\u0152\n:\3:\3:\3:\3:\3:"+
		"\5:\u0159\n:\3;\6;\u015c\n;\r;\16;\u015d\3<\3<\5<\u0162\n<\3=\6=\u0165"+
		"\n=\r=\16=\u0166\3=\3=\3>\3>\5>\u016d\n>\3>\5>\u0170\n>\3>\3>\3?\3?\3"+
		"?\3?\7?\u0178\n?\f?\16?\u017b\13?\3?\3?\3?\3?\3?\3@\3@\3@\3@\7@\u0186"+
		"\n@\f@\16@\u0189\13@\3@\3@\3\u0179\2A\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\2i\65k\2m\2o\2q\2s\2u\2w\66y\67{8}9\177:\3\2\7"+
		"\6\2\f\f\17\17$$^^\4\2--//\5\2C\\aac|\4\2\13\13\"\"\4\2\f\f\17\17\2\u0191"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2i\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2"+
		"\2\2}\3\2\2\2\2\177\3\2\2\2\3\u0081\3\2\2\2\5\u0086\3\2\2\2\7\u008c\3"+
		"\2\2\2\t\u0091\3\2\2\2\13\u009a\3\2\2\2\r\u009d\3\2\2\2\17\u00a4\3\2\2"+
		"\2\21\u00a9\3\2\2\2\23\u00af\3\2\2\2\25\u00b3\3\2\2\2\27\u00b6\3\2\2\2"+
		"\31\u00ba\3\2\2\2\33\u00bf\3\2\2\2\35\u00c6\3\2\2\2\37\u00cc\3\2\2\2!"+
		"\u00d1\3\2\2\2#\u00d7\3\2\2\2%\u00de\3\2\2\2\'\u00e3\3\2\2\2)\u00eb\3"+
		"\2\2\2+\u00ed\3\2\2\2-\u00ef\3\2\2\2/\u00f1\3\2\2\2\61\u00f3\3\2\2\2\63"+
		"\u00f5\3\2\2\2\65\u00f7\3\2\2\2\67\u00f9\3\2\2\29\u00fb\3\2\2\2;\u00fe"+
		"\3\2\2\2=\u0100\3\2\2\2?\u0103\3\2\2\2A\u0105\3\2\2\2C\u0107\3\2\2\2E"+
		"\u0109\3\2\2\2G\u010b\3\2\2\2I\u010d\3\2\2\2K\u010f\3\2\2\2M\u0112\3\2"+
		"\2\2O\u0115\3\2\2\2Q\u0118\3\2\2\2S\u011b\3\2\2\2U\u011e\3\2\2\2W\u0121"+
		"\3\2\2\2Y\u0124\3\2\2\2[\u0126\3\2\2\2]\u0129\3\2\2\2_\u012c\3\2\2\2a"+
		"\u012e\3\2\2\2c\u0130\3\2\2\2e\u0132\3\2\2\2g\u013a\3\2\2\2i\u013c\3\2"+
		"\2\2k\u0145\3\2\2\2m\u0147\3\2\2\2o\u0149\3\2\2\2q\u014c\3\2\2\2s\u0158"+
		"\3\2\2\2u\u015b\3\2\2\2w\u0161\3\2\2\2y\u0164\3\2\2\2{\u016f\3\2\2\2}"+
		"\u0173\3\2\2\2\177\u0181\3\2\2\2\u0081\u0082\7d\2\2\u0082\u0083\7q\2\2"+
		"\u0083\u0084\7q\2\2\u0084\u0085\7n\2\2\u0085\4\3\2\2\2\u0086\u0087\7d"+
		"\2\2\u0087\u0088\7t\2\2\u0088\u0089\7g\2\2\u0089\u008a\7c\2\2\u008a\u008b"+
		"\7m\2\2\u008b\6\3\2\2\2\u008c\u008d\7e\2\2\u008d\u008e\7j\2\2\u008e\u008f"+
		"\7c\2\2\u008f\u0090\7t\2\2\u0090\b\3\2\2\2\u0091\u0092\7e\2\2\u0092\u0093"+
		"\7q\2\2\u0093\u0094\7p\2\2\u0094\u0095\7v\2\2\u0095\u0096\7k\2\2\u0096"+
		"\u0097\7p\2\2\u0097\u0098\7w\2\2\u0098\u0099\7g\2\2\u0099\n\3\2\2\2\u009a"+
		"\u009b\7f\2\2\u009b\u009c\7q\2\2\u009c\f\3\2\2\2\u009d\u009e\7f\2\2\u009e"+
		"\u009f\7q\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1\7d\2\2\u00a1\u00a2\7n\2\2"+
		"\u00a2\u00a3\7g\2\2\u00a3\16\3\2\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7"+
		"n\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7g\2\2\u00a8\20\3\2\2\2\u00a9\u00aa"+
		"\7h\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7c\2\2\u00ad"+
		"\u00ae\7v\2\2\u00ae\22\3\2\2\2\u00af\u00b0\7h\2\2\u00b0\u00b1\7q\2\2\u00b1"+
		"\u00b2\7t\2\2\u00b2\24\3\2\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7h\2\2\u00b5"+
		"\26\3\2\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7v\2\2\u00b9"+
		"\30\3\2\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7p\2\2\u00bd"+
		"\u00be\7i\2\2\u00be\32\3\2\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7g\2\2\u00c1"+
		"\u00c2\7v\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7p\2\2"+
		"\u00c5\34\3\2\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7j\2\2\u00c8\u00c9\7"+
		"q\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7v\2\2\u00cb\36\3\2\2\2\u00cc\u00cd"+
		"\7x\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7f\2\2\u00d0"+
		" \3\2\2\2\u00d1\u00d2\7y\2\2\u00d2\u00d3\7j\2\2\u00d3\u00d4\7k\2\2\u00d4"+
		"\u00d5\7n\2\2\u00d5\u00d6\7g\2\2\u00d6\"\3\2\2\2\u00d7\u00d8\7u\2\2\u00d8"+
		"\u00d9\7y\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7e\2\2"+
		"\u00dc\u00dd\7j\2\2\u00dd$\3\2\2\2\u00de\u00df\7e\2\2\u00df\u00e0\7c\2"+
		"\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7g\2\2\u00e2&\3\2\2\2\u00e3\u00e4\7"+
		"f\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7h\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8"+
		"\7w\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea\7v\2\2\u00ea(\3\2\2\2\u00eb\u00ec"+
		"\7\60\2\2\u00ec*\3\2\2\2\u00ed\u00ee\7*\2\2\u00ee,\3\2\2\2\u00ef\u00f0"+
		"\7+\2\2\u00f0.\3\2\2\2\u00f1\u00f2\7]\2\2\u00f2\60\3\2\2\2\u00f3\u00f4"+
		"\7_\2\2\u00f4\62\3\2\2\2\u00f5\u00f6\7}\2\2\u00f6\64\3\2\2\2\u00f7\u00f8"+
		"\7\177\2\2\u00f8\66\3\2\2\2\u00f9\u00fa\7>\2\2\u00fa8\3\2\2\2\u00fb\u00fc"+
		"\7>\2\2\u00fc\u00fd\7?\2\2\u00fd:\3\2\2\2\u00fe\u00ff\7@\2\2\u00ff<\3"+
		"\2\2\2\u0100\u0101\7@\2\2\u0101\u0102\7?\2\2\u0102>\3\2\2\2\u0103\u0104"+
		"\7-\2\2\u0104@\3\2\2\2\u0105\u0106\7/\2\2\u0106B\3\2\2\2\u0107\u0108\7"+
		",\2\2\u0108D\3\2\2\2\u0109\u010a\7\61\2\2\u010aF\3\2\2\2\u010b\u010c\7"+
		"\'\2\2\u010cH\3\2\2\2\u010d\u010e\7?\2\2\u010eJ\3\2\2\2\u010f\u0110\7"+
		"-\2\2\u0110\u0111\7?\2\2\u0111L\3\2\2\2\u0112\u0113\7/\2\2\u0113\u0114"+
		"\7?\2\2\u0114N\3\2\2\2\u0115\u0116\7,\2\2\u0116\u0117\7?\2\2\u0117P\3"+
		"\2\2\2\u0118\u0119\7\61\2\2\u0119\u011a\7?\2\2\u011aR\3\2\2\2\u011b\u011c"+
		"\7\'\2\2\u011c\u011d\7?\2\2\u011dT\3\2\2\2\u011e\u011f\7(\2\2\u011f\u0120"+
		"\7(\2\2\u0120V\3\2\2\2\u0121\u0122\7~\2\2\u0122\u0123\7~\2\2\u0123X\3"+
		"\2\2\2\u0124\u0125\7#\2\2\u0125Z\3\2\2\2\u0126\u0127\7?\2\2\u0127\u0128"+
		"\7?\2\2\u0128\\\3\2\2\2\u0129\u012a\7#\2\2\u012a\u012b\7?\2\2\u012b^\3"+
		"\2\2\2\u012c\u012d\7<\2\2\u012d`\3\2\2\2\u012e\u012f\7=\2\2\u012fb\3\2"+
		"\2\2\u0130\u0131\7.\2\2\u0131d\3\2\2\2\u0132\u0137\5o8\2\u0133\u0136\5"+
		"o8\2\u0134\u0136\5m\67\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136"+
		"\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138f\3\2\2\2"+
		"\u0139\u0137\3\2\2\2\u013a\u013b\n\2\2\2\u013bh\3\2\2\2\u013c\u0140\7"+
		"$\2\2\u013d\u013f\5g\64\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2"+
		"\2\2\u0143\u0144\7$\2\2\u0144j\3\2\2\2\u0145\u0146\t\3\2\2\u0146l\3\2"+
		"\2\2\u0147\u0148\4\62;\2\u0148n\3\2\2\2\u0149\u014a\t\4\2\2\u014ap\3\2"+
		"\2\2\u014b\u014d\5m\67\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014fr\3\2\2\2\u0150\u0152\5q9\2\u0151"+
		"\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\7\60"+
		"\2\2\u0154\u0159\5q9\2\u0155\u0156\5q9\2\u0156\u0157\7\60\2\2\u0157\u0159"+
		"\3\2\2\2\u0158\u0151\3\2\2\2\u0158\u0155\3\2\2\2\u0159t\3\2\2\2\u015a"+
		"\u015c\5m\67\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b\3\2"+
		"\2\2\u015d\u015e\3\2\2\2\u015ev\3\2\2\2\u015f\u0162\5u;\2\u0160\u0162"+
		"\5s:\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162x\3\2\2\2\u0163\u0165"+
		"\t\5\2\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\b=\2\2\u0169z\3\2\2\2\u016a"+
		"\u016c\7\17\2\2\u016b\u016d\7\f\2\2\u016c\u016b\3\2\2\2\u016c\u016d\3"+
		"\2\2\2\u016d\u0170\3\2\2\2\u016e\u0170\7\f\2\2\u016f\u016a\3\2\2\2\u016f"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\b>\2\2\u0172|\3\2\2\2\u0173"+
		"\u0174\7\61\2\2\u0174\u0175\7,\2\2\u0175\u0179\3\2\2\2\u0176\u0178\13"+
		"\2\2\2\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u017a\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\7,"+
		"\2\2\u017d\u017e\7\61\2\2\u017e\u017f\3\2\2\2\u017f\u0180\b?\2\2\u0180"+
		"~\3\2\2\2\u0181\u0182\7\61\2\2\u0182\u0183\7\61\2\2\u0183\u0187\3\2\2"+
		"\2\u0184\u0186\n\6\2\2\u0185\u0184\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185"+
		"\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u0187\3\2\2\2\u018a"+
		"\u018b\b@\2\2\u018b\u0080\3\2\2\2\20\2\u0135\u0137\u0140\u014e\u0151\u0158"+
		"\u015d\u0161\u0166\u016c\u016f\u0179\u0187\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}