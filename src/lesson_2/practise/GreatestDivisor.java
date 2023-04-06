package lesson_2.practise;

import java.util.Scanner;

public class GreatestDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number a: ");
        int a = sc.nextInt();
        System.out.println("Enter number b: ");
        int b = sc.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("There is no greatest common divisor");
        } else if (a == 0 && b != 0) {
            System.out.println("Greatest common divisor is : " + Math.abs(b));
        } else if (a != 0 && b == 0) {
            System.out.println("Greatest common divisor is : " + Math.sqrt(a));
        } else {
            while (a != b){
                if( a > b){
                    a = a -b;
                }else{
                    b = b - a;
                }
            }
        }
        System.out.println("Greatest common divisor is :"+  a);
    }
}
