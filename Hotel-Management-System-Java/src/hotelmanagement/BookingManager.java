package hotelmanagement;
import java.util.*;
public class BookingManager {
    private List<Booking> bookings=new ArrayList<>(); private Hotel hotel;
    public BookingManager(Hotel hotel){this.hotel=hotel;}
    public Booking bookRoom(Guest guest,int roomNumber,int nights){
        Room room=hotel.findRoom(roomNumber);
        if(room==null){System.out.println("Room not found.");return null;}
        if(room.isBooked()){System.out.println("Room is already booked.");return null;}
        if(!Validator.isValidNights(nights)){System.out.println("Invalid number of nights.");return null;}
        double total=BillCalculator.calculateTotal(room,nights);
        room.setBooked(true); Booking b=new Booking(BookingIdGenerator.generateId(),guest,room,nights,total);bookings.add(b);
        System.out.println("Room booked successfully!");System.out.println("Booking ID: "+b.getBookingId());System.out.println("Total Bill: Rs."+String.format("%.2f",total));return b;
    }
    public Booking findBooking(String id){for(Booking b:bookings)if(b.getBookingId().equalsIgnoreCase(id))return b;return null;}
    public void cancelBooking(String id){Booking b=findBooking(id);if(b==null){System.out.println("Booking not found.");return;}b.getRoom().setBooked(false);bookings.remove(b);System.out.println("Booking cancelled successfully.");}
    public void displayBookings(){if(bookings.isEmpty()){System.out.println("No bookings available.");return;}for(Booking b:bookings)b.displayBooking();}
    public void searchGuest(String name){boolean found=false;for(Booking b:bookings)if(b.getGuest().getName().equalsIgnoreCase(name)){b.displayBooking();found=true;}if(!found)System.out.println("Guest not found.");}
    public void modifyBooking(String id,int nights){Booking b=findBooking(id);if(b==null){System.out.println("Booking not found.");return;}if(!Validator.isValidNights(nights)){System.out.println("Invalid number of nights.");return;}b.setNights(nights);b.setTotalAmount(BillCalculator.calculateTotal(b.getRoom(),nights));System.out.println("Booking updated successfully.");b.displayBooking();}
    public List<Booking> getBookings(){return bookings;}
}