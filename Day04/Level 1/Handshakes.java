import java.util.Scanner;

public class Handshakes {
           public static int NumberOfShakes(int students){
                return (students*(students-1)) / 2;
           }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of Students");
            int students = sc.nextInt();

            int Handshakes = NumberOfShakes(students);

            System.out.println("The Number of Handshakes " + Handshakes);
        }
}
