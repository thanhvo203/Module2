package giai_thuat;

public class TinhTongSoTrongChuoi {
    public static void main(String[] args) {
        String s = "abc1232assabwov12";
        Tong(s);
    }
    public static void Tong(String s){
        int tong = 0;
        char[] charArr = new char[s.length()];
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = s.charAt(i);
        }
        int n = charArr.length;
        for (int i = 0; i < n-1; i++) {
            if(charArr[i] >= 48 && charArr[i] <= 57 ){
                 int so = charArr[i] - 48;
                for (int j = i+1; j < n; j++) {
                    if(charArr[j] <48 || charArr[j] >57){
                        i = j;
                        break;
                    }else{
                        int x = charArr[j] -48;
                        so = so * 10 + x;
                    }
                }
                tong += so;
            }
        }
        System.out.println(tong);
    }

}

