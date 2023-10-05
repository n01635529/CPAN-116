import java.util.Scanner;

public class Ideal_Weight_Calculator {

    private final static int POUNDS_PER_INCH = 5;
    private final static int BASE_HEIGHT = 60;
    private final static int BASE_WEIGHT = 110;
    private final static int FEET_INCHES = 12;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Input
        double total_height = input_module(sc);
        
        // Calculate
        double ideal_weight = calculate_module(total_height);
        
        // Output
        output_module(total_height, ideal_weight);
    }
    public static double input_module(Scanner scanner) {
        
        // input
        
        System.out.println("Enter the height in full feet: ");
        double height_feet = scanner.nextDouble();
        System.out.println("Enter the additional inches in height: ");
        double height_inches = scanner.nextDouble();
        double total_height = height_feet * FEET_INCHES + height_inches;
        return total_height;
    
    }
    
    public static double calculate_module(double total_height) {
        
        double calculated_height = total_height - BASE_HEIGHT;
        double ideal_weight = calculated_height * POUNDS_PER_INCH + BASE_WEIGHT; 
        return ideal_weight;
    }

    public static void output_module(double total_height, double ideal_weight) {

        double output_height = total_height / FEET_INCHES;
        System.out.println("User's height in feet: " + String.format("%.2f ", output_height));
        System.out.println("Calculated ideal body weight: " + ideal_weight + " pounds");
        
    }
    
}
