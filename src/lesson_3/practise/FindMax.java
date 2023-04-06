package lesson_3.practise;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;

        do {
            System.out.println("Enter the size of array: ");
            size = sc.nextInt();
            if(size > 20){
                System.out.println("Please enter again :");
            }
        }while (size > 20);

        array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element of array: "+i+" : ");
            array[i] = sc.nextInt();
        }
        System.out.print("Element of array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ",array[i]);
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("Max is: " +max);
    }
}
