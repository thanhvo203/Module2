package giai_thuat;

import java.util.Scanner;

public class SapXepSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào dãy số: ");
        int number = sc.nextInt();
        int numberAfterReverse = 0;
        while (number > 0){
            int chiaLayDu = number % 10;
            numberAfterReverse = numberAfterReverse *10 +chiaLayDu;
            number = number /10;
        }
        System.out.println(numberAfterReverse);
    }
}
