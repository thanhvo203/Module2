package lesson2.exercise;

import java.util.Scanner;

public class CheckTwentyPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number =  sc.nextInt();
        int count = 0;
        int n = 2;

        while (count < number){
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.printf("%d " , n);
                count++;
            }
            n++;
        }
    }
}
