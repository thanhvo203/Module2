package lesson_4.practise_1;

import java.util.Scanner;

public class Rectangle {
    double weight;
    double height;

    public Rectangle(double weight, double height){
        this.height = height;
        this.weight = weight;
    }
    public double getArea(){
        return this.height * this.weight;
    }
    public double getPerimeter(){
        return (this.height+this.weight)*2;
    }
    public String display(){
        return "Rectangle { width = "+ weight+", height = "+ height+"}";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight: ");
        double weight = sc.nextDouble();
        System.out.println("Enter height: ");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(weight,height);
        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of rectangle: "+ rectangle.getPerimeter());
        System.out.println("Display : " + rectangle.display());
    }
}
