package bg.smg;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import bg.smg.game.Card;
import bg.smg.game.Deck;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JComboBox;

public class DeckMenu extends JFrame {
	JButton createDeckButton;
	CustomDeckMenu customDeckMenu = null;
	JComboBox comboBoxDecks;
	JButton btnFinish;

	public DeckMenu() {
		this.setTitle("Choose a Deck");
		this.setSize(600, 200);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel chooseDeckLabel = new JLabel("Choose a Deck:");
		chooseDeckLabel.setBounds(41, 12, 243, 33);
		getContentPane().add(chooseDeckLabel);
		chooseDeckLabel.setFont(new Font("Arial", Font.BOLD, 28));

		comboBoxDecks = new JComboBox();
		comboBoxDecks.setMaximumRowCount(10);
		comboBoxDecks.setBounds(302, 12, 254, 33);
		comboBoxDecks.addItem(Deck.newAnimalDeck());
		getContentPane().add(comboBoxDecks);

		createDeckButton = new JButton("Create New Deck");
		createDeckButton.setBounds(41, 57, 190, 33);
		createDeckButton.setFont(new Font("Dialog", Font.BOLD, 16));

		createDeckButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (comboBoxDecks.getItemCount() >= 10)
					return;

				customDeckMenu = new CustomDeckMenu();

				customDeckMenu.getFinishDeckButton().addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						ArrayList<Card> cards = customDeckMenu.getCards();

						if (cards.size() != 10) {
							JOptionPane.showMessageDialog(customDeckMenu, "The deck must have exactly 10 cards.");
						} else {

							comboBoxDecks.addItem(new Deck(customDeckMenu.getDeckName(), cards));
							customDeckMenu.dispose();

						}
					}
				});
			}
		});

		getContentPane().add(createDeckButton);

		btnFinish = new JButton("Finish");
		btnFinish.setBounds(41, 111, 190, 33);
		getContentPane().add(btnFinish);

		this.setVisible(true);
	}

	public JButton getFinishButton() {
		return btnFinish;
	}

	public Deck getSelectedDeck() {
		return (Deck) comboBoxDecks.getSelectedObjects()[0];
	}
}