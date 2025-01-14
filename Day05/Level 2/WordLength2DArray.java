import java.util.Scanner;

public class WordLength2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input text
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Split text and generate 2D array
        String[][] wordLengths = generateWordLengths(text);

        // Display results
        System.out.println("\nWord\tLength");
        for (String[] row : wordLengths) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    // Method to split text into words and calculate lengths
    public static String[][] generateWordLengths(String text) {
        int wordCount = 0, lastSpace = -1;

        for (int i = 0; i <= text.length(); i++)
            if (i == text.length() || text.charAt(i) == ' ') wordCount++;

        String[][] wordLengths = new String[wordCount][2];
        wordCount = 0;

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                String word = text.substring(lastSpace + 1, i).trim();
                wordLengths[wordCount][0] = word;
                wordLengths[wordCount][1] = String.valueOf(getLength(word));
                wordCount++;
                lastSpace = i;
            }
        }
        return wordLengths;
    }

    // Custom method to calculate string length
    public static int getLength(String str) {
        int count = 0;
        while (true) {
            try {
                str.charAt(count);
                count++;
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }
}
