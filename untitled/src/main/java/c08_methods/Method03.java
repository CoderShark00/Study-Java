package c08_methods;

import java.util.Scanner;

/*
    Method02 파일을 확인하면 ㅂㄹ찍기 관련한 method 수업 내용이 있다.
    getStar() 메서드를 확인하면 내부에 if - else if - else 형태의 구문으로 매개변수를 1~4 까지를 받아서 왼쪽으로 증가하는 별,
    오른쪽으로 증가하는 별 등을 만들게끔 되있다
    하지만 if문을 이용한 방식이 가독성이 너무 떨어지기 때문에 switch문으로 교체해 동일한 기능을 하게끔 Refactoring
 */
public class Method03 {
    public static String getStar(int menuSelect, int totalLine){
    String result = "";

    switch(menuSelect) {
        case 1: // 왼쪽으로 치우친 증가하는 별
            for (int i = 1; i <= totalLine; i++) {
                for (int j = 1; j <= i; j++) {
                    result += "*";
                }
                result += "\n";
            }
            break;

        case 2: // 오른쪽으로 치우친 증가하는 별
            for (int i = 0; i < totalLine; i++) {
                // 공백 삽입
                for (int j = 0; j < totalLine - i - 1; j++) {
                    result += " ";
                }
                // 별 삽입
                for (int k = 0; k < i + 1; k++) {
                    result += "*";
                }
                result += "\n";
            }
            break;

        case 3: // 왼쪽으로 치우친 감소하는 별
            for (int i = 0; i < totalLine; i++) {
                for (int j = 0; j < totalLine - i - 1; j++) {
                    result += "*";
                }
                result += "\n";
            }
            break;

        case 4: // 오른쪽으로 치우친 감소하는 별
            for (int i = 0; i < totalLine; i++) {
                for (int j = 0; j < i; j++) {
                    result += " ";
                }
                for (int k = 0; k < totalLine - i; k++) {
                    result += "*";
                }
                result += "\n";
            }
            break;

        default:
            System.out.println("잘못된 메뉴 선택");
            break;
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


        while (choice < 1 || choice > 4) {
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
