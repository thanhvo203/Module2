package lesson3.practise;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name you wanna find in array: ");
        String inputName = sc.nextLine();
        boolean check = false;

        for (int i = 0; i < students.length; i++) {
            if(inputName.equals(students[i])){
                System.out.println("Position the name in array "+inputName+" is : "+i);
                check = true;
                break;
            }
        }
        if (check == false){
            System.out.println("Not found the name in the array.");
        }
    }
}
