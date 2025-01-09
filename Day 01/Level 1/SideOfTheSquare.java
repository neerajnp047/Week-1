import java.util.Scanner;
public class SideOfTheSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter perimeter of the Square: ");
        float perimeter = sc.nextFloat();
        float side = perimeter/4;
        System.out.print(" The length of the side is"+ side +"whose perimeter is" + perimeter);
    
}
}