package bg.smg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import bg.smg.game.Card;
import bg.smg.game.Deck;
import bg.smg.game.Player;

public class Game {
    private MainMenu mainMenu = null;
    private DeckMenu deckMenu = null;
    private GameWindow gameWindow = null;
    private CustomDeckMenu customDeckMenu = null;
    
    private Player player = null;
    private Deck deck = null;
    private GameState state = GameState.MainMenu;
    private ArrayList<Card> cards;
    private int[] selectedCards;
    
    public Game()
    {
    	deck = Deck.newAnimalDeck();
    	cards = new ArrayList<Card>();
    	cards.ensureCapacity(20);
    	selectedCards = new int[2];
    	selectedCards[0] = -1;
    	selectedCards[1] = -1;
    	
    	for (int i = 0; i < 10; ++i)
    	{
    		cards.add(deck.getCards().get(i));
    		cards.add(deck.getCards().get(i));
    	}
    	
        mainMenu = new MainMenu();
        
        mainMenu.getPlayButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	mainMenu.setVisible(false);
                mainMenu.setEnabled(false);
                
                state = GameState.InGame;
                gameWindow = new GameWindow(mainMenu.getPlayerName(), deck);
                player = new Player(mainMenu.getPlayerName());
                ArrayList<JButton> cardButtons = gameWindow.getCardButtons(); // Tova e otvratitelno kato dizain, boli me surceto
                
                for (JButton cb : cardButtons) {
                	cb.addActionListener(new ActionListener() {
                		@Override
                		public void actionPerformed(ActionEvent e)
                		{
                			if (selectedCards[0] < 0 || selectedCards[1] < 0)
                			{
                				int buttonIndex = cardButtons.indexOf(cb);
                				if (selectedCards[0] < 0)
                					selectedCards[0] = buttonIndex;
                				else if (selectedCards[1] < 0)
                					if (buttonIndex != selectedCards[0])
                						selectedCards[1] = buttonIndex;
                					else
                						return;
                				else
                					return;
                				
                				cb.setIcon(cards.get(buttonIndex).getIcon());
                				cb.updateUI();
                				
                				if (selectedCards[0] > -1 && selectedCards[1] > -1 && cards.get(selectedCards[0]).getName() == cards.get(selectedCards[1]).getName())
                				{
                					player.setScore(player.getScore() + cards.get(selectedCards[0]).getPoints());
                					cb.setVisible(false);
                					cb.setEnabled(false);
                					cardButtons.get(selectedCards[0]).setVisible(false);
                					cardButtons.get(selectedCards[0]).setEnabled(false);
                					
                					selectedCards[0] = -1;
                					selectedCards[1] = -1;
                					
                					gameWindow.setScore(player.getScore());
                					
                				}
                				
                			}
                		}
                	});
                }
            }
        });
        
        mainMenu.getChooseDeckButton().addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
        		state = GameState.DeckSelection;
            	deckMenu = new DeckMenu();
            	
            	deckMenu.getCreateDeckButton().addActionListener(new ActionListener() {
            		@Override
                    public void actionPerformed(ActionEvent e) {
            			state = GameState.DeckCreation;
            			customDeckMenu = new CustomDeckMenu();
            			
            			customDeckMenu.getFinishDeckButton().addActionListener(new ActionListener() {
            				@Override
            	            public void actionPerformed(ActionEvent e) {
            	            	ArrayList<Card> cards = customDeckMenu.getCards();
            	            	
            	            	if (cards.size() != 10) {
            	            		JOptionPane.showMessageDialog(customDeckMenu, "The deck must have exactly 10 cards.");
            	            	}
            	            	else
            	            	{
            	            		deck = new Deck(customDeckMenu.getDeckName(), cards);
            	            		customDeckMenu.dispose();
            	            	}
            	            }
            			});
                    }
            	});
            	
            	
            }
        });
        
    }

    enum GameState {
    	MainMenu,
    	DeckSelection,
    	DeckCreation,
    	InGame
    }
    
    public void run()
    {
        
    }
}
