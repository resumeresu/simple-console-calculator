package org.example.impl;

import org.example.Operation;

public class Addition extends Operation {
    public Addition() {
        super("Addition", '+');
    }

    @Override
    public double performOperation(double a, double b) {
        return a + b;
    }
}
