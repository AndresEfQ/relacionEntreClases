import Entities.Deck;
import Entities.Card;

import java.util.ArrayList;

public class SpanishDeckMain {

    public static void main(String[] args) {

        Deck deck = new Deck();
        System.out.println("Initial Deck");
        deck.showPile();
        deck.showDeck();
        System.out.println();
        System.out.println("Deck after being shuffled");
        deck.shuffle();
        deck.showDeck();
        System.out.println();
        System.out.println("Deck after giving cards");
        System.out.println();
        System.out.println("Given cards");
        ArrayList<Card> givenCards = deck.giveCards(15);
        System.out.println();
        System.out.println("Show pile");
        deck.showPile();
        System.out.println();
        System.out.println("Show deck");
        deck.showDeck();
    }
}
