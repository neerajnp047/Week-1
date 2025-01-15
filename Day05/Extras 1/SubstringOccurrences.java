import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string and substring from the user
        System.out.println("Enter a string ");
        String str = sc.nextLine();
        System.out.println("Enter the substring to count ");
        String substring = sc.nextLine();

        // Count occurrences of the substring
        int count = (str.length() - str.replace(substring, "").length()) / substring.length();

        // Displaying the result
        System.out.println("The substring \"" + substring + "\" occurs " + count + " times");

        sc.close();
    }
}
