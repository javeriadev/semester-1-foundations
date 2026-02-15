package calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Enter an operator (+,-,*,/): ");
        String operator = scanner.next();

        switch (operator) {
            case "+" -> { double add = firstNumber + secondNumber;
                System.out.println("The result is: " + add);
                break;}
            case "-" -> { double subtract = firstNumber - secondNumber;
                System.out.println("The result is: " + subtract);
                break;}
            case "*" -> { double multiply = firstNumber * secondNumber;
                System.out.println("The result is: " + multiply);
                break;}
            case "/" -> {
                if (secondNumber == 0) {
                    System.out.println("Second number can not be zero");
                } else {
                    double divide = firstNumber / secondNumber;
                    System.out.println("The result is: " + divide);
                }
                break;}
            default -> {
                System.out.println("Invalid choice.");}
        }
    }
}

