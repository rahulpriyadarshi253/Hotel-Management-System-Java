package hotelmanagement;
import java.util.Random;
public class BookingIdGenerator {
    public static String generateId(){return "HTL"+(100000+new Random().nextInt(900000));}
}