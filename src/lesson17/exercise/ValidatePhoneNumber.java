package lesson17.exercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pattern pattern = Pattern.compile("^[CAP][0-9]{4}[GHIK]$");
        while (true){
            System.out.println("Enter class name: ");
            String className = sc.nextLine();
            if(pattern.matcher(className).find()){
                System.out.println(className);
                break;
            }else{
                System.err.println("Wrong input, please input again");
            }
        }
    }
}
