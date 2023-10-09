# oop-practice
23.10.08 ~


## [실습 1] Calculator 절차지향 -> 객체지향 구현하기

### Step1. 절차지향 계산기 구현하기
- release v1 프로젝트 > `Calculator.java` 에 계산기 기능을 구협합니다. 
- 구현 요구사항
  1. 간단한 사칙연산을 할 수 있다.
  2. a, b 두 수 중 음수가 하나라도 있으면 IllegalArgument 예외를 발생시킨다.
  3. 나눗셈에서 0으로 나누려고 하는 경우 IllegalArgument 예외를 발생시킨다.
- `test` 폴더 내부의 `CalculatorTest` 를 실행하여 모두 통과하는지 확인합니다.

### Step2. 객체지향 계산기 구현하기
- 두 개의 Calculator 를 구현합니다.
  1. `BasicCalculator` 
     - 두 수의 양수/음수 범위 제한은 따로 없습니다.
     - 사칙연산 (+, -, *, /) 모두 가능합니다.
     - 나누기 연산에서 0으로 나눌 수 없습니다. -> `IllegalArgumentException()` 발생
  2. `SimpleCalculator`
     - 입력되는 두 수 a, b는 모두 0이상이어야 합니다. -> `IllegalArgumentException()` 발생
     - 단, 사칙연산 중 +와 -연산만 가능합니다.
  3. 두 Calculator class는 `AbstractClass` 를 상속받습니다.

- 4개의 연산자 class 를 구현합니다. 
  - AdditionOperator, DivisionOperator, MultiplicationOperator, SubtractionOperator
  - ArithmeticOperator를 `interface` 를 상속받습니다.

- `test` 폴더 내부의 `SimpleCalculatorTest` `BasicCalculatorTest` 를 실행하여 모두 통과하는지 확인합니다.
