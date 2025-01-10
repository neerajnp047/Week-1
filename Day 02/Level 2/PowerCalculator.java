import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(), power = scanner.nextInt();
        int result = 1;
        
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        
        System.out.println(result);
        scanner.close();
    }
}
