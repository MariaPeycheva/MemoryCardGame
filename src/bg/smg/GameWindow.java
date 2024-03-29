package bg.smg;

import javax.swing.*;

import bg.smg.game.Card;
import bg.smg.game.Deck;
import bg.smg.game.Player;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class GameWindow extends JFrame {
	
	private JLabel deckLabel;
	private JLabel nameLabel;
	private JLabel scoreLabel;
	private JLabel timeLabel;
	
	private ArrayList<JButton> cardButtons;
    private ArrayList<Card> cards;
    private int[] selectedCards;
	private Player player;
	private Deck deck;
	private Timer timer;
	private int remainingSeconds = 100;
	private int cardsFound = 0;
	
	public GameWindow(String playerName, Deck deck) {
		player = new Player(playerName);
		cardButtons = new ArrayList<JButton>();
		cardButtons.ensureCapacity(20);
		this.deck = deck;
    	
    	cards = new ArrayList<Card>();
    	cards.ensureCapacity(20);
    	
    	for (int i = 0; i < 10; ++i)
    	{
    		cards.add(this.deck.getCards().get(i));
    		cards.add(this.deck.getCards().get(i));
    	}
		
    	selectedCards = new int[2];
    	selectedCards[0] = -1;
    	selectedCards[1] = -1;
		
        initUI();
        
		setVisible(true);
		
		timer = new Timer();
		
		timer.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				timerTick();
				
			}
		}, 1000, 1000);
	}
	
	private void initUI()
	{
		setTitle("Cards");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);   
		
		deckLabel = new JLabel("Cards");
		deckLabel.setBounds(0, 0, 790, 31);
		deckLabel.setHorizontalAlignment(SwingConstants.CENTER);
		deckLabel.setFont(new Font("Arial", Font.BOLD, 36));
		getContentPane().add(deckLabel);

		JPanel labelsPanel = new JPanel();
		labelsPanel.setBounds(0, 37, 790, 51);
		getContentPane().add(labelsPanel);
		labelsPanel.setLayout(new GridLayout(0, 3, 10, 0));

		nameLabel = new JLabel("Name: " + this.player.getName());
		labelsPanel.add(nameLabel);
		nameLabel.setFont(new Font("Arial", Font.PLAIN, 26));

		scoreLabel = new JLabel("Score: ");
		labelsPanel.add(scoreLabel);
		scoreLabel.setFont(new Font("Arial", Font.PLAIN, 26));

		timeLabel = new JLabel("Time: ");
		labelsPanel.add(timeLabel);
		timeLabel.setFont(new Font("Arial", Font.PLAIN, 26));
		timeLabel.setText("Time: " + Integer.toString(remainingSeconds));
		
		initButtons();
	}
	
	private void initButtons()
	{
		JButton btnCard1 = new JButton("");
		btnCard1.setBounds(30, 100, 100, 100);
		getContentPane().add(btnCard1);
		cardButtons.add(btnCard1);
		
		JButton btnCard2 = new JButton("");
		btnCard2.setBounds(190, 100, 100, 100);
		getContentPane().add(btnCard2);
		cardButtons.add(btnCard2);
		
		JButton btnCard3 = new JButton("");
		btnCard3.setBounds(350, 100, 100, 100);
		getContentPane().add(btnCard3);
		cardButtons.add(btnCard3);
		
		JButton btnCard4 = new JButton("");
		btnCard4.setBounds(510, 100, 100, 100);
		getContentPane().add(btnCard4);
		cardButtons.add(btnCard4);
		
		JButton btnCard5 = new JButton("");
		btnCard5.setBounds(670, 100, 100, 100);
		getContentPane().add(btnCard5);
		cardButtons.add(btnCard5);
		
		JButton btnCard6 = new JButton("");
		btnCard6.setBounds(30, 220, 100, 100);
		getContentPane().add(btnCard6);
		cardButtons.add(btnCard6);
		
		JButton btnCard7 = new JButton("");
		btnCard7.setBounds(190, 220, 100, 100);
		getContentPane().add(btnCard7);
		cardButtons.add(btnCard7);
		
		JButton btnCard8 = new JButton("");
		btnCard8.setBounds(350, 220, 100, 100);
		getContentPane().add(btnCard8);
		cardButtons.add(btnCard8);
		
		JButton btnCard9 = new JButton("");
		btnCard9.setBounds(510, 220, 100, 100);
		getContentPane().add(btnCard9);
		cardButtons.add(btnCard9);
		
		JButton btnCard10 = new JButton("");
		btnCard10.setBounds(670, 220, 100, 100);
		getContentPane().add(btnCard10);
		cardButtons.add(btnCard10);
		
		JButton btnCard11 = new JButton("");
		btnCard11.setBounds(30, 340, 100, 100);
		getContentPane().add(btnCard11);
		cardButtons.add(btnCard11);
		
		JButton btnCard12 = new JButton("");
		btnCard12.setBounds(190, 340, 100, 100);
		getContentPane().add(btnCard12);
		cardButtons.add(btnCard12);
		
		JButton btnCard13 = new JButton("");
		btnCard13.setBounds(350, 340, 100, 100);
		getContentPane().add(btnCard13);
		cardButtons.add(btnCard13);
		
		JButton btnCard14 = new JButton("");
		btnCard14.setBounds(510, 340, 100, 100);
		getContentPane().add(btnCard14);
		cardButtons.add(btnCard14);
		
		JButton btnCard15 = new JButton("");
		btnCard15.setBounds(670, 340, 100, 100);
		getContentPane().add(btnCard15);
		cardButtons.add(btnCard15);
		
		JButton btnCard16 = new JButton("");
		btnCard16.setBounds(30, 460, 100, 100);
		getContentPane().add(btnCard16);
		cardButtons.add(btnCard16);
		
		JButton btnCard17 = new JButton("");
		btnCard17.setBounds(190, 460, 100, 100);
		getContentPane().add(btnCard17);
		cardButtons.add(btnCard17);
		
		JButton btnCard18 = new JButton("");
		btnCard18.setBounds(350, 460, 100, 100);
		getContentPane().add(btnCard18);
		cardButtons.add(btnCard18);
		
		JButton btnCard19 = new JButton("");
		btnCard19.setBounds(510, 460, 100, 100);
		getContentPane().add(btnCard19);
		cardButtons.add(btnCard19);
		
		JButton btnCard20 = new JButton("");
		btnCard20.setBounds(670, 460, 100, 100);
		getContentPane().add(btnCard20);
		cardButtons.add(btnCard20);
		
		Path resourceDirectory = Paths.get("src","res");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
        
        GameWindow currentGameWindow = this;
		
		for(JButton b : cardButtons)
			b.setIcon(new ImageIcon(absolutePath + "/default/card_back.png"));
		
		for (JButton cb : cardButtons) {
        	cb.addActionListener(new ActionListener() {
        		@Override
        		public void actionPerformed(ActionEvent e)
        		{
        			int buttonIndex = cardButtons.indexOf(cb);
        			cb.setIcon(cards.get(buttonIndex).getIcon()); // ne raboti za vtorata karta poradi nqkva prichina
    				
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
        					setScore(player.getScore());
        					cardsFound += 2;
        					
        					if (cardsFound == 20)
        					{
        						setEnabled(false);
        						timer.cancel();
        						new GameWonWindow(currentGameWindow);
        					}
        					
        					cardButtons.get(selectedCards[0]).setEnabled(false);
        					cardButtons.get(selectedCards[0]).setVisible(false);
        					cb.setEnabled(false);
        					cb.setVisible(false);
        					
        					/*try {
								//Thread.sleep(1000);
								
	        					
	        					
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}*/

        					
        					selectedCards[0] = -1;
        					selectedCards[1] = -1;
        					
        				}
    					else
    					{
    						Path resourceDirectory = Paths.get("src","res");
    				        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
    				        
    				        cardButtons.get(selectedCards[0]).setIcon(new ImageIcon(absolutePath + "/default/card_back.png"));
    						cb.setIcon(new ImageIcon(absolutePath + "/default/card_back.png"));
    						selectedCards[0] = -1;
        					selectedCards[1] = -1;
    				        
    				        /*try {
								Thread.sleep(1000);
								
	    						
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}*/
    					}
    				}
        		}
        	});
        }
	}
	
	public String getPlayerName()
	{
		return player.getName();
	}
	
	public Deck getDeck()
	{
		return deck;
	}
	
	public void setScore(int score)
	{
		scoreLabel.setText("Score: " + Integer.toString(score));
	}
	
	private void timerTick()
	{
		if(remainingSeconds > 0)
		{
			remainingSeconds -= 1;
		}
		else
		{
			this.setEnabled(false);
			this.timer.cancel();
			new GameOverWindow(player.getScore(), this);	
		}
		
		timeLabel.setText("Time: " + Integer.toString(remainingSeconds));
	}
	
}