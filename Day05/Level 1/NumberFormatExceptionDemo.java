import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String input) {
        System.out.println("Generating exception...");
        int number = Integer.parseInt(input);
        System.out.println("Number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String input) {
        try {
            System.out.println("Handling exception...");
            int number = Integer.parseInt(input);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Uncomment the following line to run and observe the exception
        // generateException(input);
        handleException(input);
    }
}
