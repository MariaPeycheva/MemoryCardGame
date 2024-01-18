package bg.smg.game;

import java.awt.Image;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Deck {
	private String name;
	private ArrayList<Card> cards;
	private ImageIcon cardBackImage;
	
	public Deck(String name, ArrayList<Card> cards)
	{
		if(cards.size() != 10)
			throw new RuntimeException("A deck must contain exactly 10 cards.");
		
		this.name = name;
		this.cards = cards;
		
		cardBackImage = new ImageIcon(System.getProperty("user.dir") + "res/default/card_back.png");
	}
	
	public static Deck newAnimalDeck()
	{
		ArrayList<Card> cards = new ArrayList<Card>();
		cards.ensureCapacity(10);
		
		Path resourceDirectory = Paths.get("src","res");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
		
		cards.add(new Card("Elephant", 10, new ImageIcon(
				new ImageIcon(absolutePath + "/default/animal_deck/elephant.png").
				getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT))));
		cards.add(new Card("Lion", 20, new ImageIcon(
				new ImageIcon(absolutePath + "/default/animal_deck/lion.png").
				getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT))));
		cards.add(new Card("Kangaroo", 30, new ImageIcon(
				new ImageIcon(absolutePath + "/default/animal_deck/kangaroo.png").
				getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT))));
		cards.add(new Card("Bird", 40, new ImageIcon(
				new ImageIcon(absolutePath + "/default/animal_deck/bird.png").
				getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT))));
		cards.add(new Card("Frog", 50, new ImageIcon(
				new ImageIcon(absolutePath + "/default/animal_deck/frog.png").
				getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT))));
		cards.add(new Card("Cow", 60, new ImageIcon(
				new ImageIcon(absolutePath + "/default/animal_deck/cow.png").
				getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT))));
		cards.add(new Card("Fish", 70, new ImageIcon(
				new ImageIcon(absolutePath + "/default/animal_deck/fish.png").
				getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT))));
		cards.add(new Card("Penguin", 80, new ImageIcon(
				new ImageIcon(absolutePath + "/default/animal_deck/penguin.png").
				getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT))));
		cards.add(new Card("Snake", 90, new ImageIcon(
				new ImageIcon(absolutePath + "/default/animal_deck/snake.png").
				getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT))));
		cards.add(new Card("Cockroach", 100, new ImageIcon(
				new ImageIcon(absolutePath + "/default/animal_deck/cockroach.png").
				getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT))));
		
		return new Deck("Animal Deck", cards);
	}
	
	public ArrayList<Card> getCards(){
		return this.cards;
	}
	
	public ImageIcon getCardBackIcon() {
		return this.getCardBackIcon();
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
