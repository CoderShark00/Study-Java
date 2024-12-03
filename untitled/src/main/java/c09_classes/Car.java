package c09_classes;
/*
    ClassA에 적은 내용을 바탕으로 Car 클래스를 정의함.
 */
public class Car {
    // 속성(멤버 변수)
    String color;
    int speed;

    // 행동(메서드)
    void drive(){
        System.out.println("자동차가 주행 중입니다.");
    }

    void stop(){
        System.out.println("자동차가 멈췄습니다.");
    }
}
