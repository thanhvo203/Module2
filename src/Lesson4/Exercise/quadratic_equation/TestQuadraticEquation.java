package lesson4.exercise.quadratic_equation;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a :");
        double a = sc.nextDouble();
        System.out.println("Nhập b :");
        double b = sc.nextDouble();
        System.out.println("Nhập c :");
        double c = sc.nextDouble();
       QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        if(a == 0){
            System.out.println("Phương trình vô nghiệm.");
        }else{
            double delta = quadraticEquation.getDiscriminant();
            System.out.println("Delta: " + delta);
            if(delta > 0){
                System.out.println("Phương trình có 2 nghiệm:");
                System.out.print("x1: "+quadraticEquation.getRoot1()+" x2: "+quadraticEquation.getRoot2());
            }else if(delta == 0 ){
                double x = -b / (2*a);
                System.out.println("x1=x2= " + x);
            }else{
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
