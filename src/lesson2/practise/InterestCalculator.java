package lesson2.practise;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter money: ");
        double money = sc.nextDouble();
        System.out.println("Enter month: ");
        double month = sc.nextDouble();
        System.out.println("Enter interest Rate: ");
        double interestRate = sc.nextDouble();

        double totalMoney = 0;
        for (int i = 0; i < month; i++) {
            totalMoney += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest : " + totalMoney);
    }
}
