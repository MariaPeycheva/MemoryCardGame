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
                			int buttonIndex = cardButtons.indexOf(cb);
                			cb.setIcon(cards.get(buttonIndex).getIcon()); // ne raboti poradi nqkva prichina za vtorata karta
            				
            				if (selectedCards[0] < 0)
            				{
            					selectedCards[0] = buttonIndex;
            				}else if (selectedCards[1] < 0)
            				{
            					selectedCards[1] = buttonIndex;
            				}
            				
            				if (selectedCards[0] > -1 && selectedCards[1] > -1)
            				{
            					if(cards.get(selectedCards[0]).getName() == cards.get(selectedCards[1]).getName())
                				{
                					player.setScore(player.getScore() + cards.get(selectedCards[0]).getPoints());
                					gameWindow.setScore(player.getScore());
                					
                					cardButtons.get(selectedCards[0]).setEnabled(false);
                					cardButtons.get(selectedCards[0]).setVisible(false);
                					cb.setEnabled(false);
                					cb.setVisible(false);
                					
                					selectedCards[0] = -1;
                					selectedCards[1] = -1;
                					
                				}
            					else
            					{
            						Path resourceDirectory = Paths.get("src","res");
            				        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
            				        
            				        try {
										Thread.sleep(1000);
									} catch (InterruptedException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
            				        
            						cardButtons.get(selectedCards[0]).setIcon(new ImageIcon(absolutePath + "/default/card_back.png"));
            						cb.setIcon(new ImageIcon(absolutePath + "/default/card_back.png"));
            						selectedCards[0] = -1;
                					selectedCards[1] = -1;
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
