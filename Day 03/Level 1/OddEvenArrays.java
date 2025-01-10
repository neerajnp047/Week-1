import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Error");
            return;
        }
        int[] evens = new int[number / 2 + 1];
        int[] odds = new int[number / 2 + 1];
        int evenIndex = 0, oddIndex = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) evens[evenIndex++] = i;
            else odds[oddIndex++] = i;
        }
        System.out.println("Odd numbers: " + java.util.Arrays.toString(java.util.Arrays.copyOf(odds, oddIndex)));
        System.out.println("Even numbers: " + java.util.Arrays.toString(java.util.Arrays.copyOf(evens, evenIndex)));
    }
}
