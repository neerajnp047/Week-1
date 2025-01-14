import java.util.Scanner;

public class CharacterFrequency {

    // Method to find and display character frequencies
    public static void findAndPrintFrequency(String text) {
        int[] freq = new int[256]; // Array for character frequencies

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Display characters and their frequencies
        System.out.println("Character frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + ": " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        findAndPrintFrequency(input); // Call the method to process and display

        scanner.close();
    }
}
