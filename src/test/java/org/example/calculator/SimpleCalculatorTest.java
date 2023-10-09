package org.example.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.api.Assertions.*;

/**
 * SimpleCalculator
 * - 입력되는 두 수 a, b는 모두 0이상이어야 합니다. -> IllegalArgumentException() 발생
 * - 단, 사칙연산 중 +와 -연산만 가능합니다.
 * - 나누기 연산에서 0으로 나눌 수 없습니다. -> IllegalArgumentException() 발생
 */
class SimpleCalculatorTest {
    SimpleCalculator calculator = new SimpleCalculator();

    @DisplayName("입력된 두 수는 모두 0이상이어야 합니다.")
    @Test
    void invalidNumber() {
        assertThatCode(()->calculator.executeCalculate(-1, "+", 2))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("지원 가능한 연산자는 (+, -) 입니다.")
    @ParameterizedTest
    @ValueSource(strings = {"+", "-"})
    void validOperator(String operator) {
        assertThatCode(()->calculator.executeCalculate(1, operator, 2))
                .doesNotThrowAnyException();
    }

    @DisplayName("지원 불가능한 연산자는 (*, /) 입니다.")
    @ParameterizedTest
    @ValueSource(strings = {"*", "/"})
    void invalidOperator(String operator) {
        assertThatCode(()->calculator.executeCalculate(1, operator, 2))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("나눗셈에서 0을 나누는 경우 IllegalArgumentException 예외를 발생시킨다.")
    @Test
    void zeroDivisionTest() {
        assertThatCode(() -> calculator.executeCalculate(10, "/", 0))
                .isInstanceOf(IllegalArgumentException.class);
    }

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
}