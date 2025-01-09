import java.util.Scanner;
public class DistanceInYard {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance ");
        float distanceInInch = sc.nextFloat();
        System.out.print(" Your Height in yard is "+ distanceInInch/3 +" while in mile is " + distanceInInch/(3*1760)+"and inches is"+distanceInInch);
    }
}