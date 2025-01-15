import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input string and character to remove
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);
        
        // Remove all occurrences of the specified character
        String modifiedString = input.replaceAll(String.valueOf(ch), "");

        // Display the modified string
        System.out.println("Modified String: " + modifiedString);
        
        sc.close();
    }
}
