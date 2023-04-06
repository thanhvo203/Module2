package lesson3.exercise;

import java.util.Scanner;

public class FindMinElement {
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
        byte min = array[0][0];
        for (byte i = 0; i < size1; i++) {
            for (byte j = 0; j < size2; j++) {
                if(min > array[i][j]){
                    min = array[i][j];
                }
            }
        }
        System.out.println("Min element: " +min);
    }
}
