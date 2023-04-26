package case_study_module_2.utils.validate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidateEmployee {
    public static boolean checkID(String id){
        Pattern patternID = Pattern.compile("^NV-[0-9]{4}$");
        Matcher matcher = patternID.matcher(id);
        return matcher.matches();
    }
    public static boolean checkName(String name){
        Pattern patternName = Pattern.compile("^$");
        Matcher matcher = patternName.matcher(name);
        return matcher.matches();
    }
    public static boolean checkAge(String dayOfBirth){
       return false;
    }
    public static boolean checkIdentityNumber(String identityNumber){
        Pattern pattern = Pattern.compile("^[0-9]$");
        Matcher matcher = pattern.matcher(identityNumber);
        return matcher.matches();
    }
    public static boolean checkPhoneNumber(String phoneNumber){
        Pattern pattern = Pattern.compile("^0[0-9]{9}$");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }


}
