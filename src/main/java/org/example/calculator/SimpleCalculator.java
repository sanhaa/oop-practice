package org.example.calculator;

import org.example.calculator.operator.*;

import java.util.List;

/**
 * SimpleCalculator
 * - 입력되는 두 수 a, b는 모두 0이상이어야 합니다. -> IllegalArgumentException() 발생
 * - 단, 사칙연산 중 +와 -연산만 가능합니다.
 */

public class SimpleCalculator extends AbstractCalculator {
    private static final List<ArithmeticOperator> arithmeticOperators = List.of(new AdditionOperator(), new SubtractionOperator());

    @Override
    public int executeCalculate(int a, String operator, int b) {
        // 1. 입력된 두 수 validation 검사
        // 2. calculate 수행
        // 사실 위의 두 기능을 따로 메소드로 분리하는게 좋지만..
        if(numberValidation(a, b)) {
            return arithmeticOperators.stream()
                    .filter(arithmeticOperator -> arithmeticOperator.supports(operator))
                    .map(arithmeticOperator -> arithmeticOperator.calculate(a, b))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다.(+, - 연산만 지원)"));
        }
        else throw new IllegalArgumentException("음수는 계산할 수 없습니다.");
    }
}
