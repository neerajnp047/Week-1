import java.util.Scanner;

public class FactorOperations {

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) count++;
        int[] factors = new int[count];
        for (int i = 1, index = 0; i <= number; i++) if (number % i == 0) factors[index++] = i;
        return factors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);
        int sum = 0, product = 1;
        double sumOfSquares = 0;

        System.out.print("Factors: ");
        for (int factor : factors) {
            sum += factor;
            product *= factor;
            sumOfSquares += Math.pow(factor, 2);
            System.out.print(factor + " ");
        }

        System.out.println("\nSum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
        
        sc.close();
    }
}
