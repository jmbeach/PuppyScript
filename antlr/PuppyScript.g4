/*
Author: Jared Beach
Description: Grammar for PuppyScript
language. Tries to sort rules from
highest to lowest levels
*/
grammar PuppyScript;

// statements
// last thing computed is returned
statement: variableDeclaration
 | ifStatement
 | whileLoop
 | functionDeclaration
 | lambdaCall SEMI
 | expr SEMI
 | SEMI
 | BR
 ;

statementList:	statement
  | statement statementList;

optStatementList: (statementList)?;

// if statements
ifStatement: RUFF OP expr CP block optElseStatement;

elseStatement: RELSE ifStatement
 | RELSE block;

optElseStatement: elseStatement?;

// loops
whileLoop: WHILE OP expr CP block;

// block
block: OCB optStatementList CCB;

// expressions
expr: primary
 | expr operator expr
 | expr logicalOperator expr
 | expr assignOperator expr
 ;

 optExprList: exprList?;
 exprList: expr
  | expr COMMA exprList
  ;


assignOperator: EQ;
operator: PLUS | MINUS | TIMES | DIVIDE;

logicalOperator: GREATER
 | EQUALTO
 | LESS
 | STRICTGREATER
 | STRICTLESS
 | NOT
 | OR
 ;

// lambda
// use the function keyword for lambdas too, but don't have
// ID associated with them is only differnce
// covers functionCall
lambdaCall: functionDeclaration OP optArgList CP;

// declarations
functionDeclaration: TRICK optId OP optIdList CP block;

variableDeclaration: TREAT ID EQ expr SEMI;

// declaration components
argList: expr
 | expr COMMA argList
 ;

optArgList: argList?;

idList: ID
 | ID COMMA idList;

optId: ID?;

optIdList: idList?;

// primaries
primary: ID
 | STRING
 | BOOLEAN
 | INT
 | OSQUARE argList CSQUARE
 | OP expr CP
 | lambdaCall
 | functionDeclaration
 | ID OP optArgList CP
 | ID OSQUARE expr CSQUARE
 ;


BR: '\n';
CCB:'}';
COMMA:',';
CP:')';
CSQUARE:']';
DIVIDE: '/';
EQ:'=';
MINUS: '-';
OCB:'{';
OP:'(';
OSQUARE:'[';
PLUS: '+';
SEMI: ';';
STRICTGREATER:'>';
STRICTLESS:'<';
TIMES: '*';
EQUALTO:'==';
GREATER:'>=';
LESS:'<=';
NOT:'!=';
OR:'||';
AND: '&&';
RUFF:'ruff';
RELSE:'relse';
TREAT:'treat';
TRICK:'trick';
WHILE:'while';
BOOLEAN: 'true' | 'false';
INT: [0-9]+;
ID: [a-zA-Z$_] [a-zA-Z0-9$_]*;
STRING: '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
   |   '\'' ( ESC_SEQ | ~('\\'|'\'') )* '\''
   ;

ESC_SEQ
   : '\\' ('\"'|'\\'|'/'|'b'|'f'|'n'|'r'|'t')
   ;


