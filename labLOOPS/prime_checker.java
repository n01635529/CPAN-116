import java.util.Scanner;

public class prime_checker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput;
        while (true) {
            System.out.print("Enter an integer (negative to exit): ");

            userInput = scanner.nextInt();

            if (userInput < 0) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            boolean isPrime = isPrime(userInput);

            if (isPrime) {
                System.out.println(userInput + " is a prime number.");
                break;
            } else {
                System.out.println(userInput + " is not a prime number.");
            }
        }

        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}
