package c12_arrays;

import java.util.Arrays;
import java.util.Comparator;


/*

    배열의 출력

    이전 수업에서 sout(arr)을 이용해 출력하면 주소값만 나온다는 사실 확인
    그리고 반복문을 통해서 각 인덱스(주소값)에 저장된 요소(element)들을 불러올 수 있지만,
    배열 전체를 출력하는 방법은 이제 나옴

    Arrays 클래스 이용, 정적 메서드 toString(배열명)을 사용하면 배열 전체 출력 가능
    클래스명.메서드명()이었다. -> scanner.nextInt()와 다른 방식이다
    toString()이라는 메서드 역시 객체명.toString()에서 사용한 적이 있다

    여기서 기억할 점은
    동일한 method 명이라 할지라도 어떤 클래스에 종속돼있냐에 따라서 다른 결과값을 가지고 온다
 */
public class ArrayTest03 {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//
//        System.out.println(Arrays.toString(arr));
//
//        String[] arr2 = {"a","b","c","d","e","f"};
//        System.out.println(Arrays.toString(arr2));


        Integer[] arr3 = {4, 7, 10, 5, 2, 8, 3, 1, 6, 9};
        System.out.println("정렬 전 : " + Arrays.toString(arr3));

        // 오름 차순 배열
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

        // 내림 차순 배열
        Arrays.sort(arr3, Comparator.reverseOrder());
        // Comparator.reverseOrder() 메서드를 적용하기 위해서는 <T>가 요구되고, T는 클래스여야만 한다. 제네릭
        System.out.println(Arrays.toString(arr3));
    }
}
