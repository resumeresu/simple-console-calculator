package org.example.impl;

import org.example.Operation;

public class Division extends Operation {
    public Division() {
        super("Division", '/');
    }

    @Override
    public double performOperation(double a, double b) {
        return a / b;

    }
}
