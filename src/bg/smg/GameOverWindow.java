package bg.smg;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class GameOverWindow extends JFrame {
	
	public GameOverWindow(int finalScore, GameWindow oldGameWindow)
	{
		this.setTitle("Game Over");
		this.setSize(400, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblGameOver = new JLabel("Game Over");
		lblGameOver.setFont(new Font("Dialog", Font.BOLD, 40));
		lblGameOver.setHorizontalAlignment(SwingConstants.CENTER);
		lblGameOver.setBounds(50, 10, 300, 35);
		getContentPane().add(lblGameOver);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(228, 123, 122, 35);
		btnExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		getContentPane().add(btnExit);
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.setBounds(31, 123, 122, 35);
		btnNewGame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new GameWindow(oldGameWindow.getPlayerName(), oldGameWindow.getDeck());
				oldGameWindow.dispose();
				dispose();
			}
			
		});
		getContentPane().add(btnNewGame);
		
		JLabel lblScore = new JLabel("Your Score: " + Integer.toString(finalScore));
		lblScore.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblScore.setBounds(99, 67, 250, 30);
		getContentPane().add(lblScore);
		
		this.setVisible(true);
	}
}
