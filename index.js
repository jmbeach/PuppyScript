#!/usr/bin/env node
var asciimo = require("asciimo").Figlet;
var colors = require("colors");
var commandLineArgs = require("command-line-args");
var getUsage = require("command-line-usage");
var lexer = require("./lexer/lexer.js");
var Recognizer = require("./recognizer/recognizer.js");
var t = require("./lexer/lextypes.js");

var optionList = [
	{name: "input", defaultOption:true, alias: "i",type: String, description: "The file to run Puppy Script on"},
	{name: "mode", alias: "m",type: String, description: "Run PuppyScript in lexing, recognizing mode, or default. Leave this empty to run in default mode. Modes: lexer, recognizer"},
	{name: "debug", alias: "d",type: Boolean, description: "Include this in recognizing mode to see extra debugging information",defaultValue:false}
];
var cli = commandLineArgs(optionList);
var options = cli.parse();
var usage = getUsage(optionList);
function printUssage() {
	asciimo.write("Puppy Script","chunky",function(art) {
		console.log(art.cyan);
		console.log("A dynamic programming language which aims to distract you from getting anything done by making most keywords related to dogs / puppies.");
		console.log(usage);
	});
}
/// MAIN
// if the user didn't pass in the main parameter
if (options.input == null) {
	// print usage
	printUssage();
	return;
}
switch(options.mode) {
	case "lexer":
		console.log("Running in lexer mode.");
		lexer.fileName = options.input;
		lexer.openFile(function(){
			var lexed = new lexer.lexeme({});
			while (lexed.type != t.END_OF_FILE) {
				lexed = lexer.lex();
				(console.log(lexed.toString()));
			}
		});
		break;
	case "recognizer":
		lexer.fileName = options.input
		lexer.openFile(function() {
			Recognizer.debug = options.debug;
			var recognizer = new Recognizer.new(lexer);
			recognizer.parse();
			console.log("Successfully recognized document".green);
			console.log("Run with debug (-d) flag for more output".yellow);
		});
		break;
}	
