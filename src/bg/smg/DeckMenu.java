package bg.smg;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;

public class DeckMenu extends JFrame {
	JButton customDeck1Button;
	JButton customDeck2Button;
	JButton customDeck3Button;
	JButton createDeckButton;

	public DeckMenu() {
		this.setTitle("Choose a Deck");
		this.setSize(800, 500);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel chooseDeckLabel = new JLabel("Choose a Deck:");
		chooseDeckLabel.setBounds(36, 5, 243, 33);
		getContentPane().add(chooseDeckLabel);
		chooseDeckLabel.setFont(new Font("Arial", Font.BOLD, 28));

		createDeckButton = new JButton("Create New Deck");
		createDeckButton.setBounds(294, 7, 190, 29);
		getContentPane().add(createDeckButton);
		createDeckButton.setFont(new Font("Dialog", Font.BOLD, 16));

		JLabel customDeckLabel = new JLabel("Custom Decks:");
		customDeckLabel.setBounds(529, 5, 235, 33);
		getContentPane().add(customDeckLabel);
		customDeckLabel.setFont(new Font("Arial", Font.BOLD, 28));

		customDeck1Button = new JButton("");
		customDeck1Button.setBounds(638, 54, 34, 10);
		getContentPane().add(customDeck1Button);
		customDeck1Button.setFont(new Font("Arial", Font.PLAIN, 18));

		customDeck2Button = new JButton("");
		customDeck2Button.setBounds(677, 54, 34, 10);
		getContentPane().add(customDeck2Button);

		customDeck2Button.setFont(new Font("Arial", Font.PLAIN, 18));

		customDeck3Button = new JButton("");
		customDeck3Button.setBounds(716, 54, 34, 10);
		getContentPane().add(customDeck3Button);

		customDeck3Button.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JPanel panelDefaultDecks = new JPanel();
		panelDefaultDecks.setBounds(10, 50, 283, 292);
		getContentPane().add(panelDefaultDecks);
				panelDefaultDecks.setLayout(new GridLayout(6, 1, 0, 20));
		
				JButton artistsButton = new JButton("Artists");
				panelDefaultDecks.add(artistsButton);
				artistsButton.setFont(new Font("Arial", Font.PLAIN, 18));
				JButton summerButton = new JButton("Summer");
				panelDefaultDecks.add(summerButton);
				summerButton.setFont(new Font("Arial", Font.PLAIN, 18));
				JButton schoolButton = new JButton("School");
				panelDefaultDecks.add(schoolButton);
				schoolButton.setFont(new Font("Arial", Font.PLAIN, 18));
				JButton animalsButton = new JButton("Animals");
				panelDefaultDecks.add(animalsButton);
				animalsButton.setFont(new Font("Arial", Font.PLAIN, 18));
				JButton carsButton = new JButton("Cars");
				panelDefaultDecks.add(carsButton);
				carsButton.setFont(new Font("Arial", Font.PLAIN, 18));
				JButton disneyButton = new JButton("Disney");
				panelDefaultDecks.add(disneyButton);
				disneyButton.setFont(new Font("Arial", Font.PLAIN, 18));

		this.setVisible(true);
	}

	public JButton getCreateDeckButton() {
		return createDeckButton;
	}
}