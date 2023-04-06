package lesson_3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MainDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array = new int[3][3];
        System.out.println("Enter the element: ");
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array: "+Arrays.deepToString(array));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length; j++) {
                sum += array[i][j];
                break;
            }
        }
        System.out.println("Sum of Main Diagonal of array: "+ sum);

    }
}