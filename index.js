var 
	asciimo = require("asciimo").Figlet
	, colors = require("colors")
	, commandLineArgs = require("command-line-args")
	, getUsage = require("command-line-usage")
;

var optionList = [
	{name: "input", defaultOption:true, alias: "i",type: String, description: "The file to run Puppy Script on"},
	{name: "lexer", alias: "l",type: Boolean, description: "Run PuppyScript in lexing mode to see what symbols Puppy Script generates with a given input file"},
	{name: "recognizer", alias: "r",type:Boolean, description: "Run PuppyScript in recognizing mode on a given input file"}
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
// if the user didn't pass in the main parameter
if (options.input == null) {
	// print usage
	printUssage();
}
