/*
 * Decompiled with CFR 0_114.
 */
package co.edu.eafit.dis.st0270.s2016.sisctr.lexer;

import co.edu.eafit.dis.st0270.s2016.sisctr.lexer.SCLexerException;
import co.edu.eafit.dis.st0270.s2016.sisctr.token.SCToken;

public interface SCLexer {
    public SCToken getNextToken() throws SCLexerException;
}

