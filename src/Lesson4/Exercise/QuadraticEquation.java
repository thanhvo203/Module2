package Lesson4.Exercise;


import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return  this.c;
    }
    public double  getDiscriminant(){
        return (b*b) - (4*a*c);
    }
    public double getRoot1(){
        return (-b + Math.sqrt(getDiscriminant()))/(2*a);
    }
    public double getRoot2(){
        return  (-b -  Math.sqrt(getDiscriminant()))/(2*a);
    }
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
