package Lesson1.Practise;

import java.util.Scanner;

public class BodyWeightIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the weight: ");
        double weight = sc.nextFloat();
        System.out.println("Enter the height: ");
        double height = sc.nextFloat();

        double bmi = weight / Math.pow(height, 2);

        if (bmi < 18.5) {
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        } else if (bmi < 25) {
            System.out.printf("%-20.2f%s", bmi, "Normal");
        } else if (bmi < 30) {
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        } else {
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }
    }
}
