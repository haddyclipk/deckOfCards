package deckOfCards;

import java.util.Collections;
import java.util.LinkedList;

/**
 * 
 * @author weihaoqu
 *
 */

public class Deck {
	private LinkedList<Card> cards;

	public Deck() {
		cards = new LinkedList<Card>();
		refill();
	}

	public void shuffle() {
		Collections.shuffle(cards);

	}

	public Card dealOneCard() {
		if (!cards.isEmpty())
			return cards.pop();
		else
			return null;
	}

	public boolean isEmpty() {
		return cards.isEmpty();
	}

	public void refill() {
		if (isEmpty()) {
			fill();
		} else { // not empty, but want to refill the deck, simply discard rest
					// cards and fill again
			cards = new LinkedList<Card>();
			fill();
		}
	}

	private void fill() {
		for (Suit s : Suit.values()) {
			for (Face f : Face.values()) {
				cards.offer(new Card(s, f));
			}
		}
	}
}
