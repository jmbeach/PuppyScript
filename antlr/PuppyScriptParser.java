// Generated from PuppyScript.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PuppyScriptParser extends Parser {
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
	public static final int
		RULE_statement = 0, RULE_statementList = 1, RULE_optStatementList = 2, 
		RULE_ifStatement = 3, RULE_elseStatement = 4, RULE_optElseStatement = 5, 
		RULE_whileLoop = 6, RULE_block = 7, RULE_expr = 8, RULE_optExprList = 9, 
		RULE_exprList = 10, RULE_assignOperator = 11, RULE_operator = 12, RULE_logicalOperator = 13, 
		RULE_lambdaCall = 14, RULE_functionDeclaration = 15, RULE_variableDeclaration = 16, 
		RULE_argList = 17, RULE_optArgList = 18, RULE_idList = 19, RULE_optId = 20, 
		RULE_optIdList = 21, RULE_primary = 22;
	public static final String[] ruleNames = {
		"statement", "statementList", "optStatementList", "ifStatement", "elseStatement", 
		"optElseStatement", "whileLoop", "block", "expr", "optExprList", "exprList", 
		"assignOperator", "operator", "logicalOperator", "lambdaCall", "functionDeclaration", 
		"variableDeclaration", "argList", "optArgList", "idList", "optId", "optIdList", 
		"primary"
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

	@Override
	public String getGrammarFileName() { return "PuppyScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PuppyScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public LambdaCallContext lambdaCall() {
			return getRuleContext(LambdaCallContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PuppyScriptParser.SEMI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode BR() { return getToken(PuppyScriptParser.BR, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			setState(58);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				whileLoop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				functionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				lambdaCall();
				setState(51);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				expr(0);
				setState(54);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(56);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(57);
				match(BR);
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

	public static class StatementListContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statementList);
		try {
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				statement();
				setState(62);
				statementList();
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

	public static class OptStatementListContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public OptStatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optStatementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).enterOptStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).exitOptStatementList(this);
		}
	}

	public final OptStatementListContext optStatementList() throws RecognitionException {
		OptStatementListContext _localctx = new OptStatementListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_optStatementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BR) | (1L << OP) | (1L << OSQUARE) | (1L << SEMI) | (1L << RUFF) | (1L << TREAT) | (1L << TRICK) | (1L << WHILE) | (1L << BOOLEAN) | (1L << INT) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				setState(66);
				statementList();
				}
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode RUFF() { return getToken(PuppyScriptParser.RUFF, 0); }
		public TerminalNode OP() { return getToken(PuppyScriptParser.OP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CP() { return getToken(PuppyScriptParser.CP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public OptElseStatementContext optElseStatement() {
			return getRuleContext(OptElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(RUFF);
			setState(70);
			match(OP);
			setState(71);
			expr(0);
			setState(72);
			match(CP);
			setState(73);
			block();
			setState(74);
			optElseStatement();
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

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode RELSE() { return getToken(PuppyScriptParser.RELSE, 0); }
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).exitElseStatement(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elseStatement);
		try {
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(RELSE);
				setState(77);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(RELSE);
				setState(79);
				block();
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

	public static class OptElseStatementContext extends ParserRuleContext {
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public OptElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).enterOptElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).exitOptElseStatement(this);
		}
	}

	public final OptElseStatementContext optElseStatement() throws RecognitionException {
		OptElseStatementContext _localctx = new OptElseStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_optElseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if (_la==RELSE) {
				{
				setState(82);
				elseStatement();
				}
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

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PuppyScriptParser.WHILE, 0); }
		public TerminalNode OP() { return getToken(PuppyScriptParser.OP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CP() { return getToken(PuppyScriptParser.CP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(WHILE);
			setState(86);
			match(OP);
			setState(87);
			expr(0);
			setState(88);
			match(CP);
			setState(89);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OCB() { return getToken(PuppyScriptParser.OCB, 0); }
		public OptStatementListContext optStatementList() {
			return getRuleContext(OptStatementListContext.class,0);
		}
		public TerminalNode CCB() { return getToken(PuppyScriptParser.CCB, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(OCB);
			setState(92);
			optStatementList();
			setState(93);
			match(CCB);
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
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public AssignOperatorContext assignOperator() {
			return getRuleContext(AssignOperatorContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(96);
			primary();
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(110);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(98);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(99);
						operator();
						setState(100);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(103);
						logicalOperator();
						setState(104);
						expr(3);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(106);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(107);
						assignOperator();
						setState(108);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(114);
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

	public static class OptExprListContext extends ParserRuleContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public OptExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optExprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).enterOptExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).exitOptExprList(this);
		}
	}

	public final OptExprListContext optExprList() throws RecognitionException {
		OptExprListContext _localctx = new OptExprListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_optExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP) | (1L << OSQUARE) | (1L << TRICK) | (1L << BOOLEAN) | (1L << INT) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				setState(115);
				exprList();
				}
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

	public static class ExprListContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PuppyScriptParser.COMMA, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).exitExprList(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exprList);
		try {
			setState(123);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				expr(0);
				setState(120);
				match(COMMA);
				setState(121);
				exprList();
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

	public static class AssignOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(PuppyScriptParser.EQ, 0); }
		public AssignOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).enterAssignOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).exitAssignOperator(this);
		}
	}

	public final AssignOperatorContext assignOperator() throws RecognitionException {
		AssignOperatorContext _localctx = new AssignOperatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(EQ);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(PuppyScriptParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PuppyScriptParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(PuppyScriptParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(PuppyScriptParser.DIVIDE, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIVIDE) | (1L << MINUS) | (1L << PLUS) | (1L << TIMES))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode GREATER() { return getToken(PuppyScriptParser.GREATER, 0); }
		public TerminalNode EQUALTO() { return getToken(PuppyScriptParser.EQUALTO, 0); }
		public TerminalNode LESS() { return getToken(PuppyScriptParser.LESS, 0); }
		public TerminalNode STRICTGREATER() { return getToken(PuppyScriptParser.STRICTGREATER, 0); }
		public TerminalNode STRICTLESS() { return getToken(PuppyScriptParser.STRICTLESS, 0); }
		public TerminalNode NOT() { return getToken(PuppyScriptParser.NOT, 0); }
		public TerminalNode OR() { return getToken(PuppyScriptParser.OR, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).exitLogicalOperator(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRICTGREATER) | (1L << STRICTLESS) | (1L << EQUALTO) | (1L << GREATER) | (1L << LESS) | (1L << NOT) | (1L << OR))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class LambdaCallContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public TerminalNode OP() { return getToken(PuppyScriptParser.OP, 0); }
		public OptArgListContext optArgList() {
			return getRuleContext(OptArgListContext.class,0);
		}
		public TerminalNode CP() { return getToken(PuppyScriptParser.CP, 0); }
		public LambdaCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).enterLambdaCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).exitLambdaCall(this);
		}
	}

	public final LambdaCallContext lambdaCall() throws RecognitionException {
		LambdaCallContext _localctx = new LambdaCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lambdaCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			functionDeclaration();
			setState(132);
			match(OP);
			setState(133);
			optArgList();
			setState(134);
			match(CP);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode TRICK() { return getToken(PuppyScriptParser.TRICK, 0); }
		public OptIdContext optId() {
			return getRuleContext(OptIdContext.class,0);
		}
		public TerminalNode OP() { return getToken(PuppyScriptParser.OP, 0); }
		public OptIdListContext optIdList() {
			return getRuleContext(OptIdListContext.class,0);
		}
		public TerminalNode CP() { return getToken(PuppyScriptParser.CP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(TRICK);
			setState(137);
			optId();
			setState(138);
			match(OP);
			setState(139);
			optIdList();
			setState(140);
			match(CP);
			setState(141);
			block();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode TREAT() { return getToken(PuppyScriptParser.TREAT, 0); }
		public TerminalNode ID() { return getToken(PuppyScriptParser.ID, 0); }
		public TerminalNode EQ() { return getToken(PuppyScriptParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PuppyScriptParser.SEMI, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(TREAT);
			setState(144);
			match(ID);
			setState(145);
			match(EQ);
			setState(146);
			expr(0);
			setState(147);
			match(SEMI);
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

	public static class ArgListContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PuppyScriptParser.COMMA, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).exitArgList(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_argList);
		try {
			setState(154);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				expr(0);
				setState(151);
				match(COMMA);
				setState(152);
				argList();
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

	public static class OptArgListContext extends ParserRuleContext {
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public OptArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).enterOptArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).exitOptArgList(this);
		}
	}

	public final OptArgListContext optArgList() throws RecognitionException {
		OptArgListContext _localctx = new OptArgListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_optArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP) | (1L << OSQUARE) | (1L << TRICK) | (1L << BOOLEAN) | (1L << INT) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				setState(156);
				argList();
				}
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

	public static class IdListContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PuppyScriptParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(PuppyScriptParser.COMMA, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).exitIdList(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_idList);
		try {
			setState(163);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(ID);
				setState(161);
				match(COMMA);
				setState(162);
				idList();
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

	public static class OptIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PuppyScriptParser.ID, 0); }
		public OptIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).enterOptId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).exitOptId(this);
		}
	}

	public final OptIdContext optId() throws RecognitionException {
		OptIdContext _localctx = new OptIdContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_optId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(165);
				match(ID);
				}
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

	public static class OptIdListContext extends ParserRuleContext {
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public OptIdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optIdList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).enterOptIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).exitOptIdList(this);
		}
	}

	public final OptIdListContext optIdList() throws RecognitionException {
		OptIdListContext _localctx = new OptIdListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_optIdList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(168);
				idList();
				}
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PuppyScriptParser.ID, 0); }
		public TerminalNode STRING() { return getToken(PuppyScriptParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(PuppyScriptParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(PuppyScriptParser.INT, 0); }
		public TerminalNode OSQUARE() { return getToken(PuppyScriptParser.OSQUARE, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode CSQUARE() { return getToken(PuppyScriptParser.CSQUARE, 0); }
		public TerminalNode OP() { return getToken(PuppyScriptParser.OP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CP() { return getToken(PuppyScriptParser.CP, 0); }
		public LambdaCallContext lambdaCall() {
			return getRuleContext(LambdaCallContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public OptArgListContext optArgList() {
			return getRuleContext(OptArgListContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_primary);
		try {
			setState(195);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				match(BOOLEAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				match(INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				match(OSQUARE);
				setState(176);
				argList();
				setState(177);
				match(CSQUARE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
				match(OP);
				setState(180);
				expr(0);
				setState(181);
				match(CP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(183);
				lambdaCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(184);
				functionDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(185);
				match(ID);
				setState(186);
				match(OP);
				setState(187);
				optArgList();
				setState(188);
				match(CP);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(190);
				match(ID);
				setState(191);
				match(OSQUARE);
				setState(192);
				expr(0);
				setState(193);
				match(CSQUARE);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u00c8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2=\n\2\3\3\3\3\3\3\3\3\5\3C\n"+
		"\3\3\4\5\4F\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6S\n\6\3"+
		"\7\5\7V\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nq\n\n\f\n\16\nt\13\n\3\13"+
		"\5\13w\n\13\3\f\3\f\3\f\3\f\3\f\5\f~\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u009d\n\23\3\24\5\24"+
		"\u00a0\n\24\3\25\3\25\3\25\3\25\5\25\u00a6\n\25\3\26\5\26\u00a9\n\26\3"+
		"\27\5\27\u00ac\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u00c6\n\30\3\30\2\3\22\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\2\4\6\2\b\b\n\n\16\16\22\22\4\2\20\21\23\27\u00ce\2<\3\2\2\2"+
		"\4B\3\2\2\2\6E\3\2\2\2\bG\3\2\2\2\nR\3\2\2\2\fU\3\2\2\2\16W\3\2\2\2\20"+
		"]\3\2\2\2\22a\3\2\2\2\24v\3\2\2\2\26}\3\2\2\2\30\177\3\2\2\2\32\u0081"+
		"\3\2\2\2\34\u0083\3\2\2\2\36\u0085\3\2\2\2 \u008a\3\2\2\2\"\u0091\3\2"+
		"\2\2$\u009c\3\2\2\2&\u009f\3\2\2\2(\u00a5\3\2\2\2*\u00a8\3\2\2\2,\u00ab"+
		"\3\2\2\2.\u00c5\3\2\2\2\60=\5\"\22\2\61=\5\b\5\2\62=\5\16\b\2\63=\5 \21"+
		"\2\64\65\5\36\20\2\65\66\7\17\2\2\66=\3\2\2\2\678\5\22\n\289\7\17\2\2"+
		"9=\3\2\2\2:=\7\17\2\2;=\7\3\2\2<\60\3\2\2\2<\61\3\2\2\2<\62\3\2\2\2<\63"+
		"\3\2\2\2<\64\3\2\2\2<\67\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\3\3\2\2\2>C\5\2"+
		"\2\2?@\5\2\2\2@A\5\4\3\2AC\3\2\2\2B>\3\2\2\2B?\3\2\2\2C\5\3\2\2\2DF\5"+
		"\4\3\2ED\3\2\2\2EF\3\2\2\2F\7\3\2\2\2GH\7\31\2\2HI\7\f\2\2IJ\5\22\n\2"+
		"JK\7\6\2\2KL\5\20\t\2LM\5\f\7\2M\t\3\2\2\2NO\7\32\2\2OS\5\b\5\2PQ\7\32"+
		"\2\2QS\5\20\t\2RN\3\2\2\2RP\3\2\2\2S\13\3\2\2\2TV\5\n\6\2UT\3\2\2\2UV"+
		"\3\2\2\2V\r\3\2\2\2WX\7\35\2\2XY\7\f\2\2YZ\5\22\n\2Z[\7\6\2\2[\\\5\20"+
		"\t\2\\\17\3\2\2\2]^\7\13\2\2^_\5\6\4\2_`\7\4\2\2`\21\3\2\2\2ab\b\n\1\2"+
		"bc\5.\30\2cr\3\2\2\2de\f\5\2\2ef\5\32\16\2fg\5\22\n\6gq\3\2\2\2hi\f\4"+
		"\2\2ij\5\34\17\2jk\5\22\n\5kq\3\2\2\2lm\f\3\2\2mn\5\30\r\2no\5\22\n\4"+
		"oq\3\2\2\2pd\3\2\2\2ph\3\2\2\2pl\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2"+
		"s\23\3\2\2\2tr\3\2\2\2uw\5\26\f\2vu\3\2\2\2vw\3\2\2\2w\25\3\2\2\2x~\5"+
		"\22\n\2yz\5\22\n\2z{\7\5\2\2{|\5\26\f\2|~\3\2\2\2}x\3\2\2\2}y\3\2\2\2"+
		"~\27\3\2\2\2\177\u0080\7\t\2\2\u0080\31\3\2\2\2\u0081\u0082\t\2\2\2\u0082"+
		"\33\3\2\2\2\u0083\u0084\t\3\2\2\u0084\35\3\2\2\2\u0085\u0086\5 \21\2\u0086"+
		"\u0087\7\f\2\2\u0087\u0088\5&\24\2\u0088\u0089\7\6\2\2\u0089\37\3\2\2"+
		"\2\u008a\u008b\7\34\2\2\u008b\u008c\5*\26\2\u008c\u008d\7\f\2\2\u008d"+
		"\u008e\5,\27\2\u008e\u008f\7\6\2\2\u008f\u0090\5\20\t\2\u0090!\3\2\2\2"+
		"\u0091\u0092\7\33\2\2\u0092\u0093\7 \2\2\u0093\u0094\7\t\2\2\u0094\u0095"+
		"\5\22\n\2\u0095\u0096\7\17\2\2\u0096#\3\2\2\2\u0097\u009d\5\22\n\2\u0098"+
		"\u0099\5\22\n\2\u0099\u009a\7\5\2\2\u009a\u009b\5$\23\2\u009b\u009d\3"+
		"\2\2\2\u009c\u0097\3\2\2\2\u009c\u0098\3\2\2\2\u009d%\3\2\2\2\u009e\u00a0"+
		"\5$\23\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\'\3\2\2\2\u00a1"+
		"\u00a6\7 \2\2\u00a2\u00a3\7 \2\2\u00a3\u00a4\7\5\2\2\u00a4\u00a6\5(\25"+
		"\2\u00a5\u00a1\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a6)\3\2\2\2\u00a7\u00a9"+
		"\7 \2\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9+\3\2\2\2\u00aa\u00ac"+
		"\5(\25\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac-\3\2\2\2\u00ad"+
		"\u00c6\7 \2\2\u00ae\u00c6\7!\2\2\u00af\u00c6\7\36\2\2\u00b0\u00c6\7\37"+
		"\2\2\u00b1\u00b2\7\r\2\2\u00b2\u00b3\5$\23\2\u00b3\u00b4\7\7\2\2\u00b4"+
		"\u00c6\3\2\2\2\u00b5\u00b6\7\f\2\2\u00b6\u00b7\5\22\n\2\u00b7\u00b8\7"+
		"\6\2\2\u00b8\u00c6\3\2\2\2\u00b9\u00c6\5\36\20\2\u00ba\u00c6\5 \21\2\u00bb"+
		"\u00bc\7 \2\2\u00bc\u00bd\7\f\2\2\u00bd\u00be\5&\24\2\u00be\u00bf\7\6"+
		"\2\2\u00bf\u00c6\3\2\2\2\u00c0\u00c1\7 \2\2\u00c1\u00c2\7\r\2\2\u00c2"+
		"\u00c3\5\22\n\2\u00c3\u00c4\7\7\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00ad\3"+
		"\2\2\2\u00c5\u00ae\3\2\2\2\u00c5\u00af\3\2\2\2\u00c5\u00b0\3\2\2\2\u00c5"+
		"\u00b1\3\2\2\2\u00c5\u00b5\3\2\2\2\u00c5\u00b9\3\2\2\2\u00c5\u00ba\3\2"+
		"\2\2\u00c5\u00bb\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c6/\3\2\2\2\21<BERUpr"+
		"v}\u009c\u009f\u00a5\u00a8\u00ab\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}