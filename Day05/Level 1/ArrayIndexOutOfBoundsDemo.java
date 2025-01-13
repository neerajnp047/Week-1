import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {


    public static void generateException(String[] names) {
        System.out.println("Generating exception...");
        System.out.println(names[names.length]);
    }
    public static void handleException(String[] names) {
        try {
            System.out.println("Handling exception...");
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of names:");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] names = new String[n];
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        handleException(names);
    }
}
