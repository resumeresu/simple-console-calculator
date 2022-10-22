package org.example;

import org.example.impl.ConsoleReader;

public class Calculator {

    private final Reader reader;

    public Calculator(Reader reader) {
        this.reader = reader;
    }

    public String run() {
        System.out.println("Enter the first number:");
        double a = reader.readA();
        System.out.println("Enter the second number:");
        double b = reader.readB();
        System.out.println("Enter the required operation:");
        Operation operation = reader.readOperation();
        return "Result: " + operation.performOperation(a, b);
    }

}
