package com.example.calculatorskypro.service;

public interface CalculatorService {
    String calculatorWelcome();

    String calculatorPlus(Integer num1, Integer num2);

    String calculatorMinus(Integer num1, Integer num2);

    String calculatorMultiply(Integer num1, Integer num2);

    String calculatorDivide(Integer num1, Integer num2);
}
