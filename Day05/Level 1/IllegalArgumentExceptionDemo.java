import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    public static void generateException(String text) {
        System.out.println("Generating exception...");
        System.out.println(text.substring(5, 3)); 
    }

    public static void handleException(String text) {
        try {
            System.out.println("Handling exception...");
            System.out.println(text.substring(5, 3)); 
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        handleException(input);
    }
}
