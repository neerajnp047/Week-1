import java.util.Scanner;

public class SimpleInterest {
    public static double CalculatingSimpleInterest(double principal, double rate, double time){
        return (principal*rate*time) / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal ");
        double principal = sc.nextDouble();
        System.out.println("Enter the Rate ");
        double rate = sc.nextDouble();
        System.out.println("Enter the Time ");
        double time = sc.nextDouble();
    
        double SimpleInterest = CalculatingSimpleInterest(principal, rate, time);

        System.out.println("The Simple Interst is " + SimpleInterest + " for principal " + principal + " Rate of Interst " + rate + "and time " + time);
    }
}
