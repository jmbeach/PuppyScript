var t = require("../lexer/lextypes.js"),
	colors = require("colors"),
	util = require("util");
module.exports.debug = false;

function Recognizer(lexer) {
  self = this;
	self.current;
	var indent = 0;
	var debug = function(message) {
		if (module.exports.debug) {
			for (var i = 0; i <indent;i++) {
				message = "\t"+message;
			}	
			console.log(message);
		}
	}
	var debugIncreaseIndent = function() {
		indent++;
	}
	var debugDecreaseIndent = function() {
		indent--;
	}

	var check = function(type) {
		return type == self.current.type;
	}

	var operatorPending = function() {
		debug("operatorPending()");
		debugIncreaseIndent();
		debug("current type "+self.current.toString());
		debugDecreaseIndent();
		return check(t.DIVIDE) || check(t.PLUS) || 
				check(t.TIMES) || check(t.MINUS);
	}
	var logicalOperatorPending = function() {
		return check(t.EQUALTO) || check(t.GREATER) ||
			check(t.STRICTGREATER) || check(t.LESS) ||
			check(t.STRICTLESS) || check(t.OR) || 
			check(t.AND);
	}

	var assignmentOperatorPending = function() {
		return check(t.EQ);
	}
	var expressionPending = function() {
		return primaryPending();
	}

	var primaryPending = function() {
		return check(t.ID) || check(t.STRING) ||
			check(t.BOOLEAN) || check(t.INT) || check (t.OSQUARE) ||
			check(t.OP) || check(t.TRICK);
	}
	var argumentListPending = function() {
		return expressionPending();
	}
	var statementPending = function() {
		return check(t.RUFF) || check(t.ID) || check(t.WHILE) ||
				check(t.TREAT) ||
				expressionPending() || check(t.SEMI);
	}
	var statementListPending = function() {
		return statementPending();
	}

  self.parse = function() {
		debug("beginning parse");
    self.advance();
    statementList();
  }

  self.advance = function() {
		var old = self.current;
		self.current = lexer.lex();
		return old;
	}
	self.match = function(type) {
		if (check(type)) {
			return self.advance();
		}
		debug(self.current.type);
		var err = new Error("Parser Error: ".cyan + "looking for ".red+type.toString().underline.yellow+" found ".red +self.current.toString().underline.yellow+ " instead\n".red);
		throw err;
		return null;
	}
	function statementList() {
		debug("statementList()");
		debugIncreaseIndent
		statement();
		if (check(t.END_OF_FILE)) { return self.advance(); }
		if (statementPending()) {
			statementList();
		}
		debugDecreaseIndent();
	}
	function statement() {
		debug("statement()");
		debugIncreaseIndent();
		if (check(t.RUFF)) {
			ifStatement();
		}
		else if (check(t.TREAT)) {
			variableDeclaration();
		}
		else if (check(t.WHILE)) {
			whileLoop();
		}
		else if (check(t.TRICK)) {
			functionDeclaration();
			// check lambda call
			if(check(t.OP)) {
				self.advance();
				optArgList();
				self.match(t.CP);
			}
		}
		else if (expressionPending()) {
			expr();
			debug("matching semi");
			self.match(t.SEMI);
		}
		else {
			self.match(t.SEMI);
		}
		debugDecreaseIndent();
	}
	function ifStatement() {
		debug("ifStatement()");
		debugIncreaseIndent();
		self.match(t.RUFF);
		self.match(t.OP);
		expr();
		self.match(t.CP);
		block();
		optElseStatement();
		debugDecreaseIndent();
	}
	function whileLoop() {
		debug("whileLoop()");
		debugIncreaseIndent();
		self.match(t.WHILE);
		self.match(t.OP);
		expr();
		self.match(t.CP);
		block();
		debugDecreaseIndent();
	}
	function functionDeclaration() {
		debug("functionDeclaration()");
		debugIncreaseIndent();
		self.match(t.TRICK);
		optId();
		self.match(t.OP);
		optIdList();
		self.match(t.CP);
		block();
		debugDecreaseIndent();
	}
	function variableDeclaration() {
		debug("variableDeclaration()");
		debugIncreaseIndent();
		debug("matching treat");
		self.match(t.TREAT);
		debug("matching id");
		self.match(t.ID);
		debug("matching eq");
		self.match(t.EQ);
		debug("matching expression");
		expr();
		debug("matching semi");
		self.match(t.SEMI);
		debugDecreaseIndent();
	}
	function expr() {
		debug("expr()");
		debugIncreaseIndent();
		debug("matching primary");
		primary();
		if (operatorPending()) {
			debug("operator pending");
			operator();
			expr();
		}
		else if (logicalOperatorPending()) {
			debug("logic operator pending");
			logicalOperator();
			expr();
		}
		else if (assignmentOperatorPending()) {
			debug("assignment operator pending");
			assignmentOperator();
			expr();
		}
		debugDecreaseIndent();
	}
	function primary() {
		debug("primary()");
		debugIncreaseIndent();
		if (check(t.ID)) {
			debug("Begins with ID");
			self.advance();
			// see if functionDec pending
			if (check(t.TRICK)) {
				functionDeclaration();
				// see if lambdaCall
				if (check(t.OP)) {
					match(t.OP);
					optIdList();
					match(t.CP);
					block();
				}
			}
			else if (check(t.OP)) {
				self.match(t.OP);
				optArgList();
				self.match(t.CP);
			}	
			else if (check(t.OSQUARE)){
				self.match(t.OSQUARE);
				expr();
				self.match(t.CSQUARE);
			}
			// otherwise this one is just an ID
		}
		else if(check(t.STRING)) {
			debug("matching string");
			self.match(t.STRING);
		}
		else if(check(t.BOOLEAN)) {
			debug("matching boolean");
			self.match(t.BOOLEAN);
		}
		else if(check(t.INT)) {
			debug("matching int");
			self.match(t.INT);
		}
		else {
			debug("matching [");
			self.match(t.OSQUARE);
			debug("matching expression");
			expr();
			self.match(t.CSQUARE);
		}
		debugDecreaseIndent();
	}
	function optArgList() {
		debug("optArgList()");
		if(argumentListPending()) {
			argList();
		}
	}
	function argList() {
		debug("argList()");
		expr();
		if (self.check(t.COMMA)) {
			self.match(t.COMMA);
			argList();
		}
	}
	function operator() {
		debug("operator()");
		if(check(t.PLUS)) { self.match(t.PLUS); }
		else if (check(t.MINUS)) { self.match(t.MINUS); }
		else if (check(t.TIMES)) { self.match(t.TIMES); }
		else { self.match(t.DIVIDE); }
	}
	function logicalOperator() {
		debug("logicalOperator()");
		if (check(t.GREATER)) { self.match(t.GREATER); }
		else if (check(t.EQUALTO)) { self.match(t.EQUALTO); }
		else if (check(t.LESS)) { self.match(t.LESS); }
		else if (check(t.STRICTGREATER)) { self.match(t.STRICTGREATER); }
		else if (check(t.STRICTLESS)) { self.match(t.STRICTLESS); }
		else if (check(t.NOT)) { self.match(t.NOT); }
		else { self.match(t.OR); }
	}
	function block() {
		debug("block()");
		debugIncreaseIndent();
		self.match(t.OCB);
		optStatementList();
		debug("matching close bracket");
		self.match(t.CCB);
		debugDecreaseIndent();
	}
	function optStatementList() {
		debug("optStatementList()");
		debugIncreaseIndent();
		if(statementListPending()) {
			statementList();
		}
		debugDecreaseIndent();
	}
	function argList() {
		debug("argList()");
		debugIncreaseIndent();
		expr();
		if (check(t.COMMA)) {
			self.advance();
			argList();
		}
		debugDecreaseIndent();
	}
	function optElseStatement() {
		debug("optElseStatement()");
		debugIncreaseIndent();
		if (check(t.RELSE)) {
			elseStatement();
		}
		debugDecreaseIndent();
	}
	function elseStatement() {
		debug("elseStatement()");
		debugIncreaseIndent();
		self.match(t.RELSE);
		if (check(t.RUFF)) {
			ifStatement();
		}
		else {
			block();
		}
		debugDecreaseIndent();
	}
	function optId() {
		debug("optId()");
		if (check(t.ID)) {
			self.match(t.ID)
		}
	}
	function optIdList() {
		debug("optIdList()");
		debugIncreaseIndent();
		if (check(t.ID)) {
			idList();
		}
		debugDecreaseIndent();
	}
	function idList() {
		debug("idList()");
		debugIncreaseIndent();
		self.match(t.ID);
		if (check(t.COMMA)) {
			self.advance();
			idList();
		}
		debugDecreaseIndent();
	}
	function assignOperator() {
		debug("assignOperator()");
		match(t.EQ);
	}
}
module.exports.new = Recognizer;
