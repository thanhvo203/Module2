package lesson13.exercise;

import java.util.Arrays;

public class InsertionSort {
    public static int[]  insertionSort(int[] arr){
        int index;
        int value;
        for (int i = 0; i < arr.length; i++) {
            index = i;
            value = arr[i];
            while (index > 0 && value < arr[index-1]){
                arr[index] = arr[index-1];
                index--;
            }
            arr[index] = value;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {1,5,35,7,2,63,4,5,-1};
        System.out.println(Arrays.toString(insertionSort(array)));

    }
}
