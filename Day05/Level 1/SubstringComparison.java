import java.util.Scanner;

public class SubstringComparison {

    public static String createSubstringUsingCharAt(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(text.charAt(i));
        }
        return substring.toString();
    }
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text ");
        String text = sc.next();
        System.out.print("Enter the start index ");
        int start = sc.nextInt();
        System.out.print("Enter the end index ");
        int end = sc.nextInt();
        String substringUsingCharAt = createSubstringUsingCharAt(text, start, end);
        String substringUsingBuiltIn = text.substring(start, end);
        boolean areStringsEqual = compareStrings(substringUsingCharAt, substringUsingBuiltIn);
        System.out.println("Substring using charAt " + substringUsingCharAt);
        System.out.println("Substring using substring " + substringUsingBuiltIn);
        System.out.println("Both the substring equal " + areStringsEqual);
    }
}
