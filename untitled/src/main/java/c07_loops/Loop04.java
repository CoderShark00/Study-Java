package c07_loops;

import java.util.Scanner;

public class Loop04 {
    public static void main(String[] args) {
        /*
            while문

            형식:
            while(조건문) {
                실행문
            }
         */

//        int a = 0;
//        for (int i = 1; i < 6; i++) {
//            a += i;
//        }
//        System.out.println(a);
//
//        int sum=0;
//        int i=0;
//        while(i<6){
//            sum+=i;
//            i++;
//        }
//        System.out.println(sum);

        /*
            이상의 for문과 while문에서 확인할 수 있듯이
            for문의 경우 :
                한계값을 설정하기 때문에 정홛한 반복의 횟수를 알 수 있음
                    -> 반복 횟수를 고정시킬 수 있을 때 주로 사용
            while문의 경우 :
                외부에서 변수를 선언한 다음에 강제로 증가시키는 편이기 때문에
                    횟수를 고려한 반복문에는 덜 적절함.
                    대신, 특정 조건을 만족하는지 아닌지와 같이 횟수와 관계 없는 경우
                    while 반복문이 선호됨
         */

        Scanner in = new Scanner(System.in);
        boolean continued = true;
        while(continued) {
            System.out.println("계속하시겠습니까? >>> ");
            int answer = in.nextInt();
            if(answer == 1) {
                continued = false;
            }
        }
    }
}
