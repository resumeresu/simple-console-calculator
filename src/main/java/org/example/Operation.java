package org.example;

public abstract class Operation {

    private final String name;
    private final char symbol;

    public Operation(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public abstract double performOperation(double a,  double b);
}
