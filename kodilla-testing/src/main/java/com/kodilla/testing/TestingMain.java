package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calc = new Calculator(5,4);
        Integer result = calc.add();
        Integer result2 = calc.subtract();

        if (result.equals(9)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error");
        }

        if (result2.equals(1)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error");
        }
    }





    }

