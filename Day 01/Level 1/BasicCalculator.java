import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = sc.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number2 != 0 ? number1 / number2 : Double.NaN; // Handle division by zero

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
                            + number1 + " and " + number2 + " is:");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + (number2 != 0 ? division : "Undefined (division by zero)"));
        sc.close();
    }
}
