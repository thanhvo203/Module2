package giai_thuat;

public class SoLanXuatHienKyTuTrongChuoi {
    public static void SoLanXuatHien(String str) {
        String[] string1 = str.split("");
        int count = 0;
        for (int i = 0; i < string1.length; i++) {
            String word = string1[i];
            for (int j = 0; j < string1.length; j++) {
                if (string1[j].contains(word)) {
                    count++;
                }
            }
            System.out.print(count + string1[i] + " ");
            count = 0;
        }
    }

    public static void main(String[] args) {
        String str = "aabacsdc";
        SoLanXuatHien(str);
    }
}
