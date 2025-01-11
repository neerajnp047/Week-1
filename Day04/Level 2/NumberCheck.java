import java.util.Scanner;

public class NumberCheck {

    public static String isPositive(int num) {
        return num >= 0 ? "Positive" : "Negative";
    }

    public static String isEven(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 < num2) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            System.out.println(isPositive(numbers[i]));
            if (numbers[i] >= 0) {
                System.out.println(isEven(numbers[i]));
            }
        }

        int result = compare(numbers[0], numbers[4]);
        if (result > 0) {
            System.out.println("First number is greater than the last number.");
        } else if (result < 0) {
            System.out.println("First number is less than the last number.");
        } else {
            System.out.println("First and last numbers are equal.");
        }

        sc.close();
    }
}
