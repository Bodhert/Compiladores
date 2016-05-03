lexer grammar SCcompisladoresANTLRLexer;

@lexer::header{
package co.edu.eafit.dis.st0270.s2016.compisladores.lexer;
}


options
{
 superClass = NLexer;
}

@lexer::rulecatch {
   catch (RecognitionException e) {
      throw e;
   }
}

Operators
		: '[' 
		| ']' 
		| '{'
		| '}'
		| '(' 
		| ')' 
		| '<' 
		| '>' 
		| '+' 
		| '-' 
		| '*' 
		| '/' 
		| '>>=' 
		| '>>' 
		| '|' 
		| '@' 
		| '=' 
		| ':' 
		;

		
ReservedWord
			: 'disp'
			| 'input'
			| 'let'
			| 'Int'
			;

SeparatorWord
			: ','
			;

SpecialSymbol
			: '()'
			; 

LiteralIntToken : '0' | ['1'..'9']['0'..'9']* 
			    ;

LiteralStringToken : '"'( ~('"'|'\n'|'\r') )*'"' | '_'
				   ;

IDToken : (['a'-'z']|['A'-'Z'])*
		;

Comment
      :  ( '//' ~[\r\n]* '\r'? '\n'
         | '/*' .*? '*/'
         ) -> skip
      ;

WhiteSpace  :   ( ' '
		        | '\t'
        		| '\r'
        		| '\n'
        		| '\f'
        		) -> skip
    		;