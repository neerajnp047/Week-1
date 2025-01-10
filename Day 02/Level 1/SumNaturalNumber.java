import java.util.Scanner;
public class SumNaturalNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number ");
        int num = sc.nextInt();

        if(num>0){
            int sum = 0; 
            for (int i = 1; i<=num; i++){
                sum = sum + i;
            }
            int formulaSum = num*(num + 1) / 2;
            System.out.println("Sum using while loop " + num);
            System.out.println("Sum using formula " + formulaSum);
        }else {
            System.out.println(num + "is not a natural number");
        }

    }
}