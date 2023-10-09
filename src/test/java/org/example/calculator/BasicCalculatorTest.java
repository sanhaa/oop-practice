package org.example.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * 요구사항
 * - 간단한 사칙연산을 할 수 있다.
 * - 음수가 하나라도 있으면 IllegalArgument 예외를 발생시킨다.
 * - 나눗셈에서 0으로 나누려고 하는 경우 IllegalArgument 예외를 발생시킨다.
 */
public class BasicCalculatorTest {
    AbstractCalculator calculator = new BasicCalculator();

    @DisplayName("덧셈 연산을 수행한다")
    @Test
    void additionTest() {
        int result = calculator.executeCalculate(1, "+", 2);

        assertThat(result).isEqualTo(3);
    }

    @DisplayName("뺄셈 연산을 수행한다")
    @Test
    void subtractionTest() {
        int result = calculator.executeCalculate(1, "-", 2);

        assertThat(result).isEqualTo(-1);
    }

    @DisplayName("여러 연산을 테스트")
    @ParameterizedTest
    @MethodSource("arg")
    void calculateTest(int a, String operator, int b, int result) {
        int calculated = calculator.executeCalculate(a, operator, b);

        assertThat(calculated).isEqualTo(result);
    }

    private static Stream<Arguments> arg(){
        return Stream.of(
                arguments(1, "+", 2, 3),
                arguments(1, "-", 2, -1),
                arguments(4, "*", 2, 8),
                arguments(4, "/", 2, 2)
        );
    }
    @DisplayName("나눗셈에서 0을 나누는 경우 IllegalArgumentException 예외를 발생시킨다.")
    @Test
    void zeroDivisionTest() {
        assertThatCode(() -> calculator.executeCalculate(10, "/", 0))
                .isInstanceOf(IllegalArgumentException.class);
    }
}