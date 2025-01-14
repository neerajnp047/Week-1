import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2]; // Array for height and weight

        // Input height and weight
        System.out.println("Enter height (cm) and weight (kg) for 10 people:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            data[i][1] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            data[i][0] = sc.nextDouble();
        }

        // Display BMI Report
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------------");

        for (double[] person : data) {
            double height = person[1] / 100; // Convert cm to meters
            double bmi = person[0] / (height * height);
            String status = (bmi <= 18.4) ? "Underweight" : (bmi <= 24.9) ? "Normal" :
                            (bmi <= 39.9) ? "Overweight" : "Obese";
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", person[1], person[0], bmi, status);
        }

        sc.close();
    }
}
