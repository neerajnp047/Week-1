import java.util.Scanner;
public class UnitPrice {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the unit price in INR: ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter the quantity to be bought: ");
        double Quantity = input.nextDouble();
        double totalPrice = unitPrice * Quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + Quantity + " and unit price is INR " + unitPrice + ".");
        input.close();
    }
}
