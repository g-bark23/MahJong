import	java.awt.*;
import java.awt.geom.AffineTransform;

import	javax.swing.*;

public class BambooTile extends RankTile{
	public Color forestGreen = new Color(34, 139, 34);
	
	public BambooTile(int rank){
		super(rank);
	}
	
	public String toString(){
		switch(rank){
			case 2 : return "Bamboo " + rank;
			case 3 : return "Bamboo " + rank;
			case 4 : return "Bamboo " + rank;
			case 5 : return "Bamboo " + rank;
			case 6 : return "Bamboo " + rank;
			case 7 : return "Bamboo " + rank;
			case 8 : return "Bamboo " + rank;
			case 9 : return "Bamboo " + rank;
			default : return "Invalid BambooTile";
		}
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		switch(rank){
		case 2:
			drawBamboo(g, 50, 15, Color.BLUE);
			drawBamboo(g, 50, 36, forestGreen);
			break;
		case 3:
			drawBamboo(g, 50, 15, Color.BLUE);
			drawBamboo(g, 35, 36, forestGreen);
			drawBamboo(g, 65, 36, forestGreen);
			break;
		case 4:
			drawBamboo(g, 35, 13, Color.BLUE);
			drawBamboo(g, 35, 34, forestGreen);
			drawBamboo(g, 63, 13, forestGreen);
			drawBamboo(g, 63, 34, Color.BLUE);
			break;
		case 5:
			drawBamboo(g, 28, 13, forestGreen);
			drawBamboo(g, 28, 34, Color.BLUE);
			drawBamboo(g, 49, 25, Color.RED);
			drawBamboo(g, 70, 13, Color.BLUE);
			drawBamboo(g, 70, 34, forestGreen);
			break;
		case 6:
			drawBamboo(g, 28, 13, forestGreen);
			drawBamboo(g, 28, 34, Color.BLUE);
			drawBamboo(g, 49, 13, forestGreen);
			drawBamboo(g, 49, 34, Color.BLUE);
			drawBamboo(g, 70, 13, forestGreen);
			drawBamboo(g, 70, 34, Color.BLUE);
			break;
		case 7:
			drawBamboo(g, 49, 3, Color.RED);
			drawBamboo(g, 28, 25, forestGreen);
			drawBamboo(g, 28, 46, Color.BLUE);
			drawBamboo(g, 49, 25, forestGreen);
			drawBamboo(g, 49, 46, Color.BLUE);
			drawBamboo(g, 70, 25, forestGreen);
			drawBamboo(g, 70, 46, Color.BLUE);
			break;
		case 8:
			drawBamboo(g, 24, 13, forestGreen);
			drawBamboo(g, 24, 36, Color.BLUE);
			drawBamboo(g, 78, 13, forestGreen);
			drawBamboo(g, 78, 36, Color.BLUE);
		
			Graphics2D g2d = (Graphics2D)g;
	        AffineTransform old = g2d.getTransform();
	        g2d.rotate(Math.toRadians(45));
	        drawBamboo(g, 44, -24, forestGreen);
	        g2d.setTransform(old);
	        
	        g2d.rotate(Math.toRadians(-45));
			drawBamboo(g, -5, 53, Color.BLUE);
	        g2d.setTransform(old);
	        
	        g2d.rotate(Math.toRadians(-45));
	        drawBamboo(g, 25, 54, forestGreen);
	        g2d.setTransform(old);
	        
	        g2d.rotate(Math.toRadians(45));
			drawBamboo(g, 75, -26, Color.BLUE);
	        g2d.setTransform(old);
	        
			break;
		case 9:
			drawBamboo(g, 28, 2, Color.RED);
			drawBamboo(g, 28, 24, Color.RED);
			drawBamboo(g, 28, 46, Color.RED);
			drawBamboo(g, 49, 2, Color.BLUE);
			drawBamboo(g, 49, 24, Color.BLUE);
			drawBamboo(g, 49, 46, Color.BLUE);
			drawBamboo(g, 70, 2, forestGreen);
			drawBamboo(g, 70, 24, forestGreen);
			drawBamboo(g, 70, 46, forestGreen);
			break;
		}
		
	}
	
	public void drawBamboo(Graphics g, int x, int y, Color color)
	{
		g.setColor(color);
		g.fillArc(x - 2, y, 13, 8, 180, -180);
		g.fillArc(x - 2, y + 17, 13, 8, 180, -180);
		g.fillRoundRect(x + 2, y + 1, 6, 20, 2, 2);
		g.setColor(Color.WHITE);
		g.drawLine(x + 5, y + 2, x + 5, y + 19);
		g.setColor(color);
		g.fillArc(x - 2, y + 8, 13, 8, 180, -180);
	}
	
	public static void main(String[] args)
	{
		JFrame	frame = new JFrame();

		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Bamboo Tiles");

		frame.add(new BambooTile(2));
		frame.add(new BambooTile(3));
		frame.add(new BambooTile(4));
		frame.add(new BambooTile(5));
		frame.add(new BambooTile(6));
		frame.add(new BambooTile(7));
		frame.add(new BambooTile(8));
		frame.add(new BambooTile(9));

		frame.pack();
		frame.setVisible(true);
	}
}
