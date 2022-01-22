grammar Grammar;

tree: code=translationUnit? EOF;

primaryExpression:
	StringLiteral+
	| Number
	| LeftParen expression RightParen
	| ID;

postfixExpression:
	primaryExpression
	| postfixExpression LeftParen expressionList? RightParen
	| postfixExpression Dot ID;

expressionList:
    expression #listNextLevel
    | args=expressionList Comma expr=expression #expressionListAss1;


unaryExpression:
	postfixExpression
	| unaryOperator unaryExpression;

unaryOperator: Plus | Minus | Not;

multiplicativeExpression:
    unaryExpression #mulExpressionNextLevel
    | exp1=multiplicativeExpression op=Mul exp2=unaryExpression #mulOperation
    | exp1=multiplicativeExpression op=Div exp2=unaryExpression #mulOperation
    | exp1=multiplicativeExpression op=Mod exp2=unaryExpression #mulOperation;

additiveExpression:
    multiplicativeExpression #addExpressionNextLevel
    | exp1=additiveExpression op=Plus exp2=multiplicativeExpression #addOperation
    | exp1=additiveExpression op=Minus exp2=multiplicativeExpression #addOperation;

relationalExpression :
    additiveExpression #relExpressionNextLevel
    | exp1=relationalExpression op=Less exp2=additiveExpression #relOperation
    | exp1=relationalExpression op=NotGreater exp2=additiveExpression #relOperation
    | exp1=relationalExpression op=Greater exp2=additiveExpression #relOperation
    | exp1=relationalExpression op=NotLess exp2=additiveExpression #relOperation;

equalityExpression:
    relationalExpression #equalityExpressionNextLevel
    | exp1=equalityExpression op=Equal exp2=relationalExpression #equalityOperation
    | exp1=equalityExpression op=NotEqual exp2=relationalExpression #equalityOperation;

andExpression:
   equalityExpression #andExpressionNext
   | exp1=andExpression op=And ex2=equalityExpression #andOperation;

orExpression:
    andExpression #orExpressionNext
    | exp1=orExpression op=Or exp2=andExpression #orOperation;

expression:
    orExpression #expressionNext
    | exp1=unaryExpression op=assignmentOperator exp2=expression #expressionListAss;

assignmentOperator:
    Assign | PlusAssign | MinusAssign | DivAssign | MulAssign | ModAssign;

declaration
    :   t=type decl=initDeclarator Semicolon;

initDeclarator
    :   declarator #initDeclNextLevel                             // Empty declaration
    |   e1=declarator Assign e2=expression #initDeclEq  // For intial value declaration
    ;

type:
    ('void'
    | 'char'
    | 'short'
    | 'int'
    | 'long'
    | 'float'
    | 'double'
    | 'bool'
    | ID);

declarator:
    ID
    | LeftParen declarator RightParen
    | declarator LeftParen functionArgs? RightParen;

functionArgs:
    argDeclaration #argsNext
    | exp1=functionArgs Comma exp2=functionArgs #argsComma;

argDeclaration: t=type argName=ID;

statement returns [boolean ignore]:
    codeBlock
    |   e=expressionStatement {$ignore = $e.ignore;}
    |   ifBlock
    |   switchBlock
    |   iterationBlock
    |   jumpStatement;

codeBlock returns [boolean ignore]:
    LeftBrace scopedCode=blockItemList? RightBrace;

caseBlock returns [boolean ignore]:
    name=Case exp=expression Colon scopedCode=blockItemList? stat=caseBlock?
    | name=Default exp=expression? Colon scopedCode=blockItemList?;

blockItemList returns [boolean ignore]:
    blockItem #blockItemListNewLine
    |   list=blockItemList item=blockItem {$list.ignore = $item.ignore;} #blockItemListN;

blockItem returns [boolean ignore]:
    e=statement {$ignore = $e.ignore;}
    |   declaration;

expressionStatement returns [boolean ignore]:
    e=expression Semicolon #exprMeaningful
    |   Semicolon {$ignore = true;} #exprEmpty;

ifBlock:
   If LeftParen condition=expression RightParen ifCode=codeBlock (Else elseCode=codeBlock)?;

switchBlock:
    Switch LeftParen condition=expression RightParen switchCode=caseStatement;

caseStatement:
    LeftBrace code=caseBlock RightBrace;

iterationBlock:
    name=While LeftParen e1=expression RightParen code=codeBlock
    |  name=For LeftParen forCond=forCondition RightParen code=codeBlock
    |  name=Do code=codeBlock While LeftParen e1=expression RightParen;

forCondition:
    d=forDeclaration? Semicolon e1=forExpression? Semicolon e2=forExpression?
	|   assignExpr=expression? Semicolon e1=forExpression? Semicolon e2=forExpression?;

forExpression:
    expression #forExprNextLevel
    |   forExprList=forExpression Comma assignExpr=expression #forExpr1;

forDeclaration:
    t=type initDecl=initDeclarator;

jumpStatement:
    Continue Semicolon #jumpContinue
    |   Break Semicolon #jumpBreak
    |   Return (returnValue=expression)? Semicolon #jumpReturn;

translationUnit:
    function
    |   translationUnit function;

function:
    returnType=type definition=declarator code=codeBlock;

//Lexer
Bool: 'bool';
Break: 'break';
Char: 'char';
Continue: 'continue';
Do: 'do';
Double: 'double';
Else: 'else';
Float: 'float';
For: 'for';
If: 'if';
Int: 'int';
Long: 'long';
Return: 'return';
Short: 'short';
Void: 'void';
While: 'while';
Switch: 'switch';
Case: 'case';
Default: 'default';

Dot: '.';

LeftParen : '(';
RightParen : ')';
LeftBracket : '[';
RightBracket : ']';
LeftBrace : '{';
RightBrace : '}';

Less : '<';
NotGreater : '<=';
Greater : '>';
NotLess : '>=';

Plus : '+';
Minus : '-';
Mul : '*';
Div : '/';
Mod : '%';

Assign : '=';

PlusAssign : '+=';
MinusAssign : '-=';
MulAssign : '*=';
DivAssign : '/=';
ModAssign : '%=';

And : '&&';
Or : '||';
Not : '!';

Equal : '==';
NotEqual: '!=';

Colon : ':';
Semicolon : ';';
Comma : ',';

ID : NonDigit (NonDigit | Digit)*;

fragment Schar:
	~ ["\\\r\n];

StringLiteral : '"' Schar* '"';

fragment Sign : [+-];

fragment Digit : '0'..'9';

fragment NonDigit: [a-zA-Z_];

fragment DigitSequence : Digit+;

fragment FractionalConst :
    DigitSequence? '.' DigitSequence
    | DigitSequence '.';

fragment DecimalConst : Digit+;

Number : DecimalConst | FractionalConst;

Whitespace: [ \t]+ -> skip;

Newline: ('\r' '\n'? | '\n') -> skip;

BlockComment: '/*' .*? '*/' -> skip;

LineComment: '//' ~ [\r\n]* -> skip;