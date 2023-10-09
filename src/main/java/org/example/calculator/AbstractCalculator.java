package org.example.calculator;

/**
 * Abstract Class는
 * 하위 클래스에게 공통 method를 구현한 채로 상속할 수 있다.
 * 하위 클래스는 상위 클래스(abstract class)에 구현된 모든 method를 재정의하지 않아도 된다.
 * 다만, abstract method는 하위 클래스에서 반드시 재정의해야 한다.
 */
public abstract class AbstractCalculator {

    boolean numberValidation(int a, int b){
        /**
         * a, b 두 수의 validation을 검사합니다.
         * - a, b 중 하나가 음수인 경우 false를 반환
         * - a, b 모두 0포함 양수인 경우 true를 반환
         */
        if(a < 0 || b<0) return false;
        else return true;
    }

    // abstract method: 자식 class에게 overriding 강요
    abstract public int executeCalculate(int a, String operator, int b);
}
