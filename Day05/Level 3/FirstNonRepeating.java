import java.util.Scanner;

public class FirstNonRepeating {

    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeating(String text) {
        int[] freq = new int[256]; // Array to store frequency of each character

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Find the first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0'; // Return null character if no non-repeating character found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = findFirstNonRepeating(input);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}
