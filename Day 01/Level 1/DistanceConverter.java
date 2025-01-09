import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilometer;

        System.out.print("Enter the distance in kilometers: ");
        kilometer = input.nextDouble();

        double miles = kilometer / 1.6;

        System.out.println("The total miles is " + miles + " mile(s) for the given " + kilometer + " km.");

        input.close();
    }
}
