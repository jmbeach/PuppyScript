install: 
	npm install -g
doc:
	pandoc README.md -f markdown -t html -o README.html
	pandoc README.md -f markdown -o README.pdf
	pandoc examples/lexer/README.md -f markdown -t html -o examples/lexer/README.html
	pandoc examples/lexer/README.md -f markdown -o examples/lexer/README.pdf
	pandoc examples/recognizer/README.md -f markdown -t html -o examples/recognizer/README.html
	pandoc examples/recognizer/README.md -f markdown -o examples/recognizer/README.pdf
