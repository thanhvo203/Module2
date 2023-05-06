package giai_thuat;

public class IsOdd {
    public static void isOdd(int number) {
        if (number < 0) {
            System.out.println("Number is not bigger than  0");
        } else if (number % 2 == 0) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }

    public static void main(String[] args) {
        isOdd(-2);
    }
}
