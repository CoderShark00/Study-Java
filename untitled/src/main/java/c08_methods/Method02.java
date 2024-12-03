package c08_methods;

import java.util.Scanner;

public class Method02 {
/*
    main 메서드에서 메뉴로 정의한 1~4까지의 별찍기 메서드 구현
 */
    public static String getStar(int menuSelect, int totalLine){
        String result = "";

        if (menuSelect == 1) {
            for (int i = 1; i<=totalLine; i++){
                for (int j = 1; j <= i; j++) {
                    result += "*";
                }
                result += "\n";
            }
        }else if (menuSelect == 2){
            // 오른쪽으로 치우친 증가하는 별
            for (int i = 0; i < totalLine; i++) {
                // 공백 삽입하는 실행문1
                for (int j=0; j<totalLine-i-1 ; j++){
                    result += " ";
                }
                // 별 삽입하는 실행문2-2
                for (int k = 0; k < i+1; k++) {
                    result += "*";
                }
                result += "\n";
            }
        }else if (menuSelect == 3){
            // 왼쪽으로 치우친 감소하는 별
            for (int i = 0; i < totalLine; i++) {
                for (int j=0; j<totalLine-i-1 ; j++){
                    result += "*";
                }
                result += "\n";
            }
        } else if (menuSelect == 4){
            for (int i = 0; i < totalLine; i++) {
                for (int j=0; j< i ; j++){
                    result += " ";
                }
                for (int k = 0; k < totalLine - i ; k++) {
                    result += "*";
                }
                result += "\n";
            }
        }else {
            System.out.println("Invalid menu selection");
        }

        return result;
    }


    public static void main(String[] args) {
        // 별찍기를 메서드 형태로 구현해볼 예정
        // 사용할 클래스 import
        Scanner sc = new Scanner(System.in);
        // 사용할 변수 선언
        int rowOfStars;
        int choice = 0;
        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");

        System.out.println("메뉴 선택 : ");
        choice = sc.nextInt();
//        if (choice < 1 || choice > 4) {
//            System.out.println("다시 선택하셈.");
//            choice = sc.nextInt();
//        }

        while(choice <1 || choice > 4){
            System.out.println("다시 선택하셈.");
            choice = sc.nextInt();
        }
        System.out.println("별의 줄 수 입력 : ");
        rowOfStars = sc.nextInt();
        System.out.println(" [ 호출하신 결과입니다 ]");
        String stars = getStar(choice, rowOfStars);
        System.out.println(stars);
    }
}
