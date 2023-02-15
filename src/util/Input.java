package util;

import java.util.Scanner;

public class Input {


    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();

    }

    public boolean Yesno() {
        String input = scanner.nextLine();

        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        int number = getInt();
        while (number < min || number > max) {
        System.out.printf("Please enter an integer between %d and %d ", min, max);
        number = getInt();

    } return number;


}
    public int getInt() {
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Enter a valid integer");
        }

        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double number = getDouble();
        while (number < min || number > max);
         {
            System.out.printf("Please enter a decimal between %.2f and %.2f: ", min, max);
            number = getDouble();

        }
        return number;

    }

    public double getDouble() {
        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.println("Enter a valid Decimal");
        }

        return scanner.nextDouble();
    }
}



