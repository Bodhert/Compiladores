package co.edu.eafit.dis.st0270.s2016.compisladores.lexer;

import co.edu.eafit.dis.st0270.s2016.compisladores.token.COReservedWordToken;
import co.edu.eafit.dis.st0270.s2016.compisladores.token.COIDToken;
import co.edu.eafit.dis.st0270.s2016.compisladores.token.COLiteralToken;
import co.edu.eafit.dis.st0270.s2016.compisladores.token.COOperatorToken;
import co.edu.eafit.dis.st0270.s2016.compisladores.token.COSeparatorToken;
import co.edu.eafit.dis.st0270.s2016.compisladores.token.COSpecialSymbolToken;
import co.edu.eafit.dis.st0270.s2016.compisladores.token.COStringToken;
import co.edu.eafit.dis.st0270.s2016.compisladores.token.COIntToken;
import co.edu.eafit.dis.st0270.s2016.sisctr.token.SCToken;
import co.edu.eafit.dis.st0270.s2016.sisctr.lexer.SCLexer;
import co.edu.eafit.dis.st0270.s2016.sisctr.lexer.SCLexerException;
import java.io.IOException;

%%
%implements SCLexer
%class SCcompisladoresLexer
%unicode
%line
%column
%type SCToken
%public


%{
public SCToken getNextToken() throws SCLexerException{
       SCToken t = null;
       try{
	t =  yylex();
       }catch(Exception e){
       	throw new SCLexerException(e.getMessage());		    
       }
       return t; 
}
%}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\n\f\r]

Comment              = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}
TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*

Operator = "[" | "]" | "{" | "}" |"("| ")" | "<" | ">" | "+" | "-"
	       | "*" | "/" | ">>=" | ">>" | "|" | "@" | "=" | ":"

ReservedWord = "disp" | "input" | "let" | "Int"

SeparatorWord = ","

SpecialSymbol = "()"

LiteralIntToken = ([0-9]*|-[0-9]*) 

LiteralStringToken = "\""([^\n\"\\]*(\\[.\n])*)*"\"" | "_"

IDToken = ([a-z]|[A-Z]|[0-9]|"_")*

%%

<YYINITIAL> {
 {SpecialSymbol}   { return new COSpecialSymbolToken(yycolumn,yyline,yytext()); }
 {SeparatorWord}   { return new COSeparatorToken(yycolumn,yyline,yytext()); }
 {ReservedWord}    { return new COReservedWordToken(yycolumn,yyline,yytext()); }
 {Operator} 	   { return new COOperatorToken(yycolumn,yyline,yytext()); }
 {LiteralIntToken}	   { return new COIntToken(yycolumn,yyline,yytext()); }
 {LiteralStringToken}  { return new COStringToken(yycolumn,yyline,yytext()); }
 {IDToken} 	   { return new COIDToken (yycolumn,yyline,yytext()); }
 {WhiteSpace}	   { /*ignore*/ }
 {Comment}	   { /*ignore*/ }
}

[^]		 {throw new java.io.IOException ("Excepcion: Lexema Invalido: " + yytext() + " linea: " + (yyline + 1) + " columna: " + yycolumn);}

