import java.util.Scanner;

public class CompareTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter String 1 ");
        String str1 = sc.nextLine();
        System.out.println("Enter String 2 ");
        String str2 = sc.nextLine();

        int result = 0;
        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
            result = str1.charAt(i) - str2.charAt(i);
            if (result != 0) break;
        }
        if (result == 0) result = str1.length() - str2.length();
        
        System.out.println(result < 0 ? "\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order."
                                      : result > 0 ? "\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order."
                                      : "\"" + str1 + "\" is equal to \"" + str2 + "\".");
        sc.close();
    }
}
