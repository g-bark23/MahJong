import	java.awt.*;
import	javax.swing.*;

public class SeasonTile extends PictureTile{

	public SeasonTile(String name){
		super(name);
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		switch(name){
		case "Spring":
			Image Spring = new ImageIcon(this.getClass().getResource("/images/Spring.png")).getImage();
			g.drawImage(Spring, 25, 10, this);
			break;
		case "Summer":
			Image Summer = new ImageIcon(this.getClass().getResource("/images/Summer.png")).getImage();
			g.drawImage(Summer, 25, 5, this);
			break;
		case "Fall":
			Image Fall = new ImageIcon(this.getClass().getResource("/images/Fall.png")).getImage();
			g.drawImage(Fall, 25, 5, this);
			break;
		case "Winter":
			Image Winter = new ImageIcon(this.getClass().getResource("/images/Winter.png")).getImage();
			g.drawImage(Winter, 25, 5, this);
			break;
		}
	}
	
	public static void main(String[] args)
	{
		JFrame	frame = new JFrame();

		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Season Tiles");

		frame.add(new SeasonTile("Spring"));
		frame.add(new SeasonTile("Summer"));
		frame.add(new SeasonTile("Fall"));
		frame.add(new SeasonTile("Winter"));

		frame.pack();
		frame.setVisible(true);
	}
}
