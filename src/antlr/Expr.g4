grammar Expr;

/* this is crucial to the rest of the project */

/* two parts of the grammar: parser rules and lexer rules */

/* import antlr in every generated java file */

@header {
	package antlr;
}


//start variable as either declaration or variable
//  but program cannot be empty
//  the # label will indicate seven different visit methods 
//  and context corresponds to corresponding node
prog: (decl | expr)+ EOF	# Program
    ;
    

//Token ID is integer type initialzied to number
decl: ID ':' INT_TYPE '=' NUM	# Declaration
    ;
    
//note order of precedence when antlr generates parser classes
// higher listing results in higher precedence  
expr: expr '*' expr		# Multiplication
    | expr '+' expr		# Addition
    | ID				# Variable
    | NUM				# Number
    ;
    
    
  
//Tokens
fragment STR:[a-zA-Z]*;
ID: [a-z][a-zA-Z0-9_]*;  //identifiers
NUM: '0' | '-'?[1-9][0-9]*;  //either zero or a sign and 1-9 as first digit (first not a zero)
INT_TYPE: 'INT';  //keyword
COMMENT: '--' ~[\r\n]* -> skip;  //anything not cr or lf should be skipped as comment
WS: [ \t\n]+ -> skip;  //ignore whitespaces