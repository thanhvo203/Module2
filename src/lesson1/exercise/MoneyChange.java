package lesson1.exercise;

import java.util.Scanner;

public class MoneyChange {
    public static void main(String[] args) {
        int vnd = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USD wanna change to VND: ");
        int usd = sc.nextInt();

        System.out.println("Total VND you get is: " + vnd*usd);
    }
}
