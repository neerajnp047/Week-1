import java.util.Scanner;

public class AthleteRuns {
     public static double RoundsOfAthelete(double sideOne, double sideTwo, double sideThree){
        double distance = 5000;
        double perimeter = sideOne + sideTwo + sideThree;
        return  distance / perimeter;
     }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Side1");
        double sideOne = sc.nextInt();
        System.out.println("Enter a Side2");
        double sideTwo = sc.nextInt();
        System.out.println("Enter a Side3");
        double sideThree = sc.nextInt();

        double AthleteRuns = RoundsOfAthelete(sideOne, sideTwo, sideThree);

        System.out.println("The athlete needs to complete round " + AthleteRuns);
    }
          
}
