package lesson_3.new_exercise;


public class LeapYear {
    public static boolean checkYear(int number){
        if((number % 4 ==0 && number % 100 !=0) || (number%100==0 && number% 400 ==0)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkYear(12));
    }
}
