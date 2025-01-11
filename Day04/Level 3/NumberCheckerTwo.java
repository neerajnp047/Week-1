public class NumberCheckerTwo {
    public static void main(String[] args) {
        int number = 1221;
        int[] digits = storeDigits(number);
        int[] reversed = reverseDigits(digits);
        System.out.println("Digit Count: " + digits.length);
        System.out.println("Digits: " + java.util.Arrays.toString(digits));
        System.out.println("Reversed Digits: " + java.util.Arrays.toString(reversed));
        System.out.println("Are Digits Equal to Reversed: " + areArraysEqual(digits, reversed));
        System.out.println("Is Palindrome: " + isPalindrome(digits));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
    }

    public static int[] storeDigits(int number) {
        return String.valueOf(number).chars().map(c -> c - '0').toArray();
    }

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) 
            reversed[i] = digits[digits.length - 1 - i];
        return reversed;
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return java.util.Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int[] digits) {
        return areArraysEqual(digits, reverseDigits(digits));
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) 
            if (digits[i] == 0) return true;
        return false;
    }
}
