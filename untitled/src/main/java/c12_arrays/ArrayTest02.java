package c12_arrays;

import java.util.Scanner;

/*

    String[] names 배열 선언
    출석부의 이름을 입력하도록 하여, names 배열에 집어넣는 프로그램을 작성
 */
public class ArrayTest02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        count = sc.nextInt();
        sc.nextLine();

        String[] names = new String[count];

        for(int i = 0; i < count; i++){
            System.out.print((i+1) + " 번 학생 이름 : ");
            names[i] = sc.nextLine();
        }

        for(int i = 0; i<names.length; i++){
            System.out.println(names[i]);
        }
    }
}
