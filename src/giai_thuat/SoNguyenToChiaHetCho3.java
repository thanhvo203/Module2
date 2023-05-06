package giai_thuat;

public class SoNguyenToChiaHetCho3 {
    public static boolean SoNguyenToChiLeChiaHetCho3(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i < 100; i++) {
            if (SoNguyenToChiLeChiaHetCho3(i) && i % 3 == 0) {
                System.out.println(i);
                count++;
            }
        }
        if(count == 0){
            System.out.println("Not found");
        }
    }
}
