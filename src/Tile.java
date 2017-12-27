import	java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tile extends JPanel{
	
	private int[] x = {0, 0, 10, 10};
	private int[] y = {90, 20, 10, 80};
	private int[] xTopLeft = {10, 10, 20, 20};
	private int[] yTopLeft = {80, 10, 0, 70};
	private int[] xBottomTop = {90, 20, 10, 80};
	private int[] yBottomTop = {70, 70, 80, 80};
	private int[] xBottomBottom = {80, 10, 0, 70};
	private int[] yBottomBottom = {80, 80, 90, 90};
	public Polygon bottomLeft;
	public Polygon topLeft;
	public Polygon bottomBottom;
	public Polygon bottomTop;
	
	public 	Color green4 = new Color(0, 139, 0);
	public 	Color green2 = new Color(0, 238, 0);
	public 	Color yellow = new Color(255, 250, 205);
	public 	Color lightYellow = new Color(255, 248, 220);
	public	Dimension tileSize = new Dimension(95, 95);
	
	public Tile()
	{
//		setPreferredSize(tileSize);
		setSize(95, 95);
		topLeft = new Polygon(xTopLeft, yTopLeft, x.length);
		bottomTop = new Polygon(xBottomTop, yBottomTop, x.length);
		bottomLeft = new Polygon(x, y, x.length);
		bottomBottom = new Polygon(xBottomBottom, yBottomBottom, x.length);
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D	g2 = (Graphics2D)g;
		GradientPaint	gradBottom = new GradientPaint(0, 70, green2,
					70, 0, green4, true);
		g2.setPaint(gradBottom);
		
		g.fillPolygon(bottomLeft);
		g.fillPolygon(bottomBottom);
		
		GradientPaint gradTop = new GradientPaint(20, 70, lightYellow, 
				70, 0, yellow, false);
		
		g2.setPaint(gradTop);
		g.fillRect(20, 0, 70, 70);
		g.fillPolygon(topLeft);
		g.fillPolygon(bottomTop);
		
		g2.setPaint(Color.BLACK);
		g.drawPolygon(bottomLeft);
		g.drawPolygon(topLeft);
		g.drawPolygon(bottomBottom);
		g.drawPolygon(bottomTop);
		g.drawRect(20, 0, 70, 70);
	}
	
	public boolean matches (Tile other){
		if (this == other){
			return true;
		}
		
		if (other == null){
			return false;
		}
		
		if (getClass() != other.getClass()){
			return false;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Tile");
		
		frame.add(new Tile());
		
		frame.pack();
		frame.setVisible(true);
	}
}
