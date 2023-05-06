package giai_thuat;

public class TrungBinhCongUocChungVaBoiChung {
    public static int uocChungLonNhat(int a, int b){
        while (a != b){
            if( a > b ){
                return a = a -b;
            }else {
                return b = b -a;
            }
        }
        return a;
    }
    public static int boiChungNhoNhat(int a, int b){
        int result = uocChungLonNhat(a,b);
        return a*b /result;
    }
    public static int trungBinhCong(int a, int b){
        return (uocChungLonNhat(a,b)+boiChungNhoNhat(a,b))/2;
    }

    public static void main(String[] args) {
        System.out.println(trungBinhCong(40,30));

        // Tìm bội chung nhỏ nhất không dựa vào ước chung lớn nhất
        /*  int a , b, bcnn;
          bncc  = (a > b) ? a : b;
          while(true){
          if(bcnn % a == 0 && bcnn % b == 0){
               break;
              }
              ++bcnn;
          }
         */
    }
}
