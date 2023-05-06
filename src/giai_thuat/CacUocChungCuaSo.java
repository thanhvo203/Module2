package giai_thuat;

import java.util.ArrayList;


public class CacUocChungCuaSo {
    public static ArrayList<Integer> UocChung(int number){
        ArrayList<Integer> arrNums = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
             if(number % i == 0){
                 arrNums.add(i);
             }
        }
        return arrNums;
    }

    public static void main(String[] args) {
        System.out.println(UocChung(12));
    }
}
