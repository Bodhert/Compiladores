
package co.edu.eafit.dis.st0270.s2016.compisladores.token;

//import co.edu.eafit.dis.st0270.s2016.sisctr.token.SCToken;

public class COLiteralToken
    extends co.edu.eafit.dis.st0270.s2016.sisctr.token.LiteralToken {
    private int valor;

    public COLiteralToken(int column, int line, String text) {
        super(column, line, text);
	this.valor = valor;
    }
    
    public String toString(){
	String column = "" + super.getColumn();
	String line = "" + super.getLine();
	String id = super.getText(); 
	int valor = Integer.parseInt(id);
	if(valor <= 32767 && valor >= -32768){   
	    return "Literal: " + id + " linea: " + line + " columna: " + column;
	} 
	else {
	    return "Exception: Literal no reconocido: " + id + " linea: " + line + " columna: " + column ;
	}
    }
}

