package bg.smg;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
	
	private JLabel deckLabel;
	private JLabel nameLabel;
	private JLabel scoreLabel;
	private JLabel timeLabel;
	private JPanel cardsPanel;
	
	public GameWindow(String playerName) {
		setTitle("Cards");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);

		deckLabel = new JLabel("Cards");
		deckLabel.setHorizontalAlignment(SwingConstants.CENTER);
		springLayout.putConstraint(SpringLayout.NORTH, deckLabel, 0, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, deckLabel, 0, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, deckLabel, 43, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, deckLabel, 790, SpringLayout.WEST, getContentPane());
		deckLabel.setFont(new Font("Arial", Font.BOLD, 36));
		getContentPane().add(deckLabel);

		JPanel labelsPanel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, labelsPanel, 6, SpringLayout.SOUTH, deckLabel);
		springLayout.putConstraint(SpringLayout.WEST, labelsPanel, 0, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, labelsPanel, 92, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, labelsPanel, 790, SpringLayout.WEST, getContentPane());
		getContentPane().add(labelsPanel);
		labelsPanel.setLayout(new GridLayout(0, 3, 10, 0));

		nameLabel = new JLabel("Name: " + playerName);
		labelsPanel.add(nameLabel);
		nameLabel.setFont(new Font("Arial", Font.PLAIN, 26));

		scoreLabel = new JLabel("Score: ");
		labelsPanel.add(scoreLabel);
		scoreLabel.setFont(new Font("Arial", Font.PLAIN, 26));

		timeLabel = new JLabel("Time: ");
		labelsPanel.add(timeLabel);
		timeLabel.setFont(new Font("Arial", Font.PLAIN, 26));

		cardsPanel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, cardsPanel, 6, SpringLayout.SOUTH, labelsPanel);
		springLayout.putConstraint(SpringLayout.WEST, cardsPanel, 0, SpringLayout.WEST, deckLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, cardsPanel, -355, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, cardsPanel, -790, SpringLayout.EAST, getContentPane());
		getContentPane().add(cardsPanel);
		cardsPanel.setLayout(new GridLayout(1, 0, 0, 0));

		setVisible(true);
	}
	
	public void setScore(int score)
	{
		scoreLabel.setText("Score: " + Integer.toString(score));
	}
	
	public void setRemainingTime(int seconds)
	{
		timeLabel.setText("Time: " + Integer.toString(seconds));
	}
}