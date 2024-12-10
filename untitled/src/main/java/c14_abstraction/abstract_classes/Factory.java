package c14_abstraction.abstract_classes;

public abstract class Factory {

    private String name;

    public Factory(String name) {
        this.name = name;
    }


    // 추상 메서드
    public abstract void produce(String model); // 추상 메서드 -> 구현부가 존재하지 않음. {} 얘가 없다는 뜻
    public abstract void manage();

    // 추상 클래스라도 일반 메서드 존재 가능
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo(){
        System.out.println("공장의 정보를 출력합니다.");
        System.out.println("공장 이름 : " + name);
    }
}
