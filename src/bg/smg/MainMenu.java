package bg.smg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MainMenu extends JFrame {

    public MainMenu() {
        setTitle("Memory Cards Game");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel titleLabel = new JLabel("Memory Cards Game");
        titleLabel.setBounds(200, 20, 400, 40);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 36));
        add(titleLabel);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(200, 100, 100, 40);
        nameLabel.setFont(new Font("Arial", Font.ITALIC, 30));
        add(nameLabel);

        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(320, 100, 200, 40);
        add(nameTextField);

        JButton newDeckButton = new JButton("New Deck");
        JButton donateButton = new JButton("Donate");
        JButton exitButton = new JButton("Exit");

        newDeckButton.setBounds(300, 200, 200, 60);
        donateButton.setBounds(300, 280, 200, 60);
        exitButton.setBounds(325, 380, 150, 40);
        newDeckButton.setFont(new Font("Arial", Font.PLAIN, 22));
        donateButton.setFont(new Font("Arial", Font.PLAIN, 22));
        exitButton.setFont(new Font("Arial", Font.PLAIN, 18));

        newDeckButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //trqbva da se otvarq new Deck menuto
            }
        });

        donateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MainMenu.this, "Congratulations, you paid 100 dollars!");
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(newDeckButton);
        add(donateButton);
        add(exitButton);

        setVisible(true);
    }

}