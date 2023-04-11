package lesson6.exercise.triangle;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the color: ");
        String color = sc.nextLine();
        System.out.println("Enter the size1: ");
        double size1 = sc.nextDouble();
        System.out.println("Enter the size2: ");
        double size2 = sc.nextDouble();
        System.out.println("Enter the size3: ");
        double size3 = sc.nextDouble();
        System.out.println("Enter the height: ");
        double height = sc.nextDouble();
        Shape shape = new Shape(size1,size2,size3);
        Shape triangle = new Triangle(size1,size2,size3,height,color);

        System.out.println(shape.toString());
        System.out.println("Display Triangle:");
        System.out.println(triangle.toString());
        System.out.println(((Triangle) triangle).getArea());
        System.out.println(((Triangle) triangle).getPerimeter());



    }
}
