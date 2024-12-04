package c10_getter_setter;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    // 기본 생성자, 매개변수 생성자들 전부 만들기
    // PersonMain 해당 객체 만들기
    // Person person1 = new Person();
    // Person person2 = new Person("이름")
    // Person person3 = new Person(-100);
    // Person person4 = new Person("사실 나는 사람이 아니다", 1000);


    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Setter 및 Getter 정의
    // set변수명 / get변수명으로 사용하는 편

    // 1. 외부에서 필드에 직접 접근을 하지 못ㄱ하도록 접근지정자를 설정함

    // 2. Setter 구조
    //      메서드에 매개변수가 필수적으로 요구됨 ->> 값을 변경하거나 대입할 argument가 필요하기 때문
    //      그리고 return 값이 없음 -> void

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        Scanner sc = new Scanner(System.in);
        while (age <=0 || age >= 150 ){
            System.out.println("나이는 0 이상 150 미만이어야만 합니다. 다시 입력하세요>>> ");
            age = sc.nextInt();
        }
        this.age = age;
        //조건문을 적용해서 0 이상의 값만 입력이 가능하게끔 코드를 작성
//        if(age >=0 && age <150) {
//            this.age = age;
//        } else{
//            throw new IllegalArgumentException("Age must be between 0 and 150");
//        }

    }



    // 3. Getter의 구조
    //      데이터를 조회만 하면 되기 때문에 매개변수가 요구되지 않음. 즉 () 형태로 마무리됨.
    //      대신 필드와 동일한 자료형의 return 값이 요구됨 -> void가 아니다.

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
