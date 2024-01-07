package bg.smg.game;

import java.util.ArrayList;

public class Deck {
	private String name;
	private ArrayList<Card> cards;
	
	public Deck(String name, ArrayList<Card> cards)
	{
		if(cards.size() != 10)
			throw new RuntimeException("A deck must contain exactly 10 cards.");
		
		this.name = name;
		this.cards = cards;
	}
}
