// ... (same imports as before)

import java.util.Scanner;

public class TimeCalculatorApp {

    private static final String PROMPT_DISTANCE = "Enter the distance (in kilometers): ";
    private static final String PROMPT_SPEED = "Enter the speed (in km/h): ";
    private static final String RESULT_TEMPLATE = "Time required to cover %.2f km at %.2f km/h is %.2f hours.%n";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double distance = promptForPositiveDouble(scanner, PROMPT_DISTANCE);
            double speed = promptForPositiveDouble(scanner, PROMPT_SPEED);

            double time = TimeCalculator.calculateTime(distance, speed);
            displayResult(distance, speed, time);
        }
    }

    private static double promptForPositiveDouble(Scanner scanner, String promptMessage) {
        double value = -1;
        while (value <= 0) {
            System.out.print(promptMessage);
            try {
                value = Double.parseDouble(scanner.nextLine());
                if (value <= 0) {
                    System.out.println("Value must be greater than zero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }
        return value;
    }

    private static void displayResult(double distance, double speed, double time) {
        System.out.printf(RESULT_TEMPLATE, distance, speed, time);
    }
}
