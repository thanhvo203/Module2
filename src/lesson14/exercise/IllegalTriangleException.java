package lesson14.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException extends Throwable {
    public IllegalTriangleException(){

    }

    public IllegalTriangleException(String s) {
        super(s);
    }

    private void triangleException(double a, double b, double c) throws IllegalTriangleException {
       if(a < 0 || b < 0 || c < 0){
           throw new IllegalTriangleException("False 1");
       }else if(a + b < c || b + c < a || c + a < b){
           throw new IllegalTriangleException("False 2");
       }else{
           System.out.println("a , b , c:  " + a+ " ," + b +" ,"+ c);
       }
    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input edge a : ");
        double edgeA = sc.nextDouble();
        System.out.println("Input edge b : ");
        double edgeB = sc.nextDouble();
        System.out.println("Input edge c : ");
        double edgeC = sc.nextDouble();
        IllegalTriangleException triangle = new IllegalTriangleException();
        try {
            triangle.triangleException(edgeA,edgeB,edgeC);
        } catch (IllegalTriangleException e) {
            System.out.println(e);
        }
    }
}
