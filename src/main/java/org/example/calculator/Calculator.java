package org.example.calculator;

/**
 * 절차지향으로 사칙연산 계산기 코드 짜기
 *
 */

public class Calculator {

    public static int calculate(int a, String operator, int b) {
        /**
         * TODO: operator에 따라 사칙연산 구현하기
         */
        if(operator.equals("+")) return a+b;
        else if(operator.equals("-")) return a-b;
        else if(operator.equals("*")) return a*b;
        else if(operator.equals("/")) return a/b;

        return 0;
    }
}
