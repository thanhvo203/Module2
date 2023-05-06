package giai_thuat;

public class TongCacUocChung {
    public static int tongUocChung(int number){
         int sum= 0;
        for (int i = 1; i <= number ; i++) {
            if(number % i == 0 ){
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(tongUocChung(12));
    }
}
