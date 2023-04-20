package lesson12.exercise;

import java.util.LinkedList;
import java.util.Scanner;

public class StringConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String string = sc.nextLine();

        LinkedList<Character> characters = new LinkedList<>();
        LinkedList<Character> characters1 = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            if (characters.size() >= 1 && string.charAt(i) <= characters.getLast()) {
                characters.clear();
            }

            characters.add(string.charAt(i));

            if (characters.size() > characters1.size()) {
                characters1.clear();
                characters1.addAll(characters);
            }
        }
        for (Character ch : characters1) {
            System.out.print(ch);
        }
    }
}

