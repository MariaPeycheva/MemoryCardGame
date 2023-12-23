package bg.smg;

import javax.swing.*;
import java.awt.*;

public class GameView extends JFrame {
    public GameView() {
        setTitle("Cards");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel deckLabel = new JLabel("Cards");
        deckLabel.setBounds(275, 20, 400, 40);
        deckLabel.setFont(new Font("Arial", Font.BOLD, 36));
        add(deckLabel);

        JLabel nameLabel = new JLabel("Name: ");
        nameLabel.setBounds(50, 70, 300, 40);
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 26));
        add(nameLabel);

        JLabel scoreLabel = new JLabel("Score: ");
        scoreLabel.setBounds(275, 70, 300, 40);
        scoreLabel.setFont(new Font("Arial", Font.PLAIN, 26));
        add(scoreLabel);

        JLabel timeLabel = new JLabel("Time: ");
        timeLabel.setBounds(500, 70, 300, 40);
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 26));
        add(timeLabel);

        setVisible(true);
    }
}