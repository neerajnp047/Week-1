import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter String 1: ");
        char[] str1 = scanner.nextLine().replaceAll("\\s+", "").toLowerCase().toCharArray();
        System.out.println("Enter String 2: ");
        char[] str2 = scanner.nextLine().replaceAll("\\s+", "").toLowerCase().toCharArray();
        
        java.util.Arrays.sort(str1);
        java.util.Arrays.sort(str2);

        System.out.println(java.util.Arrays.equals(str1, str2) ? "The strings are anagrams." : "The strings are not anagrams.");
        
        scanner.close();
    }
}
