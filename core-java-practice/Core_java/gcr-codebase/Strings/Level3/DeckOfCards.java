import java.util.Scanner;

public class DeckOfCards {

    public static String[] initializeDeck() {

        String[] suits = {
                "Hearts",
                "Diamonds",
                "Clubs",
                "Spades"
        };

        String[] ranks = {
                "2", "3", "4", "5", "6",
                "7", "8", "9", "10",
                "Jack", "Queen",
                "King", "Ace"
        };

        String[] deck =
                new String[suits.length * ranks.length];

        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] =
                        rank + " of " + suit;
            }
        }

        return deck;
    }

    public static void shuffle(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {

            int random =
                    i + (int) (Math.random()
                            * (n - i));

            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }
    }

    public static String[][] distributeCards(
            String[] deck,
            int players,
            int cardsPerPlayer) {

        String[][] result =
                new String[players][cardsPerPlayer];

        int cardIndex = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                result[i][j] = deck[cardIndex++];
            }
        }

        return result;
    }

    public static void printPlayers(
            String[][] players) {

        for (int i = 0; i < players.length; i++) {

            System.out.println(
                    "\nPlayer " + (i + 1));

            for (String card : players[i]) {
                System.out.println(card);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] deck = initializeDeck();

        shuffle(deck);

        System.out.print("Players: ");
        int players = sc.nextInt();

        System.out.print("Cards per Player: ");
        int cards = sc.nextInt();

        if (players * cards > 52) {
            System.out.println(
                    "Not enough cards.");
            return;
        }

        String[][] distributed =
                distributeCards(deck,
                        players,
                        cards);

        printPlayers(distributed);

        sc.close();
    }
}