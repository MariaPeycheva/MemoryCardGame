package bg.smg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import bg.smg.game.Card;
import bg.smg.game.Deck;

public class Game {
    private MainMenu mainMenu = null;
    private DeckMenu deckMenu = null;
    private GameWindow gameWindow = null;
    private CustomDeckMenu customDeckMenu = null;
    
    
    private Player player = null;
    private Deck deck = null;
    private GameState state = GameState.MainMenu;

    public Game()
    {
        mainMenu = new MainMenu();
        
        mainMenu.getPlayButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	mainMenu.setVisible(false);
                mainMenu.setEnabled(false);
                
                gameWindow = new GameWindow(mainMenu.getPlayerName());
                state = GameState.InGame;
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
