import java.util.Random;

public class EmployeeBonus {

    public static double[][] determineSalaryAndYears() {
        Random rand = new Random();
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = rand.nextInt(90000) + 10000; 
            data[i][1] = rand.nextInt(11); 
        }
        return data;
    }

    public static double[][] calculateNewSalaryAndBonus(double[][] data) {
        double[][] updatedData = new double[10][3];
        for (int i = 0; i < 10; i++) {
            double salary = data[i][0];
            int yearsOfService = (int) data[i][1];
            double bonus = (yearsOfService > 5) ? 0.05 * salary : (yearsOfService < 5) ? 0.02 * salary : 0;
            double newSalary = salary + bonus;
            updatedData[i][0] = newSalary;
            updatedData[i][1] = bonus;
            updatedData[i][2] = salary;
        }
        return updatedData;
    }

    public static void calculateTotals(double[][] updatedData) {
        double oldSalarySum = 0, newSalarySum = 0, totalBonus = 0;
        for (int i = 0; i < 10; i++) {
            oldSalarySum += updatedData[i][2];
            newSalarySum += updatedData[i][0];
            totalBonus += updatedData[i][1];
        }
        
        System.out.printf("%-15s%-15s%-15s%-15s\n", "Employee", "Old Salary", "New Salary", "Bonus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-15d%-15.2f%-15.2f%-15.2f\n", i + 1, updatedData[i][2], updatedData[i][0], updatedData[i][1]);
        }
        System.out.printf("\nTotal Old Salary: %.2f\nTotal New Salary: %.2f\nTotal Bonus: %.2f\n", oldSalarySum, newSalarySum, totalBonus);
    }

    public static void main(String[] args) {
        double[][] data = determineSalaryAndYears();
        double[][] updatedData = calculateNewSalaryAndBonus(data);
        calculateTotals(updatedData);
    }
}
