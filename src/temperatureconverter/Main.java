package temperatureconverter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the temperature converter!");

        System.out.print("Enter the temperature: ");
        double temp = scanner.nextDouble();

        System.out.print("Convert to celsius (C) or fahrenheit (F): ");
        String choice = scanner.next().toUpperCase();

        double celsius = (temp - 32) * 5/9;
        double fahrenheit = (temp * 5/9) + 32;

        double result = (choice.equals("C")) ? celsius : fahrenheit;

        System.out.println("The result is: " + result);
    }
}

