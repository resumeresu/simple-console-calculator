package org.example;

import org.example.impl.*;

public enum Operations {
    ADDITION(new Addition()),
    SUBTRACTION(new Subtraction()),
    MULTIPLICATION(new Multiplication()),
    DIVISION(new Division()),
    POWER_OF(new PowerOf());

    private final Operation operation;

    Operations(Operation operation) {
        this.operation = operation;
    }

    public Operation getImplementation() {
        return operation;
    }

    public static Operations lookup(char symbol) {
        for (Operations value : values()) {
            if (value.getImplementation().getSymbol() == symbol)
                return value;
        }
        throw new IllegalArgumentException("Incorrect operation symbol: " + symbol);
    }
}
