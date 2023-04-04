package Lesson3.Exercise;

import java.util.Scanner;

public class InsertArray {
    public static void insert(int arr[], int vt, int pt){
        int n = arr.length;
        n++;
        for (int i = n-2; i > vt; i--) {
            arr[i] = arr[i-1];
        }
        arr[vt] = pt;
        System.out.print("Array after insert: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ",arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array[] = {10,4,6,7,8,0,0,0,2,1};
        System.out.println("Enter the position: ");
        int index = sc.nextInt();
        System.out.println("Enter the element: ");
        int element = sc.nextInt();

        insert(array,index,element);

    }
}
