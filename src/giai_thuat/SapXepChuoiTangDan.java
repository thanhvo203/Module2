package giai_thuat;

import java.util.Arrays;

public class SapXepChuoiTangDan {
    public static void main(String[] args) {
        String str = "afbabsasf";
        char[] characters = new char[str.length()];
        for (int i = 0; i < characters.length; i++) {
            characters[i] = str.charAt(i);
        }
        for (int i = 0; i < characters.length; i++) {
            for (int j = i; j < characters.length; j++) {
                if(characters[i] > characters[j]){
                    char temp = characters[i];
                    characters[i] = characters[j];
                    characters[j] = temp;
                }
            }
        }
        String str1 = new String(characters);
        System.out.println(str1);
    }
}
