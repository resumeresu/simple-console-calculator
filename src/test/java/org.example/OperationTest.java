package org.example;

import org.example.impl.Addition;
import org.example.impl.Division;
import org.example.impl.Multiplication;
import org.example.impl.Subtraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperationTest {

    private Operation operation;

    @Test
    void additionTest() {
        operation = new Addition();
        Assertions.assertEquals(4.44, operation.performOperation(2.22, 2.22));
    }

    @Test
    void divisionTest() {
        operation = new Division();
        Assertions.assertEquals(2.22, operation.performOperation(4.44, 2.00));
    }

    @Test
    void multiplicationTest() {
        operation = new Multiplication();
        Assertions.assertEquals(4.928400000000001, operation.performOperation(2.22, 2.22));
    }

    @Test
    void subtractionTest() {
        operation = new Subtraction();
        Assertions.assertEquals(2.22, operation.performOperation(4.44, 2.22));
    }
}
