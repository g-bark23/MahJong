import java.awt.*;

public class Circle 
{
	
	private int x;
	private int y;
	private Color color;
	
	public Circle(int x, int y, Color color) 
	{
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(color);
		g.fillOval(x, y, 12, 12);
		g.setColor(Color.WHITE);
		g.drawLine(x + 3, y + 3, x + 9, y + 9);
		g.drawLine(x + 9, y + 3, x + 3, y + 9);
	}
}
