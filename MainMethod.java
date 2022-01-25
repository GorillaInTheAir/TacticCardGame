package TacticalCardGame;


public class MainMethod {

	public static void main(String[] args) {
		Card x = Card.getCard("ComodoCharger");
		x.executeCombo();		
		
		Card y = Card.getCard("Truestrike");
		y.executeCombo();
		
		Card z = Card.getCard("SundropElixir");
		z.executeCombo();
	}

}
