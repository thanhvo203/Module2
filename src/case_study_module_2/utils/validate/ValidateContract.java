package case_study_module_2.utils.validate;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateContract {
    public static boolean checkCodeContract(String codeContract){
        Pattern pattern = Pattern.compile("^CT-[0-9]{4}$");
        Matcher matcher = pattern.matcher(codeContract);
        return matcher.matches();
    }
    public static boolean checkCodeBooking(String codeBooking){
        Pattern pattern = Pattern.compile("BK-[0-9]{4}");
        Matcher matcher = pattern.matcher(codeBooking);
        return matcher.matches();
    }
}
