package com.example.factorial;

public class FactorialCalculator {

    public long calculateFactorial(int number) {
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}

package com.example.factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {

    @Test
    void testCalculateFactorial() {
        FactorialCalculator calculator = new FactorialCalculator();
        assertEquals(24, calculator.calculateFactorial(4));
        assertEquals(120, calculator.calculateFactorial(5));
        assertEquals(720, calculator.calculateFactorial(6));
    }
}
