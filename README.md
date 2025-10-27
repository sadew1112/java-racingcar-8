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
3. CarValidator : transCarList 메서드(public), inputValidate 메서드(private), carListValidate 메서드(private)
4. CountValidator : validate 메서드(public)
5. MoveStrategy : isMovable 메서드(public)
6. RacingGame : race 메서드(public), move 메서드(private)
7. OutputView : raceStart 메서드(public), progressView 메서드(public), winnerView 메서드(public)

## 기능 구현 목록
1. main : 프로그램에서 사용되는 클래스들을 조합하여 선언
2. cars : 사용자로부터 car 이름 목록을 입력 받음
3. transCarList : 입력 받은 문자열을 쉼표를 구분자로 구분해서 리스트로 반환
4. inputValidate : 입력 받은 문자열 자체가 형식에서 벗어났는지 검증
5. carListValidate : 입력 받은 car 이름 각각이 형식에서 벗어났거나 잘못된 값이 입력되지 않았는 지 검증
6. moveCount : 사용자로부터 이동 횟수를 입력 받음
7. validate : 입력 받은 이동 횟수가 잘못된 형식인지 검증
8. isMovable : 전진 or 멈춤을 랜덤 숫자를 통해 기준을 거쳐 boolean으로 반환
9. race : 앞서 받은 car 목록, 이동 횟수를 전진 기준을 바탕으로 실제 경주 진행 및 이동 기록 반환
10. move : 입력 boolean 이 true 면 전진(1), false 면 멈춤(0) 을 반환
11. raceStart : "실행 결과" 안내 출력 전용
12. progressView : 중간 이동 상황을 형식에 맞게 출력
13. winnerView : 최종 승자를 형식에 맞게 출력

## 추가 고려 사항
1. 자동차 이름이 공백이 들어오는 경우 해당 이름은 제외시키고 나머지로 car list 구성
2. 자동차 이름 앞뒤로 공백이 들어오는 경우 trim으로 공백 제거
3. 자동차 이름은 중복 불가
4. 시도 횟수로 공백이 들어오는 경우 예외 발생
5. 시도 횟수 앞뒤로 공백이 들어오는 경우 trim으로 공백 제거