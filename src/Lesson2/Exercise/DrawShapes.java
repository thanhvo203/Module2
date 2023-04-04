package Lesson2.Exercise;


import java.util.Scanner;

public class DrawShapes {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("Enter number 1 to draw rectangle");
            System.out.println("Enter number 2 to draw square triangle");
            System.out.println("Enter number 3 to draw isosceles triangle");
            System.out.println("Enter number 4 to exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5 ; i++){
                        for (int j = 1; j <= i ; j++){
                            System.out.print(" * ");
                        }
                        System.out.println("   ");
                    }
                    System.out.println(" ");
                    for (int i = 1; i <= 5 ; i++){
                        for (int j = 0; j <= 5-i ; j++){
                            System.out.print(" * ");
                        }
                        System.out.println("   ");
                    }
                    System.out.println(" ");
                    for (int i = 1; i <= 5 ; i++){
                        for (int j = 1; j <= 5 ; j++){
                            if(j >= i){
                                System.out.print(" * ");
                            }else{
                                System.out.print("   ");
                            }
                        }
                        System.out.println(" ");
                    }
                    System.out.println(" ");
                    for (int i = 1; i <= 5 ; i++){
                        for (int j = 1; j <= 5 ; j++){
                            if(j <= 5-i){
                                System.out.print("   ");
                            }else{
                                System.out.print(" * ");
                            }
                        }
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5-i; j++) {
                            System.out.print("   ");
                        }
                        for (int j = 1; j <= 2*i-1; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 4:
                    System.exit(4);
            }
        }
    }
}
