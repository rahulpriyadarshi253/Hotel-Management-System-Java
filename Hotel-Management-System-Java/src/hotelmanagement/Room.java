package hotelmanagement;
public class Room {
    private int roomNumber; private String type; private double pricePerNight; private boolean booked;
    public Room(int roomNumber,String type,double pricePerNight){this.roomNumber=roomNumber;this.type=type;this.pricePerNight=pricePerNight;}
    public int getRoomNumber(){return roomNumber;} public String getType(){return type;} public double getPricePerNight(){return pricePerNight;} public boolean isBooked(){return booked;}
    public void setBooked(boolean booked){this.booked=booked;}
    public void displayRoom(){System.out.println("Room "+roomNumber+" | "+type+" | Rs."+pricePerNight+" | "+(booked?"Booked":"Available"));}
}