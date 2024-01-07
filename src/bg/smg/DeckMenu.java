package bg.smg;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class DeckMenu {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Deck Chooser");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(240, 240, 240));
        frame.getContentPane().add(panel);
        placeComponents(panel);
        
        JButton customDeck1Button = new JButton("");
        customDeck1Button.setFont(new Font("Arial", Font.PLAIN, 18));
        customDeck1Button.setBounds(317, 120, 170, 45);
        panel.add(customDeck1Button);
        
        JButton customDeck2Button = new JButton("");
     
        
        customDeck2Button.setFont(new Font("Arial", Font.PLAIN, 18));
        customDeck2Button.setBounds(317, 175, 170, 45);
        panel.add(customDeck2Button);
        
        JButton customDeck3Button = new JButton("");
       
        customDeck3Button.setFont(new Font("Arial", Font.PLAIN, 18));
        customDeck3Button.setBounds(317, 230, 170, 45);
        panel.add(customDeck3Button);

 
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JButton artistsButton = new JButton("Artists");
        artistsButton.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton summerButton = new JButton("Summer");
        summerButton.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton schoolButton = new JButton("School");
        schoolButton.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton animalsButton = new JButton("Animals");
        animalsButton.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton carsButton = new JButton("Cars");
        carsButton.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton disneyButton = new JButton("Disney");
        disneyButton.setFont(new Font("Arial", Font.PLAIN, 18));
       
        artistsButton.setBounds(50, 120, 170, 45);
        summerButton.setBounds(50, 175, 170, 45);
        schoolButton.setBounds(50, 230, 170, 45);
        animalsButton.setBounds(50, 285, 170, 45);
        carsButton.setBounds(50, 340, 170, 45);
        disneyButton.setBounds(50, 395, 170, 45);

       
     
        JLabel chooseDeckLabel = new JLabel("Choose a Deck:");
        chooseDeckLabel.setFont(new Font("Arial", Font.BOLD, 28));
        chooseDeckLabel.setBounds(12, 30, 243, 65);
        panel.add(chooseDeckLabel);

        JLabel customDeckLabel = new JLabel("Custom Decks:");
        customDeckLabel.setFont(new Font("Arial", Font.BOLD, 28));
        customDeckLabel.setBounds(280, 40, 243, 45);
        panel.add(customDeckLabel);

 
        JButton createDeckButton = new JButton("Create New Deck");
        createDeckButton.setFont(new Font("Dialog", Font.BOLD, 16));
        createDeckButton.setBounds(547, 197, 208, 78);
        panel.add(createDeckButton);

        JButton donateButton = new JButton("Donate");
        donateButton.setFont(new Font("Arial", Font.PLAIN, 18));
        donateButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        donateButton.setBounds(547, 298, 206, 78);
        panel.add(donateButton);

        
        panel.add(artistsButton);
        panel.add(summerButton);
        panel.add(schoolButton);
        panel.add(animalsButton);
        panel.add(carsButton);
        panel.add(disneyButton);
     
        
    }
}