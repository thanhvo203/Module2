package giai_thuat;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GiaTriLonNhatThu2 {
    public static void main(String[] args) {
        int[] arrNums = {1,4,6,2,4,6,12,2};
        for (int i = 0; i < arrNums.length; i++) {
            for (int j = i; j < arrNums.length; j++) {
                if(arrNums[i] > arrNums[j]){
                    int temp = arrNums[i];
                    arrNums[i] = arrNums[j];
                    arrNums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arrNums));
        System.out.println("Second Max : "+ arrNums[arrNums.length-2]);
        
    }
}
