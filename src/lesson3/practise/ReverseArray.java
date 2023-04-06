package lesson3.practise;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length;
        int[] array;
        do {
            System.out.println("Enter the length of array: ");
            length = sc.nextInt();
            if(length > 20){
                System.out.println("Can't accept this number!!");
            }
        }while (length > 20);
        array = new int[length];
        for (int i = 0 ; i < length; i++){
            System.out.println("Enter the element " + i + " : ");
            array[i] = sc.nextInt();
        }

        System.out.print("Element of array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        for (int i = 0 ; i < array.length/2 ; i++){
            int temp  = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        System.out.println("Element of array after reverse: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}
