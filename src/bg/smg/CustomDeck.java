package bg.smg;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class CustomDeck {
	 public static void main(String[] args) {
	        // Create the main frame
	        JFrame frame = new JFrame("Create Custom Deck");
	        frame.setSize(800, 500);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().setLayout(new GridLayout(4, 1, 0, 0));
	        
	        JLabel lblCreateCustomDeck = new JLabel("Create Custom Deck");
	        lblCreateCustomDeck.setHorizontalAlignment(SwingConstants.CENTER);
	        frame.getContentPane().add(lblCreateCustomDeck);
	        lblCreateCustomDeck.setFont(new Font("Arial", Font.BOLD, 28));
	        	        	        
	        	        	        JPanel panel = new JPanel();
	        	        	        frame.getContentPane().add(panel);
	        	        	        	        panel.setLayout(new GridLayout(2, 2, 10, 20));
	        	        	        
	        	        	        JPanel panel_1 = new JPanel();
	        	        	        panel.add(panel_1);
	        	        	        	        panel_1.setLayout(new GridLayout(0, 2, 0, 0));
	        	        	        
	        	        	        	        JLabel deckNameLabel = new JLabel("Deck Name:");
	        	        	        	        deckNameLabel.setHorizontalAlignment(SwingConstants.TRAILING);
	        	        	        	        panel_1.add(deckNameLabel);
	        	        	        	        deckNameLabel.setFont(new Font("Arial", Font.BOLD, 24));
	        	        	        	        
	        	        	        	        	        JTextField deckNameTextField = new JTextField(20);
	        	        	        	        	        panel_1.add(deckNameTextField);
	        	        	        
	        	        	        JLabel lblNewLabel = new JLabel("Cards:");
	        	        	        panel.add(lblNewLabel);
	        	        	        lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
	        	        	        
	        	        	        JButton btnNewButton = new JButton("Add Card");
	        	        	        panel.add(btnNewButton);
	        	        	        btnNewButton.setFont(new Font("Arial", Font.PLAIN, 24));

	        frame.setVisible(true);
	    }

	    private static void placeComponents(JPanel panel) {

	    }
	}
