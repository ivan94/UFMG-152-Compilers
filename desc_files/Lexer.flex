package br.ufmg.dcc.fernandes.ivan.lexer;

import br.ufmg.dcc.fernandes.ivan.parser.sym;
import java_cup.runtime.*;

%%

%public
%class Lexer
%implements sym

%unicode

%line
%column

%cup
%cupdebug

%{
   private Symbol symbol(int type) {
     return new Symbol(type, yyline, yycolumn);
   }
   private Symbol symbol(int type, Object value) {
     return new Symbol(type, yyline, yycolumn, value);
   }
%}

/* main character classes */
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

WhiteSpace = {LineTerminator} | [ \t\f]

/* comments */
Comment = "//" {InputCharacter}* {LineTerminator}?

/* identifiers */
Identifier = [:jletter:][:jletterdigit:]*

/* integer literals */
DecIntegerLiteral = 0 | [1-9][0-9]*

/* floating point literals */
FloatLiteral  = ({FLit1}|{FLit2}|{FLit3}) {Exponent}?

FLit1    = [0-9]+ \. [0-9]*
FLit2    = \. [0-9]+
FLit3    = [0-9]+
Exponent = [eE] [+-]? [0-9]+

%state CHARLITERAL

%%

<YYINITIAL> {
    /* keywords */
    "int"                          { return symbol(INT); }
    "char"                         { return symbol(CHAR); }
    "float"                        { return symbol(FLOAT); }
    "bool"                         { return symbol(BOOLEAN); }
    "if"                           { return symbol(IF); }
    "while"                        { return symbol(WHILE); }
    "do"                           { return symbol(DO); }
    "else"                         { return symbol(ELSE); }
    "break"                        { return symbol(BREAK); }

    /* boolean literals */
    "true"                         { return symbol(BOOLEAN_LITERAL, true); }
    "false"                        { return symbol(BOOLEAN_LITERAL, false); }

    /* separators */
    "{"                            { return symbol(LBRACE); }
    "}"                            { return symbol(RBRACE); }
    "["                            { return symbol(LBRACK); }
    "]"                            { return symbol(RBRACK); }
    "("                            { return symbol(LPAREN); }
    ")"                            { return symbol(RPAREN); }
    ";"                            { return symbol(SEMICOLON); }


    /* comments */
    {Comment}                      { /* ignore */ }

    /* whitespace */
    {WhiteSpace}                   { /* ignore */ }

    /* operators */
    "="                            { return symbol(EQ); }
    ">"                            { return symbol(GT); }
    "<"                            { return symbol(LT); }
    "!"                            { return symbol(NOT); }
    "=="                           { return symbol(EQEQ); }
    "<="                           { return symbol(LTEQ); }
    ">="                           { return symbol(GTEQ); }
    "!="                           { return symbol(NOTEQ); }
    "&&"                           { return symbol(ANDAND); }
    "||"                           { return symbol(OROR); }
    "+"                            { return symbol(PLUS); }
    "-"                            { return symbol(MINUS); }
    "*"                            { return symbol(MULT); }
    "/"                            { return symbol(DIV); }

    {Identifier}                   { return symbol(IDENTIFIER, yytext()); }
    {DecIntegerLiteral}            { return symbol(INTEGER_LITERAL, new Integer(yytext())); }
    {FloatLiteral}                 { return symbol(FLOATING_POINT_LITERAL, new Float(yytext().substring(0,yylength()-1))); }

}

<<EOF>>                          { return symbol(EOF); }
