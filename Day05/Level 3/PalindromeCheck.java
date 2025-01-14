import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Compare characters from start and end
    public static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive palindrome check
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Compare original and reversed arrays
    public static boolean isPalindromeUsingArrays(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseArray(original);
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Helper method to reverse a char array
    public static char[] reverseArray(char[] arr) {
        char[] reversed = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Using Logic 1
        boolean resultIterative = isPalindromeIterative(text);
        System.out.println("Using Iterative Method: " + (resultIterative ? "Palindrome" : "Not a Palindrome"));

        // Using Logic 2
        boolean resultRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Using Recursive Method: " + (resultRecursive ? "Palindrome" : "Not a Palindrome"));

        // Using Logic 3
        boolean resultUsingArrays = isPalindromeUsingArrays(text);
        System.out.println("Using Character Arrays: " + (resultUsingArrays ? "Palindrome" : "Not a Palindrome"));

        scanner.close();
    }
}
