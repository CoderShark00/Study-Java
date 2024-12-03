package c07_loops;

import java.util.Scanner;

public class Loop02 {
    public static void main(String[] args) {
        /*
            기본 예제
            n에 숫자를 입력 받아 몇 번 반복할지 정하고, 1부터 n까지 더하는 반복문을 작성하시오

            실행 예
            몇 번 반복할지 입력하세요 >>> 100
            합은 5050입니다.
         */
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        System.out.println("몇 번 반복할지 입력하세요 >>> ");
        int n = scanner.nextInt();
        for (int i = 0; i < n+1; i++) { // or i<=n
             result += i;
        }
        System.out.println("합은 " + result + "입니다.");
    }
}
