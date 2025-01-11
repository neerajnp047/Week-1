public class NumberCheckerFour {

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) count++;
        int[] factors = new int[count];
        for (int i = 1, index = 0; i <= number; i++) if (number % i == 0) factors[index++] = i;
        return factors;
    }

    public static int greatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 1];
    }

    public static int sumOfFactors(int number) {
        int sum = 0;
        for (int factor : findFactors(number)) sum += factor;
        return sum;
    }

    public static int productOfFactors(int number) {
        int product = 1;
        for (int factor : findFactors(number)) product *= factor;
        return product;
    }

    public static double productOfCubeOfFactors(int number) {
        double product = 1;
        for (int factor : findFactors(number)) product *= Math.pow(factor, 3);
        return product;
    }

    public static boolean isPerfectNumber(int number) {
        return sumOfFactors(number) - number == number;
    }

    public static boolean isAbundantNumber(int number) {
        return sumOfFactors(number) - number > number;
    }

    public static boolean isDeficientNumber(int number) {
        return sumOfFactors(number) - number < number;
    }

    public static boolean isStrongNumber(int number) {
        int sum = 0, temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    private static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) result *= i;
        return result;
    }

    public static void main(String[] args) {
        int number = 145;
        System.out.println("Factors: ");
        for (int factor : findFactors(number)) System.out.print(factor + " ");
        System.out.println("\nGreatest Factor: " + greatestFactor(number));
        System.out.println("Sum of Factors: " + sumOfFactors(number));
        System.out.println("Product of Factors: " + productOfFactors(number));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(number));
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));
    }
}
