package org.example.impl;

import org.example.Operation;
import org.example.Operations;
import org.example.Reader;

import java.util.Scanner;

public class ConsoleReader implements Reader {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public double readA() {
        return scanner.nextDouble();
    }

    @Override
    public double readB() {
        return scanner.nextDouble();
    }

    @Override
    public Operation readOperation() {
        char symbol = scanner.next().charAt(0);
        return Operations.lookup(symbol).getImplementation();
    }
}
