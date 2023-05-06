package giai_thuat;

public class FibonacciSmallerThan100 {
    public static void fibonacci(){
       int number = 0;
       int number1  =0;
       int number2 = 1;
        System.out.print(number1 + " " + number2 + " ");
       while (number < 100){
           number = number1 + number2;
           number1 = number2;
           number2 = number;
           if(number <100){
               System.out.print(number+ " ");
           }
       }
    }

    public static void main(String[] args) {
        fibonacci();
    }
}
