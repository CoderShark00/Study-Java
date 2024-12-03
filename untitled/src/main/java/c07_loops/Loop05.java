package c07_loops;

import java.util.Scanner;

public class Loop05 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 >>> ");
        int rows = in.nextInt();


        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
