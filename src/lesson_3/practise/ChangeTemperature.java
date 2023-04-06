package lesson_3.practise;

import java.util.Scanner;

public class ChangeTemperature {
    public static double  celsiusToFahrenheit(double celsius){
        double fahrenheit =  (9.0 / 5) * (celsius + 32);
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0/9) * (fahrenheit -32);
        return celsius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius ;
        double fahrenheit;
        int choice ;
        do {
            System.out.println("Menu");
            System.out.println("1. Celsius To Fahrenheit");
            System.out.println("2. Fahrenheit To Celsius");
            System.out.println("3. Exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the celsius: ");
                    celsius = sc.nextDouble();
                    System.out.println("Celsius to Fahrenheit: "+ celsiusToFahrenheit(celsius));
                case 2:
                    System.out.println("Enter the fahrenheit: ");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " +fahrenheitToCelsius(fahrenheit));
                case 3:
                    System.exit(3);
            }
        }while (choice != 3);
    }
}
