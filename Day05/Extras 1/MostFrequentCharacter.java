import java.util.Scanner;
import java.util.HashMap;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        char mostFrequentChar = '\0';
        int maxCount = 0;
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        for (char ch : input.toCharArray()) {
            int count = frequencyMap.getOrDefault(ch, 0) + 1;
            frequencyMap.put(ch, count);
            if (count > maxCount) {
                mostFrequentChar = ch;
                maxCount = count;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
        scanner.close();
    }
}
