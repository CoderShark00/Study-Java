package c02_variable;

public class Main {
    public static void main(String[] args) {
//        // 논리 자료형 변수
//        boolean checkFlag = false; //or true
//
//        //자료형 변수명 = 데이터;  -> 변수 선언 및 초기화 방식
//        System.out.println(checkFlag);
//        //Java에서의 변수 표기법 -> 카멜 표기법 (Camel Case) : 첫문자는 소문자로 두번쨰는 대문자로 시작
//        // ex) findMember
//        checkFlag = true; // 변수에 데이터 재대입
//        System.out.println(checkFlag);
//        checkFlag2 = true; // 오류 발생
//        boolean checkFlag3; // 변수 선언 -> 자료형 변수명;
//        checkFlag3=true; // 변수에 값을 최초로 대입하는 것을 -> 초기화
//        // 최초로 변수를 선언할 때 자료형(data type)을 명시하고 값을 대입하여 초기화함
//        // 추후 해당 변수에 값을 재대입하는 경우에 변수명 = (바뀐)값; 형태로 작성함.
//
//        // 문자 자료형 변수
//        char name1 = '안'; // 문자를 입력할 때는 작은 따옴표(')로 감싼다.
//        char name2 = '근'; // 문자(character) : 알파벳 / 한글 / 숫자 하나
//        char name3 = '수'; //
//
//        System.out.println(name1);
//        System.out.println(name2);
//        System.out.println(name3);
//
//        System.out.println(name1 + name2 + name3); // 복수의 문자들이 표기된 주소가 출력됨
//
//        System.out.println("" + name1 + name2 + name3); // java의 sout의 경우 맨 앞의 자료형을 따라감
        //즉, 큰 따옴표로 시작했을 경우 () 내에 있는 전체 자료형을 문자열로 보기 때문에 "안근수" 전체가 출력됨.

        /*
            name 1, 2, 3에 여러분의 이름을 한 글자씩 대입하고, sout을 통해서 콘솔창에 띄우기
         */

//        name1 = '이';
//        name2 = '승';
//        name3 = '혁';
//        System.out.println("" + name1 + name2 + name3);

        // 정수 자료형 변수
//        int width1 = 100;
//        int width2 = 200;
//        System.out.println(width1);
//        System.out.println(width2);
//        System.out.println(width1 + width2); // 숫자끼리는 연산이 가능
//
//        String width3 = "300";
//        String width4 = "400";
//        System.out.println(width3 + width4); // 문자끼리는 연산이 안되고, 나열만 가능
//        System.out.println(width1 + width3);
//        System.out.println(width4 + width2);
//
//
//        //java17 버전 이후 : 여러줄에 걸친 데이터를 하나의 변수에 대입 가능 큰따옴표 세개를 사용한다.
//        String introduction = """
//                안근수
//                영어교육과
//                코리아it아카데미 웹 강사
//                ESTJ
//                """;
//        System.out.println(introduction);
//
//        /*
//            String introduction2를 선언하고, 거기에 수강생분들의
//            이름
//            전공
//         */
//        String introduction2 = """
//                이승혁
//                전자공학과
//                학생
//                ISTP
//                """;
//        System.out.println(introduction2);

//        int longNumber = 1214124215352345;
//        System.out.println(longNumber);
        long time = System.currentTimeMillis();
        System.out.println(time);

        /*
        int (4바이트 , 32 비트)
            최소값 : -2,147,483,648 (-2^31)
            최대값 : 2,147,483,647 (2^31 -1)
       long (8바이트, 64비트)
            최소값 : 존나큼
         */

        // 실수 자료형 변수
        double pi = 3.14159;
        System.out.println(pi);

        double dotZero = 3;
        System.out.println(dotZero);


        // 상수
        final String FILE_PATH = "c:/seunghyuk_java";
        // 상수의 경우에는 변수명을 대문자로 작성함
        final String EXAMPLE_OF_FINAL;
        EXAMPLE_OF_FINAL = "이것이 예시입니다.";
        System.out.println(EXAMPLE_OF_FINAL);
        /*
        상수의 특징:
        1) 개발자들끼리의 약속으로 상수는 전체 다 대문자로 작성하고, 단어사이의 경계를 '_'로 표시함.
        2) 한번의 선언 및 초기화가 가능
        3) 2)를 이유로, 재대입이 불가능
         */

    }
}
