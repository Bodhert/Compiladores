
package co.edu.eafit.dis.st0270.s2016.compisladores.token;

import co.edu.eafit.dis.st0270.s2016.sisctr.compisladores.SCToken;

public abstract class ReservedWordToken
extends SCToken {
    public ReservedWordToken(int column, int line, String text) {
        super(column, line, text);
    }
}

