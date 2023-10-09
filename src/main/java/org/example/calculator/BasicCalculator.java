package org.example.calculator;

import org.example.calculator.operator.*;

import java.util.List;

/**
 * Basic Calculator
 * - 두 수의 양수/음수 범위 제한은 따로 없습니다.
 * - 사칙연산 (+, -, *, /) 모두 가능합니다.
 * - 나누기 연산에서 0으로 나눌 수 없습니다. -> IllegalArgumentException() 발생
 */

public class BasicCalculator extends AbstractCalculator {
    // ArithmeticOperator라는 interface로 이루어진 리스트
    private static final List<ArithmeticOperator> arithmeticOperators = List.of(new AdditionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());

    @Override
    public int executeCalculate(int a, String operator, int b) {
        return arithmeticOperators.stream()
                .filter(arithmeticOperator -> arithmeticOperator.supports(operator)) // 입력된 operator를 지원하는 operator 객체를 List<>에서 찾습니다.
                .map(arithmeticOperator -> arithmeticOperator.calculate(a, b))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));

    }
}
