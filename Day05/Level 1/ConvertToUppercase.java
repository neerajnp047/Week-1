import java.util.Scanner;

public class ConvertToUppercase {

    public static String convertToUppercase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
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

        String uppercaseText = convertToUppercase(input);
        String builtinUppercase = input.toUpperCase();

        boolean isEqual = compareStrings(uppercaseText, builtinUppercase);

        System.out.println("Converted text using custom method " + uppercaseText);
        System.out.println("Converted text using built-in method " + builtinUppercase);
        System.out.println("Both result are same? " + isEqual);
    }
}
