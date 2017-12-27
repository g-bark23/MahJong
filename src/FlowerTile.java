import	java.awt.*;
import	javax.swing.*;

public class FlowerTile extends PictureTile{
	public FlowerTile(String name){
		super(name);
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		switch(name){
		case "Chrysanthemum":
			Image Chrysanthemum = new ImageIcon(this.getClass().getResource("/images/Chrysanthemum.png")).getImage();
			g.drawImage(Chrysanthemum, 22, 7, this);
			break;
		case "Orchid":
			Image Orchid = new ImageIcon(this.getClass().getResource("/images/Orchid.png")).getImage();
			g.drawImage(Orchid, 24, 5, this);
			break;
		case "Plum":
			Image Plum = new ImageIcon(this.getClass().getResource("/images/Plum.png")).getImage();
			g.drawImage(Plum, 26, 5, this);
			break;
		case "Bamboo":
			Image Bamboo = new ImageIcon(this.getClass().getResource("/images/Bamboo.png")).getImage();
			g.drawImage(Bamboo, 30, 6, this);
			break;
		}
	}
	
	public static void main(String[] args)
	{
		JFrame	frame = new JFrame();

		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Flower Tiles");

		frame.add(new FlowerTile("Chrysanthemum"));
		frame.add(new FlowerTile("Orchid"));
		frame.add(new FlowerTile("Plum"));
		frame.add(new FlowerTile("Bamboo"));

		frame.pack();
		frame.setVisible(true);
	}
}
