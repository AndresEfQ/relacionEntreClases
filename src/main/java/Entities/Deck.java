package Entities;

import java.util.ArrayList;
import java.util.Collections;

import Enum.Suit;
import Enum.CardNumber;

public class Deck {

    private ArrayList<Card> cards;
    private ArrayList<Card> pile;

    public Deck() {
        cards = new ArrayList<>();
        pile = new ArrayList<>();

        for (Suit suit : Suit.values()) {
            for (CardNumber number : CardNumber.values()) {
                cards.add(new Card(number, suit));
            }
        }
    }

    public ArrayList<Card> getCards() {
        return cards;
    }


    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card nextCard() {
        if (cards.isEmpty()) {
            System.out.println("There are no more cards");
            return null;
        }
        pile.add(cards.get(0));
        return cards.remove(0);
    }

    public int availableCards() {
        return cards.size();
    }

    public ArrayList<Card> giveCards(int requiredCards) {
        if (availableCards() < requiredCards) {
            System.out.println("There are no enough cards");
            return null;
        }
        ArrayList<Card> givenCards = new ArrayList<>();
        for (int i = 0; i < requiredCards; i++) {
            pile.add(cards.get(i));
            givenCards.add(cards.remove(i));
        }
        return givenCards;
    }

    public void showPile() {
        for (Card card : pile) {
            System.out.println(card);
        }
    }

    public void showDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }
}
