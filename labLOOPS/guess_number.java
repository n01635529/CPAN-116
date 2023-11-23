import java.util.Random;
import java.util.Scanner;

public class guess_number {
    public static void main(String[] args) {
        System.out.println("Welcome to the Guess the Number Game");
        System.out.println("Try to guess the number between 1 and 100.");
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int guess;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("To low! Try again.");
            }

            if (guess > randomNumber) {
                System.out.println("To high! Try again.");
            }

        } while (guess != randomNumber);
        if (guess == randomNumber)

            System.out.println("Congratulations! You guessed the correct number: " + guess);
        scanner.close();
    }

}
