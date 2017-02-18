package deckOfCardTest;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import deckOfCards.Deck;

/**
 * 
 * @author weihaoqu
 *
 */
public class DeckTest {
	private static Deck deckOfCards;
	
	@BeforeClass
	public static void initial(){
		deckOfCards=new Deck();
	}
	
	@Test
	public void NoShuffle(){
		System.out.println("Noshuffle PART:");
		deckOfCards.refill();
		for(int i=0; i<52; ++i){
		    System.out.println(i+": "+deckOfCards.dealOneCard().cardToString());
		    
			}
		assertNull(deckOfCards.dealOneCard());
		
	}
	@Test
	public void shuffle(){
		System.out.println("SHUFFLE:");
		deckOfCards.refill();
		deckOfCards.shuffle();
		for(int i=0; i<52; ++i){
		    System.out.println(i+": "+deckOfCards.dealOneCard().cardToString());
		    
			}
		assertNull(deckOfCards.dealOneCard());
		
	}
	
	@Test
	public void shuffleInHalfWay(){
		System.out.println("Shuffle half way part:");
		deckOfCards.refill();
		deckOfCards.shuffle();
		for(int i=0; i<26; ++i){
		    System.out.println(i+": "+deckOfCards.dealOneCard().cardToString());
		    
			}
		deckOfCards.shuffle();
		for(int i=0; i<26; ++i){
		    System.out.println(i+": "+deckOfCards.dealOneCard().cardToString());
		    
			}
		assertNull(deckOfCards.dealOneCard());
		
	}
	
	@AfterClass
	public static void finishedTest(){}
}
