package deckOfCards;

/**
 * 
 * @author weihaoqu
 *
 */
public enum Face {
		Ace(0),
		Two(1),
		Three(2),
		Four(3),
		Five(4),
		Six(5),
		Seven(6),
		Eight(7),
		Nine(8),
		Ten(9),
		Jack(10),
		Queue(11),
		King(12);
		
		private int val;
		
		private Face(int val){
			this.val=val;
		}
		public int getValue(){
			return this.val;
		}
		public static Face getFace(int v){
			Face retFace=null;
			switch (v) {
			case 0:
				retFace= Ace;
				break;
			case 1:
				retFace= Two;
				break;
			case 2:
				retFace= Three;
				break;
			case 3:
				retFace= Four;
				break;
			case 4:
				retFace= Five;
				break;
			case 5:
				retFace= Six;
				break;
			case 6:
				retFace= Seven;
				break;
			case 7:
				retFace= Eight;
				break;
			case 8:
				retFace= Nine;
				break;
			case 9:
				retFace= Ten;
				break;
			case 10:
				retFace= Jack;
				break;
			case 11:
				retFace= Queue;
				break;
			case 12:
				retFace=King;
				break;
				
			default:
				break;
			}
			return retFace;
		}
		
}
