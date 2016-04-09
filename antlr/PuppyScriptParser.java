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
		SEMI=1, PLUS=2, MINUS=3, TIMES=4, DIVIDE=5, BOOLEAN=6, STRING=7, INT=8, 
		RUFF=9, OP=10, CP=11, OCB=12, CCB=13, RELSE=14, WHILE=15, GREATER=16, 
		EQUALTO=17, BR=18, LESS=19, STRICTGREATER=20, STRICTLESS=21, NOT=22, OR=23, 
		EQ=24, TRICK=25, ID=26, OSQUARE=27, CSQUARE=28, COMMA=29, VAR=30;
	public static final int
		RULE_statement = 0, RULE_statementList = 1, RULE_optStatementList = 2, 
		RULE_ifStatement = 3, RULE_elseStatement = 4, RULE_optElseStatement = 5, 
		RULE_whileLoop = 6, RULE_block = 7, RULE_expr = 8, RULE_optExprList = 9, 
		RULE_exprList = 10, RULE_assignOperator = 11, RULE_operator = 12, RULE_logicalOperator = 13, 
		RULE_lambdaCall = 14, RULE_functionDeclaration = 15, RULE_functionCall = 16, 
		RULE_variableDeclaration = 17, RULE_argList = 18, RULE_optArgList = 19, 
		RULE_idList = 20, RULE_optId = 21, RULE_optIdList = 22, RULE_primary = 23, 
		RULE_assign = 24;
	public static final String[] ruleNames = {
		"statement", "statementList", "optStatementList", "ifStatement", "elseStatement", 
		"optElseStatement", "whileLoop", "block", "expr", "optExprList", "exprList", 
		"assignOperator", "operator", "logicalOperator", "lambdaCall", "functionDeclaration", 
		"functionCall", "variableDeclaration", "argList", "optArgList", "idList", 
		"optId", "optIdList", "primary", "assign"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'+'", "'-'", "'*'", "'/'", null, null, null, "'ruff'", "'('", 
		"')'", "'{'", "'}'", "'relse'", "'while'", "'>='", "'=='", "'\n'", "'<='", 
		"'>'", "'<'", "'!='", "'||'", "'='", "'trick'", null, "'['", "']'", "','", 
		"'var'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEMI", "PLUS", "MINUS", "TIMES", "DIVIDE", "BOOLEAN", "STRING", 
		"INT", "RUFF", "OP", "CP", "OCB", "CCB", "RELSE", "WHILE", "GREATER", 
		"EQUALTO", "BR", "LESS", "STRICTGREATER", "STRICTLESS", "NOT", "OR", "EQ", 
		"TRICK", "ID", "OSQUARE", "CSQUARE", "COMMA", "VAR"
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
			setState(62);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				whileLoop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				functionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				lambdaCall();
				setState(55);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				expr(0);
				setState(58);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(61);
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
			setState(68);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				statement();
				setState(66);
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
			setState(71);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << BOOLEAN) | (1L << STRING) | (1L << INT) | (1L << RUFF) | (1L << OP) | (1L << WHILE) | (1L << BR) | (1L << TRICK) | (1L << ID) | (1L << OSQUARE) | (1L << VAR))) != 0)) {
				{
				setState(70);
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
			setState(73);
			match(RUFF);
			setState(74);
			match(OP);
			setState(75);
			expr(0);
			setState(76);
			match(CP);
			setState(77);
			block();
			setState(78);
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
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(RELSE);
				setState(81);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(RELSE);
				setState(83);
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
			setState(87);
			_la = _input.LA(1);
			if (_la==RELSE) {
				{
				setState(86);
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
			setState(89);
			match(WHILE);
			setState(90);
			match(OP);
			setState(91);
			expr(0);
			setState(92);
			match(CP);
			setState(93);
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
			setState(95);
			match(OCB);
			setState(96);
			optStatementList();
			setState(97);
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
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
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
			setState(102);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(100);
				primary();
				}
				break;
			case 2:
				{
				setState(101);
				functionDeclaration();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(116);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(104);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(105);
						operator();
						setState(106);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(109);
						logicalOperator();
						setState(110);
						expr(3);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(112);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(113);
						assignOperator();
						setState(114);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			setState(122);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << STRING) | (1L << INT) | (1L << OP) | (1L << TRICK) | (1L << ID) | (1L << OSQUARE))) != 0)) {
				{
				setState(121);
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
			setState(129);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				expr(0);
				setState(126);
				match(COMMA);
				setState(127);
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
			setState(131);
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
			setState(133);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIVIDE))) != 0)) ) {
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
			setState(135);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << EQUALTO) | (1L << LESS) | (1L << STRICTGREATER) | (1L << STRICTLESS) | (1L << NOT) | (1L << OR))) != 0)) ) {
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
			setState(137);
			functionDeclaration();
			setState(138);
			match(OP);
			setState(139);
			optArgList();
			setState(140);
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
			setState(142);
			match(TRICK);
			setState(143);
			optId();
			setState(144);
			match(OP);
			setState(145);
			optIdList();
			setState(146);
			match(CP);
			setState(147);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PuppyScriptParser.ID, 0); }
		public TerminalNode OP() { return getToken(PuppyScriptParser.OP, 0); }
		public OptExprListContext optExprList() {
			return getRuleContext(OptExprListContext.class,0);
		}
		public TerminalNode CP() { return getToken(PuppyScriptParser.CP, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(ID);
			setState(150);
			match(OP);
			setState(151);
			optExprList();
			setState(152);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(PuppyScriptParser.VAR, 0); }
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
		enterRule(_localctx, 34, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(VAR);
			setState(155);
			match(ID);
			setState(156);
			match(EQ);
			setState(157);
			expr(0);
			setState(158);
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
		enterRule(_localctx, 36, RULE_argList);
		try {
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				expr(0);
				setState(162);
				match(COMMA);
				setState(163);
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
		enterRule(_localctx, 38, RULE_optArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << STRING) | (1L << INT) | (1L << OP) | (1L << TRICK) | (1L << ID) | (1L << OSQUARE))) != 0)) {
				{
				setState(167);
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
		enterRule(_localctx, 40, RULE_idList);
		try {
			setState(174);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(ID);
				setState(172);
				match(COMMA);
				setState(173);
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
		enterRule(_localctx, 42, RULE_optId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(176);
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
		enterRule(_localctx, 44, RULE_optIdList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(179);
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
		enterRule(_localctx, 46, RULE_primary);
		try {
			setState(206);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(BOOLEAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				match(INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				match(OSQUARE);
				setState(187);
				argList();
				setState(188);
				match(CSQUARE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(190);
				match(OP);
				setState(191);
				expr(0);
				setState(192);
				match(CP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(194);
				lambdaCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(195);
				functionDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(196);
				match(ID);
				setState(197);
				match(OP);
				setState(198);
				optArgList();
				setState(199);
				match(CP);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(201);
				match(ID);
				setState(202);
				match(OSQUARE);
				setState(203);
				expr(0);
				setState(204);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PuppyScriptParser.ID, 0); }
		public List<TerminalNode> EQ() { return getTokens(PuppyScriptParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(PuppyScriptParser.EQ, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PuppyScriptListener ) ((PuppyScriptListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(ID);
			setState(209);
			match(EQ);
			setState(210);
			expr(0);
			{
			setState(211);
			expr(0);
			setState(212);
			match(EQ);
			setState(213);
			expr(0);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u00da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2A\n\2\3"+
		"\3\3\3\3\3\3\3\5\3G\n\3\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\5\6W\n\6\3\7\5\7Z\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\5\ni\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\7\nw\n\n\f\n\16\nz\13\n\3\13\5\13}\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u0084"+
		"\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u00a8\n\24\3\25\5\25\u00ab\n\25"+
		"\3\26\3\26\3\26\3\26\5\26\u00b1\n\26\3\27\5\27\u00b4\n\27\3\30\5\30\u00b7"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00d1\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\2\3\22\33\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\2\4\3\2\4\7\4\2\22\23\25\31\u00df\2"+
		"@\3\2\2\2\4F\3\2\2\2\6I\3\2\2\2\bK\3\2\2\2\nV\3\2\2\2\fY\3\2\2\2\16[\3"+
		"\2\2\2\20a\3\2\2\2\22h\3\2\2\2\24|\3\2\2\2\26\u0083\3\2\2\2\30\u0085\3"+
		"\2\2\2\32\u0087\3\2\2\2\34\u0089\3\2\2\2\36\u008b\3\2\2\2 \u0090\3\2\2"+
		"\2\"\u0097\3\2\2\2$\u009c\3\2\2\2&\u00a7\3\2\2\2(\u00aa\3\2\2\2*\u00b0"+
		"\3\2\2\2,\u00b3\3\2\2\2.\u00b6\3\2\2\2\60\u00d0\3\2\2\2\62\u00d2\3\2\2"+
		"\2\64A\5$\23\2\65A\5\b\5\2\66A\5\16\b\2\67A\5 \21\289\5\36\20\29:\7\3"+
		"\2\2:A\3\2\2\2;<\5\22\n\2<=\7\3\2\2=A\3\2\2\2>A\7\3\2\2?A\7\24\2\2@\64"+
		"\3\2\2\2@\65\3\2\2\2@\66\3\2\2\2@\67\3\2\2\2@8\3\2\2\2@;\3\2\2\2@>\3\2"+
		"\2\2@?\3\2\2\2A\3\3\2\2\2BG\5\2\2\2CD\5\2\2\2DE\5\4\3\2EG\3\2\2\2FB\3"+
		"\2\2\2FC\3\2\2\2G\5\3\2\2\2HJ\5\4\3\2IH\3\2\2\2IJ\3\2\2\2J\7\3\2\2\2K"+
		"L\7\13\2\2LM\7\f\2\2MN\5\22\n\2NO\7\r\2\2OP\5\20\t\2PQ\5\f\7\2Q\t\3\2"+
		"\2\2RS\7\20\2\2SW\5\b\5\2TU\7\20\2\2UW\5\20\t\2VR\3\2\2\2VT\3\2\2\2W\13"+
		"\3\2\2\2XZ\5\n\6\2YX\3\2\2\2YZ\3\2\2\2Z\r\3\2\2\2[\\\7\21\2\2\\]\7\f\2"+
		"\2]^\5\22\n\2^_\7\r\2\2_`\5\20\t\2`\17\3\2\2\2ab\7\16\2\2bc\5\6\4\2cd"+
		"\7\17\2\2d\21\3\2\2\2ef\b\n\1\2fi\5\60\31\2gi\5 \21\2he\3\2\2\2hg\3\2"+
		"\2\2ix\3\2\2\2jk\f\5\2\2kl\5\32\16\2lm\5\22\n\6mw\3\2\2\2no\f\4\2\2op"+
		"\5\34\17\2pq\5\22\n\5qw\3\2\2\2rs\f\3\2\2st\5\30\r\2tu\5\22\n\4uw\3\2"+
		"\2\2vj\3\2\2\2vn\3\2\2\2vr\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\23\3"+
		"\2\2\2zx\3\2\2\2{}\5\26\f\2|{\3\2\2\2|}\3\2\2\2}\25\3\2\2\2~\u0084\5\22"+
		"\n\2\177\u0080\5\22\n\2\u0080\u0081\7\37\2\2\u0081\u0082\5\26\f\2\u0082"+
		"\u0084\3\2\2\2\u0083~\3\2\2\2\u0083\177\3\2\2\2\u0084\27\3\2\2\2\u0085"+
		"\u0086\7\32\2\2\u0086\31\3\2\2\2\u0087\u0088\t\2\2\2\u0088\33\3\2\2\2"+
		"\u0089\u008a\t\3\2\2\u008a\35\3\2\2\2\u008b\u008c\5 \21\2\u008c\u008d"+
		"\7\f\2\2\u008d\u008e\5(\25\2\u008e\u008f\7\r\2\2\u008f\37\3\2\2\2\u0090"+
		"\u0091\7\33\2\2\u0091\u0092\5,\27\2\u0092\u0093\7\f\2\2\u0093\u0094\5"+
		".\30\2\u0094\u0095\7\r\2\2\u0095\u0096\5\20\t\2\u0096!\3\2\2\2\u0097\u0098"+
		"\7\34\2\2\u0098\u0099\7\f\2\2\u0099\u009a\5\24\13\2\u009a\u009b\7\r\2"+
		"\2\u009b#\3\2\2\2\u009c\u009d\7 \2\2\u009d\u009e\7\34\2\2\u009e\u009f"+
		"\7\32\2\2\u009f\u00a0\5\22\n\2\u00a0\u00a1\7\3\2\2\u00a1%\3\2\2\2\u00a2"+
		"\u00a8\5\22\n\2\u00a3\u00a4\5\22\n\2\u00a4\u00a5\7\37\2\2\u00a5\u00a6"+
		"\5&\24\2\u00a6\u00a8\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8"+
		"\'\3\2\2\2\u00a9\u00ab\5&\24\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2"+
		"\u00ab)\3\2\2\2\u00ac\u00b1\7\34\2\2\u00ad\u00ae\7\34\2\2\u00ae\u00af"+
		"\7\37\2\2\u00af\u00b1\5*\26\2\u00b0\u00ac\3\2\2\2\u00b0\u00ad\3\2\2\2"+
		"\u00b1+\3\2\2\2\u00b2\u00b4\7\34\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3"+
		"\2\2\2\u00b4-\3\2\2\2\u00b5\u00b7\5*\26\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7/\3\2\2\2\u00b8\u00d1\7\34\2\2\u00b9\u00d1\7\t\2\2\u00ba"+
		"\u00d1\7\b\2\2\u00bb\u00d1\7\n\2\2\u00bc\u00bd\7\35\2\2\u00bd\u00be\5"+
		"&\24\2\u00be\u00bf\7\36\2\2\u00bf\u00d1\3\2\2\2\u00c0\u00c1\7\f\2\2\u00c1"+
		"\u00c2\5\22\n\2\u00c2\u00c3\7\r\2\2\u00c3\u00d1\3\2\2\2\u00c4\u00d1\5"+
		"\36\20\2\u00c5\u00d1\5 \21\2\u00c6\u00c7\7\34\2\2\u00c7\u00c8\7\f\2\2"+
		"\u00c8\u00c9\5(\25\2\u00c9\u00ca\7\r\2\2\u00ca\u00d1\3\2\2\2\u00cb\u00cc"+
		"\7\34\2\2\u00cc\u00cd\7\35\2\2\u00cd\u00ce\5\22\n\2\u00ce\u00cf\7\36\2"+
		"\2\u00cf\u00d1\3\2\2\2\u00d0\u00b8\3\2\2\2\u00d0\u00b9\3\2\2\2\u00d0\u00ba"+
		"\3\2\2\2\u00d0\u00bb\3\2\2\2\u00d0\u00bc\3\2\2\2\u00d0\u00c0\3\2\2\2\u00d0"+
		"\u00c4\3\2\2\2\u00d0\u00c5\3\2\2\2\u00d0\u00c6\3\2\2\2\u00d0\u00cb\3\2"+
		"\2\2\u00d1\61\3\2\2\2\u00d2\u00d3\7\34\2\2\u00d3\u00d4\7\32\2\2\u00d4"+
		"\u00d5\5\22\n\2\u00d5\u00d6\5\22\n\2\u00d6\u00d7\7\32\2\2\u00d7\u00d8"+
		"\5\22\n\2\u00d8\63\3\2\2\2\22@FIVYhvx|\u0083\u00a7\u00aa\u00b0\u00b3\u00b6"+
		"\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}