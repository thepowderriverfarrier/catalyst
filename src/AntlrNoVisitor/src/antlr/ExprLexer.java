// Generated from Expr.g4 by ANTLR 4.8

	package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, IMPORT=2, XDMPEVAL=3, DECLAREFUNCTIONAS=4, DECLAREVARIABLEAS=5, 
		TESTPHRASE=6, OPPRED=7, WHITESPACE=8, WORD=9, NUMBER=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "IMPORT", "XDMPEVAL", "DECLAREFUNCTIONAS", "DECLAREVARIABLEAS", 
			"TESTPHRASE", "OPPRED", "WHITESPACE", "WORD", "NUMBER", "XDMP", "FUNCTIONAS", 
			"VARIABLEAS", "LETTER", "LBRAC", "RBRAC", "LPAREN", "SIGNS", "DIGIT", 
			"T", "E", "S", "P", "H", "R", "A"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'import'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "IMPORT", "XDMPEVAL", "DECLAREFUNCTIONAS", "DECLAREVARIABLEAS", 
			"TESTPHRASE", "OPPRED", "WHITESPACE", "WORD", "NUMBER"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f\u00e5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\6\5Q\n\5\r\5\16"+
		"\5R\3\5\3\5\3\6\3\6\6\6Y\n\6\r\6\16\6Z\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\6\bl\n\b\r\b\16\bm\3\b\3\b\5\br\n\b\3\b\7"+
		"\bu\n\b\f\b\16\bx\13\b\3\t\6\t{\n\t\r\t\16\t|\3\t\3\t\3\n\6\n\u0082\n"+
		"\n\r\n\16\n\u0083\3\13\6\13\u0087\n\13\r\13\16\13\u0088\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009e"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00d4\n\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\6=R"+
		"Zm\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\2\31\2\33\2\35"+
		"\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\3\2\5\4\2\13\f\"\"\4\2"+
		"C\\c|\7\2--\60\61>>@@~~\2\u00e2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\3\67\3\2\2\2\5E\3\2\2\2\7L\3\2\2\2\tN\3\2\2\2\13V\3"+
		"\2\2\2\r^\3\2\2\2\17i\3\2\2\2\21z\3\2\2\2\23\u0081\3\2\2\2\25\u0086\3"+
		"\2\2\2\27\u009d\3\2\2\2\31\u009f\3\2\2\2\33\u00b0\3\2\2\2\35\u00c3\3\2"+
		"\2\2\37\u00c5\3\2\2\2!\u00c7\3\2\2\2#\u00c9\3\2\2\2%\u00d3\3\2\2\2\'\u00d5"+
		"\3\2\2\2)\u00d7\3\2\2\2+\u00d9\3\2\2\2-\u00db\3\2\2\2/\u00dd\3\2\2\2\61"+
		"\u00df\3\2\2\2\63\u00e1\3\2\2\2\65\u00e3\3\2\2\2\678\7*\2\289\7<\2\29"+
		"=\3\2\2\2:<\13\2\2\2;:\3\2\2\2<?\3\2\2\2=>\3\2\2\2=;\3\2\2\2>@\3\2\2\2"+
		"?=\3\2\2\2@A\7<\2\2AB\7+\2\2BC\3\2\2\2CD\b\2\2\2D\4\3\2\2\2EF\7k\2\2F"+
		"G\7o\2\2GH\7r\2\2HI\7q\2\2IJ\7t\2\2JK\7v\2\2K\6\3\2\2\2LM\5\27\f\2M\b"+
		"\3\2\2\2NP\5\31\r\2OQ\13\2\2\2PO\3\2\2\2QR\3\2\2\2RS\3\2\2\2RP\3\2\2\2"+
		"ST\3\2\2\2TU\5#\22\2U\n\3\2\2\2VX\5\33\16\2WY\13\2\2\2XW\3\2\2\2YZ\3\2"+
		"\2\2Z[\3\2\2\2ZX\3\2\2\2[\\\3\2\2\2\\]\7=\2\2]\f\3\2\2\2^_\5)\25\2_`\5"+
		"+\26\2`a\5-\27\2ab\5)\25\2bc\5/\30\2cd\5\61\31\2de\5\63\32\2ef\5\65\33"+
		"\2fg\5-\27\2gh\5+\26\2h\16\3\2\2\2ik\5\37\20\2jl\13\2\2\2kj\3\2\2\2lm"+
		"\3\2\2\2mn\3\2\2\2mk\3\2\2\2no\3\2\2\2oq\5!\21\2pr\5%\23\2qp\3\2\2\2q"+
		"r\3\2\2\2rv\3\2\2\2su\5\23\n\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2"+
		"w\20\3\2\2\2xv\3\2\2\2y{\t\2\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2"+
		"\2}~\3\2\2\2~\177\b\t\2\2\177\22\3\2\2\2\u0080\u0082\5\35\17\2\u0081\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\24\3\2\2\2\u0085\u0087\5\'\24\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2"+
		"\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\26\3\2\2\2\u008a\u008b"+
		"\7z\2\2\u008b\u008c\7f\2\2\u008c\u008d\7o\2\2\u008d\u008e\7r\2\2\u008e"+
		"\u008f\7<\2\2\u008f\u0090\7g\2\2\u0090\u0091\7x\2\2\u0091\u0092\7c\2\2"+
		"\u0092\u009e\7n\2\2\u0093\u0094\7z\2\2\u0094\u0095\7f\2\2\u0095\u0096"+
		"\7o\2\2\u0096\u0097\7r\2\2\u0097\u0098\7<\2\2\u0098\u0099\7x\2\2\u0099"+
		"\u009a\7c\2\2\u009a\u009b\7n\2\2\u009b\u009c\7w\2\2\u009c\u009e\7g\2\2"+
		"\u009d\u008a\3\2\2\2\u009d\u0093\3\2\2\2\u009e\30\3\2\2\2\u009f\u00a0"+
		"\7f\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7n\2\2\u00a3"+
		"\u00a4\7c\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7\"\2"+
		"\2\u00a7\u00a8\7h\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab"+
		"\7e\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7q\2\2\u00ae"+
		"\u00af\7p\2\2\u00af\32\3\2\2\2\u00b0\u00b1\7f\2\2\u00b1\u00b2\7g\2\2\u00b2"+
		"\u00b3\7e\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7t\2\2"+
		"\u00b6\u00b7\7g\2\2\u00b7\u00b8\7\"\2\2\u00b8\u00b9\7x\2\2\u00b9\u00ba"+
		"\7c\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7c\2\2\u00bd"+
		"\u00be\7d\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7\"\2"+
		"\2\u00c1\u00c2\7&\2\2\u00c2\34\3\2\2\2\u00c3\u00c4\t\3\2\2\u00c4\36\3"+
		"\2\2\2\u00c5\u00c6\7]\2\2\u00c6 \3\2\2\2\u00c7\u00c8\7_\2\2\u00c8\"\3"+
		"\2\2\2\u00c9\u00ca\7*\2\2\u00ca$\3\2\2\2\u00cb\u00d4\7B\2\2\u00cc\u00cd"+
		"\7*\2\2\u00cd\u00d4\7+\2\2\u00ce\u00d4\7,\2\2\u00cf\u00d0\7\"\2\2\u00d0"+
		"\u00d1\7?\2\2\u00d1\u00d4\7\"\2\2\u00d2\u00d4\t\4\2\2\u00d3\u00cb\3\2"+
		"\2\2\u00d3\u00cc\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4&\3\2\2\2\u00d5\u00d6\4\62;\2\u00d6(\3\2\2\2\u00d7"+
		"\u00d8\7v\2\2\u00d8*\3\2\2\2\u00d9\u00da\7g\2\2\u00da,\3\2\2\2\u00db\u00dc"+
		"\7u\2\2\u00dc.\3\2\2\2\u00dd\u00de\7r\2\2\u00de\60\3\2\2\2\u00df\u00e0"+
		"\7j\2\2\u00e0\62\3\2\2\2\u00e1\u00e2\7t\2\2\u00e2\64\3\2\2\2\u00e3\u00e4"+
		"\7c\2\2\u00e4\66\3\2\2\2\16\2=RZmqv|\u0083\u0088\u009d\u00d3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}