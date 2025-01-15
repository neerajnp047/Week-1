import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string ");
        String input = sc.nextLine();

        StringBuilder result = new StringBuilder();
        input.chars().distinct().forEach(c -> result.append((char) c));

        System.out.println("After removing duplicates " + result);

        sc.close();
    }
}
