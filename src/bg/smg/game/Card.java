package bg.smg.game;

import javax.swing.ImageIcon;

public class Card {
	private String name;
	private int points;
	private ImageIcon icon;
	
	public Card(String name, int points, ImageIcon icon)
	{
		this.name = name;
		this.points = points;
		this.icon = icon;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getPoints()
	{
		return points;
	}
	
	public ImageIcon getIcon()
	{
		return icon;
	}
}
