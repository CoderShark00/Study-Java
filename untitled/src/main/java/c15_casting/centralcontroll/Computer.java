package c15_casting.centralcontroll;

public class Computer implements Power {

    @Override
    public void off() {
        System.out.println("Computer의 전원을 끕니다.");
    }

    @Override
    public void on() {
        System.out.println("Computer의 전원을 켭니다.");
    }
}
