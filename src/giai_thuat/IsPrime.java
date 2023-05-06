package giai_thuat;

public class IsPrime {
    public static boolean isPrime(int number){
        if(number < 2){
            return false;
        }
        int sqrt = (int)Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if(number % 2 == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
}
