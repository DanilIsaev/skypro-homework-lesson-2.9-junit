package com.example.calculatorskypro.service;

import com.example.calculatorskypro.exception.ZeroDevisionException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.calculatorskypro.CalculatorServiceImplTestConstant.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceImplTestParams {

    private final CalculatorService calculatorServiceTest = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    void calculatorPlus(Integer num1, Integer num2) {
        assertEquals(generateResultString(num1, num2, "+", num1 + num2), calculatorServiceTest.calculatorPlus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    void calculatorMinus(Integer num1, Integer num2) {
        assertEquals(generateResultString(num1, num2, "-", num1 - num2), calculatorServiceTest.calculatorMinus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    void calculatorMultiply(Integer num1, Integer num2) {
        assertEquals(generateResultString(num1, num2, "*", num1 * num2), calculatorServiceTest.calculatorMultiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    void calculatorDivide(Integer num1, Integer num2) {
        assertEquals(generateResultString(num1, num2, "/", num1 / num2), calculatorServiceTest.calculatorDivide(num1, num2));
    }

    private String generateResultString(Integer num1, Integer num2, String mathOperation, Integer result) {
        return String.format("%d %s %d = %d", num1, mathOperation, num2, result);
    }

    public static Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of(NUM1, NUM2),
                Arguments.of(NUM1, NUM4),
                Arguments.of(NUM2, NUM1),
                Arguments.of(NUM2, NUM4),
                Arguments.of(NUM4, NUM1),
                Arguments.of(NUM4, NUM2)
        );
    }

}
