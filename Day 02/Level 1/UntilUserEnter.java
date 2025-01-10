import java.util.Scanner;

public class UntilUserEnter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        
        while(true){
            System.out.println("Enter a number or zero to stop ");
            double number = sc.nextInt();
            
            if(number <= 0){
                break;
            }
            total = total + number;
        }
        System.out.println("The total sum is: " + total);
    }
   
}