package org.example.calculator;

/**
 * 절차지향 계산기
 */

public class Calculator {

    public int executeCalculate(int a, String operator, int b) {
        /**
         * TODO: 절차지향적 사칙연산 구현하기
         */
        if(a < 0 && b < 0) throw new IllegalArgumentException("음수는 계산할 수 없습니다.");

        if(operator.equals("+")) return a+b;
        else if(operator.equals("-")) return a-b;
        else if(operator.equals("*")) return a*b;
        else if(operator.equals("/")) {
            if(b == 0) throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
            return a/b;
        }

        return 0;
    }
}
