import java.util.Random;
import java.util.Scanner;

public class Dice {
    private int value;

    public Dice() {
        value = 0;
    }

    public void roll() {
        Random rand = new Random();
        int random = rand.nextInt(6) + 1;
        value = random;

        if (value == 6) {
            System.out.println("Side 6 (Chakkaaaaa)");
        } else {
            System.out.println("Side: " + value + " (better luck next time)");
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int newValue) {
        value = newValue;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dice dice = new Dice();
        char check = 'y';

        while (check == 'y' || check == 'Y') {
            System.out.println("---------------------------------------------------");
            System.out.print("Do you want to roll the dice? (Y/N): ");
            check = scanner.next().charAt(0);
            if (check == 'Y' || check == 'y') {
                dice.roll();
                System.out.println("Do you want to roll the dice? Y/N");
            } else {
                System.out.println("Program exits");
            }
        }
        scanner.close();
    }
}

