import java.util.Scanner;

public class CharacterFrequencyThree {

    // Method to find character frequencies using nested loops
    public static String[] findFrequency(String text) {
        char[] characters = text.toCharArray(); // Convert string to char array
        int[] freq = new int[characters.length]; // Frequency array

        // Outer loop to traverse each character
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') { // Skip already counted characters
                freq[i] = 1; // Initialize frequency
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        freq[i]++;
                        characters[j] = '0'; // Mark as counted
                    }
                }
            }
        }

        // Prepare results
        int uniqueCount = 0;
        for (char c : characters) {
            if (c != '0') uniqueCount++;
        }

        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[index++] = characters[i] + ": " + freq[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] frequencies = findFrequency(input);

        System.out.println("Character frequencies:");
        for (String entry : frequencies) {
            System.out.println(entry);
        }

        scanner.close();
    }
}
