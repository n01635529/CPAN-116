package assignment1;
import java.util.Scanner;
public class Restaurant_Bill_Calculator {

    private final static double SALES_TAX = 0.07;
    private final static double TIP = 0.15;

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
       double base_price = get_price(sc);
       
       double ammount_tax = get_tax(base_price);
       double ammount_tip = get_tip(base_price);
       
       display_ammounts(base_price, ammount_tip, ammount_tax);
        
    }
    
 public static double get_price(Scanner scanner) {
     
     System.out.println("How much does this meal cost? ");
     double base_price = scanner.nextDouble();
     return base_price;
 }
 
 public static double get_tax(double base_price) {
     
     double ammount_tax = base_price * SALES_TAX;
     return ammount_tax;    
 }
 
 public static double get_tip(double base_price) {

     double ammount_tip = base_price * TIP;
     return ammount_tip;
 }
 
 public static void display_ammounts(double base_price, double ammount_tip, double ammount_tax) {

     double total_price = base_price + ammount_tip + ammount_tax;
     System.out.println("NET Ammount (Excluding Tax): $" + base_price);
     System.out.println("Tax (%7): $" + String.format("%.2f ", ammount_tax));
     System.out.println("Tip (%15): $" + String.format("%.2f ", ammount_tip));
     System.out.println("Gross Ammount (Including tax and tips): $" +  String.format("%.2f ", total_price));
}
}