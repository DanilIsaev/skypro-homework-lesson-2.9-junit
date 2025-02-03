package com.example.calculatorskypro.exception;

public class ZeroDevisionException extends IllegalArgumentException {
    public ZeroDevisionException() {
        super("Ошибка, деление на 0 невозможно");
    }
}
