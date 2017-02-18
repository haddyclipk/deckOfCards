package deckOfCards;

/**
 * 
 * @author weihaoqu
 *
 */
public enum Suit {
	HEART(0), SPADE(1), CLUB(2), DIAMOND(3);

	private int val;

	private Suit(int val) {
		this.val = val;
	}

	public int getValue() {
		return this.val;
	}

	public static Suit getSuit(int v) {
		Suit retSuit = null;
		switch (v) {
		case 0:
			retSuit = HEART;
			break;
		case 1:
			retSuit = SPADE;
			break;
		case 2:
			retSuit = CLUB;
			break;
		case 4:
			retSuit = DIAMOND;
			break;
		default:
			break;
		}
		return retSuit;
	}
}
