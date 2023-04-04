package Lesson3.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte[][] array;
        System.out.println("Enter the size 1 :");
        byte size1 = sc.nextByte();
        System.out.println("Enter the size 2 :");
        byte size2 = sc.nextByte();

        array = new byte[size1][size2];
        System.out.println("Enter the element of array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextByte();
            }
        }
        byte max = array[0][0];
        byte position1 = 0;
        byte position2 = 0;
        for (byte i = 0; i < size1; i++) {
            for (byte j = 0; j < size2; j++) {
                if(max < array[i][j]){
                    max = array[i][j];
                    position1 = i;
                    position2 = j;
                }
            }
        }
        System.out.println("Max element: " +max);
        System.out.printf("Posion of max element: ");
        System.out.printf("[%d][%d] " , position1 ,position2);
    }
}
