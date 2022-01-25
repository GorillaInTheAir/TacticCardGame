package TacticalCardGame;


public class usage {

	public static void main(String[] args) {
//		new Card();
//		System.out.println(Card.cardMap);
		Card x = Card.getCard("Troll");
		x.barking();
		Card y = Card.getCard("Ghost");
		y.barking();
	}

}
