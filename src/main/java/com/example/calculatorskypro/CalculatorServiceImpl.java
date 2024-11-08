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
    public String calculatorPlus(float num1, float num2) {
        float result = num1 + num2;
        String str = String.format("%f + %f = %f", num1, num2, result);
        return str;
    }

    @Override
    public String calculatorMinus() {
        return "";
    }

    @Override
    public String calculatorMultiply() {
        return "";
    }

    @Override
    public String calculatorDivide() {
        return "";
    }


}
