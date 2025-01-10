import java.util.Scanner;

public class FootballTeam {
    public static void main(String[] args) {
        double[] heights = new double[11];
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }
        System.out.println("Mean height: " + (sum / 11));
    }
}
