package org.example.impl;

import org.example.Operation;

public class PowerOf extends Operation {

    public PowerOf() {
        super("To the power of", '^');
    }

    @Override
    public double performOperation(double a, double b) {
        return Math.pow(a, b);
    }
}
