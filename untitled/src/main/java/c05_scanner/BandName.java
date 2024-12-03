package c05_scanner;

import java.util.Scanner;

public class BandName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String logo = """
                
                  /$$$$$$                                     /$$$$$$$                                            \s
                 /$$__  $$                                   | $$__  $$                                           \s
                | $$  \\__/  /$$$$$$  /$$$$$$  /$$   /$$      | $$  \\ $$  /$$$$$$  /$$$$$$/$$$$   /$$$$$$  /$$$$$$$\s
                | $$ /$$$$ /$$__  $$|____  $$| $$  | $$      | $$$$$$$/ |____  $$| $$_  $$_  $$ /$$__  $$| $$__  $$
                | $$|_  $$| $$  \\__/ /$$$$$$$| $$  | $$      | $$__  $$  /$$$$$$$| $$ \\ $$ \\ $$| $$$$$$$$| $$  \\ $$
                | $$  \\ $$| $$      /$$__  $$| $$  | $$      | $$  \\ $$ /$$__  $$| $$ | $$ | $$| $$_____/| $$  | $$
                |  $$$$$$/| $$     |  $$$$$$$|  $$$$$$$      | $$  | $$|  $$$$$$$| $$ | $$ | $$|  $$$$$$$| $$  | $$
                 \\______/ |__/      \\_______/ \\____  $$      |__/  |__/ \\_______/|__/ |__/ |__/ \\_______/|__/  |__/
                                              /$$  | $$                                                           \s
                                             |  $$$$$$/                                                           \s
                                              \\______/                                                            \s
                
                
               """;

//        // 변수 선언 - > 초기화 x
//        String name;
//        String age;
//        String school;
//        String mbti;
//
//        System.out.println("이름이 무엇입니까? >>> ");
//        name = scanner.nextLine();
//        System.out.println("몇 살입니까? >>> ");
//        age = scanner.nextLine();
//        System.out.println("학교가 어디입니까? >>> ");
//        school = scanner.nextLine();
//        System.out.println("mbti가 무엇입니까? >>> ");
//        mbti = scanner.nextLine();
//
//        System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "살입니다.\n" + school + "에 재학 중이며, mbti는 " + mbti+ "입니다.");
//

        // pantsColor, lastFood 변수를 선언 -> String
        // 입력 받기 위한 안내문을 작성하고, 변수에 데이터를 대입하세요.
        // 지금 입은 하의 색깔이 무엇인가요?
        // 마지막으로 먹은 음식이 무엇인가요?

        // pantsColor와 lastFood를 이용하여 밴드 네임을 출력하세요.
        // 당신의 밴드 이름은 그레이 시리얼입니다.

        String pantsColor;
        String lastFood;

        System.out.println(logo);
        System.out.println("지금 입은 하의 색깔이 무엇인가요? >>>");
        pantsColor = scanner.nextLine();
        System.out.println("마지막으로 먹은 음식이 무엇인가요? >>>");
        lastFood = scanner.nextLine();
        System.out.println("당신의 밴드 이름은 " + pantsColor + " " +  lastFood + "입니다.");

    }
}
