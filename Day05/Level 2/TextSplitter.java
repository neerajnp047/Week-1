import java.util.Scanner;

public class TextSplitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input text
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Split using custom method and built-in split
        String[] customSplit = customSplitText(text);
        String[] builtInSplit = text.split("\\s+");

        // Compare results and display
        System.out.println("Custom Split: " + String.join(", ", customSplit));
        System.out.println("Built-in Split: " + String.join(", ", builtInSplit));
        System.out.println("Are results identical? " + compareArrays(customSplit, builtInSplit));
    }

    public static String[] customSplitText(String text) {
        int count = 0, lastSpace = -1;
        for (int i = 0; i <= text.length(); i++) 
            if (i == text.length() || text.charAt(i) == ' ') count++;
        
        String[] words = new String[count];
        count = 0;
        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                words[count++] = text.substring(lastSpace + 1, i).trim();
                lastSpace = i;
            }
        }
        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) 
            if (!arr1[i].equals(arr2[i])) return false;
        return true;
    }
}
