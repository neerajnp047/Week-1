import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string from the user
        System.out.println("Enter a string ");
        String input = sc.nextLine();

        // Toggle case of each character
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(Character.toUpperCase(ch));
            }
        }

        // Display the modified string
        System.out.println("String after toggling case " + result);

        sc.close();
    }
}
