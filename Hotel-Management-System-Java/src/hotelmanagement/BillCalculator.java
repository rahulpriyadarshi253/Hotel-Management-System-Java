package hotelmanagement;  
public class BillCalculator {
    public static double calculateRoomBill(Room room,int nights){return room.getPricePerNight()*nights;}
    public static double calculateTax(double amount){return amount*0.12;}
    public static double calculateTotal(Room room,int nights){double bill=calculateRoomBill(room,nights);return bill+calculateTax(bill);}
}
