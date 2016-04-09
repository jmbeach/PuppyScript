const fs = require('fs');
var t = require('./lextypes.js'),
	validator = require('validator');
module.exports.fileName = "";
var f = null;

function lexeme(opts) {
	var self = this;
    self.type = opts.type;
    self.value = opts.value;
	self.toString = function() {
		var rep = "LEXEME: { type: "+self.type.toString()
		if (self.value) {
			rep += ", value: "+self.value.toString();
		}
		rep +=" }";
		return rep;
	}
}
module.exports.lexeme = lexeme;

function File(opts) {
    var self = this;
    var whiteSpace = [9, 10, 32];
    var currentIndex = 0;
    self.buffer = null;
    var fileName = opts.file;
    fs.readFile(fileName, function(err, data) {
        if (err) throw err;
        self.buffer = data;
        opts.onData(data);
    });
    var isWhiteSpace = function(c) {
        return whiteSpace.indexOf(c) > -1;
    }
    self.next = function() {
        if (currentIndex > self.buffer.length - 1) {
            return t.END_OF_FILE;
        }
        var toReturn = self.buffer[currentIndex];
		currentIndex++;
        if (isWhiteSpace(toReturn)) {
            return self.next();
		}
		return String.fromCharCode(toReturn);
    }
	self.nextAndWhiteSpace = function() {
        if (currentIndex > self.buffer.length - 1) {
            return t.END_OF_FILE;
        }
        var toReturn = self.buffer[currentIndex];
		currentIndex++;
		return String.fromCharCode(toReturn);
	}
	self.peakNext = function() {
		if (currentIndex + 1 > self.buffer.length-1) {
			return t.END_OF_FILE;
		}
		return String.fromCharCode(self.buffer[currentIndex]);
	}
	self.pushBack = function() {
		currentIndex--;
		if (currentIndex < 0) {
			return t.BEGINNING_OF_FILE;
		}
		if (isWhiteSpace(self.buffer[currentIndex])) {
			return self.pushBack();
		}
		return String.fromCharCode(self.buffer[currentIndex]);
	}
	self.pushBackAndWhiteSpace = function() {
		currentIndex--;
		if (currentIndex < 0) {
			return t.BEGINNING_OF_FILE;
		}
		return String.fromCharCode(self.buffer[currentIndex]);
	}
}


module.exports.openFile = function(onData) {
	f = new File({
		file:module.exports.fileName,
		onData:onData
	});
}
function lexNotEqual(ch) {
	if (ch == "!") {
		var next = f.peakNext();
		if (next == "=") {
			f.next();
			return new lexeme({type:t.NOT});
		}
	}
	return new lexeme({type:t.UNKNOWN});
}
function lexOr(ch) {
	if (ch == "|") {
		var next = f.peakNext();
		if (next == "|") {
			f.next();
			return new lexeme({type:t.OR});
		}
	}
	return new lexeme({type:t.UNKNOWN});
}
function lexAnd(ch) {
	if (ch == "&") {
		var next = f.peakNext();
		if (next == "&") {
			f.next();
			return new lexeme({type:t.AND});
		}
	}
	return new lexeme({type:t.UNKNOWN});
}
function lexWord(ch) {
	var buffer = "" + ch;
	ch = f.nextAndWhiteSpace();
	while (validator.isNumeric(ch.toString()) || validator.isAlpha(ch.toString()) || ch == "_") {
		buffer += ch;
		ch = f.nextAndWhiteSpace();
	}
	f.pushBackAndWhiteSpace();
	switch (buffer) {
		case 'ruff':
			return new lexeme({type:t.RUFF});
		case 'relse':
			return new lexeme({type:t.RELSE});
		case 'trick':
			return new lexeme({type:t.TRICK});
		case 'treat':
			return new lexeme({type:t.TREAT});
		case 'while':
			return new lexeme({type:t.WHILE});
		case 'true':
			return new lexeme({type:t.BOOLEAN,value:true});
		case 'false':
			return new lexeme({type:t.BOOLEAN,value:false});
		default:
			return new lexeme({type:t.ID,value:buffer});
	}
}
function lexNumber(ch) {
	var buffer = ""+ch;
	ch = f.nextAndWhiteSpace();
	while (validator.isNumeric(ch.toString())) {
		buffer+= ch;
		ch = f.nextAndWhiteSpace();
	}
	f.pushBackAndWhiteSpace();
	return new lexeme({type:t.INT,value:parseInt(buffer)});
}
function lexString() {
	var buffer = "";
	ch = f.nextAndWhiteSpace();
	while (ch != "\"") {
		if (ch == "\\"){
			ch = f.nextAndWhiteSpace();
		}
		buffer+= ch;
		ch=f.nextAndWhiteSpace();
	}
	return new lexeme({type:t.STRING,value:buffer});
}
module.exports.lex = function() {
    var ch = f.next();
	console.log
	if (ch === t.END_OF_FILE) return new lexeme({type: t.END_OF_FILE});
	switch(ch) {
		case '}':
			return new lexeme({type:t.CCB});
		case ',':
			return new lexeme({type:t.COMMA});
		case ')':
			return new lexeme({type:t.CP});
		case ']':
			return new lexeme({type:t.CSQUARE});
		case '/':
			return new lexeme({type:t.DIVIDE});
		case '=':
			var next = f.peakNext();
			if (next == '=') {
				f.next();
				return new lexeme({type:t.EQUALTO});
			}
			return new lexeme({type:t.EQ});
		case '-':
			return new lexeme({type:t.MINUS});
		case '{':
			return new lexeme({type:t.OCB});
		case '(':
			return new lexeme({type:t.OP});
		case '[':
			return new lexeme({type:t.OSQUARE});
		case '+':
			return new lexeme({type:t.PLUS});
		case ';':
			return new lexeme({type:t.SEMI});
		case '>':
			var next = f.peakNext();
			if (next == '=') {
				f.next();
				return new lexeme({type:t.GREATER});
			}
			return new lexeme({type:t.STRICTGREATER});
		case '<':
			var next = f.peakNext();
			if (next == '=') {
				f.next();
				return new lexeme({type:t.LESS});
			}
			return new lexeme({type:t.STRICTLESS});
		case '*':
			return new lexeme({type:t.TIMES});
		case '!':
			return lexNotEqual(ch);
		case '|':
			return lexOr(ch);
		case '&':
			return lexAnd(ch);
		default:
			if (ch == "\"") {
				return lexString();
			}
			if (validator.isNumeric(ch)) {
				return lexNumber(ch);
			}
			if (validator.isAlpha(ch)) {
				return lexWord(ch);
			}
			return new lexeme({type:t.UNKNOWN});
	}
}
