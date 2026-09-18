package hotelmanagement;
public class Validator {
    public static boolean isValidName(String s){return s!=null&&!s.trim().isEmpty();}
    public static boolean isValidAge(int a){return a>=1&&a<=100;}
    public static boolean isValidPhone(String p){return p!=null&&p.matches("\\d{10}");}
    public static boolean isValidNights(int n){return n>=1&&n<=30;}
}