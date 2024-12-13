package c17_bean;



public class Person {
    private final String name; // 필드에 final이 붙으면 생성자 필수
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }
}
