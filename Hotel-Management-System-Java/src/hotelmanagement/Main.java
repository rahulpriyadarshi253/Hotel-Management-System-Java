package hotelmanagement;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);Hotel hotel=new Hotel();BookingManager manager=new BookingManager(hotel);
        while(true){
            System.out.println("\n===== HOTEL MANAGEMENT SYSTEM =====");
            System.out.println("1. Display Rooms\n2. Book a Room\n3. Display Bookings\n4. Cancel Booking\n5. Print Booking\n6. Search Guest\n7. Modify Booking\n8. Hotel Statistics\n9. Run Tests\n10. Exit");
            System.out.print("Enter your choice: ");
            try{
                int choice=Integer.parseInt(sc.nextLine());
                switch(choice){
                    case 1: hotel.displayRooms(); break;
                    case 2:
                        System.out.print("Enter guest name: ");String name=sc.nextLine();
                        System.out.print("Enter age: ");int age=Integer.parseInt(sc.nextLine());
                        System.out.print("Enter gender: ");String gender=sc.nextLine();
                        System.out.print("Enter phone number: ");String phone=sc.nextLine();
                        if(!Validator.isValidName(name)||!Validator.isValidAge(age)||!Validator.isValidPhone(phone)){System.out.println("Invalid guest details.");break;}
                        System.out.print("Enter room number: ");int room=Integer.parseInt(sc.nextLine());
                        System.out.print("Enter number of nights: ");int nights=Integer.parseInt(sc.nextLine());
                        manager.bookRoom(new Guest(name,age,gender,phone),room,nights);break;
                    case 3: manager.displayBookings();break;
                    case 4: System.out.print("Enter booking ID: ");manager.cancelBooking(sc.nextLine());break;
                    case 5: System.out.print("Enter booking ID: ");Booking b=manager.findBooking(sc.nextLine());if(b!=null)b.displayBooking();else System.out.println("Booking not found.");break;
                    case 6: System.out.print("Enter guest name: ");manager.searchGuest(sc.nextLine());break;
                    case 7: System.out.print("Enter booking ID: ");String id=sc.nextLine();System.out.print("Enter new number of nights: ");manager.modifyBooking(id,Integer.parseInt(sc.nextLine()));break;
                    case 8: Statistics.displayStatistics(manager,hotel);break;
                    case 9: TestModule.runTests();break;
                    case 10: System.out.println("Thank you!");sc.close();return;
                    default:System.out.println("Invalid choice.");
                }
            }catch(NumberFormatException e){System.out.println("Please enter a valid number.");}
        }
    }
}