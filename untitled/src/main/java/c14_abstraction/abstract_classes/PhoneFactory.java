package c14_abstraction.abstract_classes;

public class PhoneFactory extends Factory {

    public PhoneFactory(String name) {
        super(name);
    }

    @Override //슈퍼 클래스의 추상 메서드
    public void produce(String model) {
        System.out.println("[ " + model + " ] 모델 스마트폰을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println("스마트폰 공장을 관리합니다.");
    }

}
