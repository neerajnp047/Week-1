import java.util.Scanner;

public class AnagramCheck {

    public static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) return false;
        int[] freq = new int[256];
        for (int i = 0; i < text1.length(); i++) {
            freq[text1.charAt(i)]++;
            freq[text2.charAt(i)]--;
        }
        for (int count : freq) {
            if (count != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();
        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();
        System.out.println(areAnagrams(text1, text2) ? "The texts are anagrams." : "The texts are not anagrams.");
        scanner.close();
    }
}
