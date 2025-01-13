import java.util.Scanner;

public class CompareTwoStrings {

    public static boolean CompareingTheStrings(String str1, String str2){
        if(str1.length()!= str2.length()){
            return false;
        }
        for(int i = 0; i < str1.length(); i++){
        if(str1.charAt(i)!= str2.charAt(i)) {
            return false;
        }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string ");
        String str1 = sc.next();
        System.out.print("Enter the second string ");
        String str2 = sc.next();

        boolean compareusingCharAt = CompareingTheStrings(str1, str2);
        boolean stringequalto = str1.equals(str2);

        System.out.println("Comparing using charAt method " + compareusingCharAt);
        System.out.println("Comparing using equals method " + stringequalto);
        System.out.println("Result match " + (compareusingCharAt == stringequalto));
    }
}
