var lexer = require("./lexer.js");
var t = require("./lextypes.js");
lexer.fileName = "test1.pup";
lexer.openFile(function(){
	var lexed = new lexer.lexeme({});
	while (lexed.type != t.END_OF_FILE) {
		lexed = lexer.lex();
		(console.log(lexed.toString()));
	}
});
