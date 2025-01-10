import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) numbers[i] = sc.nextInt();
        for (int n : numbers)
            System.out.println(n == 0 ? "Zero" : n > 0 ? n + (n % 2 == 0 ? " is positive and even" : " is positive and odd") : n + " is negative");
        System.out.println(numbers[0] == numbers[4] ? "First equals last" : numbers[0] > numbers[4] ? "First greater than last" : "First less than last");
    }
}
