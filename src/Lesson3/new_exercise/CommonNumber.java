package lesson3.new_exercise;

import java.util.Arrays;

public class CommonNumber {
    public static int[] checkCommonNumber(int number){
//        int count = 0;
        int[] array = new int[number];
        int j = 0;
        for (int i = 1; i <= number; i++) {
            if(number % i == 0){
                array[j] = i;
                j++;
            }
        }
//        int[] array2 = new int[count];
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = array[i];
//        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(checkCommonNumber(10)));
    }
}
