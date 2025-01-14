import java.util.Scanner;

public class TrimStringComparison {
    

        public static int[] trimSpaces(String text) {
            int start = 0, end = text.length() - 1;
            while (start <= end && text.charAt(start) == ' ') start++;
            while (end >= start && text.charAt(end) == ' ') end--;
            return new int[]{start, end};
        }
    
        public static String substring(String text, int start, int end) {
            StringBuilder sb = new StringBuilder();
            for (int i = start; i <= end; i++) sb.append(text.charAt(i));
            return sb.toString();
        }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces ");
        String text = sc.nextLine();

        int[] indexes = trimSpaces(text);
        String trimmedText = substring(text, indexes[0], indexes[1]);
        boolean isEqual = trimmedText.equals(text.trim());

        System.out.println("Trimmed text using charAt " + trimmedText);
        System.out.println("Trimmed text using built-in trim " + text.trim());
        System.out.println("Are both trims equal? " + isEqual);
    }
}


  

