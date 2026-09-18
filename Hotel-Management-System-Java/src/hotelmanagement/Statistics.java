package hotelmanagement;
public class Statistics {
    public static void displayStatistics(BookingManager m,Hotel h){
        int booked=m.getBookings().size();double revenue=0;for(Booking b:m.getBookings())revenue+=b.getTotalAmount();
        System.out.println("\n===== HOTEL STATISTICS =====");System.out.println("Total Rooms     : "+h.getRooms().size());System.out.println("Booked Rooms    : "+booked);System.out.println("Available Rooms : "+(h.getRooms().size()-booked));System.out.println("Total Revenue   : Rs."+String.format("%.2f",revenue));
    }
}