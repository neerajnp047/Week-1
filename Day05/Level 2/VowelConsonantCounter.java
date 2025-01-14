import java.util.Scanner;

public class VowelConsonantCounter {

     // Count vowels and consonants
     public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) >= 0) vowels++;
                else consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string ");
        String text = sc.nextLine();

        // Count vowels and consonants
        int[] counts = countVowelsAndConsonants(text);

        // Display results
        System.out.println("Vowels " + counts[0] + "\nConsonants " + counts[1]);
    }
   
}
