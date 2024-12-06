package c12_arrays;

import java.util.Arrays;

/*
    다차원 배열(Multi Dimensional Array) 중에 2차원 배열

    다차원 배열은 2차원 이상의 배열을 의미하지만, 개발 환경 상 2차원 배열 이상을 사용하는 경우는 극히
    드물기 때문에 2차원 배열을 기준으로 강의합니다.

    형식 :

    int[][] arr = new int[크기][크기]
    int[][] arr2 = new int[크기][]
    int[][] arr3 = new int{ {1,2}, {3,4}, {5,6}]

    2차원 배열 선언 시, 열의 크기는 지정하지 않아도 되지만, 행의 크기는 항상 지정해야 합니다.
    -> 2번 방식 참조
 */
public class ArrayTest05 {
    public static void main(String[] args) {
//
//        int[][] arr3 = { {1, 2}, {3, 4} , {5, 6} };
//
//        System.out.println(arr3);
//        System.out.println(arr3[0]);
//        System.out.println(arr3[0][0]);
//
//        System.out.println(Arrays.toString(arr3)); // 1차배열만 적용 가능
//
//
//        // 배열의 각 요소를 출력하는 반복문을 작성하시오.
//
//        for (int i = 0; i < arr3.length; i++) {
//            for (int j = 0; j < arr3[i].length; j++) {
//                System.out.print(arr3[i][j] + " ");
//            }
//
////            System.out.println();
//        }

        // 2차 배열을 기준으로 할 때 첫번째 반복문을 작성할 경우 2차 배열의 요소인 1차 배열들이 나옴
        // -> 1차 배열이기 때문에 Arrays.toString()으로 배열 전체 출력이 가능하다는 의미
//        for(int i = 0; i<arr3.length; i++) {
            //for (int j = 0; j < arr3[i].length; j++) {
                // 이상의 코드에서 arr3[i]가 1차 배열임을 확인 가능 -> 배열에 .length 필드가 있으니까
                // 그러면 1차 배열 전체를 주소값이 아니라 데이터를 출력하는 static 메서드인 Arrays.toString() 사용 가능
//            System.out.println(Arrays.toString(arr3[i]));
            //}
//        }
//
//
//        System.out.println(Arrays.deepToString(arr3));

        // 2차원 배열을 prettyWriting으로 작성
        int[][] arr = {
                { 1,2,3 },
                { 4,5,6 },
                { 7,8,9 }
        };

        int[][] arr3 = {                // 해당 배열의 크기는 int[3][2]
                { 1, 2 },
                { 3, 4 },
                { 5, 6 }
        };
     }
}
