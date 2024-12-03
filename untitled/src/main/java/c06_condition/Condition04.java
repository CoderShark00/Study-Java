package c06_condition;

import java.util.Scanner;

public class Condition04 {
    public static void main(String[] args) {
        /*
            switch문
            형식 :
            switch(변수) {
            case 조건1:
                실행문
                   break;
             case 조건2:
                실행문
                break;
                default:
                실행문
                }

         */

        Scanner sc = new Scanner(System.in);

        String selected;
        System.out.println("[   선택 프로그램   ]");
        System.out.println("a. 메뉴1");
        System.out.println("b. 메뉴2");
        System.out.println("c. 메뉴3");
        System.out.println("d. 메뉴4");
        System.out.println("e. 메뉴5");

        System.out.println("메뉴를 선택하세요 >>> ");
        selected = sc.nextLine();

        switch (selected) {
            case "a":
                System.out.println("메뉴1 선택");
                break;
            case "b":
                System.out.println("메뉴2 선택");
                break;
            case "c":
                System.out.println("메뉴3 선택");
                break;
            case "d":
                System.out.println("메뉴4 선택");
                break;
            case "e":
                System.out.println("메뉴5 선택");
                break;
            default:
                System.out.println("잘못 선택하심");
        }

    }
}
