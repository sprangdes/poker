package org.example.poker;

import dto.Card;
import dto.DeckOfCards;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static dto.Card.*;
import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void testCreateDeckWithoutJoker() {
        List<Card> cards = createDeckWithoutJoker();
        assertNotNull(cards);
        assertEquals(52, cards.size());
    }

    @Test
    void testCreateDeckWithJoker() {
        List<Card> cards = createDeckWithJoker();
        assertNotNull(cards);
        assertEquals(54, cards.size());
    }

    @Test
    void testShuffle() {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(DeckOfCards.Suit.SPADES, DeckOfCards.Rank.ACE));
        cards.add(new Card(DeckOfCards.Suit.CLUBS, DeckOfCards.Rank.FIVE));
        cards.add(new Card(DeckOfCards.Suit.DIAMONDS, DeckOfCards.Rank.TEN));
        cards.add(new Card(DeckOfCards.Suit.HEARTS, DeckOfCards.Rank.JACK));
        cards.add(new Card(DeckOfCards.Suit.SPADES, DeckOfCards.Rank.QUEEN));
        System.out.println(cards);

        List<Card> shuffle_card = shuffle(cards);
        System.out.println(shuffle_card);
    }
}