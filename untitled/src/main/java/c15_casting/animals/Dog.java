package c15_casting.animals;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        super.makeSound(); // 상위 클래스의 makeSound() 메서드를 호출하는 키워드 super
        System.out.println("강아지가 짖습니다.");
    }

    // Dog만의 method
    public void fetch(){
        System.out.println("강아지 공을 물어옵니다.");
    }
}
