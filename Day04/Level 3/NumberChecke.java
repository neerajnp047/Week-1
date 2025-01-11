public class NumberChecke {
    public static void main(String[] args) {
        int number = 21;
        int[] digits = storeDigits(number);
        System.out.println("Digit Count: " + digits.length);
        System.out.println("Digits: " + java.util.Arrays.toString(digits));
        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad Number: " + isHarshadNumber(number, digits));
        System.out.println("Digit Frequencies: " + java.util.Arrays.deepToString(findDigitFrequencies(digits)));
    }

    public static int[] storeDigits(int number) {
        return String.valueOf(number).chars().map(c -> c - '0').toArray();
    }

    public static int sumOfDigits(int[] digits) {
        return java.util.Arrays.stream(digits).sum();
    }

    public static int sumOfSquares(int[] digits) {
        return java.util.Arrays.stream(digits).map(d -> (int) Math.pow(d, 2)).sum();
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        return number % sumOfDigits(digits) == 0;
    }

    public static int[][] findDigitFrequencies(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }
}
