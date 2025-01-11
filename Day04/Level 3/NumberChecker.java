public class NumberChecker {
    public static void main(String[] args) {
        int number = 153;
        int[] digits = storeDigits(number);
        System.out.println("Digit Count: " + digits.length);
        System.out.println("Digits: " + java.util.Arrays.toString(digits));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number, digits));
        System.out.println("Largest, Second Largest: " + java.util.Arrays.toString(findTwoLargest(digits)));
        System.out.println("Smallest, Second Smallest: " + java.util.Arrays.toString(findTwoSmallest(digits)));
    }

    public static int[] storeDigits(int number) {
        return String.valueOf(number).chars().map(c -> c - '0').toArray();
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) if (digits[i] == 0) return true;
        return false;
    }

    public static boolean isArmstrongNumber(int number, int[] digits) {
        return number == java.util.Arrays.stream(digits).map(d -> (int) Math.pow(d, digits.length)).sum();
    }

    public static int[] findTwoLargest(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max1) { max2 = max1; max1 = d; } 
            else if (d > max2) max2 = d;
        }
        return new int[]{max1, max2};
    }

    public static int[] findTwoSmallest(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min1) { min2 = min1; min1 = d; } 
            else if (d < min2) min2 = d;
        }
        return new int[]{min1, min2};
    }
}
