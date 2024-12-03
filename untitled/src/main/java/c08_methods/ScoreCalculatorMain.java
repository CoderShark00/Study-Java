package c08_methods;

import java.util.Scanner;

public class ScoreCalculatorMain {

    public static void main(String[] args) {
        // Scanner Import
        Scanner sc = new Scanner(System.in);
        // ScoreCalculator import -> 클래스명 객체명 = new 클래스명(); -> constructor
        ScoreCalculator scoreCalculator = new ScoreCalculator();
        int totalSubjects = 0;
        double score1 = 0;
        double score2;
        double totalScore = 0;
        double avgScore = 0;
        boolean endOfCalc = false;

        //기존 오버라이딩을 이용한 단순연산자 사용 및 메서드 활용 예제
//        System.out.print("첫 번째 과목의 점수를 입력하세요 >>> ");
//        score1 = sc.nextDouble();
//        System.out.println("두 번재 과목의 점수를 입력하세요 >>>");
//        score2 = sc.nextDouble();
//        System.out.println("세 번째 과목의 점수를 입력하세요 >>>");
//        double score3 = sc.nextDouble();
//
//        // 기본 연산자를 활용한 방법
//        System.out.println("총 합은 " + (score1 + score2 + score3) + "점 입니다.");
//        System.out.println("평균 점수는 " + ((score1 + score2 + score3)/3) + "점 입니다.");
//
//        // ScoreCalculator에서 정의한 메서드를 활용한 방법
//        totalScore = scoreCalculator.calculateSum(score1, score2, score3);
//        avgScore = scoreCalculator.calculateAverage(totalScore, 3);
//        System.out.println("----------------------------------");
//        System.out.println("총 합은 " + totalScore + "점 입니다(메서드 활용).");
//        System.out.println("평균 점수는 " + avgScore + "점 입니다(메서드 활용).");


        // 2. 점수를 누적적으로 더할 수 있게끔 작성하는 방식의 프로그래밍
        while(!endOfCalc) {
            System.out.println("점수를 입력하세요(종료하려면 -1을 입력하세요) >>> ");
            score1 = sc.nextDouble();
            if(score1 == -1){
                break; // switch문에서 배운 break문으로 : 반복문 종료할 때 쓰임 강제 종료 즉시 종료 바로 종료됨 밑으로 더안감
             //   endOfCalc = true; // 반복문 종료
            }
            totalScore = scoreCalculator.calculateSum2(totalScore, score1);
            totalSubjects++;
//            System.out.println("총 점은 " + totalScore + "점입니다.\n현재 과목의 수는 " + (totalSubjects-1) + "개 입니다.");
//            System.out.println("평균은 " + (totalScore+1) / (totalSubjects));

        }

        // 분모가 0이면 예외가 발생하기 때문에, totalSubjects가 0 초과일 때만 실행되도록 조건문 설정 -> 예외처리의 고전적 방법
        if (totalSubjects>0){
            avgScore = scoreCalculator.calculateAverage(totalScore, totalSubjects);
            System.out.println("입력한 점수의 합계 : " + totalScore + "\n입력한 점수의 평균 : " + avgScore);
        }else {
            System.out.println("입력한 점수가 없습니다.");
        }
    }
}
