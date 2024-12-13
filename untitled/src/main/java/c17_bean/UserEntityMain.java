package c17_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntityLombok user1 = new UserEntityLombok();
        UserEntityLombok user2 = new UserEntityLombok();

        /*
            username에 abcdef
            password 1234
            email에 a@test.com
            name 이름
         */
        user1.setUsername("abcdef");
        user1.setPassword("1234");
        user1.setEmail("a@test.com");
        user1.setName("이승혁");
        System.out.println(user1);
    }
}
