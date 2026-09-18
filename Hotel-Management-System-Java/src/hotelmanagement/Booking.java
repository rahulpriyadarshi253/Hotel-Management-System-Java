package hotelmanagement;
public class Booking {
    private String bookingId; private Guest guest; private Room room; private int nights; private double totalAmount;
    public Booking(String id,Guest guest,Room room,int nights,double total){bookingId=id;this.guest=guest;this.room=room;this.nights=nights;totalAmount=total;}
    public String getBookingId(){return bookingId;} public Guest getGuest(){return guest;} public Room getRoom(){return room;} public int getNights(){return nights;} public double getTotalAmount(){return totalAmount;}
    public void setNights(int n){nights=n;} public void setTotalAmount(double t){totalAmount=t;}
    public void displayBooking(){System.out.println("\n----- BOOKING DETAILS -----");System.out.println("Booking ID : "+bookingId);System.out.println("Guest      : "+guest.getName());System.out.println("Room       : "+room.getRoomNumber());System.out.println("Room Type  : "+room.getType());System.out.println("Nights     : "+nights);System.out.println("Total Bill : Rs."+String.format("%.2f",totalAmount));}
}