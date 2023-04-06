package lesson1.practise;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        float weight;
        float height;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight :" );
        weight = sc.nextFloat();
        System.out.println("Enter the height: ");
        height = sc.nextFloat();

        float area = weight * height;
        System.out.println("Area : " + area);

    }
}
