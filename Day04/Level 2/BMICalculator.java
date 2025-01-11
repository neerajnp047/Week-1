import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        String[] statuses = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) and height (cm) for person " + (i + 1) + ":");
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble() / 100;
            double bmi = data[i][0] / (data[i][1] * data[i][1]);
            statuses[i] = bmi <= 18.4 ? "Underweight" : bmi <= 24.9 ? "Normal" : bmi <= 39.9 ? "Overweight" : "Obese";
        }

        System.out.println("Height (cm) | Weight (kg) | BMI       | Status");
        for (int i = 0; i < 10; i++) {
            double bmi = data[i][0] / (data[i][1] * data[i][1]);
            System.out.printf("%11.2f | %11.2f | %9.2f | %s%n", data[i][1] * 100, data[i][0], bmi, statuses[i]);
        }
    }
}
