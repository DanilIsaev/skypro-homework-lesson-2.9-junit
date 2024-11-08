package com.example.calculatorskypro;

import org.springframework.web.bind.annotation.RequestParam;

public interface CalculatorService {
    String calculatorWelcome();

    String calculatorPlus(float num1, float num2);

    String calculatorMinus();

    String calculatorMultiply();

    String calculatorDivide();
}
