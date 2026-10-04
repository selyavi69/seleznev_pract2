import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Poker9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        int n = scanner.nextInt();

        String[] suits = {
                "Черви(♥)",
                "Бубны(♦)",
                "Трефы(♣)",
                "Пики(♠)"
        };

        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Валет", "Дама", "Король", "Туз"
        };

        ArrayList<String> deck = new ArrayList<>();

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " " + suit);
            }
        }

        Collections.shuffle(deck);

        int cardsNeeded = n * 5;

        if (cardsNeeded > deck.size()) {
            System.out.println("Слишком много игроков.");
            return;
        }

        int cardIndex = 0;

        for (int player = 1; player <= n; player++) {

            System.out.println("Игрок " + player + ":");

            for (int card = 0; card < 5; card++) {
                System.out.println(deck.get(cardIndex));
                cardIndex++;
            }

            System.out.println();
        }
    }

}
