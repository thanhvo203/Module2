package lesson10.exercise.reverse_array_stack;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string.");
        String bracket = sc.nextLine();

        if(checkBracket(bracket)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    public static boolean checkBracket(String string) {
        Stack<Character> stackLeftBracket = new Stack<>();
        Stack<Character> stackRightBracket = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                stackLeftBracket.push(string.charAt(i));
            } else if (string.charAt(i) == ')') {
                stackRightBracket.push(string.charAt(i));
            }
        }
        if (stackLeftBracket.size() > stackRightBracket.size()
                || stackLeftBracket.size() < stackRightBracket.size()) {
            return false;
        }
        return true;
    }
}
