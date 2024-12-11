package c15_casting.centralcontroll;

public class Tv implements Power {

    @Override
    public void on() {
        // 재정의
        System.out.println("Tv의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("Tv의 전원을 끕니다.");
    }
}
