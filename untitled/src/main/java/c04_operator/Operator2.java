package c04_operator;

import jdk.jshell.VarSnippet;

public class Operator2 {
    public static void main(String[] args) {
        /*
            -----------논리 연산자------------
            true(1), false(0) : 컴퓨터가 읽을 수 있는 두 숫자
            boolean : true / false를 구분하는 자료형

            AND(&&) -> 곱 T x T = T, T x F = F, F x F = F
            OR(||) -> 합 T + T = T, T + F = T, F + F = F
            NOT(!) -> 값을 반대로 바꿔준다, 혹은 틀릴 경우를 나타냄 -> 추후 수업 예정
         */

        boolean flag1 = true;
        boolean flag2 = false;

//        boolean result1 = flag1 && flag1; // AND 연산자 활용 : 곱연산
//        System.out.println("T x T = " + result1);
//
//        boolean result2 = flag1 && flag2;
//        System.out.println("T x F = " + result2);
//
//        boolean result3 = flag2 && flag2;
//        System.out.println("F x F = " + result3);
//
//        System.out.println("-------------------------------");
//
//        boolean result4 = flag1 || flag1;
//        System.out.println("T + T = " + result4);
//
//        boolean result5 = flag1 || flag2;
//        System.out.println("T + F = " + result5);
//
//        boolean result6 = flag2 || flag2;
//        System.out.println("F + F = " + result6);

        System.out.print("안녕하세요.\t제 이름은");
        System.out.print("\n안근수입니다.");

        boolean result7 = flag1 || flag2 && flag1;
        System.out.println("T + F x T = " + result7);

        boolean result8 = 10%3!=0;
        System.out.println("10 % 3 != 0 => " + result8);

        boolean result9 = 10%3==0;
        System.out.println("10 % 3 == 0 => " + result9);
    }
}
