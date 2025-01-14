import java.util.Scanner;

public class ShortestLongestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input text
        System.out.print("Enter the text ");
        String text = sc.nextLine();

        // Process text
        String[] words = splitText(text);
        String[][] wordLengths = generateWordLengths(words);
        int[] result = findShortestLongest(wordLengths);

        // Display results
        System.out.println("\nWord\tLength");
        for (String[] row : wordLengths) System.out.println(row[0] + "\t" + row[1]);
        System.out.println("\nShortest " + wordLengths[result[0]][0] + " (" + wordLengths[result[0]][1] + ")");
        System.out.println("Longest " + wordLengths[result[1]][0] + " (" + wordLengths[result[1]][1] + ")");
    }

    // Split text into words without split()
    public static String[] splitText(String text) {
        int count = 0, last = -1;
        for (int i = 0; i <= text.length(); i++)
            if (i == text.length() || text.charAt(i) == ' ') count++;
        String[] words = new String[count];
        count = 0;
        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                words[count++] = text.substring(last + 1, i).trim();
                last = i;
            }
        }
        return words;
    }

    // Generate 2D array of words and lengths
    public static String[][] generateWordLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(words[i].chars().count());
        }
        return wordLengths;
    }

    // Find shortest and longest word indexes
    public static int[] findShortestLongest(String[][] wordLengths) {
        int shortest = 0, longest = 0;
        for (int i = 1; i < wordLengths.length; i++) {
            int len = Integer.parseInt(wordLengths[i][1]);
            if (len < Integer.parseInt(wordLengths[shortest][1])) shortest = i;
            if (len > Integer.parseInt(wordLengths[longest][1])) longest = i;
        }
        return new int[]{shortest, longest};
    }
}
