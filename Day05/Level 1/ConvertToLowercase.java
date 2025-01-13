import java.util.Scanner;

public class ConvertToLowercase {
    public static String convertToLowercase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String lowercaseText = convertToLowercase(input);
        String builtinLowercase = input.toLowerCase();

        boolean isEqual = compareStrings(lowercaseText, builtinLowercase);

        System.out.println("Converted text using custom method: " + lowercaseText);
        System.out.println("Converted text using built-in method: " + builtinLowercase);
        System.out.println("Are both methods producing the same result? " + isEqual);
    }
}
