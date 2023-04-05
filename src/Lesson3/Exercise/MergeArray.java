package lesson3.exercise;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        byte[] arr1 = {1,2,3,4,5};
        byte[] arr2 = {5,4,3,2,1};
        byte[] arr3 ;
        int length = arr1.length + arr2.length;

        arr3 = new byte[length];
        byte count = 0;

        for (byte array : arr1) {
            arr3[count] = array;
            count++;
        }
        for (byte array :arr2) {
            arr3[count] = array;
            count++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
