package giai_thuat;

import java.util.Scanner;

public class DemSoLanBatKyPhanTuNhapVao {
    public static void main(String[] args) {
        String str = "fioanovodv";
        String[] str2 = str.split("");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 ký tự");
        String str1 = sc.nextLine();
        int count  = 0;
        for (int i = 0; i < str2.length; i++) {
            if(str1.equals(str2[i])){
                count++;
            }
        }
        System.out.println(count);

    }
}
