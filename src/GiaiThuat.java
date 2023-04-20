import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class GiaiThuat {
    public static void main(String[] args) {
        String result ="";
        String string = "CodegymDaNang";
        String[] n = string.split("");
        for (int i = 0; i < n.length; i++) {
            if (n[i].equals(n[i].toUpperCase()) && i > 0 ) {
                result+=" " + n[i].toLowerCase();
            }else{
                result+= n[i];
            }
            System.out.println(result.toLowerCase());
        }
    }
}
