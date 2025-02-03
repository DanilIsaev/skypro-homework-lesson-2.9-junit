package com.example.calculatorskypro.service;

import com.example.calculatorskypro.exception.ZeroDevisionException;
import org.junit.jupiter.api.Test;

import static com.example.calculatorskypro.CalculatorServiceImplTestConstant.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private final CalculatorService calculatorServiceTest = new CalculatorServiceImpl();
    String result;

    @Test
    void calculatorPlus() {
        result = String.format("%d + %d = %d", NUM1, NUM2, NUM1 + NUM2);
        assertEquals(result, calculatorServiceTest.calculatorPlus(NUM1, NUM2));
    }

    @Test
    void calculatorMinus() {
        result = String.format("%d - %d = %d", NUM1, NUM2, NUM1 - NUM2);
        assertEquals(result, calculatorServiceTest.calculatorMinus(NUM1, NUM2));
    }

    @Test
    void calculatorMultiply() {
        result = String.format("%d * %d = %d", NUM4, NUM2, NUM4 * NUM2);
        assertEquals(result, calculatorServiceTest.calculatorMultiply(NUM4, NUM2));
    }

    @Test
    void calculatorDivide() {
        result = String.format("%d / %d = %d", NUM4, NUM2, NUM4 / NUM2);
        assertEquals(result, calculatorServiceTest.calculatorDivide(NUM4, NUM2));
    }

    @Test
    void calculatorDivideZero() {
        assertThrows(ZeroDevisionException.class, () -> calculatorServiceTest.calculatorDivide(NUM2, ZERO));
    }


}