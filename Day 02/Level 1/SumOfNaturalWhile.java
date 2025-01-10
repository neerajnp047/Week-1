import java.util.Scanner;
public class SumOfNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();

        if(num > 0){
            int formulaSum = num*(num + 1) / 2;
            int loopSum = 0;
            int i = 1;
            while (i <= num){
                loopSum += i;
                i++;
            }
            System.out.println("sum using the fromula " + formulaSum);
            System.out.println("sum using the while loop" + loopSum);

            if(formulaSum == loopSum){
                System.out.println("The result from both computations are correct ");
            }else  {
                System.out.println("The result from both computations are incorrect");
            }
        }else {
            System.out.println("The number " + num + " is not a natural number");
        }
        sc.close();
}
    }
    
