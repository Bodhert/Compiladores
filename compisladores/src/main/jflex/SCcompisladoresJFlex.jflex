package co.edu.eafit.dis.st0270.s2016.compisladores.lexer;

import co.edu.eafit.dis.st0270.s2016.compisladores.token.COReservedWordToken;
import co.edu.eafit.dis.st0270.s2016.compisladores.token.COIDToken;
import co.edu.eafit.dis.st0270.s2016.compisladores.token.COLiteralToken;
import co.edu.eafit.dis.st0270.s2016.compisladores.token.COOperatorToken;
import co.edu.eafit.dis.st0270.s2016.compisladores.token.COSeparatorToken;
import co.edu.eafit.dis.st0270.s2016.compisladores.token.COSpecialSymbolToken;
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

LiteralToken = 0 | [1-9][0-9]* 

IDToken = ([a-z]|[A-Z])*

%%

<YYINITIAL> {
 {SpecialSymbol}   { return new COSpecialSymbolToken(yycolumn,yyline,yytext()); }
 {SeparatorWord}   { return new COSeparatorToken(yycolumn,yyline,yytext()); }
 {ReservedWord}    { return new COReservedWordToken(yycolumn,yyline,yytext()); }
 {Operator} 	   { return new COOperatorToken(yycolumn,yyline,yytext()); }
 {LiteralToken}	   { return new COLiteralToken(yycolumn,yyline,yytext()); }
 {IDToken} 	   { return new COIDToken (yycolumn,yyline,yytext()); }
 {WhiteSpace}	   { /*ignore*/ }
 {Comment}	   { /*ignore*/ }
}

[^]		 {throw new java.io.IOException ("Excepcion: Token no reconocido: " + yytext() + " linea: " + (yyline + 1) + " columna: " + yycolumn);}

