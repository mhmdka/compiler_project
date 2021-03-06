grammar Jython;

prog                    :   importclass* (classDef)?;
importclass             :   'import' CLASSNAME;
classDef                :   'class' CLASSNAME('(' CLASSNAME')')? '{' class_body* '}';
class_body              :   varDec
                        |   methodDec
                        |   constructor
                        |   arrayDec
                        ;
varDec                  :   type ID ;
arrayDec                :   type '['INTEGER']' ID ;

//My Changes
arrayAssign             :   (arrayDec | prefixexp) '=' type args ('['INTEGER']');

methodDec               :   'def' (type|'void') ID  '(' parameter* ')''{' ( statement)* '}';
constructor             :   'def'  CLASSNAME'(' parameter* ')''{' ( statement)* '}';
parameter               :   varDec (',' varDec)* ;
statement               :   varDec
                        |   assignment
                        |   print_statment
                        |   method_call
                        |   return_statment
                        |   if_statment    
                        |   while_statment   
                        |   if_else_statment
                        |   for_statment
                        ;
return_statment         :   'return' exp ;
condition_list          :   condition (('or'|'and') condition)*;
condition               :   BOOL
                        |   prefixexp
                        |   equality
                        ;
if_statment             :   'if' '(' condition_list ')' '{' statement* '}';
while_statment          :   'while' '(' condition_list ')' '{' statement* '}';
if_else_statment        :   'if' '(' condition_list ')' '{'statement* '}'
                            ('elif' '(' condition_list ')' '{' statement*'}')*
                            ('else' '{' statement* '}')?;
print_statment          :   'print' '(' (prefixexp | type args | INTEGER | STRING | BOOL) ')';
for_statment            :   'for' ID 'in' ID '{' statement* '}'
                        |   'for' ID 'in' 'range' '(' INTEGER (',' INTEGER)? (',' INTEGER)? ')' '{' statement* '}';
method_call             :   prefixexp '.' ID args
                        |   ID args
                        ;
assignment              :   assign
                        |   type assign
                        |   arrayAssign
                        ;

exp                     :   'none' 
                        |   BOOL 
                        |   INTEGER 
                        |   STRING 
                        |   Float
                        |   prefixexp
                        |   CLASSNAME args  
                        |   '(' assign ')'
                        |   ID args
                        ;

prefixexp               :   ID 
                        |   prefixexp '[' add ']'
                        |   prefixexp '.' ID 
                        |   prefixexp '.' ID args 
                        |   'self' '.' method_call 
                        |   'self' '.' ID;

args                    :   '(' (explist)? ')';
explist                 :   exp (',' exp)*;
type                    :   'int' 
                        |   'float' 
                        |   'bool' 
                        |   'string' 
                        |   CLASSNAME;


// PRIORITY

assign                  :   and (('=' | '+=' | '*=' | '-=' | '/=') and)* ;
and                     :   equality (('and' | 'or') equality)* ;
equality                :   relation (('==' | '!=') relation)* ;
relation                :   add (('>' | '<' | '>=' | '<=') add)* ;
add                     :   mult (('+' | '-') mult)* ;
mult                    :   exp (('*' | '/' | '%') exp)* ;

CLASSNAME               :   ('A'..'Z') LetterOrDigit*;
ID                      :   ('a'..'z') LetterOrDigit*;


fragment Dec            :   ('0' | '-'? [1-9] [0-9]*) [1L]? ;
fragment Hex            :   '0' ('x'|'X') ([0-9]| [a-f] | [A-F])+ [1L]?;
fragment Oct            :   '0' '_'* [0-7] ([0-7]* [0-7])? [lL]?;
fragment Bin            :   '0' [bB] [01] ([01]* [01])? [lL]?;


INTEGER                 :   Dec 
                        |   Hex 
                        |   Oct 
                        |   Bin
                        ;
BOOL                    :   'true'
                        |   'false'
                        ;

STRING                  :   '"'  (~[\r\n"] | '""')* '"';
Float                   :   ([0-9]+ '.' ([0-9]+)? | '.' [0-9]+) (('e'|'E') ('-'|'+')? [0-9]+)? [fFdD]?
                        |   [0-9]+ (('e'|'E') ('-'|'+')? [0-9]+ [fFdD]? | [fFdD])
                        ;

fragment Letter         :   [a-zA-Z_];
fragment LetterOrDigit  :   Letter 
                        |   [0-9]
                        ;

fragment INT_DEC        :   'int';
fragment FLOAT_DEC      :   'float';
fragment BOOL_DEC       :   'bool';
fragment STRING_DEC     :   'string';


SINGLELINECOMMENT       :   '#' ~[\r\n]* '\r'? '\n' -> channel(HIDDEN);
MULTILINECOMMENT        :   '#*' .*? '*#'    -> channel(HIDDEN);

WS                      :   [ \r\t\u000C\n]+ -> channel(HIDDEN);
