package bankingprogram;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = 100;
        int choice;

        do {
            System.out.println("Banking program");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Your balance is " + balance);
            } else if (choice == 2) {
                balance = balance + deposit();
            } else if (choice == 3) {
                balance = balance - withdraw(balance);
            } else if (choice != 4) {
                System.out.println("Invalid choice. Try again");
            }
        } while (choice != 4);

        System.out.println("You have exited Banking program");
    }

    static double deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("Amount can not be negative.");
            return 0;
        } else {
            return amount;
        }
    }

    static double withdraw(double balance) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (balance < amount) {
            System.out.println("Insufficient balance.");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can not be negative.");
            return 0;
        } else {
            return amount;
        }
    }

}


