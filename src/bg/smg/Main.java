package bg.smg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import bg.smg.game.Card;
import bg.smg.game.Deck;
import bg.smg.game.Player;

public class Main {

	private static MainMenu mainMenu = null;
	private static DeckMenu deckMenu = null;
	private static GameWindow gameWindow = null;
	private static CustomDeckMenu customDeckMenu = null;

	private static Deck deck = null;

	public static void main(String[] args) {
		deck = Deck.newAnimalDeck();

		mainMenu = new MainMenu();

		mainMenu.getPlayButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mainMenu.setVisible(false);
				mainMenu.setEnabled(false);

				gameWindow = new GameWindow(mainMenu.getPlayerName(), deck);
			}
		});

		mainMenu.getChooseDeckButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				deckMenu = new DeckMenu();

				deckMenu.getCreateDeckButton().addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						customDeckMenu = new CustomDeckMenu();

						customDeckMenu.getFinishDeckButton().addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								ArrayList<Card> cards = customDeckMenu.getCards();

								if (cards.size() != 10) {
									JOptionPane.showMessageDialog(customDeckMenu,
											"The deck must have exactly 10 cards.");
								} else {
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
}
