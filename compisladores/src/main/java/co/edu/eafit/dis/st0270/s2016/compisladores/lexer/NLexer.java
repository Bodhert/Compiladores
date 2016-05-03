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
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Vocabulary;


public abstract class NLexer extends Lexer implements SCLexer {

    public NLexer(CharStream in){
	super(in);
    }

    public SCToken getNextToken() throws SCLexerException{
	Token t = nextToken();
	Token teof = emitEOF();
	
	if(t.getType() ==  teof.getType()) return null;
	
	Vocabulary voc = this.getVocabulary();
	String tipo = voc.getSymbolicName(t.getType());
	SCToken sctoken = null;
	if(tipo.compareTo("OPERATORS") == 0) sctoken = new COOperatorToken(t.getCharPositionInLine(),t.getLine(),t.getText());
	else
	    throw new SCLexerException ("holi");
	
	return sctoken;
    }
    
}
