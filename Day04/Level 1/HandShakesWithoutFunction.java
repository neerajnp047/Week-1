import java.util.Scanner;
public class HandShakesWithoutFunction{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter a number ");
    int numberOfStudents = sc.nextInt();
    int totalHandShakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
    System.out.println("Total possible handshakes: " + totalHandShakes);

    }   
}