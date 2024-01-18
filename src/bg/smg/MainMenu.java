package bg.smg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MainMenu extends JFrame {

	private JLabel titleLabel;
	private JLabel playerNameLabel;
	private JTextField playerNameTextField;

	private JButton playButton;

	private JButton chooseDeckButton;
	private JButton donateButton;
	private JButton exitButton;

	public MainMenu() {
		setTitle("Memory Cards Game");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		titleLabel = new JLabel("Memory Cards Game");
		titleLabel.setBounds(0, 0, 790, 126);
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
		getContentPane().add(titleLabel);

		JPanel playerPanel = new JPanel();
		playerPanel.setBounds(103, 138, 499, 36);
		getContentPane().add(playerPanel);
		playerPanel.setLayout(new GridLayout(1, 2, 0, 0));

		playerNameLabel = new JLabel("Player Name: ");
		playerNameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		playerPanel.add(playerNameLabel);
		playerNameLabel.setFont(new Font("Arial", Font.ITALIC, 30));

		playerNameTextField = new JTextField();
		playerPanel.add(playerNameTextField);

		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setBounds(184, 228, 418, 330);
		buttonsPanel.setLayout(new GridLayout(4, 1, 0, 10));

		playButton = new JButton("Play");
		playButton.setFont(new Font("Dialog", Font.PLAIN, 22));
		
		chooseDeckButton = new JButton("Choose a Deck");
		chooseDeckButton.setFont(new Font("Arial", Font.PLAIN, 22));
		chooseDeckButton.setBounds(0, 200, 200, 60);
		

		exitButton = new JButton("Exit");
		exitButton.setBounds(325, 380, 150, 40);
		exitButton.setFont(new Font("Arial", Font.PLAIN, 18));

		exitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		buttonsPanel.add(playButton);
		buttonsPanel.add(chooseDeckButton);
		buttonsPanel.add(exitButton);

		getContentPane().add(buttonsPanel);
		donateButton = new JButton("Donate");
		donateButton.setBounds(300, 280, 200, 60);
		donateButton.setFont(new Font("Arial", Font.PLAIN, 22));

		donateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MainMenu.this, "Thank you for your generous donation!");
			}
		});

		setVisible(true);
	}

	public String getPlayerName() {
		return playerNameTextField.getText();
	}

	public JButton getPlayButton() {
		return playButton;
	}

	public JButton getChooseDeckButton() {
		return chooseDeckButton;
	}
}