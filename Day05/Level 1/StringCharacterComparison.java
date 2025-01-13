import java.util.Scanner;

public class StringCharacterComparison {

    public static char[] getCharacters(String text) {
        char[] characters = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }
        return characters;
    }

    public static boolean compareCharArrays(char[] arry1, char[] arry2) {
        if (arry1.length != arry2.length) {
            return false;
        }
        for (int i = 0; i < arry1.length; i++) {
            if (arry1[i] != arry2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] charactersUsingMethod = getCharacters(text);
        char[] charactersUsingToCharArray = text.toCharArray();

        boolean areArraysEqual = compareCharArrays(charactersUsingMethod, charactersUsingToCharArray);

        System.out.println("Characters using user-defined method: " + new String(charactersUsingMethod));
        System.out.println("Characters using toCharArray() method: " + new String(charactersUsingToCharArray));

        if (areArraysEqual) {
            System.out.println("Both character arrays are equal ");
        } else {
            System.out.println("Both character arrays are not equal ");
        }
    }
}
