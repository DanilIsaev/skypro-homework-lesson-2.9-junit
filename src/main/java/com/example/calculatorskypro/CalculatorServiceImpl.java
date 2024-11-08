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
        String result = String.format("%d + %d = %d", num1, num2, sum);
        return result;
    }

    @Override
    public String calculatorMinus(Integer num1, Integer num2) {
        return "";
    }

    @Override
    public String calculatorMultiply(Integer num1, Integer num2) {
        return "";
    }

    @Override
    public String calculatorDivide(Integer num1, Integer num2) {
        return "";
    }


}
