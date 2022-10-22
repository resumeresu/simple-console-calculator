package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class OperationLookupTest {

    @CsvSource({
            "+, Addition",
            "-, Subtraction",
            "*, Multiplication",
            "/, Division",
            "^, To the power of"
    })
    @ParameterizedTest
    void lookupTest(char symbol, String name) {
        Operations operation = Operations.lookup(symbol);
        Assertions.assertEquals(name, operation.getImplementation().getName());
    }
}
