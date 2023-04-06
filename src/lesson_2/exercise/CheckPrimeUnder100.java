package lesson_2.exercise;

import java.util.Scanner;

public class CheckPrimeUnder100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            if( i == 0 || i == 1){
                continue;
            }else{
                boolean check = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if(i % j == 0){
                        check = false;
                        break;
                    }
                }
                if(check){
                    System.out.printf("%d " , i);
                }
            }

        }
    }
}
