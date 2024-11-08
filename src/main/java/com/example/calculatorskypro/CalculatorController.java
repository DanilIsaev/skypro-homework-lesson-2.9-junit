package com.example.calculatorskypro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String calculatorWelcome() {
        return calculatorService.calculatorWelcome();
    }

    @GetMapping(path = "/plus")
    public String calculatorPlus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2){
        return calculatorService.calculatorPlus(num1, num2);
    }
}
