/*
 * Decompiled with CFR 0_114.
 */
package co.edu.eafit.dis.st0270.s2016.sisctr.token;

public abstract class SCToken {
    private int column;
    private int line;
    private String text;

    public SCToken(int column, int line, String text) {
        this.column = column;
        this.line = line;
        this.text = text;
    }

    public int getColumn() {
        return this.column;
    }

    public int getLine() {
        return this.line;
    }

    public String getText() {
        return this.text;
    }
}

