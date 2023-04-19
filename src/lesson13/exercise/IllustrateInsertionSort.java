package lesson13.exercise;

import java.util.Arrays;

public class IllustrateInsertionSort {
    public static void main(String[] args) {
        int[] array = {1,5,35,7,2,63,4,5,-1};
        int value;
        int index;
        for (int i = 0; i < array.length; i++) {
            index = i;
            value = array[i];
            while (index > 0 && value < array[index-1]){
                array[index] = array[index-1];
                index--;
                System.out.println(Arrays.toString(array));
            }
            array[index] = value;
            System.out.println(Arrays.toString(array));
            System.out.println("------------------");
        }
    }
}
