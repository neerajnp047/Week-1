import java.util.Scanner;

public class StoreValues {
    public static void main(String[] args) {
        double[] values = new double[10];
        double sum = 0;
        int index = 0;
        Scanner sc = new Scanner(System.in);
        while (index < 10) {
            double input = sc.nextDouble();
            if (input <= 0) break;
            values[index++] = input;
        }
        for (int i = 0; i < index; i++) sum += values[i];
        System.out.println("The total value is " + sum);
    }
}
