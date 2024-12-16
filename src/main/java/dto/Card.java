package dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Data
@AllArgsConstructor
public class Card {

    private dto.DeckOfCards.Suit suit;
    private DeckOfCards.Rank rank;

    /**
     * 產生不含鬼牌牌組
     * @return
     */
    public static List<Card> createDeckWithoutJoker() {
        List<Card> deck = new ArrayList<>();
        for (DeckOfCards.Suit suit : DeckOfCards.Suit.values()) {
            if (suit.equals(DeckOfCards.Suit.JOKER)) {
                continue;
            }
            for (DeckOfCards.Rank rank : DeckOfCards.Rank.values()) {
                if (rank.equals(DeckOfCards.Rank.JOKER_BLACK) || rank.equals(DeckOfCards.Rank.JOKER_COLOR)) {
                    continue;
                }
                deck.add(new Card(suit, rank));
            }
        }
        return deck;
    }

    /**
     * 產生含鬼牌牌組
     * @return
     */
    public static List<Card> createDeckWithJoker() {
        List<Card> deck = createDeckWithoutJoker();
        deck.add(new Card(DeckOfCards.Suit.JOKER, DeckOfCards.Rank.JOKER_BLACK));
        deck.add(new Card(DeckOfCards.Suit.JOKER, DeckOfCards.Rank.JOKER_COLOR));
        return deck;
    }

    /**
     * 洗牌
     * @param cards
     * @return
     */
    public static List<Card> shuffle(List<Card> cards) {
        Collections.shuffle(cards, new Random());
        return cards;
    }
}
