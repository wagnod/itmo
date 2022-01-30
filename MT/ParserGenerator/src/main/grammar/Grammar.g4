grammar Grammar;

file: grammarName packageName fields? rules;

grammarName returns [String gName] : GRAMMAR n=CAPITALIZED { $gName = $n.text; };
packageName returns [String pName]: LEFT_ANGLE PACKAGE n=ID RIGHT_ANGLE { $pName = $n.text; };

fields: FIELDS LEFT_BRACKET field+ RIGHT_BRAKCET;
field: ID ID COLON CAPITALIZED;

rules: grammarRule+ ;
grammarRule: terminalRule | syntaxRule ;

terminalRule : TERMINAL_NAME COLON REGEXP code? SKIP_RULE? ;

syntaxRule: ID typedArg? COLON names ;
name: TERMINAL_NAME | ID argument? ;
names: name+ code? | names OR names ;

argument: ARGUMENT ;
typedArg: LEFT_BRACKET ID ID COLON CAPITALIZED RIGHT_BRAKCET ;

code: CODE;

FIELDS: 'members';

LEFT_PAREN : '(';
RIGHT_PAREN : ')';
LEFT_BRACKET : '[';
RIGHT_BRAKCET : ']';
LEFT_BRACE : '{';
RIGHT_BRACE : '}';
LEFT_ANGLE: '<';
RIGHT_ANGLE: '>';

COLON : ':';
SEMICOLON : ';';
COMMA : ',';
OR : '|';

GRAMMAR: 'grammar';
PACKAGE : 'package';

REGEXP : '"' (.)*? '"' ;
SKIP_RULE : '-> skip';

ARGUMENT : LEFT_PAREN .+? RIGHT_PAREN;

WHITESPACES : [ \t\r\n]+ -> skip;
BLOCK_COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT : '//' ~ [\r\n]* -> skip;

ID : LOWERCASE;

TERMINAL_NAME: [A-Z_]+;

LOWERCASE  : [a-z]([0-9a-zA-Z])*;
CAPITALIZED: [A-Z]([0-9a-zA-Z])*;

CODE : LEFT_BRACE .+? RIGHT_BRACE;