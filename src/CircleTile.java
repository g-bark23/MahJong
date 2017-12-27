import	java.awt.*;
import	javax.swing.*;

public class CircleTile extends RankTile{
	public Color forestGreen = new Color(34, 139, 34);
	final Circle circles[] = new Circle[9];
	
	public CircleTile(int rank){
		super(rank);
		setToolTipText(toString());
		switch(rank){
		case 1:
			circles[0] = new Pancake(50, 30, Color.RED);
			break;
		case 2:
			circles[0] = new Circle(50, 15, forestGreen);
			circles[1] = new Circle(50, 45, Color.RED);
			break;
		case 3:
			circles[0] = new Circle(25, 5, Color.BLUE);
			circles[1] = new Circle(48, 28, Color.RED);
			circles[2] = new Circle(72, 52, forestGreen);
			break;
		case 4:
			circles[0] = new Circle(35, 15, Color.BLUE);
			circles[1] = new Circle(35, 45, forestGreen);
			circles[2] = new Circle(65, 15, forestGreen);
			circles[3] = new Circle(65, 45, Color.BLUE);
			break;
		case 5:
			circles[0] = new Circle(25, 5, Color.BLUE);
			circles[1] = new Circle(48, 28, Color.RED);
			circles[2] = new Circle(72, 52, Color.BLUE);
			circles[3] = new Circle(72, 5, forestGreen);
			circles[4] = new Circle(25, 52, forestGreen);
			break;
		case 6:
			circles[0] = new Circle(35, 5, forestGreen);
			circles[1] = new Circle(65, 5, forestGreen);
			circles[2] = new Circle(35, 28, Color.RED);
			circles[3] = new Circle(65, 28, Color.RED);
			circles[4] = new Circle(35, 52, Color.RED);
			circles[5] = new Circle(65, 52, Color.RED);
			break;
		case 7:
			circles[0] = new Circle(25, 5, forestGreen);
			circles[1] = new Circle(48, 13, forestGreen);
			circles[2] = new Circle(70, 23, forestGreen);
			circles[3] = new Circle(35, 37, Color.RED);
			circles[4] = new Circle(65, 37, Color.RED);
			circles[5] = new Circle(35, 52, Color.RED);
			circles[6] = new Circle(65, 52, Color.RED);
			break;
		case 8:
			circles[0] = new Circle(35, 2, Color.BLUE);
			circles[1] = new Circle(65, 2, Color.BLUE);
			circles[2] = new Circle(35, 20, Color.BLUE);
			circles[3] = new Circle(65, 20, Color.BLUE);
			circles[4] = new Circle(35, 38, Color.BLUE);
			circles[5] = new Circle(65, 38, Color.BLUE);
			circles[6] = new Circle(65, 55, Color.BLUE);
			circles[7] = new Circle(35, 55, Color.BLUE);
			break;
		case 9:
			circles[0] = new Circle(25, 5, forestGreen);
			circles[1] = new Circle(50, 5, forestGreen);
			circles[2] = new Circle(72, 5, forestGreen);
			circles[3] = new Circle(25, 29, Color.RED);
			circles[4] = new Circle(50, 29, Color.RED);
			circles[5] = new Circle(72, 29, Color.RED);
			circles[6] = new Circle(25, 52, Color.BLUE);
			circles[7] = new Circle(50, 52, Color.BLUE);
			circles[8] = new Circle(72, 52, Color.BLUE);
			break;
		}
	}
	
	public String toString(){
		
		switch(rank){
			case 1 : return "Circle " + rank;
			case 2 : return "Circle " + rank;
			case 3 : return "Circle " + rank;
			case 4 : return "Circle " + rank;
			case 5 : return "Circle " + rank;
			case 6 : return "Circle " + rank;
			case 7 : return "Circle " + rank;
			case 8 : return "Circle " + rank;
			case 9 : return "Circle " + rank;
			default : return "Invalid CircleTile";
		}
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		for (Circle c : circles)
			if (c != null)
				c.draw(g);
	}
	
	public static void main(String[] args)
	{
		JFrame	frame = new JFrame();

		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Circle Tiles");

		frame.add(new CircleTile(1));
		frame.add(new CircleTile(2));
		frame.add(new CircleTile(3));
		frame.add(new CircleTile(4));
		frame.add(new CircleTile(5));
		frame.add(new CircleTile(6));
		frame.add(new CircleTile(7));
		frame.add(new CircleTile(8));
		frame.add(new CircleTile(9));

		frame.pack();
		frame.setVisible(true);
	}
	
}
