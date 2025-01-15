import java.util.Scanner;

public class ReplaceWord {

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input sentence and words to replace
        System.out.print("Enter a sentence ");
        String sentence = sc.nextLine();
        System.out.print("Enter the word to replace ");
        String oldWord = sc.nextLine();
        System.out.print("Enter the word to replace with ");
        String newWord = sc.nextLine();
        
        // Call the replaceWord method
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        // Display the modified sentence
        System.out.println("Modified Sentence " + modifiedSentence);

        sc.close();
    }
    
}
