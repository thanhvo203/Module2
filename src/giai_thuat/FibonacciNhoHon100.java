package giai_thuat;

public class FibonacciNhoHon100 {
    public static void TimFibonacci(){
        int num1 = 0;
        int num2 = 0;
        int num3 = 1;
        System.out.print(num3 + " ");
        while (true){
            num1 = num2 + num3;
            num2 = num3;
            num3 = num1;
            if (num1 <= 100){
                System.out.print(num1 + " ");
            }else{
                break;
            }
        }
    }
    public static void main(String[] args) {
        TimFibonacci();
    }
}
