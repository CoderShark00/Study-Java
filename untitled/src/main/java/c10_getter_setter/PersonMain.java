package c10_getter_setter;

public class PersonMain {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person("이승혁");
        Person person3 = new Person(-100);
        Person person4 = new Person("사실 나는 사람이 아니다", 1000);

        // 접근 지정자 private 떄문

        person3.setAge(150);
        person4.setName("김삼");
        person4.setAge(30);

        System.out.println(person3.getAge());
        System.out.println(person4.getName());
        System.out.println(person4.getAge());

    }
}
