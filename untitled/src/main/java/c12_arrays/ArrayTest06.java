package c12_arrays;

import java.util.Arrays;

public class ArrayTest06 {
    public static void main(String[] args) {


        int[][] arr = new int[5][5];

        int number = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = number++;
            }
        }

        System.out.println(Arrays.deepToString(arr) + "\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}
