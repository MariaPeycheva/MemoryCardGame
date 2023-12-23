package bg.smg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameOver extends JFrame {
    public GameOver() {
        setTitle("Memory Cards Game");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel titleLabel = new JLabel("Game over");
        titleLabel.setBounds(250, 20, 400, 40);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 36));
        add(titleLabel);

        JLabel nameLabel = new JLabel("Name:" + getName());
        nameLabel.setBounds(250, 100, 100, 40);
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 26));
        add(nameLabel);

        JLabel scoreLabel = new JLabel("Score:" /*trqbva da se slozhi resultata*/);
        scoreLabel.setBounds(250, 160, 100, 40);
        scoreLabel.setFont(new Font("Arial", Font.PLAIN, 26));
        add(scoreLabel);

        JLabel timeLabel = new JLabel("Time:" /*trqbva da se slozhi vremeto*/);
        timeLabel.setBounds(250, 220, 100, 40);
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 26));
        add(timeLabel);

        JButton resetButton = new JButton("New Game");
        resetButton.setBounds(50, 320, 200, 40);

        JButton donateButton = new JButton("Donate");
        donateButton.setBounds(300, 320, 200, 40);

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(550, 320, 200, 40);

        resetButton.setFont(new Font("Arial", Font.PLAIN, 22));
        donateButton.setFont(new Font("Arial", Font.PLAIN, 22));
        exitButton.setFont(new Font("Arial", Font.PLAIN, 22));

        add(resetButton);
        add(donateButton);
        add(exitButton);

        donateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(GameOver.this, "Congratulations, you paid 100 dollars!");
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }
}