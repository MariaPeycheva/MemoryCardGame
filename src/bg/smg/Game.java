package bg.smg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Game {
    private Player player = null;
    private MainMenu mainMenu = null;
    private DeckMenu deckMenu = null;


    public Game()
    {
        mainMenu = new MainMenu();
        
        mainMenu.getPlayButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	mainMenu.setVisible(false);
                mainMenu.setEnabled(false);
            }
        });
        
        mainMenu.getNewDeckButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				deckMenu = new DeckMenu();
				deckMenu.setVisible(true);
				deckMenu.setEnabled(true);
			}
		});
    }

    public void run()
    {
        
    }
}
