package org.example.calculator;

public class Main {

    public static void main(String[] args){
        int a = 10;
        int b = 2;

        String operator = "+";

        Calculator calculator = new Calculator();

        int result = calculator.executeCalculate(a, operator, b);

        System.out.println("result = " + result);

        AbstractCalculator newCalculator = new BasicCalculator();
        System.out.println("result = " + newCalculator.executeCalculate(a, operator, b));

    }

}
