# java-racingcar
자동차 경주 게임 미션 저장소

## 📨 프로그래밍 요구사항
- 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
  - 참고문서: https://google.github.io/styleguide/javaguide.html 또는 https://myeonguni.tistory.com/1596
- 규칙 1: 한 메서드에 오직 한 단계의 들여쓰기(indent)만 한다.를 지키며 구현한다. 
  - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다. 
  - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
- 규칙 2: else 예약어를 쓰지 않는다.를 지키며 구현한다.
  - 힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
  - else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.
- 함수(또는 메소드)의 길이가 10라인을 넘어가지 않도록 구현한다.
  - 함수(또는 메소드)가 한 가지 일만 잘 하도록 구현한다.
    
<br>

## 🎯 기능 요구사항
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.

<br>

## 🔥 기능 구현 목록
- [x] 이름 입력받는 기능
  - [x] 이름이 5자 초과인 경우
  - [x] 끝에 쉼표가 있는 경우
  - [x] 이름이 중복되는 경우
  - [x] 쉼표가 연달아 나오는 경우
  - [x] 이름에 공백이 존재하는 경우
- [x] 횟수 입력받는 기능
  - [x] 양수가 아닌 경우
  - [x] 숫자가 아닌 값을 입력한 경우
- [x] 자동차를 생성하는 기능
- [x] 자동차 전진/정지 기능
- [ ] 경주 화면 출력하는 기능
- [ ] 횟수에 따라 경주를 진행하는 기능
- [ ] 우승자를 계산하는 기능
- [ ] 우승자를 출력하는 기능

<br>

## 우아한테크코스 코드리뷰
* [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)
