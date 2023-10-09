package org.example.calculator.operator;

public class DivisionOperator implements ArithmeticOperator{
    @Override
    public boolean supports(String operator) {
        return true;
    }

    @Override
    public int calculate(int a, int b) {
        return 0;
    }
}
