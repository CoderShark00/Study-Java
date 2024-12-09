package c13_inheritance;

public class Tiger extends Animal{
    // 생성자
    public Tiger() {
    }

    public Tiger(int animalAge) {
        super(animalAge);
    }

    public Tiger(String animalName) {
        super(animalName);
    }

    public Tiger(String animalName, int animalAge) {
        super(animalName, animalAge);
    }

    @Override
    public void move() {
        super.move();   // super()의 경우는 생성자 super.메서드명은 부모클래스 메서드 호출

        //재정의 영역
        System.out.println("네 발로 걷습니다.");
    }
}
