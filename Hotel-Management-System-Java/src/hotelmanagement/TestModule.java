package hotelmanagement;
public class TestModule {
    static int pass,fail;
    static void check(String n,boolean r){if(r){System.out.println("[PASS] "+n);pass++;}else{System.out.println("[FAIL] "+n);fail++;}}
    public static void runTests(){
        pass=fail=0;Room r=new Room(101,"Single",1500);
        check("Room bill for 2 nights",BillCalculator.calculateRoomBill(r,2)==3000);
        check("Tax calculation",BillCalculator.calculateTax(1000)==120);
        check("Valid age",Validator.isValidAge(25));check("Invalid age",!Validator.isValidAge(150));
        check("Valid phone",Validator.isValidPhone("9876543210"));check("Invalid phone",!Validator.isValidPhone("12345"));
        System.out.println("\nTests Passed: "+pass);System.out.println("Tests Failed: "+fail);
    }
}