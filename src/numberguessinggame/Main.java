package numberguessinggame;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int attempts = 0;

        int myNum = random.nextInt(1, 100);

        System.out.println("Welcome to the number guessing game!");
        System.out.println("Enter a number from 1 to 100: ");
        int num = scanner.nextInt();
        attempts++;

        while (num != myNum) {
            if (num > myNum) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
            System.out.println("Enter a number: ");
            num = scanner.nextInt();
            attempts++;
        }

        System.out.println("Congratulations! You guessed it!");
        System.out.println("Total number of attempts: " + attempts);
    }
}

