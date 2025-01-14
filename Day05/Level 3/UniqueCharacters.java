import java.util.Scanner;

public class UniqueCharacters {

    // Method to calculate the length of a string without using length()
    public static int calculateLength(String text) {
        int length = 0;
        while (true) {
            try {
                text.charAt(length);
                length++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return length;
    }

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int length = calculateLength(text);
        char[] unique = new char[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < index; j++) {
                if (unique[j] == current) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) unique[index++] = current;
        }

        char[] result = new char[index];
        System.arraycopy(unique, 0, result, 0, index);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] uniqueChars = findUniqueCharacters(input);

        System.out.println("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }

        sc.close();
    }
}
