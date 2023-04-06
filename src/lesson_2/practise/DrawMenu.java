package lesson_2.practise;

import java.util.Scanner;

public class DrawMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = -1;

        while (choice != 0){
            System.out.println("Menu");
            System.out.println("Enter number 0 to exit");
            System.out.println("Enter number 1 to draw triangle");
            System.out.println("Enter number 2 to draw square");
            System.out.println("Enter number 3 to draw rectangle");
            choice = sc.nextInt();
            switch (choice){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("* * * * *");
                    System.out.println("* * * * ");
                    System.out.println("* * * ");
                    System.out.println("* * ");
                    System.out.println("* ");
                    break;
                case 2:
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                default:
                    System.out.println("Wrong choice!!");
                    break;
            }
        }
    }
}