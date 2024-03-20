import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("----------------------------------------------------------\n");
        System.out.println("Enter the weight (in kilograms):");

        double weight = input.nextDouble();
        System.out.println("----------------------------------------------------------\n");
        System.out.println("Enter the height (in meters):");

        double height = input.nextDouble();

        // The formula for BMI is weight in kilograms divided by height in meters squared
        double bodyMassIndex = weight / (height * height);

        System.out.println("----------------------------------------------------------\n");
        System.out.println("The Body Mass Index is " + bodyMassIndex);

        // Categorizing the BMI
        if (bodyMassIndex < 18.5) {
            System.out.println("You are Underweight.");
        } else if (bodyMassIndex >= 18.5 && bodyMassIndex <= 24.9) {
            System.out.println("You have Normal weight.");
        } else if (bodyMassIndex >= 25 && bodyMassIndex <= 29.9) {
            System.out.println("You are Overweight.");
        } else {
            System.out.println("You are Obese.");
        }

        Khan khan = new Khan();
        khan.printStart();
    }
}

class Khan {
    public void printStart() {
        System.out.println("Khan class has started.");
    }
}
