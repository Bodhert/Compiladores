grammar SCcompisladoresANTLRParser;

  @header{
    package co.edu.eafit.dis.st0270.s2016.compisladores.parser;
  }

control : decls disp #ctrl
        ;

decls :                 #voidDecls //epsilon
      | decllet decls   #letList
      | decldisp decls  #dispList
      ;

decldisp : 'disp' ID tao STRING '=' exp #dispL
         ;

decllet : 'let' ID '=' disp   #letL
        ;

disp   : disp1 disp0pp #dispVi
        ;

disp0p : '>>=' disp1 disp0pp #delt0p
        ;

disp0pp  : #delt0ppEmpty
          | disp0p #delt0pp
          ;

disp1    :  disp2 disp1pp #delt1
          ;

disp1p   : '>>' disp2 disp1pp #delt1p
          ;

disp1pp  : #delt1ppEmpty
          | disp1p #delt1pp
          ;

disp2  : disp3 disp2pp #delt2
        ;

disp2p   : '|' disp3 disp2pp #delt2p
          ;

disp2pp  : #delt2ppEmpty
          | disp2p #delt2pp
          ;

disp3    : ID #delt3ID
          | '{' disp '}' #delt3Curl
          | '[' exp ']' #delt3Brack
          | '(' disp (',' disp)+ ')' #delt3Paren
          ;

exp       : '+' exp exp0p #add
          | '-' exp exp0p #sub
          | exp1 #expr1
          ;

exp1      : '*' exp exp0p #times
          | '/' exp exp0p #divide
          | exp2 #expr2
          ;

exp2      : eta INT exp0p #num
          | exp3 #expr3
          ;

exp3      :'@' exp exp0p #at
          | '_' exp0p #underLine
          | 'input' exp0p #input
          | '(' exp ')' exp0p #listParen
          | '<' exp (',' exp)+ '>' exp0p #listAng
          ;

exp0p     : #exp0pEmpty
          | exp #expr
          ;

eta       : #positive
          | '-' #negative
          ;

tao         :tao1 tao0p #tao1L
          ;

tao0p       : #tao0pEmpty
          |':' tao #dots
          ;

tao1        : 'Int' #tao1Int
          | VOID #tao1Void
          | '(' tao(',' tao)+ ')' #tao1Paren
          ;

VOID      : '()'
          ;

STRING    : '"' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '_' | '/' | ' ') * '"'
          ;

INT       : '0'
          | ('1'..'9')('0'..'9')*
          ;

ID        : ([a-zA-Z][a-zA-Z0-9_]*)
          ;

WS : ( ' '
| '\t'
| '\r'
| '\n'
| '\f'
) -> skip
;
