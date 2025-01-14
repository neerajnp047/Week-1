import java.util.Scanner;

public class LengthFinder {
    public static int findLength(String input){
        int count = 0;
        try{
            while(true){
                input.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e){

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.next();

        int customLength = findLength(input);
        
        int builtInLength = input.length();
        
        System.out.println("Length using custom method " + customLength);
        System.out.println("Length using built-in method " + builtInLength);
    }
}
