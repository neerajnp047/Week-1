import java.util.Scanner;

public class DeckOfCards {

    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[52];
        for (int i = 0; i < suits.length; i++)
            for (int j = 0; j < ranks.length; j++)
                deck[i * ranks.length + j] = ranks[j] + " of " + suits[i];
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int r = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int n, int players) {
        String[][] hands = new String[players][n];
        for (int i = 0, index = 0; i < players; i++)
            for (int j = 0; j < n; j++)
                hands[i][j] = deck[index++];
        return hands;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter players: ");
        int players = sc.nextInt();
        System.out.print("Enter cards per player: ");
        int n = sc.nextInt();
        String[] deck = initializeDeck();
        if (players * n > deck.length) {
            System.out.println("Not enough cards!");
            return;
        }
        shuffleDeck(deck);
        String[][] hands = distributeCards(deck, n, players);
        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (String card : hands[i])
                System.out.println("  " + card);
        }
        sc.close();
    }
}
