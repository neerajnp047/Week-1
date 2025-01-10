import java.util.Scanner;

public class YoungestFriend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Amar's age: ");
        int ageAmar = scanner.nextInt();
        System.out.print("Enter Amar's height: ");
        double heightAmar = scanner.nextDouble();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("Enter Akbar's height: ");
        double heightAkbar = scanner.nextDouble();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = scanner.nextInt();
        System.out.print("Enter Anthony's height: ");
        double heightAnthony = scanner.nextDouble();
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        if (youngestAge == ageAmar) {
            System.out.println("Youngest friend: Amar");
        } else if (youngestAge == ageAkbar) {
            System.out.println("Youngest friend: Akbar");
        } else {
            System.out.println("Youngest friend: Anthony");
        }
        if (tallestHeight == heightAmar) {
            System.out.println("Tallest friend: Amar");
        } else if (tallestHeight == heightAkbar) {
            System.out.println("Tallest friend: Akbar");
        } else {
            System.out.println("Tallest friend: Anthony");
        }

        scanner.close();
    }
}
