package Lesson1.Practise;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month: ");
        int month = sc.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Month "+month +" have 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Month "+month+ " have 30 days.");
                break;
            case 2:
                System.out.println("Month "+month+ " have 28 or 29 days.");

        }
        if (month == 0){
            System.out.println("This number is not a month!!!");
        }
    }
}
