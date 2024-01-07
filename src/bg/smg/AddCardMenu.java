package bg.smg;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

import bg.smg.game.Card;
import bg.smg.util.*;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddCardMenu extends JFrame {

	JLabel lblImagePreview;
	JButton btnAddCard;
	
	private JTextField txfCardName;
	private JTextField txfCardPoints;
	private ImageIcon imgIcon = null;
	
	public AddCardMenu() {
		this.setTitle("Add Card");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(400, 300);

		this.setVisible(true);
		this.setEnabled(true);

		JButton btnSelectImage = new JButton("Select Image");
		btnSelectImage.setBounds(253, 12, 125, 25);
		btnSelectImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.addChoosableFileFilter(new ImageFilter());
				fileChooser.setAcceptAllFileFilterUsed(false);

				int option = fileChooser.showOpenDialog(btnSelectImage);
				if (option == JFileChooser.APPROVE_OPTION)
				{
					File imageFile = fileChooser.getSelectedFile();
					
					imgIcon = new ImageIcon(new ImageIcon(imageFile.getAbsolutePath())
							.getImage().getScaledInstance(lblImagePreview.getWidth(), lblImagePreview.getHeight(), Image.SCALE_DEFAULT));
		            lblImagePreview.setIcon(imgIcon);
		            
				}
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(btnSelectImage);
		
		btnAddCard = new JButton("Add Card");
		btnAddCard.setBounds(12, 217, 125, 25);
		getContentPane().add(btnAddCard);
		
		JLabel lblImagePreviewText = new JLabel("Card Preview:");
		lblImagePreviewText.setBounds(253, 49, 125, 25);
		getContentPane().add(lblImagePreviewText);
		
		lblImagePreview = new JLabel("");
		lblImagePreview.setBounds(253, 77, 100, 100);
		getContentPane().add(lblImagePreview);
		
		JLabel lblCardName = new JLabel("Card Name:");
		lblCardName.setBounds(12, 12, 100, 25);
		getContentPane().add(lblCardName);
		
		txfCardName = new JTextField();
		lblCardName.setLabelFor(txfCardName);
		txfCardName.setBounds(112, 12, 114, 25);
		getContentPane().add(txfCardName);
		txfCardName.setColumns(10);
		
		JLabel lblCardPoints = new JLabel("Card Points:");
		lblCardPoints.setBounds(12, 54, 100, 25);
		getContentPane().add(lblCardPoints);
		
		txfCardPoints = new JTextField();
		lblCardPoints.setLabelFor(txfCardPoints);
		txfCardPoints.setColumns(10);
		txfCardPoints.setBounds(112, 49, 114, 25);
		getContentPane().add(txfCardPoints);
	}
	
	public int getCardPoints()
	{
		try {
			return Integer.parseInt(txfCardPoints.getText());
			
		} catch(Exception e)
		{
			return 0; // Strahoten error-handling
		}
		
	}
	
	public String getCardName()
	{
		try
		{
			return txfCardName.getText();
		}catch (Exception e)
		{
			return "";
		}
	}
	
	public ImageIcon getCardIcon()
	{
		return imgIcon;
	}
	
	public JButton getAddCardButton()
	{
		return btnAddCard;
	}
}
