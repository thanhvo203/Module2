package lesson11.exercise;

import java.util.*;

public class CountWordInMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String stringWord = sc.nextLine().toLowerCase();

        String[] newString = stringWord.split("");
        System.out.println(Arrays.toString(newString));
        int count = 0;
        String check;
        for (int i = 0; i < newString.length; i++) {
            check = newString[i];
            for (int j = 0; j < newString.length; j++){
                if(check.equals(newString[j])){
                    count++;
                }
            }
            map.put(newString[i],count);
            count =0;
        }
        System.out.println(map);
    }
}
