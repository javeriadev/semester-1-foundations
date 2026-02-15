package compoundinterestcalculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principle amount: ");
        double principalAmount = scanner.nextDouble();
        System.out.print("Enter the interest rate in %: ");
        double interestRate = scanner.nextDouble() / 100;
        System.out.print("Enter the number of times compounded per year: ");
        int compounded = scanner.nextInt();
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double compoundInterest = principalAmount * Math.pow((1 + interestRate/compounded), compounded*years);

        System.out.println("The compound interest is $" + compoundInterest);

    }
}

