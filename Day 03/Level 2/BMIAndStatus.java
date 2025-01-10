import java.util.Scanner;

public class BMIAndStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number of persons
        System.out.print("Enter number of persons: ");
        int n = scanner.nextInt();

        // Multi-dimensional array to store height, weight, and BMI
        double[][] personData = new double[n][3];
        // Array to store weight status
        String[] weightStatus = new String[n];

        // Loop to take input for weight and height, and calculate BMI
        for (int i = 0; i < n; i++) {
            // Input weight
            do {
                System.out.print("Enter weight for person " + (i + 1) + " (in kg): ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Please enter a positive value for weight.");
                }
            } while (personData[i][1] <= 0);

            // Input height
            do {
                System.out.print("Enter height for person " + (i + 1) + " (in meters): ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Please enter a positive value for height.");
                }
            } while (personData[i][0] <= 0);

            // Calculate BMI and store it in personData array
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determine weight status
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] < 40.0) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display height, weight, BMI, and status for each person
        System.out.println("\nPerson\tHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s\n", (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
