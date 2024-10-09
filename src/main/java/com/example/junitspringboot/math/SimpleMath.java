package com.example.junitspringboot.math;

public class SimpleMath {
    public Double sum(Double numberOne, Double numberTwo) {
        return numberOne +  numberTwo;
    }

    public Double subtraction(Double numberOne, Double numberTwo) {
        return numberOne -  numberTwo;
    }

    public Double multiplication(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }

    public Double division(Double numberOne, Double numberTwo) throws ArithmeticException {
        if (numberTwo.equals(0.0)) {
            throw new ArithmeticException("numberTwo cant be zero");
        }
        return numberOne / numberTwo;
    }

    public Double mean(Double numberOne, Double numberTwo) {
        return (numberOne +  numberTwo) / 2;
    }

    public Double squareRoot(Double number) {
        return Math.sqrt(number);
    }
}
