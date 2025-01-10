import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int[] factors = new int[number];
        int index = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) factors[index++] = i;
        System.out.println("Factors: " + java.util.Arrays.toString(java.util.Arrays.copyOf(factors, index)));
    }
}
