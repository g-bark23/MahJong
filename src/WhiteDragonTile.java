import	java.awt.*;

public class WhiteDragonTile extends Tile{
	
	public String toString(){
		return "White Dragon";
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.drawRect(28, 8, 52, 52);
		g.drawRect(32, 12, 44, 44);
		Stroke blocks = new BasicStroke(4, BasicStroke.CAP_SQUARE, BasicStroke.CAP_SQUARE, 0, new float[]{5.65f, 11.70f}, 0);
		Graphics2D g2 = (Graphics2D)g;
		g2.setStroke(blocks);
		g2.drawRect(30, 10, 48, 48);
	}
}
