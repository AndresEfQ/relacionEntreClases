package Entities;

import Enum.CardNumber;
import Enum.Suit;

public class Card {
    private CardNumber number;
    private Suit suit;

    public Card(CardNumber number, Suit suit) {
        this.number = number;
        this.suit = suit;
    }

    public CardNumber getNumber() {
        return number;
    }

    public void setNumber(CardNumber number) {
        this.number = number;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return number + " of " + suit;
    }
}
