package org.example.calculator;

import org.example.calculator.operator.*;

import java.util.List;

/**
 * SimpleCalculator
 * - 입력되는 두 수 a, b는 모두 0이상이어야 합니다. -> IllegalArgumentException() 발생
 * - 단, 사칙연산 중 +와 -연산만 가능합니다.
 */

public class SimpleCalculator extends AbstractCalculator {
    private static final List<ArithmeticOperator> arithmeticOperators = List.of();

    @Override
    public int executeCalculate(int a, String operator, int b) {
        /**
         * TODO: 계산을 수행하는 코드를 작성합니다.
         * 1. 입력된 두 수 validation 검사하고 필요시 IllegalArgumentException() 발생
         *  2. calculate 수행하고 불가능한 사칙연산이 들어온 경우 IllegalArgumentException() 발생
         * 사실 위의 두 기능을 따로 메소드로 분리하는게 좋지만..
         */
        return 0;
    }
}
