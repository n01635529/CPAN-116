import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {

        // input / setting variables

        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a non-negative integer to calculate its factorial: ");
            number = sc.nextInt();

            if (number < 0) {
                System.out.println("Invalid input. Please enter a non-negative integer.");
            }

        } while (number < 0);

        sc.close();

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
