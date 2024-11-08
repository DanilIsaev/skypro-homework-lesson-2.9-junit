package com.example.calculatorskypro;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String calculatorWelcome() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String calculatorPlus(Integer num1, Integer num2) {
        Integer sum = num1 + num2;
        return outputResult(num1, num2, "+", sum);
    }

    @Override
    public String calculatorMinus(Integer num1, Integer num2) {
        Integer minus = num1 - num2;
        return outputResult(num1, num2, "-", minus);
    }

    @Override
    public String calculatorMultiply(Integer num1, Integer num2) {
        return "";
    }

    @Override
    public String calculatorDivide(Integer num1, Integer num2) {
        if (num2 == 0) {
            return "Деление на 0 невозможно";
        } else {
            return "";
        }
    }

    private String outputResult(Integer num1, Integer num2, String action, Integer result) {
        return String.format("%d %s %d = %d", num1, action, num2, result);
    }

}
