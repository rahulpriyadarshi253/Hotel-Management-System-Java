package hotelmanagement;
import java.util.*;
public class Hotel {
    private List<Room> rooms=new ArrayList<>();
    public Hotel(){rooms.add(new Room(101,"Single",1500));rooms.add(new Room(102,"Single",1500));rooms.add(new Room(201,"Double",2500));rooms.add(new Room(202,"Double",2500));rooms.add(new Room(301,"Deluxe",3500));rooms.add(new Room(302,"Deluxe",3500));rooms.add(new Room(401,"Suite",5000));rooms.add(new Room(402,"Suite",5000));}
    public void displayRooms(){System.out.println("\n===== ROOM LIST =====");for(Room r:rooms)r.displayRoom();}
    public Room findRoom(int n){for(Room r:rooms)if(r.getRoomNumber()==n)return r;return null;}
    public List<Room> getRooms(){return rooms;}
}