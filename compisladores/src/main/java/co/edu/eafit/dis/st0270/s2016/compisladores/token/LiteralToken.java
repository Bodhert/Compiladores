
package co.edu.eafit.dis.st0270.s2016.compisladores.token;

import co.edu.eafit.dis.st0270.s2016.compisladores.token.SCToken;

public abstract class LiteralToken
extends SCToken {
    public LiteralToken(int column, int line, String text) {
        super(column, line, text);
    }
}

