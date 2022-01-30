// Generated from D:/study/MT/ParserGenerator/src/main/grammar\Grammar.g4 by ANTLR 4.9.2
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
		FIELDS=1, LEFT_PAREN=2, RIGHT_PAREN=3, LEFT_BRACKET=4, RIGHT_BRAKCET=5, 
		LEFT_BRACE=6, RIGHT_BRACE=7, LEFT_ANGLE=8, RIGHT_ANGLE=9, COLON=10, SEMICOLON=11, 
		COMMA=12, OR=13, GRAMMAR=14, PACKAGE=15, REGEXP=16, SKIP_RULE=17, ARGUMENT=18, 
		WHITESPACES=19, BLOCK_COMMENT=20, LINE_COMMENT=21, ID=22, TERMINAL_NAME=23, 
		LOWERCASE=24, CAPITALIZED=25, CODE=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FIELDS", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRAKCET", 
			"LEFT_BRACE", "RIGHT_BRACE", "LEFT_ANGLE", "RIGHT_ANGLE", "COLON", "SEMICOLON", 
			"COMMA", "OR", "GRAMMAR", "PACKAGE", "REGEXP", "SKIP_RULE", "ARGUMENT", 
			"WHITESPACES", "BLOCK_COMMENT", "LINE_COMMENT", "ID", "TERMINAL_NAME", 
			"LOWERCASE", "CAPITALIZED", "CODE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'members'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'>'", 
			"':'", "';'", "','", "'|'", "'grammar'", "'package'", null, "'-> skip'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FIELDS", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRAKCET", 
			"LEFT_BRACE", "RIGHT_BRACE", "LEFT_ANGLE", "RIGHT_ANGLE", "COLON", "SEMICOLON", 
			"COMMA", "OR", "GRAMMAR", "PACKAGE", "REGEXP", "SKIP_RULE", "ARGUMENT", 
			"WHITESPACES", "BLOCK_COMMENT", "LINE_COMMENT", "ID", "TERMINAL_NAME", 
			"LOWERCASE", "CAPITALIZED", "CODE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00bd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\7\21j\n\21\f\21\16\21m\13\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\6\23{\n\23"+
		"\r\23\16\23|\3\23\3\23\3\24\6\24\u0082\n\24\r\24\16\24\u0083\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\7\25\u008c\n\25\f\25\16\25\u008f\13\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u009a\n\26\f\26\16\26\u009d\13"+
		"\26\3\26\3\26\3\27\3\27\3\30\6\30\u00a4\n\30\r\30\16\30\u00a5\3\31\3\31"+
		"\7\31\u00aa\n\31\f\31\16\31\u00ad\13\31\3\32\3\32\7\32\u00b1\n\32\f\32"+
		"\16\32\u00b4\13\32\3\33\3\33\6\33\u00b8\n\33\r\33\16\33\u00b9\3\33\3\33"+
		"\6k|\u008d\u00b9\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\3\2\b\5\2\13\f\17\17\"\"\4\2\f\f\17\17\4\2C\\aa\3\2c|\5\2\62;C"+
		"\\c|\3\2C\\\2\u00c5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2"+
		"\2\2\5?\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2\13E\3\2\2\2\rG\3\2\2\2\17I\3\2\2"+
		"\2\21K\3\2\2\2\23M\3\2\2\2\25O\3\2\2\2\27Q\3\2\2\2\31S\3\2\2\2\33U\3\2"+
		"\2\2\35W\3\2\2\2\37_\3\2\2\2!g\3\2\2\2#p\3\2\2\2%x\3\2\2\2\'\u0081\3\2"+
		"\2\2)\u0087\3\2\2\2+\u0095\3\2\2\2-\u00a0\3\2\2\2/\u00a3\3\2\2\2\61\u00a7"+
		"\3\2\2\2\63\u00ae\3\2\2\2\65\u00b5\3\2\2\2\678\7o\2\289\7g\2\29:\7o\2"+
		"\2:;\7d\2\2;<\7g\2\2<=\7t\2\2=>\7u\2\2>\4\3\2\2\2?@\7*\2\2@\6\3\2\2\2"+
		"AB\7+\2\2B\b\3\2\2\2CD\7]\2\2D\n\3\2\2\2EF\7_\2\2F\f\3\2\2\2GH\7}\2\2"+
		"H\16\3\2\2\2IJ\7\177\2\2J\20\3\2\2\2KL\7>\2\2L\22\3\2\2\2MN\7@\2\2N\24"+
		"\3\2\2\2OP\7<\2\2P\26\3\2\2\2QR\7=\2\2R\30\3\2\2\2ST\7.\2\2T\32\3\2\2"+
		"\2UV\7~\2\2V\34\3\2\2\2WX\7i\2\2XY\7t\2\2YZ\7c\2\2Z[\7o\2\2[\\\7o\2\2"+
		"\\]\7c\2\2]^\7t\2\2^\36\3\2\2\2_`\7r\2\2`a\7c\2\2ab\7e\2\2bc\7m\2\2cd"+
		"\7c\2\2de\7i\2\2ef\7g\2\2f \3\2\2\2gk\7$\2\2hj\13\2\2\2ih\3\2\2\2jm\3"+
		"\2\2\2kl\3\2\2\2ki\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7$\2\2o\"\3\2\2\2pq\7"+
		"/\2\2qr\7@\2\2rs\7\"\2\2st\7u\2\2tu\7m\2\2uv\7k\2\2vw\7r\2\2w$\3\2\2\2"+
		"xz\5\5\3\2y{\13\2\2\2zy\3\2\2\2{|\3\2\2\2|}\3\2\2\2|z\3\2\2\2}~\3\2\2"+
		"\2~\177\5\7\4\2\177&\3\2\2\2\u0080\u0082\t\2\2\2\u0081\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0086\b\24\2\2\u0086(\3\2\2\2\u0087\u0088\7\61\2\2\u0088\u0089"+
		"\7,\2\2\u0089\u008d\3\2\2\2\u008a\u008c\13\2\2\2\u008b\u008a\3\2\2\2\u008c"+
		"\u008f\3\2\2\2\u008d\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7,\2\2\u0091\u0092\7\61\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0094\b\25\2\2\u0094*\3\2\2\2\u0095\u0096\7\61\2"+
		"\2\u0096\u0097\7\61\2\2\u0097\u009b\3\2\2\2\u0098\u009a\n\3\2\2\u0099"+
		"\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\b\26\2\2\u009f"+
		",\3\2\2\2\u00a0\u00a1\5\61\31\2\u00a1.\3\2\2\2\u00a2\u00a4\t\4\2\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\60\3\2\2\2\u00a7\u00ab\t\5\2\2\u00a8\u00aa\t\6\2\2\u00a9\u00a8"+
		"\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\62\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b2\t\7\2\2\u00af\u00b1\t\6\2"+
		"\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\64\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\5\r\7\2\u00b6"+
		"\u00b8\13\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3"+
		"\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\5\17\b\2\u00bc"+
		"\66\3\2\2\2\f\2k|\u0083\u008d\u009b\u00a5\u00ab\u00b2\u00b9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}