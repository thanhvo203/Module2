package Lesson1.Practise;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a : ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();

        if(a != 0){
            double result = (b-c)/a;
            System.out.println("Equation pass with x = " +  result);
        }else{
            if(b == 0){
                System.out.println("The solution is all x:");
            }else{
                System.out.println("No solution!");
            }
        }
    }
}
