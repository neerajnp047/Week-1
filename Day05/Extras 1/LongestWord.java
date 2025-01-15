import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a sentence ");
        String sent = sc.nextLine();

        // Split the sentence into words
        String[] words = sent.split("\\s+");
        String longest = "";

        // Finding the longest word
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        // The longest word
        System.out.println("The longest word is " + longest);

        sc.close();
    }
}
