import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Classify and display characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String type = (ch >= 'A' && ch <= 'Z') ? classifyChar((char)(ch + 32)) : classifyChar(ch);
            System.out.println(ch + "\t" + type);
        }
    }

    // Classify character as Vowel, Consonant, or Not a Letter
    public static String classifyChar(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return "aeiou".indexOf(ch) >= 0 ? "Vowel" : "Consonant";
        }
        return "Not a Letter";
    }
}
