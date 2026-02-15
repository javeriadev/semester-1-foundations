package weightconverter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the weight converter!");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");

        System.out.print("Choose an option 1/2: ");
        int choice = scanner.nextInt();

        if (choice == 1){
            System.out.print("Enter weight in lbs: ");
            double lbs = scanner.nextDouble();
            double kgs = lbs * 0.454;
            System.out.println("Weight in kgs is: " + kgs);
        } else if (choice == 2){
            System.out.print("Enter weight in kgs: ");
            double kgs = scanner.nextDouble();
            double lbs = kgs * 2.2;
            System.out.println("Weight in lbs is: " + lbs);
        } else {
            System.out.println("Invalid choice.");
        }
    }
}


