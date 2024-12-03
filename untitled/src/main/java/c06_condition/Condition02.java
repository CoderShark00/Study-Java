package c06_condition;

import java.util.Scanner;

public class Condition02 {
    public static void main(String[] args) {
        /*
            else if는 여러 조건이 나올 수 있음
         */

        Scanner sc = new Scanner(System.in);

//        System.out.println("점수를 입력하세요 : ");
//        int a = sc.nextInt();
//        if(a>=90){
//            System.out.println("당신의 등급은 A입니다.");
//        } else if (a>=80) {
//            System.out.println("당신의 등급은 B입니다.");
//        } else if (a>=70) {
//            System.out.println("당신의 등급은 C입니다");
//        } else if (a>=60) {
//            System.out.println("당신의 등급은 D입니다");
//        }else{
//            System.out.println("당신의 등급은 F입니다.");
//        }

        System.out.println("점수를 입력하세요 : ");
        int a = sc.nextInt();
        String grade;

        if(a>=90){
            grade = "A";
        } else if (a>=80) {
            grade = "B";
        } else if (a>=70) {
           grade = "C";
        } else if (a>=60) {
           grade = "D";
        } else{
            grade = "F";
        }
        System.out.println("당신의 등급은 " + grade + "입니다.");

        // 상수를 사용한 데이터를 제공했을 때 이에 맞춰서 조건문을 작성하시오.
//        final int VIP_POINT = 80;
//        final int GOLD_POINT = 60;
//        final int SILVER_POINT = 40;
//        final int BRONZE_POINT = 20;
//
//        int point;
//        System.out.print("회원 포인트 점수를 입력하세요 >>> ");
//        point = sc.nextInt();
//
//        // 변수 하나 짜리 작성
//
//        // 변수 두 개 짜리 작성하시오
//        String grade;
//
//        //실행 예
//        // 회원 포인트 점수를 입력하세요 >>> 17
//        // 당신의 등급은 일반 등급입니다.
//
//        if (point>=VIP_POINT){
//            grade = "VIP";
//        }else if (point>=GOLD_POINT) {
//            grade = "GOLD";
//        }else if (point>=SILVER_POINT) {
//            grade = "SILVER";
//        }else if (point>=BRONZE_POINT) {
//            grade = "BRONZE";
//        }else{
//            grade = "일반";
//        }
//        System.out.println("당신의 포인트는 " + point + "점이고, 등급은 " + grade + "등급입니다.");
    }
}
