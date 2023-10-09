package org.example.calculator.operator;

/**
 * 이 예제에서는
 * 각각의 Calculator 객체에 입력된 operator에 맞는 operator 객체를 가져오기 위하여
 * List<> 에 operator를 객체를 생성해 넣어두고, filter() 함수를 통해 찾아내는 방법을 사용합니다. (그냥 연습의 의미입니다.)
 * List 자료구조에 각 operator 객체를 넣기 위해 상위 클래스 (여기서는 interface)를 생성하여 자료형을 통일해주겠습니다.
 */
public interface ArithmeticOperator {
    boolean supports(String operator); // 해당 operator를 지원하는지
    int calculate(int a, int b);
}
