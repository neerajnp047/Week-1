import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a string ");
        String input = sc.nextLine();

        String revers = "";

        // Loop through the given input to the end of the string
        for (int i = input.length() - 1; i >= 0; i--) {
            revers += input.charAt(i);
        }

        // Displaying the reverse string
        System.out.println("The Reversed string " + revers);

        sc.close();
    }
}
