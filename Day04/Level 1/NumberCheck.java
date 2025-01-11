import java.util.Scanner;

public class NumberCheck {
    public static String PositiveOrNegative(int num){
        if(num > 0){
            return "It is a Positive Number";
        }else if(num < 0){
            return"It is a Negative number";
        }else{
            return "It is zero";
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();

        String NumberCheck = PositiveOrNegative(num);

        System.out.println(NumberCheck);
    }
}
