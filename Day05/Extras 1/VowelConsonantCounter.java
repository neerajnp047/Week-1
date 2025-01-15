import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Variables to hold the counts
        int vowels = 0, consonants = 0;

        // Convert the input string to lowercase for easy comparison
        input = input.toLowerCase();

        // Loop through the characters of the string
        for (char ch : input.toCharArray()) {
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            // Check if the character is a consonant
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        // Display the counts
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

        sc.close();
    }
}
