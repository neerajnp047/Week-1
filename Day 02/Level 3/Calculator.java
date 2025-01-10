import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number ");
        double num2 = sc.nextDouble();

        System.out.print("Enter the operator  ");
        String op = sc.next();

        switch (op) {
            case "+":
                System.out.println("Result: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Result: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Result: " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Not be divisible ");
                }
                break;
            default:
                System.out.println("Invalid Operator.");
        }
    }
}
