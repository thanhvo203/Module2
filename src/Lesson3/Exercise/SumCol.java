package lesson3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumCol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array = new int[2][2];
        System.out.println("Enter the element: ");
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array : " + Arrays.deepToString(array));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][2];
        }
        System.out.printf("Sum of col is : %d ", sum);
    }
}

