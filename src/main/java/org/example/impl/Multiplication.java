package org.example.impl;

import org.example.Operation;

public class Multiplication extends Operation {
    public Multiplication() {
        super("Multiplication", '*');
    }

    @Override
    public double performOperation(double a, double b) {
        return a * b;
    }
}
