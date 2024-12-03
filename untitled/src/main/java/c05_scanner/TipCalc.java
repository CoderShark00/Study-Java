package c05_scanner;

import java.util.Scanner;

public class TipCalc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
            음식점에서 팁을 계산하는 것을 원화 기준으로 한다면?

            10, 12, 15 퍼센트 중 하나를 선택

            인원수를 입력 받아서, 더치페이를 할 수 있도록 구현

            ex)
            100000원짜리 음식을 결제하고, 팁으로 10퍼센트를 준다면
            전체 음식값은 110000원이 된다.
            거기에 5명이서 나눈다면 22000원이 결과값이 됨.
         */
        // 1. 음식 가격을 입력받아야함 -> 물어보고 / 입력받는다 -> scanner
        // 2. 몇 % 퍼센트의 팁을 낼 건지 입력 받아야 함
        // 3. 입력 받은 %에서 / 100을 연산 해야함.
        // 4. 3의 결과값 * 1의 결과 값을 하게 되면 팁의 가격이 나옴
        // 5. 1의 결과값 + 4의 결과값을 하면 전체 음식 가격
        // 6. 인원수 입력
        // 7. 5의 결과값 / 6의 결과값 = 팁을 포함한 더치페이 가격이 산출

//        int foodPrice;
//        int percent;
//        int memberNum;
//        int totalPrice;
//        int pricePerPerson;
//
//        System.out.println("음식 값을 입력하세요 >>> ");
//        foodPrice = scanner.nextInt();
//        System.out.println("몇 퍼센트의 팁을 낼건가요 10, 12, 15% 중 하나를 선택하세요 >>> ");
//        percent = scanner.nextInt();
//        System.out.println("몇 분이세요 >>> ");
//        memberNum = scanner.nextInt();
//        totalPrice = foodPrice * (100+percent)/100;
//        pricePerPerson = totalPrice / memberNum;
//
//        System.out.println("한분당 내야할 가격은 " + pricePerPerson  + "입니다.");
//
        // 사용될 변수 선언
        int foodPrice;
        int percent;
        // 이거 추가함
        double percentModified;
        double totalPrice;
        int persons;
        double pricePerPerson;
        String logo = """
                
                 /$$$$$$$$ /$$$$$$ /$$$$$$$         /$$$$$$   /$$$$$$  /$$        /$$$$$$  /$$   /$$ /$$        /$$$$$$  /$$$$$$$$ /$$$$$$  /$$$$$$$\s
                |__  $$__/|_  $$_/| $$__  $$       /$$__  $$ /$$__  $$| $$       /$$__  $$| $$  | $$| $$       /$$__  $$|__  $$__//$$__  $$| $$__  $$
                   | $$     | $$  | $$  \\ $$      | $$  \\__/| $$  \\ $$| $$      | $$  \\__/| $$  | $$| $$      | $$  \\ $$   | $$  | $$  \\ $$| $$  \\ $$
                   | $$     | $$  | $$$$$$$/      | $$      | $$$$$$$$| $$      | $$      | $$  | $$| $$      | $$$$$$$$   | $$  | $$  | $$| $$$$$$$/
                   | $$     | $$  | $$____/       | $$      | $$__  $$| $$      | $$      | $$  | $$| $$      | $$__  $$   | $$  | $$  | $$| $$__  $$
                   | $$     | $$  | $$            | $$    $$| $$  | $$| $$      | $$    $$| $$  | $$| $$      | $$  | $$   | $$  | $$  | $$| $$  \\ $$
                   | $$    /$$$$$$| $$            |  $$$$$$/| $$  | $$| $$$$$$$$|  $$$$$$/|  $$$$$$/| $$$$$$$$| $$  | $$   | $$  |  $$$$$$/| $$  | $$
                   |__/   |______/|__/             \\______/ |__/  |__/|________/ \\______/  \\______/ |________/|__/  |__/   |__/   \\______/ |__/  |__/
                                                                                                                                                    \s
                                                                                                                                                    \s
                                                                                                                                                    \s
                
                """;
        System.out.println(logo);
        System.out.println("음식 값을 입력하세요 >>> ");
        foodPrice = scanner.nextInt();
        System.out.println("몇 퍼센트의 팁을 낼건가요 10, 12, 15% 중 하나를 선택하세요 >>> ");
        percent = scanner.nextInt();
        // double로 percent를 형 변환

        percentModified = (double)percent / 100;

//        System.out.println("percentModified = " + percentModified);

        System.out.println("몇 분이세요 >>> ");
        persons = scanner.nextInt();
        totalPrice = foodPrice + (foodPrice * percentModified);
        pricePerPerson = totalPrice / persons;
        int pricePerPersonInt = (int) pricePerPerson;
        System.out.println("한분당 내야할 가격은 " + pricePerPersonInt + "입니다.");
    }
}
