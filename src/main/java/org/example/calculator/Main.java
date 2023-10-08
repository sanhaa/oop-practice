package org.example.calculator;

public class Main {

    public static void main(String[] args){
        int a = 10;
        int b = 2;

        String operator = "+";

        int result = Calculator.calculate(a, operator, b);

        System.out.println("result = " + result);
    }

}
