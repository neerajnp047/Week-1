import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary and years of service for employee " + (i + 1) + ":");
            double sal = scanner.nextDouble();
            double yrs = scanner.nextDouble();

            if (sal <= 0 || yrs < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--;
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = yrs;
        }

        for (int i = 0; i < 10; i++) {
            bonus[i] = yearsOfService[i] > 5 ? salary[i] * 0.05 : salary[i] * 0.02;
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
