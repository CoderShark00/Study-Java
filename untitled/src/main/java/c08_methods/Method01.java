package c08_methods;

import java.util.Scanner;

public class Method01 {
/*
Method란? = Java에서는 함수 개념과 동일함.

Method : 일련의 동작을 묶어서 정의한 것. 입력값과 출력값이 존재(optional)

함수와 메서드가 동일한 개념이라면 왜 용어를 분리하는가?
    -> 클래스 내부에 함수를 정의하게 되면 이를 메서드라고 칭함.
    -> 자바의 경우는 모든 함수들이 특정 클래스에 종속돼있기 때문에 전부 다
        메서드에 해당함.

호출 형식
클래스명.메서드명()
객체명.메서드명() -> scanner.nextLine()

메서드 정의 : 특정한 메서드를 클래스 내에 만드는 것
메서드 호출(call) : main method가 있는 곳에서 클래스명.메서드명() 혹은,
    객체명.메서드명()을 통해서 메서드를 호출할 수 있음. -> 호출 = 실행

자바에서의 메서드

1. method : 특정 작업을 수행하는 코드 블럭을 정의하는 방법

예를 들어, '사진을 찍는다'라는 행위에 대해서 생각해보면
1) 주머니에서 폰을 꺼내고,
2) 잠금화면을 풀고
3) 카메라를 켜고,
4) 사진을 찍고자하는 대상에 폰을 조준하고,
5) 셔터를 누른다.

컴퓨터는 시키는대로만 하기 때문에 사진을 찍기 위해서는 이상의 1)-5)까지의 명렁어를
입력해줘야만 한다. 하지만, '사진을 찍는다'라는 메서드 내에 1)-5) 명령어들을
미리 입력(메서드 정의) 해놓고 나서, '사진을 찍는다'라는 명령어를 실행(메서드 호출) 시키면
자동으로 1)-5)까지의 명령을 순서대로 수행함
-> 즉 메서드란 순차적으로 이루어지는 명령어들을 모아둔 것

2. 메서드 관련 용어 정리
    1) 메서드 정의 : 사용자가 메서드를 새로 만드는 것을 의미
    2) 인수(argument) : 사용자 메서드에 전달할 입력(input)을 의미
    3) 매개변수(parameter) : 인수를 받아서 저장하는 변수를 의미
    4) 반환값/출력값/리턴값(return) : 사용자 메서드의 출력(output)을 의미
    5) 메서드 호출(call) : 만들어진 사용자 메서드를 실제로 사용하는 것을 의미
*/
    // 1번 유형 -> [ x | x ] [ 입력값(parameter) / 출력값(return) ]
    public static void call1(){
        System.out.println("[ x | x ]");
    }

    // 2번 유형 -> [ o | x ]
    public static void call2(String dailyRoutine){
        System.out.println("[ o | x ]");
        System.out.println("오늘의 일정 : " + dailyRoutine);
    }

    // 3번 유형 -> [ x | o ] : void가 아니라 출력값(return)의 자료형을 명시해줌.
    public static String call3(){
        System.out.println("[ x | o ]");
        String result = "";

        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                result += "*";
            }
            result += "\n";
        }

        return result;
    }

    // 4번 유형 -> [ o | o ]
    public static String call4(int year, int month, int date){
        /**
         * DocString : 클래스나 메서드에 대한 설명을 하기 위한 주석 처리 방법
         */
        System.out.println("[ o | o ]");
        String fullDate = year + "년 " + month + "월 " + date + "일";

        return fullDate;
    }

    public static void main(String[] args) {
        // 1번 유형 호출 -> 아까전에 scanner.nextLine()의 경우에는 객체명.메서드며야()이라고 했는데
        // 왜 여기서는 call1()만으로 호출이 가능한가?
//        call1();
//
//        call2("Java method 강의 수강");
//       Scanner sc = new Scanner(System.in);
//        String routine;
//        System.out.println("오늘의 수업 후 일정은 무엇입니까? >>> ");
//        routine = sc.nextLine();
//        call2(routine);

//        call3();

//        System.out.println(call3());

//       System.out.println(call4(2024, 11, 29));

        String todayDate = call4(2024, 11, 29);
        System.out.println(todayDate); //별도의 변수를 선언하여 메서드의 return값을 저장후, 변수를 통해 sout 실행

        Scanner sc = new Scanner(System.in);

        System.out.println("당신이 태어난 년도는 언제입니까? 숫자만 쓰세요. >>> ");
        int year = sc.nextInt();
        System.out.println("당신이 태어난 월은 언제입니까? ");
        int month = sc.nextInt();
        System.out.println("당신이 태어난 일은 언제입니까?");
        int date = sc.nextInt();

        String myBirthday = call4(year, month, date);
        System.out.println(myBirthday);
    }
}
