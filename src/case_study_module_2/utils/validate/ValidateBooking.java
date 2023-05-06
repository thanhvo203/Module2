package case_study_module_2.utils.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateBooking {
    public static boolean checkIDBooking(String id){
        Pattern pattern = Pattern.compile("^BK-[0-9]{4}$");
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }
    public static boolean checkCodeCustomer(String id){
        Pattern pattern = Pattern.compile("^KH-[0-9]{4}$");
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }
}
