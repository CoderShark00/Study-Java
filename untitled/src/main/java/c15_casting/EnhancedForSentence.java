package c15_casting;
/*
    향상된 for문(Enhanced for Sentence)

        향상된 for문의 형식 :
            자료형 변수명 : 반복가능객체(주로 배열)
        for(int num : scores){
            실행문
        }

        for 문을 실행할 때 반복 대상이 있으면 자료형은 반복 대상이 아닌 지닌 자료형(즉 요소) 과
        같은 자료형으로 지정해야 함.
        즉, 배열을 선언할 때 지정한 자료형과 꺼낼 자료형이 일치해야 함을 의미함.
        반복 대상 요소를 하나씩 변수에 대입하면서 진행하고, 반복 대상의 길이만큼 꺼내어 반복함.
 */
public class EnhancedForSentence {
    public static void main(String[] args) {
        int[] scores = {100, 90, 95};
        int sum1 =0;
        int sum2 = 0;
//        for (int score : scores) {
//            System.out.println("score = " + score);
//        }

        // 기존 for 문을 이용해 합을 구한후 sum1에 대입해서 출력하세요
        // 향상된 for문을 이욯해 합을 구한후 sum2에 대입해서 출력

        for (int i = 0; i < scores.length; i++) {
            sum1 += scores[i];
            System.out.println("sum1 = " + sum1);
        }

        for (int score : scores) {
            sum2 += score;
        }
        System.out.println("sum2 = " + sum2);
    }
}
