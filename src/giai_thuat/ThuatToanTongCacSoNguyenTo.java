package giai_thuat;

public class ThuatToanTongCacSoNguyenTo {
    public static void TimSoNguyenTo(int[]arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            if(arr[i] == 1){
                continue;
            }
            for (int j = 2 ; j <= Math.sqrt(arr[i]) ; j++) {
                if(arr[i] % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                sum += arr[i];
                System.out.print("Sum prime : " + sum);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        TimSoNguyenTo(arr);
    }
}
