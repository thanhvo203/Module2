package lesson13.practise;

import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int[] arr){
        int min;
        for (int i = 0; i < arr.length; i++) {
            min= i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,2,5,3,-2,1,10,12};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}