package lesson10.exercise.reverse_array_stack;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        while (number > 0){
            int surplus = number % 2;
            stack.push(surplus);
            number = number/2;
        }
        System.out.println("Binary: ");
        int length = stack.size();
        for (int i = 0; i < length; i++) {
            System.out.print(stack.pop());
        }
    }
}
