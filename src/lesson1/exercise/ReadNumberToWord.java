package lesson1.exercise;


import java.util.Scanner;

public class ReadNumberToWord {
    public static String underTen(int number) {
        String s = "";
        switch (number) {
            case 1 -> s = "one";
            case 2 -> s = "two";
            case 3 -> s = "three";
            case 4 -> s = "four";
            case 5 -> s = "five";
            case 6 -> s = "six";
            case 7 -> s = "seven";
            case 8 -> s = "eight";
            case 9 -> s = "nine";
            case 10 -> s = "ten";
        }
        return s;
    }

    public static int underTwenty(int number) {
        if (number == 11) {
            System.out.println("eleven");
        } else if (number == 12) {
            System.out.println("twelve");
        } else if (number == 13) {
            System.out.println("thirteen");
        } else if (number == 15) {
            System.out.println("fifteen");
        } else {
            System.out.println(underTen(number%10)+ "teen");
        }
        return number;
    }
    public static void underHundred(int number){
        if(number/10 ==2){
            System.out.println("twenty-"+underTen(number%10));
        }else if(number/10 == 3){
            System.out.println("thirty-"+underTen(number%10));
        } else if(number%10 == 0) {
            System.out.println(underTen(number/10)+"ty");
        }else if(number%10 != 0){
            System.out.println(underTen(number/10)+"ty- "+underTen(number%10));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        if (number <= 10) {
            System.out.println(underTen(number));
        } else if (number < 20) {
            System.out.println(underTwenty(number));
        }else if (number < 100){
            underHundred(number);
        }else if (number == 100){
            System.out.println("one hundred");
        }
    }
}
