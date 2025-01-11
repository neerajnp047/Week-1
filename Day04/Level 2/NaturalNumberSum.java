import java.util.Scanner;

public class NaturalNumberSum {

    public static int recursiveSum(int n) {
        return (n == 1) ? 1 : n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number.");
            return;
        }
        int recursiveResult = recursiveSum(n);
        System.out.println("Sum using recursion " + recursiveResult);
        System.out.println("Sum using formula " + formulaSum(n));
        System.out.println(recursiveResult == formulaSum(n) ? "Both results are correct." : "There is an error.");
        sc.close();
    }
}
