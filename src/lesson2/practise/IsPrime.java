package lesson2.practise;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int checkPrime = sc.nextInt();

        if (checkPrime < 2) {
            System.out.println(checkPrime + " is not a prime number.");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(checkPrime)) {
                if (checkPrime % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if(check) {
                System.out.println(checkPrime + " is a prime number");
            }else{
                System.out.println(checkPrime+ " is not a prime number");
            }
        }
    }
}
