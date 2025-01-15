import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string to check it is palindrome: ");
        String input = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println(input.equals(reversed) 
            ? "Yes, it is a palindrome." 
            : "No, it is not a palindrome.");

        sc.close();
    }
}
