package c08_methods;

import java.util.Scanner;

public class ScoreCalc02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScoreCalculator scoreCalculator = new ScoreCalculator();

        int totalSubjects = 1;
        double score1 = 0;
        double score2;
        double totalScore= 0;
        double avgScore = 0;

        boolean endOfCalc = false;

        while(!endOfCalc) {
            System.out.println("점수를 입력하세요(종료하려면 -1을 입력하세요) >>> ");
            score1 = sc.nextDouble();
            if(score1 == -1){
                totalScore += 1;
                totalSubjects -=1;
               // break; // switch문에서 배운 break문으로 : 반복문 종료할 때 쓰임 강제 종료 즉시 종료 바로 종료됨 밑으로 더안감
                endOfCalc = true; // 반복문 종료
            }
            totalScore = scoreCalculator.calculateSum2(totalScore, score1);

            avgScore = scoreCalculator.calculateAverage(totalScore, totalSubjects);
            System.out.println("---입력시 마다 나오는 합계와 평균입니다 ---");
            System.out.println("입력한 점수를 합계 : " + totalScore);
            System.out.println("입력한 점수의 평균 : " + avgScore);

            totalSubjects++;
        }
    }
}
