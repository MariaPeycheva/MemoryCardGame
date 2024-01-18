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
				deckMenu.getFinishButton().addActionListener(new ActionListener() { // moqt nemezis

					@Override
					public void actionPerformed(ActionEvent e) {
						deck = deckMenu.getSelectedDeck();
						deckMenu.dispose();
					} 
					
				});
			}
		});
	}
}
