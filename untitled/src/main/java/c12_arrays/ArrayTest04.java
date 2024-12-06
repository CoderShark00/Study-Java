package c12_arrays;

import java.util.Arrays;

/*

    여태까지 배운 자바 자체 클래스

    Scanner
    Random
    Arrays
    Integer
    Comparator

    Math.random()메서드
    0.0 ~ 1.0 미만의 난수 반환
 */
public class ArrayTest04 {
    public static void main(String[] args) {
//        double a= Math.random();
//        System.out.println(a);
//
//        int b = (int)(Math.random() * 10);
//        System.out.println(b);
//
//        int c = (int)(Math.random() * 10) + 1;
//        System.out.println(c);


        int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.println("Array: " + Arrays.toString(array));

        int totalSum = 0;
        for (int num : array) {
            totalSum += num;
        }
        System.out.println("Sum of all elements: " + totalSum);


        int evenSum = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenSum += num;
            }
        }
        System.out.println("Sum of even numbers: " + evenSum);
    }



    }

