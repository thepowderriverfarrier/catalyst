// Generated from Expr.g4 by ANTLR 4.8

	package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, IMPORT=2, XDMPEVAL=3, DECLAREFUNCTIONAS=4, DECLAREVARIABLEAS=5, 
		TESTPHRASE=6, OPPRED=7, WHITESPACE=8, WORD=9, NUMBER=10;
	public static final int
		RULE_prog = 0, RULE_parseerror = 1, RULE_expr = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "parseerror", "expr"
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

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public List<ParseerrorContext> parseerror() {
			return getRuleContexts(ParseerrorContext.class);
		}
		public ParseerrorContext parseerror(int i) {
			return getRuleContext(ParseerrorContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(8);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case XDMPEVAL:
				case DECLAREFUNCTIONAS:
				case DECLAREVARIABLEAS:
				case TESTPHRASE:
				case OPPRED:
					{
					setState(6);
					parseerror();
					}
					break;
				case IMPORT:
				case WORD:
				case NUMBER:
					{
					setState(7);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(10); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IMPORT) | (1L << XDMPEVAL) | (1L << DECLAREFUNCTIONAS) | (1L << DECLAREVARIABLEAS) | (1L << TESTPHRASE) | (1L << OPPRED) | (1L << WORD) | (1L << NUMBER))) != 0) );
			setState(12);
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

	public static class ParseerrorContext extends ParserRuleContext {
		public TerminalNode XDMPEVAL() { return getToken(ExprParser.XDMPEVAL, 0); }
		public TerminalNode DECLAREFUNCTIONAS() { return getToken(ExprParser.DECLAREFUNCTIONAS, 0); }
		public TerminalNode DECLAREVARIABLEAS() { return getToken(ExprParser.DECLAREVARIABLEAS, 0); }
		public TerminalNode TESTPHRASE() { return getToken(ExprParser.TESTPHRASE, 0); }
		public TerminalNode OPPRED() { return getToken(ExprParser.OPPRED, 0); }
		public ParseerrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseerror; }
	}

	public final ParseerrorContext parseerror() throws RecognitionException {
		ParseerrorContext _localctx = new ParseerrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_parseerror);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XDMPEVAL) | (1L << DECLAREFUNCTIONAS) | (1L << DECLAREVARIABLEAS) | (1L << TESTPHRASE) | (1L << OPPRED))) != 0)) ) {
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ExprParser.IMPORT, 0); }
		public TerminalNode NUMBER() { return getToken(ExprParser.NUMBER, 0); }
		public TerminalNode WORD() { return getToken(ExprParser.WORD, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IMPORT) | (1L << WORD) | (1L << NUMBER))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f\25\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\6\2\13\n\2\r\2\16\2\f\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\2\2\5\2\4\6\2\4\3\2\5\t\4\2\4\4\13\f\2\23\2\n\3\2\2\2\4\20\3\2\2\2\6"+
		"\22\3\2\2\2\b\13\5\4\3\2\t\13\5\6\4\2\n\b\3\2\2\2\n\t\3\2\2\2\13\f\3\2"+
		"\2\2\f\n\3\2\2\2\f\r\3\2\2\2\r\16\3\2\2\2\16\17\7\2\2\3\17\3\3\2\2\2\20"+
		"\21\t\2\2\2\21\5\3\2\2\2\22\23\t\3\2\2\23\7\3\2\2\2\4\n\f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}