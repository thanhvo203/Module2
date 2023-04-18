package lesson12.exercise;

import java.util.LinkedList;
import java.util.Scanner;


public class StringAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string:  ");
        String string = sc.nextLine();
        LinkedList<Character> stringList = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
           stringList.add(string.charAt(i));
            for (int j = i+1; j < string.length(); j++) {
                if(stringList.getLast() < string.charAt(j)){
                    stringList.add(string.charAt(j));
                }
            }
            break;
        }
        for (Character ch: stringList) {
            System.out.print(ch);
        }
    }
}
