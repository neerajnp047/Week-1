import java.util.Scanner;
public class AreaOfTriangle {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Height");
		double height= input.nextDouble();
		double heightInFoot=height/(12*2.54);
		double heightInInch=height/2.54;
    System.out.println("Your Height in cm is "+ height + " while in feet is " + heightInFoot+ " and inches is"+ heightInInch);
}
}