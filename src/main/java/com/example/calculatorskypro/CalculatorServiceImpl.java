package com.example.calculatorskypro;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String calculatorWelcome() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String calculatorPlus(Integer num1, Integer num2) {
        Integer result = num1 + num2;
        return outputResult(num1, num2, "+", result);
    }

    @Override
    public String calculatorMinus(Integer num1, Integer num2) {
        Integer result = num1 - num2;
        return outputResult(num1, num2, "-", result);
    }

    @Override
    public String calculatorMultiply(Integer num1, Integer num2) {
        Integer result = num1 * num2;
        return outputResult(num1, num2, "*", result);
    }

    @Override
    public String calculatorDivide(Integer num1, Integer num2) {
        if (num2 == 0) {
            return "Деление на 0 невозможно";
        } else {
            Integer result = num1 / num2;
            return outputResult(num1, num2, "/", result);
        }
    }

    private String outputResult(Integer num1, Integer num2, String action, Integer result) {
        return String.format("%d %s %d = %d", num1, action, num2, result);
    }

}
