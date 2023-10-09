package org.example.calculator.operator;

public class DivisionOperator implements ArithmeticOperator{
    @Override
    public boolean supports(String operator) {
        return "/".equals(operator);
    }

    @Override
    public int calculate(int a, int b) {
        if(b == 0)
            throw new IllegalArgumentException("0으로는 나눌 수 없습니다.");
        else
            return a/b;
    }
}
