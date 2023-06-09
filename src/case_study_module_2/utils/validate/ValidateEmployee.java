package case_study_module_2.utils.validate;
import java.lang.reflect.Parameter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmployee {

    public static boolean checkID(String id){
        Pattern patternID = Pattern.compile("^NV-[0-9]{4}$");
        Matcher matcher = patternID.matcher(id);
        return matcher.matches();
    }
    public static boolean checkName(String name){
        Pattern patternName = Pattern.compile("^([A-Z][a-z]+\s)+[A-Z][a-z]+$");
        Matcher matcher = patternName.matcher(name);
        return matcher.matches();
    }
    public static boolean checkAge(String dayOfBirth)  {
        Pattern pattern = Pattern.compile("^[0-3][0-9]/((0)[1-9]|(1)[0-2])/[0-9]{4}$");
        Matcher matcher = pattern.matcher(dayOfBirth);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        long milisecond18Year = (365L *24*60*60*1000)*18;
        try {
            Date date = simpleDateFormat.parse(dayOfBirth);
            if(System.currentTimeMillis() -date.getTime() >= milisecond18Year){
                return matcher.matches();
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static boolean checkIdentityNumber(String identityNumber){
        Pattern pattern = Pattern.compile("^([0-9]{9}|[0-9]{12})$");
        Matcher matcher = pattern.matcher(identityNumber);
        return matcher.matches();
    }
    public static boolean checkPhoneNumber(String phoneNumber){
        Pattern pattern = Pattern.compile("^0[0-9]{9}$");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }


}
