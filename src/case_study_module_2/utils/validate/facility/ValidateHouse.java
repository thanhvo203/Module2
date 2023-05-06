package case_study_module_2.utils.validate.facility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHouse {
    public static boolean checkServiceCode(String serviceCode){
        Pattern pattern = Pattern.compile("^SVHO-[0-9]{4}$");
        Matcher matcher = pattern.matcher(serviceCode);
        return matcher.matches();
    }
    public static boolean checkServiceName(String serviceName){
        Pattern pattern = Pattern.compile("^[A-Z][a-z]+$");
        Matcher matcher = pattern.matcher(serviceName);
        return matcher.matches();
    }
}
