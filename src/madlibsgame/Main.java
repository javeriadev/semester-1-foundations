package madlibsgame;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String friendName;
        String animal;
        String insect;

        System.out.print("Enter one of your friend's name: ");
        friendName = scanner.nextLine();
        System.out.print("Enter an animal's name: ");
        animal = scanner.nextLine();
        System.out.print("Enter an insect's name: ");
        insect = scanner.nextLine();

        System.out.println("My friend " + friendName + " is like a " + animal + " and definitely eats " + insect + " for food.");
    }

}
