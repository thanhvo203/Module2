package lesson17.exercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateClass {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^\\((84)\\)-\\([0-9]{10}\\)$");
        while (true){
            System.out.println("Enter phone number: ");
            String phoneNumber = sc.nextLine();
            if(pattern.matcher(phoneNumber).find()){
                System.out.println(phoneNumber);
                break;
            }else{
                System.err.println("Wrong input,please input again!!");
            }
        }
    }
}
