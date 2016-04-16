// Generated from PuppyScript.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PuppyScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BR=1, CCB=2, COMMA=3, CP=4, CSQUARE=5, DIVIDE=6, EQ=7, MINUS=8, OCB=9, 
		OP=10, OSQUARE=11, PLUS=12, SEMI=13, STRICTGREATER=14, STRICTLESS=15, 
		TIMES=16, EQUALTO=17, GREATER=18, LESS=19, NOT=20, OR=21, AND=22, RUFF=23, 
		RELSE=24, TREAT=25, TRICK=26, WHILE=27, BOOLEAN=28, INT=29, ID=30, STRING=31, 
		ESC_SEQ=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BR", "CCB", "COMMA", "CP", "CSQUARE", "DIVIDE", "EQ", "MINUS", "OCB", 
		"OP", "OSQUARE", "PLUS", "SEMI", "STRICTGREATER", "STRICTLESS", "TIMES", 
		"EQUALTO", "GREATER", "LESS", "NOT", "OR", "AND", "RUFF", "RELSE", "TREAT", 
		"TRICK", "WHILE", "BOOLEAN", "INT", "ID", "STRING", "ESC_SEQ"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", "'}'", "','", "')'", "']'", "'/'", "'='", "'-'", "'{'", 
		"'('", "'['", "'+'", "';'", "'>'", "'<'", "'*'", "'=='", "'>='", "'<='", 
		"'!='", "'||'", "'&&'", "'ruff'", "'relse'", "'treat'", "'trick'", "'while'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BR", "CCB", "COMMA", "CP", "CSQUARE", "DIVIDE", "EQ", "MINUS", 
		"OCB", "OP", "OSQUARE", "PLUS", "SEMI", "STRICTGREATER", "STRICTLESS", 
		"TIMES", "EQUALTO", "GREATER", "LESS", "NOT", "OR", "AND", "RUFF", "RELSE", 
		"TREAT", "TRICK", "WHILE", "BOOLEAN", "INT", "ID", "STRING", "ESC_SEQ"
	};
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


	public PuppyScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PuppyScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\"\u00c0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\5\35\u009c\n\35\3\36\6\36\u009f\n\36\r\36\16\36\u00a0\3\37\3\37\7"+
		"\37\u00a5\n\37\f\37\16\37\u00a8\13\37\3 \3 \3 \7 \u00ad\n \f \16 \u00b0"+
		"\13 \3 \3 \3 \3 \7 \u00b6\n \f \16 \u00b9\13 \3 \5 \u00bc\n \3!\3!\3!"+
		"\2\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"\3\2\b\3\2\62;\6\2&&C\\aac|\7\2&&\62;C\\aac|\4\2$$^^\4"+
		"\2))^^\n\2$$\61\61^^ddhhppttvv\u00c7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\3C\3\2\2\2\5E\3\2\2\2\7G\3\2\2\2\tI\3\2\2\2\13K\3\2\2\2\rM\3\2\2"+
		"\2\17O\3\2\2\2\21Q\3\2\2\2\23S\3\2\2\2\25U\3\2\2\2\27W\3\2\2\2\31Y\3\2"+
		"\2\2\33[\3\2\2\2\35]\3\2\2\2\37_\3\2\2\2!a\3\2\2\2#c\3\2\2\2%f\3\2\2\2"+
		"\'i\3\2\2\2)l\3\2\2\2+o\3\2\2\2-r\3\2\2\2/u\3\2\2\2\61z\3\2\2\2\63\u0080"+
		"\3\2\2\2\65\u0086\3\2\2\2\67\u008c\3\2\2\29\u009b\3\2\2\2;\u009e\3\2\2"+
		"\2=\u00a2\3\2\2\2?\u00bb\3\2\2\2A\u00bd\3\2\2\2CD\7\f\2\2D\4\3\2\2\2E"+
		"F\7\177\2\2F\6\3\2\2\2GH\7.\2\2H\b\3\2\2\2IJ\7+\2\2J\n\3\2\2\2KL\7_\2"+
		"\2L\f\3\2\2\2MN\7\61\2\2N\16\3\2\2\2OP\7?\2\2P\20\3\2\2\2QR\7/\2\2R\22"+
		"\3\2\2\2ST\7}\2\2T\24\3\2\2\2UV\7*\2\2V\26\3\2\2\2WX\7]\2\2X\30\3\2\2"+
		"\2YZ\7-\2\2Z\32\3\2\2\2[\\\7=\2\2\\\34\3\2\2\2]^\7@\2\2^\36\3\2\2\2_`"+
		"\7>\2\2` \3\2\2\2ab\7,\2\2b\"\3\2\2\2cd\7?\2\2de\7?\2\2e$\3\2\2\2fg\7"+
		"@\2\2gh\7?\2\2h&\3\2\2\2ij\7>\2\2jk\7?\2\2k(\3\2\2\2lm\7#\2\2mn\7?\2\2"+
		"n*\3\2\2\2op\7~\2\2pq\7~\2\2q,\3\2\2\2rs\7(\2\2st\7(\2\2t.\3\2\2\2uv\7"+
		"t\2\2vw\7w\2\2wx\7h\2\2xy\7h\2\2y\60\3\2\2\2z{\7t\2\2{|\7g\2\2|}\7n\2"+
		"\2}~\7u\2\2~\177\7g\2\2\177\62\3\2\2\2\u0080\u0081\7v\2\2\u0081\u0082"+
		"\7t\2\2\u0082\u0083\7g\2\2\u0083\u0084\7c\2\2\u0084\u0085\7v\2\2\u0085"+
		"\64\3\2\2\2\u0086\u0087\7v\2\2\u0087\u0088\7t\2\2\u0088\u0089\7k\2\2\u0089"+
		"\u008a\7e\2\2\u008a\u008b\7m\2\2\u008b\66\3\2\2\2\u008c\u008d\7y\2\2\u008d"+
		"\u008e\7j\2\2\u008e\u008f\7k\2\2\u008f\u0090\7n\2\2\u0090\u0091\7g\2\2"+
		"\u00918\3\2\2\2\u0092\u0093\7v\2\2\u0093\u0094\7t\2\2\u0094\u0095\7w\2"+
		"\2\u0095\u009c\7g\2\2\u0096\u0097\7h\2\2\u0097\u0098\7c\2\2\u0098\u0099"+
		"\7n\2\2\u0099\u009a\7u\2\2\u009a\u009c\7g\2\2\u009b\u0092\3\2\2\2\u009b"+
		"\u0096\3\2\2\2\u009c:\3\2\2\2\u009d\u009f\t\2\2\2\u009e\u009d\3\2\2\2"+
		"\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1<\3"+
		"\2\2\2\u00a2\u00a6\t\3\2\2\u00a3\u00a5\t\4\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7>\3\2\2\2"+
		"\u00a8\u00a6\3\2\2\2\u00a9\u00ae\7$\2\2\u00aa\u00ad\5A!\2\u00ab\u00ad"+
		"\n\5\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b1\u00bc\7$\2\2\u00b2\u00b7\7)\2\2\u00b3\u00b6\5A!\2\u00b4\u00b6"+
		"\n\6\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00ba\u00bc\7)\2\2\u00bb\u00a9\3\2\2\2\u00bb\u00b2\3\2\2\2\u00bc"+
		"@\3\2\2\2\u00bd\u00be\7^\2\2\u00be\u00bf\t\7\2\2\u00bfB\3\2\2\2\13\2\u009b"+
		"\u00a0\u00a6\u00ac\u00ae\u00b5\u00b7\u00bb\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}