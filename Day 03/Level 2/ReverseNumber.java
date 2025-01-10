import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digitCount = 0;
        int temp = number;

        while (temp != 0) {
            digitCount++;
            temp /= 10;
        }

        int[] digits = new int[digitCount];
        int index = 0;

        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        System.out.print("Reversed number: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }
    }
}
