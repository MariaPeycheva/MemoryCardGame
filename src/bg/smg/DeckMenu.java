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

		JLabel label = new JLabel("");
		label.setBounds(284, 21, 0, 0);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("");
		label_1.setBounds(289, 21, 0, 0);
		getContentPane().add(label_1);

		createDeckButton = new JButton("Create New Deck");
		createDeckButton.setBounds(294, 7, 190, 29);
		getContentPane().add(createDeckButton);
		createDeckButton.setFont(new Font("Dialog", Font.BOLD, 16));

		JLabel label_2 = new JLabel("");
		label_2.setBounds(489, 21, 0, 0);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel("");
		label_3.setBounds(494, 21, 0, 0);
		getContentPane().add(label_3);

		JLabel label_4 = new JLabel("");
		label_4.setBounds(499, 21, 0, 0);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel("");
		label_5.setBounds(504, 21, 0, 0);
		getContentPane().add(label_5);

		JLabel label_6 = new JLabel("");
		label_6.setBounds(509, 21, 0, 0);
		getContentPane().add(label_6);

		JLabel label_7 = new JLabel("");
		label_7.setBounds(514, 21, 0, 0);
		getContentPane().add(label_7);

		JLabel label_8 = new JLabel("");
		label_8.setBounds(519, 21, 0, 0);
		getContentPane().add(label_8);

		JLabel label_9 = new JLabel("");
		label_9.setBounds(524, 21, 0, 0);
		getContentPane().add(label_9);

		JLabel customDeckLabel = new JLabel("Custom Decks:");
		customDeckLabel.setBounds(529, 5, 235, 33);
		getContentPane().add(customDeckLabel);
		customDeckLabel.setFont(new Font("Arial", Font.BOLD, 28));

		JButton artistsButton = new JButton("Artists");
		artistsButton.setBounds(49, 43, 89, 32);
		getContentPane().add(artistsButton);
		artistsButton.setFont(new Font("Arial", Font.PLAIN, 18));
		JButton summerButton = new JButton("Summer");
		summerButton.setBounds(143, 43, 109, 32);
		getContentPane().add(summerButton);
		summerButton.setFont(new Font("Arial", Font.PLAIN, 18));
		JButton schoolButton = new JButton("School");
		schoolButton.setBounds(257, 43, 92, 32);
		getContentPane().add(schoolButton);
		schoolButton.setFont(new Font("Arial", Font.PLAIN, 18));
		JButton animalsButton = new JButton("Animals");
		animalsButton.setBounds(354, 43, 102, 32);
		getContentPane().add(animalsButton);
		animalsButton.setFont(new Font("Arial", Font.PLAIN, 18));
		JButton carsButton = new JButton("Cars");
		carsButton.setBounds(461, 43, 73, 32);
		getContentPane().add(carsButton);
		carsButton.setFont(new Font("Arial", Font.PLAIN, 18));
		JButton disneyButton = new JButton("Disney");
		disneyButton.setBounds(539, 43, 94, 32);
		getContentPane().add(disneyButton);
		disneyButton.setFont(new Font("Arial", Font.PLAIN, 18));

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

		this.setVisible(true);
	}

	public JButton getCreateDeckButton() {
		return createDeckButton;
	}

}