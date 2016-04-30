
package co.edu.eafit.dis.st0270.s2016.compisladores.token;

//import co.edu.eafit.dis.st0270.s2016.sisctr.token.SCToken; //por que al extender debe ser toda esa ruta

public  class COIDToken
extends co.edu.eafit.dis.st0270.s2016.sisctr.token.IDToken{
   
    
    public COIDToken(int column, int line, String id) {
        super(column,line,id);
    }

    public String toString(){
	String column = "" + super.getColumn();
	String line = "" + super.getLine();
	String id = super.getText();    
	return "Identifier: " + id + "linea: " + line + " columna: " + column;
    }
}

