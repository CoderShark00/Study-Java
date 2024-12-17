package c18_static.builders;

import lombok.Builder;

public class Person {
    // 빌더 패턴에 대한 예시. 전체 구조를 중점적으로 확인하세요
    private String name;
    private int age;
    private String address;

    // private으로 생성자를 만듭니다. -> 즉,
    private Person(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    //Person 클래스의 내부 클래스로 Builder 클래스를 정의할겁니다.
    public static class Builder{
        private final String name;
        private int age;
        private String address;

        // Builder 클래스의 생성자 정의
        // name에 final을 적용했으므로 RequiredArgsConstructor 형태로 정의
        public Builder(String name){
            this.name = name;
        }


        // 나머지 not final인 선택적 필드 추가를 위한 메서드 추가
        // -> 통상적인 method 정의 방법과 달리 Person 클래스의 필드 이름으로 메서드 명
        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        // 최종 객체 생성 메서드
        public Person build() {
            return new Person(this); // 이 단계까지 왔을 때 Person의 객체가 생성된다.
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
//     빌더 패턴말고 기존의 방식대로 생성자를 정의하는 내용입니다.
//     이 이하의 코드가 불편해서 빌더 패턴이 나왔다고 보면 됨.

//     필드 선언
//    private String name;
//    private int age;
//    private String address;
//    private String phoneNumber;
//
//    // PersonMain.java에서 2-1 문제에 해당하는 부분
//    public Person(String name, int age, String address, String phoneNumber) {
//        this.name = name;
//        this.age = age;
//        this.address = address;
//        this.phoneNumber = phoneNumber;
//    }
//
//    // PersonMain.java에서 2-2 문제에 해당하는 부분
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public Person(String name, int age, String address) {
//        this.name = name;
//        this.age = age;
//        this.address = address;
//    }
//
//    public Person(String address, String name) {
//        this.address = address;
//        this.name = name;
//    }


}
