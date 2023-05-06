package giai_thuat;

import java.util.Scanner;

public class TimTongPhanTuTrongMangBangN {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 2, 6, 7, 3, 3, 8, 2};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == n) {
                    System.out.print("Vị trí thứ 1: "+i+ "+"+"Vị trí thứ 2: " +j+ "=" + n + " ");
                    break;
                }
            }
        }
    }
}
