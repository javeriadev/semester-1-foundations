package dicerollerprogram;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int total = 0;

        System.out.println("Enter the number of dices to roll: ");
        int dices = scanner.nextInt();

        for (int i=1; i<=dices; i++){
            int num = random.nextInt(1,7);
            System.out.println("You rolled: " + num );
            total += num;
        }

        System.out.println("Total is: " + total);
    }
}
