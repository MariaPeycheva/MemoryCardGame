package bg.smg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeckMenu extends JFrame {
    public DeckMenu() {
        setTitle("Memory Cards Game");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel deckLabel = new JLabel("Deck Menu");
        deckLabel.setBounds(275, 20, 400, 40);
        deckLabel.setFont(new Font("Arial", Font.BOLD, 36));
        add(deckLabel);

        JLabel chooseDeckLabel = new JLabel("Choose a deck:");
        chooseDeckLabel.setBounds(50, 70, 300, 40);
        chooseDeckLabel.setFont(new Font("Arial", Font.PLAIN, 26));
        add(chooseDeckLabel);

        JLabel specialEditionLabel = new JLabel("Special edition:");
        specialEditionLabel.setBounds(275, 70, 300, 40);
        specialEditionLabel.setFont(new Font("Arial", Font.PLAIN, 26));
        add(specialEditionLabel);

      /*ImageIcon artistsIcon = new ImageIcon("resources/artistsmain.png");
        ImageIcon summerIcon = new ImageIcon("resources/summermain.png");
        ImageIcon schoolIcon = new ImageIcon("resources/schoolmain.png");
        ImageIcon animalsIcon = new ImageIcon("resources/animalsmain.png");
        ImageIcon carsIcon = new ImageIcon("resources/carsmain.png");
        ImageIcon disneyIcon = new ImageIcon("resources/disneymain.png");
        ImageIcon christmasIcon = new ImageIcon("resources/schristmasmain.png");
        ImageIcon easterIcon = new ImageIcon("resources/eastrermain.png");
        ImageIcon halloweenIcon = new ImageIcon("resources/halloweenmain.png");
        ImageIcon valentinesIcon = new ImageIcon("resources/valentinesmain.png");
        ImageIcon tsvetnitsaIcon = new ImageIcon("resources/tsvetnitsamain.png");
        ImageIcon motherIcon = new ImageIcon("resources/mothersmain.png");*/

        JButton artistsButton = new JButton("Artists");
        JButton summerButton = new JButton("Summer");
        JButton schoolButton = new JButton("School");
        JButton animalsButton = new JButton("Animals");
        JButton carsButton = new JButton("Cars");
        JButton disneyButton = new JButton("Disney");
        JButton christmasButton = new JButton("Christmas");
        JButton easterButton = new JButton("Easter");
        JButton halloweenButton = new JButton("Halloween");
        JButton valentinesButton = new JButton("St. Valentines");
        JButton tsvetnitsaButton = new JButton("Tsvetnitsa");
        JButton motherButton = new JButton("Mother's day");
        // JButton backButton = new JButton("Back");
        JButton donateButton = new JButton("Donate");

        artistsButton.setBounds(50, 120, 170, 45);
        summerButton.setBounds(50, 175, 170, 45);
        schoolButton.setBounds(50, 230, 170, 45);
        animalsButton.setBounds(50, 285, 170, 45);
        carsButton.setBounds(50, 340, 170, 45);
        disneyButton.setBounds(50, 395, 170, 45);

        christmasButton.setBounds(275, 120, 170, 45);
        easterButton.setBounds(275, 175, 170, 45);
        halloweenButton.setBounds(275, 230, 170, 45);
        valentinesButton.setBounds(275, 285, 170, 45);
        tsvetnitsaButton.setBounds(275, 340, 170, 45);
        motherButton.setBounds(275, 395, 170, 45);

        // backButton.setBounds(550, 150, 170, 60);
        donateButton.setBounds(550, 250, 170, 60);

        donateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(DeckMenu.this, "Congratulations, you paid 100 dollars!");
            }
        });

        add(artistsButton);
        add(summerButton);
        add(schoolButton);
        add(animalsButton);
        add(carsButton);
        add(disneyButton);
        add(christmasButton);
        add(easterButton);
        add(halloweenButton);
        add(valentinesButton);
        add(tsvetnitsaButton);
        add(motherButton);
        // add(backButton);
        add(donateButton);

        setVisible(true);

    }
}