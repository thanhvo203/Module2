package giai_thuat;

public class SoDoiXung {
    public static void main(String[] args) {
        int n = 123456;
        System.out.println(soDoiXung(n));
    }
    public static boolean soDoiXung(int n){
        int soDaoNguoc = 0;
        int soTam = n;
        while (soTam > 0){
            int chiaLayDu = soTam %10;
             soDaoNguoc = soDaoNguoc *10+chiaLayDu;
             soTam = soTam /10;
        }
        if(soDaoNguoc == n ){
            return true;
        }
        return false;
    }
}
