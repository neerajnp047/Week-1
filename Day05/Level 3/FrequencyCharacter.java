import java.util.Scanner;

public class FrequencyCharacter {

    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        char[] unique = new char[text.length()];
        int uniqueIndex = 0;

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueIndex; j++) {
                if (unique[j] == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique[uniqueIndex++] = current;
            }
        }

        // Trim the array to size
        char[] result = new char[uniqueIndex];
        System.arraycopy(unique, 0, result, 0, uniqueIndex);
        return result;
    }

    // Method to find character frequencies
    public static String[][] findFrequency(String text) {
        char[] uniqueChars = uniqueCharacters(text);
        String[][] frequencyData = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == ch) {
                    count++;
                }
            }

            frequencyData[i][0] = String.valueOf(ch);
            frequencyData[i][1] = String.valueOf(count);
        }

        return frequencyData;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] frequencies = findFrequency(input);

        System.out.println("Character frequencies:");
        for (String[] entry : frequencies) {
            System.out.println(entry[0] + ": " + entry[1]);
        }

        scanner.close();
    }
}
