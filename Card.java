package TacticalCardGame;

import java.util.*;

//Java program implementing Singleton class
//with using  getInstance() method    
public abstract class Card{
	private int id; 		 // unique identifier for the card
	
	private String cardname; // Card name
	
	private int manacost;	 // mana cost for the card
	
	/*
	MiniCard miniCard; 	   	// information about the card visualisation in the player hand
	
	BigCard bigCard;		 // information about the card preview window visualisation
	*/
	
	public abstract void executeCombo();


//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< ADD CARDS TO MAP <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	private static Map<String, Card> cardMap = new HashMap<String, Card>();
	
	private static Map<String, Card> setCard() {
		ComodoCharger.setInstance();
		Truestrike.setInstance();
		SundropElixir.setInstance();
		return cardMap;
	}

	public static Card getCard(String cardname) {
		return setCard().get(cardname);
	}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


	
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< CLASSES FOR CARDS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	private static class ComodoCharger extends Card {
		int id; 		 // unique identifier for the card
		
		String cardname; // Card name
		
		int manacost;	 // mana cost for the card
		
		private ComodoCharger() {
		}

		// Static variable reference of single_instance
		// of type Card
		private static Card single_instance = null;

		public void executeCombo() {
			// drawUnit()
			// setPlayer1Mana()
			// ...
			System.out.println("execute drawUnit( , int unitKindID) ..."
					+ "setPlayer1Mana() ...");
		}

		public static void setInstance() {
			if (single_instance == null)
				single_instance = new ComodoCharger();

			cardMap.put("ComodoCharger", single_instance);
		}
	}
	
	
	private static class Truestrike extends Card {
		int id; 		 // unique identifier for the card
		
		String cardname; // Card name
		
		int manacost;	 // mana cost for the card
		
		private Truestrike() {
		}

		// Static variable reference of single_instance
		// of type Card
		private static Card single_instance = null;

		public void executeCombo() {
			// setUnitHealth()
			// setPlayer1Mana()
			// ...
			System.out.println("execute setUnitHealth( , int 0) ..."
					+ "setPlayer1Mana() ...");
		}

		public static void setInstance() {
			if (single_instance == null)
				single_instance = new Truestrike();

			cardMap.put("Truestrike", single_instance);
		}
	}

	private static class SundropElixir extends Card {
		int id; 		 // unique identifier for the card
		
		String cardname; // Card name
		
		int manacost;	 // mana cost for the card
		
		private SundropElixir() {
		}

		// Static variable reference of single_instance
		// of type Card
		private static Card single_instance = null;

		public void executeCombo() {
			System.out.println("execute setPlayer1Health( ,int health+2) ..."
					+ "setPlayer1Mana() ...");
		}

		public static void setInstance() {
			if (single_instance == null)
				single_instance = new SundropElixir();

			cardMap.put("SundropElixir", single_instance);
		}
	}

}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>