package org.example.mock;

import org.example.Operation;
import org.example.Operations;
import org.example.Reader;

public class MockReader implements Reader {

    @Override
    public double readA() {
        return 2.22;
    }

    @Override
    public double readB() {
        return 2.22;
    }

    @Override
    public Operation readOperation() {
        return Operations.ADDITION.getImplementation();
    }
}
