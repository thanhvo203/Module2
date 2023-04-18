package lesson12.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int high , int low, int value){
        if(high >= low){
            int mid = (high + low)/2;
            if(arr[mid] > value){
                return binarySearch(arr,mid-1, low, value);
            }else if(arr[mid] < value){
                return binarySearch(arr, high, mid+1, value);
            }else{
                return mid;
            }
        }
        return  -1;
    }
    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        System.out.println("Enter size of array: ");
        int length = sc.nextInt();
        arr = new int[length];
        for(int i = 0; i < arr.length ; i++){
            System.out.println("Enter element at " + i +" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sort(arr)));

        System.out.println("Binary search: " + binarySearch(arr,arr.length-1,0,5));
    }
}
