package lesson_3.new_exercise;

public class CheckNum {

    public static boolean isOdd(int number){
        if(number % 2 ==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(CheckNum.isOdd(3));
    }
}
