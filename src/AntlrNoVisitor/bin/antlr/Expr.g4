grammar Expr;

/* this is crucial to the rest of the project */

/* two parts of the grammar: parser rules and lexer rules */

/* import antlr in every generated java file */

@header {
	package antlr;
}


//start variable


prog: (parseerror | expr)+ EOF
    ;
    
    
/* order of precedence when antlr generates parser classes */
/* higher listing results in higher precedence */  

parseerror: XDMPEVAL
    | DECLAREFUNCTIONAS
    | DECLAREVARIABLEAS
    | TESTPHRASE
    | OPPRED
    ;

expr: IMPORT
    | NUMBER
    | WORD
    ;
    





/* Tokens */

COMMENT: '(:' .*? ':)' -> skip;
IMPORT: 'import';
XDMPEVAL: XDMP;
DECLAREFUNCTIONAS: (FUNCTIONAS (.)+? LPAREN);
DECLAREVARIABLEAS: (VARIABLEAS (.)+? (';'));
TESTPHRASE:  T E S T P H R A S E;
OPPRED: (LBRAC (.)+? RBRAC SIGNS? WORD*);

WHITESPACE: ('\t' | ' ' | '\n')+ -> skip;
WORD: LETTER+;
NUMBER: DIGIT+;

fragment XDMP: ('xdmp:eval' | 'xdmp:value');
fragment FUNCTIONAS: ('declare function');
fragment VARIABLEAS: ('declare variable $');
fragment LETTER : ('a'..'z' | 'A' .. 'Z');
fragment LBRAC  : ('[');
fragment RBRAC  : (']');
fragment LPAREN : ('(');

fragment SIGNS  : ('@' |'()'| '*' |' = ' | '<' | '>' | '.' | '+' | '|' | '/');

fragment DIGIT  : ('0'..'9');


fragment T:('t');
fragment E:('e');
fragment S:('s');
fragment P:('p');
fragment H:('h');
fragment R:('r');
fragment A:('a');


