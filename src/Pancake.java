import java.awt.*;

public class Pancake extends Circle
{
	public Color forestGreen = new Color(34, 139, 34);
	
	public Pancake(int x, int y, Color c) 
	{
		super(x, y, c);
	}
	
	public void draw(Graphics g)
	{
		g.setColor(forestGreen);
		g.fillOval(25, 5, 60, 60);
		g.setColor(Color.WHITE);
		super.draw(g);
		g.setColor(Color.BLACK);
		g.drawOval(25, 5, 60, 60);
		Graphics2D	g2 = (Graphics2D)g;
		g2.setColor(Color.WHITE);
		g2.setStroke(new BasicStroke(4.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER, 5.0f, new float[] {0.4f, 7.0f}, 10.0f));
		g2.drawOval(30, 10, 50, 50);
		
	}

}
