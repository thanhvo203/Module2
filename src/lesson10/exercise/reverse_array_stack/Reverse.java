package lesson10.exercise.reverse_array_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Array before reverse: ");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Array after reverse: ");
        int[] reverseInt = reverseInteger(numbers);
        System.out.println(Arrays.toString(reverseInt));

        Stack<String> stringStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String anyString = sc.nextLine();

        System.out.println("String before reverse: ");
        System.out.println(anyString);

        System.out.println("String after reverse: ");
        reverseString(anyString);
        System.out.println(reverseString(anyString));

    }

    public static int[] reverseInteger(int[] numbers) {
        Stack<Integer> stackInt = new Stack<>();
        for (int i = 0; i < numbers.length; i++) {
            stackInt.push(numbers[i]);
        }
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = stackInt.pop();
        }
        return numbers;
    }
    public static String reverseString(String strings){
        Stack<String> stackStr = new Stack<>();
        String[] newString = strings.split("");
        for (int i = 0; i < newString.length; i++) {
             stackStr.push(newString[i]);
        }
        for (int i = 0; i < newString.length; i++) {
            newString[i] = stackStr.pop();
        }
        return String.join("", newString);

    }
}
