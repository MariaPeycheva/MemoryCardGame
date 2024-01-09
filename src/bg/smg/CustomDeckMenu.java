package bg.smg;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

import bg.smg.game.Card;

public class CustomDeckMenu extends JFrame {

	private JButton addCardButton;
	private ArrayList<Card> cards;
	private JLabel[] cardLabels;
	JButton btnFinishDeck;
	JTextField deckNameTextField;

	public CustomDeckMenu() {
		cardLabels = new JLabel[10];
		cards = new ArrayList<Card>();
		cards.ensureCapacity(10); // 10 cards per deck

		this.setTitle("Create Custom Deck");
		this.setSize(800, 500);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel lblCreateCustomDeck = new JLabel("Create Custom Deck");
		lblCreateCustomDeck.setBounds(0, 1, 800, 52);
		lblCreateCustomDeck.setHorizontalAlignment(SwingConstants.CENTER);
		this.getContentPane().add(lblCreateCustomDeck);
		lblCreateCustomDeck.setFont(new Font("Arial", Font.BOLD, 28));

		JLabel lblNewLabel = new JLabel("Cards:");
		lblNewLabel.setBounds(37, 97, 116, 46);
		getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));

		JLabel deckNameLabel = new JLabel("Deck Name:");
		deckNameLabel.setBounds(37, 56, 161, 46);
		getContentPane().add(deckNameLabel);
		deckNameLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		deckNameLabel.setFont(new Font("Arial", Font.BOLD, 24));

		deckNameTextField = new JTextField(20);
		deckNameTextField.setBounds(216, 56, 206, 46);
		getContentPane().add(deckNameTextField);

		addCardButton = new JButton("Add Card");
		addCardButton.setBounds(578, 56, 161, 48);
		getContentPane().add(addCardButton);
		addCardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddCardMenu addCardMenu = new AddCardMenu();

				addCardMenu.getAddCardButton().addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						if (cards.size() < 10) {
						cards.add(new Card(addCardMenu.getCardName(), addCardMenu.getCardPoints(),
								addCardMenu.getCardIcon()));
						
							cardLabels[cards.size() - 1].setIcon(cards.get(cards.size() - 1).getIcon());
							cardLabels[cards.size() - 1].setVisible(true);
						}
						addCardMenu.dispose();
					}
				});

			}
		});
		addCardButton.setFont(new Font("Dialog", Font.BOLD, 12));

		JLabel lblCard1 = new JLabel("");
		lblCard1.setBounds(30, 160, 100, 100);
		getContentPane().add(lblCard1);
		cardLabels[0] = lblCard1;

		JLabel lblCard2 = new JLabel("");
		lblCard2.setBounds(190, 160, 100, 100);
		getContentPane().add(lblCard2);
		cardLabels[1] = lblCard2;
		
		JLabel lblCard3 = new JLabel("");
		lblCard3.setBounds(350, 160, 100, 100);
		getContentPane().add(lblCard3);
		cardLabels[2] = lblCard3;

		JLabel lblCard4 = new JLabel("");
		lblCard4.setBounds(510, 160, 100, 100);
		getContentPane().add(lblCard4);
		cardLabels[3] = lblCard4;
		
		JLabel lblCard5 = new JLabel("");
		lblCard5.setBounds(670, 160, 100, 100);
		getContentPane().add(lblCard5);
		cardLabels[4] = lblCard5;
		
		JLabel lblCard6 = new JLabel("");
		lblCard6.setBounds(30, 300, 100, 100);
		getContentPane().add(lblCard6);
		cardLabels[5] = lblCard6;
		
		JLabel lblCard7 = new JLabel("");
		lblCard7.setBounds(190, 300, 100, 100);
		getContentPane().add(lblCard7);
		cardLabels[6] = lblCard7;
		
		JLabel lblCard8 = new JLabel("");
		lblCard8.setBounds(350, 300, 100, 100);
		getContentPane().add(lblCard8);
		cardLabels[7] = lblCard8;
		
		JLabel lblCard9 = new JLabel("");
		lblCard9.setBounds(510, 300, 100, 100);
		getContentPane().add(lblCard9);
		cardLabels[8] = lblCard9;
		
		JLabel lblCard10 = new JLabel("");
		lblCard10.setBounds(670, 300, 100, 100);
		getContentPane().add(lblCard10);
		cardLabels[9] = lblCard10;
		
		for (JLabel cl : cardLabels)
		{
			cl.setVisible(false);
			
			
		}
		
		btnFinishDeck = new JButton("Finish Deck");
		btnFinishDeck.setBounds(434, 56, 132, 46);
		getContentPane().add(btnFinishDeck);
		
		

		this.setVisible(true);
	}

	public JButton getFinishDeckButton()
	{
		return btnFinishDeck;
	}
	
	public ArrayList<Card> getCards()
	{
		return cards;
	}
	
	public String getDeckName()
	{
		try {
			return deckNameTextField.getText();
		}catch (Exception e)
		{
			return "";
		}
	}
}
