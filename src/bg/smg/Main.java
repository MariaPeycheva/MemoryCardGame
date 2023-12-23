package bg.smg;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // tiq gi napishi koga da se otvarqt
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainMenu();
            }
        });

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DeckMenu();
            }
        });


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameView();
            }
        });
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameOver();
            }
        });
    }
}
