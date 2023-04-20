package lesson14.practise;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        CalculationExample cal = new CalculationExample();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x: ");
        int x = sc.nextInt();
        System.out.println("Input y: ");
        int y = sc.nextInt();
        cal.calculation(x,y);


    }
    private void calculation(int x, int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Addition : " + a);
            System.out.println("Subtraction: " + b);
            System.out.println("Multiply : " + c);
            System.out.println("Division : " + d);
        }catch (Exception e){
            System.out.println("Exception : " + e.getMessage());
        }
    }

}
