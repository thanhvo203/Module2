package giai_thuat;

public class IsLeap {
    public static boolean isLeap(int number) {
        if ((number % 4 == 0 && number %100 != 0)||( number % 100 == 0 && number % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        if(isLeap(2000)){
            System.out.println("this year is a leap year");
        }else{
            System.out.println("this year is not a leap year");
        }
    }
}
