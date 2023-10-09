package org.example.calculator.operator;

public class AdditionOperator implements ArithmeticOperator {

    @Override
    public boolean supports(String operator) {
        return "+".equals(operator);
    }

    @Override
    public int calculate(int a, int b) {
        return 0;
    }
}
