package lesson3.exercise;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you wanna delete: ");
        int deleteNumber = sc.nextInt();

        int[] array = {1,2,3,4,5,6,7};
        System.out.print("Array before delete: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            if(deleteNumber == array[i]){
                array[i] = array[i+1];
                for (int j = i+1; j < array.length-1; j++) {
                    array[j] = array[j+1];
                }
            }
        }
        array[array.length-1] = 0;
        System.out.print("Array after delete: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}
