
import java.util.Scanner;

public class EnhancedCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enhanced Calculator");
            System.out.println("1. Basic Arithmetic Operations");
            System.out.println("2. Scientific Calculations");
            System.out.println("3. Unit Conversions");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    basicOperations(scanner);
                    break;
                case 2:
                    scientificCalculations(scanner);
                    break;
                case 3:
                    unitConversions(scanner);
                    break;
                case 4:
                    System.out.println("Exiting Calculator.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    public static void basicOperations(Scanner scanner) {
        System.out.println("Basic Operations:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose operation: ");
        int opChoice = scanner.nextInt();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result;

        switch (opChoice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation choice.");
        }
    }

    public static void scientificCalculations(Scanner scanner) {
        System.out.println("Scientific Calculations:");
        System.out.println("1. Square Root");
        System.out.println("2. Exponentiation");
        System.out.print("Choose calculation: ");
        int scChoice = scanner.nextInt();

        switch (scChoice) {
            case 1:
                System.out.print("Enter number: ");
                double num = scanner.nextDouble();
                if (num >= 0) {
                    System.out.println("Square Root: " + Math.sqrt(num));
                } else {
                    System.out.println("Error: Negative input for square root.");
                }
                break;
            case 2:
                System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter exponent: ");
                double exponent = scanner.nextDouble();
                System.out.println("Result: " + Math.pow(base, exponent));
                break;
            default:
                System.out.println("Invalid scientific calculation choice.");
        }
    }

    public static void unitConversions(Scanner scanner) {
        System.out.println("Unit Conversions:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose conversion: ");
        int ucChoice = scanner.nextInt();

        switch (ucChoice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println("Temperature in Celsius: " + celsius);
                break;
            default:
                System.out.println("Invalid conversion choice.");
        }
    }
}