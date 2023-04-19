package lesson13.practise;

import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] arr){
        int index;
        int value;
        for (int i = 1; i < arr.length; i++) {
            value = arr[i];
            index = i;
            while (index > 0 && value < arr[index-1]){
                arr[index] = arr[index-1];
                index--;
            }
            arr[index] = value;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,6,3,2,-2,2,4};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
