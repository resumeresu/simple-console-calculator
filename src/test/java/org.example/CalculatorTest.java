package org.example;

import org.example.mock.MockReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    //TODO: try to implement mockito
    private final Calculator calculator = new Calculator(new MockReader());

    @Test
    void calculatorTest() {
        String result = calculator.run();
        Assertions.assertEquals("Result: 4.44", result);
    }
}