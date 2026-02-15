package shoppingcart;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to buy: ");
        String item = scanner.nextLine();
        System.out.print("What is the price for each: ");
        double price = scanner.nextDouble();
        System.out.print("How many would you like to buy: ");
        int quantity = scanner.nextInt();

        double totalPrice = price * quantity;

        System.out.print("You have bought " + quantity + " " + item + " and your total is $" +  totalPrice + ".");
    }
}
