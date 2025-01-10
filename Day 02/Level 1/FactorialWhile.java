import java.util.Scanner;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive ingteger ");
        int num = sc.nextInt();
        
        if(num > 0) {
            int factorial = 1;
            int i = 1;
            while (i <= num) {
                factorial *= i;
                i++;
            } 
            System.out.println("The factorial of " + num + " is " + factorial);
        }else{
            System.out.println(num + "is not a positive integer ");
        }
    }
}
