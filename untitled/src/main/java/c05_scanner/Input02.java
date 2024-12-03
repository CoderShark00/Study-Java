package c05_scanner;

import java.util.Scanner;

public class Input02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("x 입력 :");
//        int x = scanner.nextInt();
//        System.out.println("y 입력 :");
//        int y = scanner.nextInt();
//        System.out.println("x + y = " + (x + y)); // 올바른 연산
//        System.out.println("x + y = " + x + y); // x, y가 String 취급받아 틀린 연산 출력

        /*
            평균 계산기를 작성하시오

            지시 사항
            1. 사용자로부터 세 개의 실수를 입력 받아, 이 숫자들의 평균 및 합을 계산하고 출력하시오.
            2. 사용자에게 첫 번째 실수를 입력
            3. 사용자에게 두 번째 실수를 입력
            4. 사용자에게 세 번째 실수를 입력
            5. 총합과 평균을 계산하고 출력하세요.


         */
        double a;
        double b;
        double c;
        double average;
        double sum;

        System.out.print("첫 번째 실수를 입력하세요 >>> ");
        a = scanner.nextDouble();
        System.out.print("두 번째 실수를 입력하세요 >>> ");
        b = scanner.nextDouble();
        System.out.print("세 번째 실수를 입력하세요 >>> ");
        c = scanner.nextDouble();
        average = (a + b + c) / 3.0;
        sum = a + b + c;
        System.out.println();
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + average);

    }
}
