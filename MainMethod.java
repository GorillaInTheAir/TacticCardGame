package TacticalCardGame;


public class MainMethod {
	

	public static void main(String[] args) {
		
		// user has used ComodoCharger card.
		Card x = Card.getCard("ComodoCharger");
		x.executeCombo();		
		
		// user has used Truestrike card.
		Card y = Card.getCard("Truestrike");
		y.executeCombo();
		
		// user has used SundropElixir card.
		Card z = Card.getCard("SundropElixir");
		z.executeCombo();
	}
}
