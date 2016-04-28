
package co.edu.eafit.dis.st0270.s2016.compisladores.token;

import co.edu.eafit.dis.st0270.s2016.sisctr.token.SCToken;

public  class COIDToken
extends IDToken {
   
    
    public COIDToken(int column, int line, string id) {
        super(column,line,id);
    }

    public String toString(){
	string column = "" + super.getColumn();
	string line = "" + super.getLine();
	string id = super.getText();    
	return "Identifier: " + id + "linea: " + line + " columna: " + column;
    }
}

