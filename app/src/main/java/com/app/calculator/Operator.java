package com.app.calculator;

public enum Operator {
    DEF("def","Select Operation"),
    ADD("add","+"),
    DIV("divide","/");

    private String name, symbol;

    Operator(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return name;
    }
}
