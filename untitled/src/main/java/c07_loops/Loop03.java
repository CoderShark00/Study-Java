package c07_loops;

import java.util.Scanner;

public class Loop03 {
    public static void main(String[] args) {
        /*
            중첩 for 문
         */
//         int a = 0;
//         int b = 0;
//
//        for (int i = 0; i < 10; i++) {
//            a = i;
//            System.out.println("a의 값 : " + a);
//            for (int j = 0; j < 10; j++) {
//                b = j;
//                System.out.println("b의 값 : " + b);
//            }
//            System.out.println("a의 값이 바뀌는 지점입니다.---");
//        }

//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("숫자를 입력하세요 >>> ");
//        int a = sc.nextInt();
//        for (int i=1; i<10; i++){
//            System.out.println(a + " x " + i + " = " + (a*i));
//        }
        /*
            구구단 출력 전체
         */
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println("-------------------");
        }
    }
}

