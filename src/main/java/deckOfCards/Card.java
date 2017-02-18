package deckOfCards;


public class Card {
		Suit suit;
		Face face;
		
		public Card(Suit s, Face f){
			suit=s;
			face=f;
			
		} 
		
		public Card(int s, int f){
			suit=Suit.getSuit(s);
			face=Face.getFace(f);
			
		} 
		public void displayCard(){
			System.out.println(suit+" "+face);
		}
		public String cardToString(){
			return suit.toString()+" "+ face.toString();
		}
		
		
}
