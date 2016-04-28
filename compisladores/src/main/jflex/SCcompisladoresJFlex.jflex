package co.edu.eafit.dis.st0270.s2016.compisladores;

import co.edu.eafit.dis.st0270.s2016.compisladores.token.COReservedWordToken;
import co.edu.eafit.dis.st0270.s2016.compisladores.token.COIDToken;
import co.edu.eafit.dis.st0270.s2016.compisladores.token.COLiteralToken;
import co.edu.eafit.dis.st0270.s2016.compisladores.token.COOperatorToken;
import co.edu.eafit.dis.st0270.s2016.compisladores.token.COSeparatorToken;
import co.edu.eafit.dis.st0270.s2016.compisladores.token.COSpecialSymbolToken;


%%
%class SCcompisladoresLexer
%unicode
%line
%column
%function getNextToken
%type Token
%public

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

SpecialSymbol = "()" | "_"

%%

<YYINITIAL> {
 {SpecialSymbol} =  {return new COSpecialSymbolToken(yycolumn,yyline,yytext());}
 {SeparatorWord} =  {return new COSeparatorWord(yycolumn,yyline,yytext()); }
 {ReservedWord}  =  {return new COReservedWordToken(yycolumn,yyline,yytext());}
 {Operator} 	 =  {retrun new 	    

}