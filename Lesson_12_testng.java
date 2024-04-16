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

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite">
    <test thread-count="5" name="Test">
        <classes>
            <class name="com.example.factorial.FactorialCalculatorTest"/>
        </classes>
    </test> <!-- Test -->
</suite> <!-- Suite -->

package com.example.factorial;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FactorialCalculatorTest {

    @Test
    public void testCalculateFactorial() {
        FactorialCalculator calculator = new FactorialCalculator();
        assertEquals(24, calculator.calculateFactorial(4));
        assertEquals(120, calculator.calculateFactorial(5));
        assertEquals(720, calculator.calculateFactorial(6));
    }
}
