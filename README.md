# 자동차 경주

## 기능 요구 사항
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우이다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.
- 우승자가 여러 명일 경우 쉼표(,)를 이용하여 구분한다.
- 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료되어야 한다.

## Class 구조
1. Application : main 메서드(하위 클래스 조합)
2. InputView : cars 메서드(public), moveCount 메서드(public)
3. CarValidator : carValidate 메서드(public, static)
4. CountValidator : countValidate 메서드(public, static)
5. MoveStrategy : isMovable 메서드(public)
6. RacingGame : race 메서드(public)
7. Winners : win 메서드(public)
8. OutputView : progressView 메서드(public), resultView 메서드(public)

## 기능 구현 목록
1. main : 프로그램에서 사용되는 클래스들을 조합하여 선언
2. cars : 사용자로부터 car 이름 목록을 입력 받음
3. carValidate : 입력 받은 car 이름이 형식에서 벗어났거나 잘못된 값이 입력되지 않았는 지 검증
4. moveCount : 사용자로부터 이동 횟수를 입력 받음
5. countValidate : 입력 받은 이동 횟수가 잘못된 값인지 검증
6. isMovable : 전진 or 멈춤의 기준을 명시
7. race : 앞서 받은 car 목록, 이동 횟수를 전진 기준을 바탕으로 실제 경주 진행 및 이동 기록 반환
8. win : race를 통해 나온 결과 리스트를 정리
   8-1. 입력 받은 결과 목록에서 각 자동차의 전진 횟수를 수치화
   8-2. 우승 차 목록을 리스트로 전달
9. progressView : 중간 이동 상황을 형식에 맞게 출력
10. resultView : 최종 승자를 형식에 맞게 출력