package seminar.max.seminar;

import seminar.max.seminar.exception.DeckEmptyException;

import java.util.List;

/**
 * Колода карт, состоит из 52 карт
 */
public class Deck {

    private final List<Card> cards;

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    //метод получения карты из колоды
    public Card getCard() throws DeckEmptyException {
        if (cards.isEmpty()) {
            throw new DeckEmptyException("Колода пустая");
        }
        Card result = cards.get(0);
        cards.remove(result);
        return result;
    }

    public List<Card> getCards() {
        return cards;
    }

}
