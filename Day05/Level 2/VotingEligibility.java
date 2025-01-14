import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of students (up to 10)
        System.out.print("Enter the number of students (max 10): ");
        int numStudents = sc.nextInt();

        if (numStudents <= 0 || numStudents > 10) return;

        int[] ages = new int[numStudents];
        for (int i = 0; i < numStudents; i++) ages[i] = (int) (Math.random() * 30) + 10;

        System.out.println("\nAge\tCan Vote?");
        System.out.println("---------------------");
        for (int age : ages) {
            String status = (age >= 18) ? "Can Vote" : "Cannot Vote";
            System.out.println(age + "\t" + status);
        }
    }
}
