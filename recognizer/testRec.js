var lexer = require("../lexer/lexer.js"),
	Recognizer = require("./recognizer.js");
lexer.fileName = "program.pup";
lexer.openFile(function() {
	Recognizer.debug = true;
	var recognizer = new Recognizer.new(lexer);
	recognizer.parse();
});

