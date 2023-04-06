package lesson3.new_exercise;

public class Fibonacci {
        public static void printFibonacci(int number){
        int num = 0;
        int num1 = 0;
        int num2 = 1;
        System.out.printf("%d ",num1);
        System.out.printf("%d ",num2);
        while (num < number){
            num = num1 + num2;
            num1 = num2;
            num2 = num;
            if(num < number){
                System.out.printf("%d " , num);
            }
        }
        return;
    }
    public static void main(String[] args) {
            Fibonacci fibonacci = new Fibonacci();
            printFibonacci(100);

    }

}
