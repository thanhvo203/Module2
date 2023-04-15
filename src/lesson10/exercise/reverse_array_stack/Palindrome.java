package lesson10.exercise.reverse_array_stack;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter palindrome: ");
        String palindrome = sc.nextLine();

        if(checkPalindrome(palindrome)){
            System.out.println("This is palindrome string");
        }else{
            System.out.println("This is not palindrome string");
        }

    }
    public static boolean checkPalindrome(String palindrome){
        Queue<String> stringQueue = new LinkedList<String>();
        Stack<String> stringStack = new Stack<>();

        String lowerCaseString = palindrome.toLowerCase();
        String[] newString = lowerCaseString.split("");
        for (int i = 0; i < newString.length; i++) {
            stringStack.push(newString[i]);
            stringQueue.offer(newString[i]);
        }
        for (int i =0 ; i < newString.length; i++){
            if(!Objects.equals(stringStack.pop(), stringQueue.poll())){
                return false;
            }
        }
        return true;
    }
}
