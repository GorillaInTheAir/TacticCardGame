package TacticalCardGame;

import java.util.*;

//Java program implementing Singleton class
//with using  getInstance() method

//Class 1
//Helper class

    
	 public abstract class Card {
		
		 public abstract void barking();
		 
		 private static Map<String, Card> cardMap = new HashMap<String, Card>();
		 
		 private static Map<String, Card> setCard() {
			 Troll.setInstance();
			 Ghost.setInstance();
			 return cardMap;
		 }
		 
		 public static Card getCard(String cardname) {
			 return setCard().get(cardname);
		 }
		
		 private static class Troll extends Card{
			 private Troll() {}
			 
			 // Static variable reference of single_instance
			 // of type Card
			 private static Card single_instance = null;
			 
			 public void barking() {
				 System.out.println("barrrrrrrrrk");
			 }
			 
			 public static void setInstance()
			 {
			     if (single_instance == null)
			    	 single_instance = new Troll();
			
				 cardMap.put("Troll", single_instance);
			 }
		 }
		 
		 private static class Ghost extends Card{
			 private Ghost() {}
			 
			 // Static variable reference of single_instance
			 // of type Card
			 private static Card single_instance = null;
			 
			 public void barking() {
				 System.out.println("baooooooooook");
			 }
			 
			 public static void setInstance()
			 {
			     if (single_instance == null)
			    	 single_instance = new Ghost();
			
				 cardMap.put("Ghost", single_instance);
			 }
		 }
		 
	}
