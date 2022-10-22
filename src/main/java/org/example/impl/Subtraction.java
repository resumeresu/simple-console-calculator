package org.example.impl;

import org.example.Operation;

public class Subtraction extends Operation {
    public Subtraction() {
        super("Subtraction", '-');
    }

    @Override
    public double performOperation(double a, double b) {
        return a - b;
    }
}
