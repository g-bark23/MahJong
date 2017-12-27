import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MahJongBoard extends JPanel implements MouseListener{

	private ArrayList<Tile> deck = new ArrayList<Tile>();
	private Tile [][][] gameBoard = new Tile [12][8][4];

	public MahJongBoard()
	{
		setLayout(null);
		fillGameBoard();
		drawGameBoard();
		setBackground(Color.YELLOW);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Image dragon = new ImageIcon(this.getClass().getResource("/images/dragon_bg.png")).getImage();
		g.drawImage(dragon, 180, 60, null);
		
	}

	private void fillGameBoard(){
		MahJongModel mjm = new MahJongModel();
		deck = mjm.getDeck();
		
		for(int layer = 0; layer < 4; layer++){
			if(layer == 0){
				for(int col = 0; col < 12; col++){
					for(int row = 0; row < 8; row++){
						if((row == 1 && col == 1) || (row == 1 && col == 10) || (row == 2 && col == 0) || (row == 5 && col == 0) || (row == 5 && col == 11) || 
								(row == 6 && col == 0) || (row == 6 && col == 1) || (row == 6 && col == 10) || (row == 6 && col == 11)){
							continue;
						}else {
							gameBoard[col][row][layer] = deck.remove(0);;
						}
					}
				}
			}else if (layer == 1){
				for(int col = 0; col < 6; col++){
					for(int row = 0; row < 6; row++){
						gameBoard[col][row][layer] = deck.remove(0);
					}
				}
			}else if (layer == 2){
				for(int col = 0; col < 4; col++){
					for(int row = 0; row < 4; row++){
						gameBoard[col][row][layer] = deck.remove(0);
					}
				}
			}else if (layer == 3){
				for(int col = 0; col < 2; col++){
					for(int row = 0; row < 2; row++){
						gameBoard[col][row][layer] = deck.remove(0);
					}
				}
				gameBoard[2][0][3] = deck.remove(0);
			}
		}
	}
	
	private void drawGameBoard(){
		int zOrder = 0;
		
		//draws layer 4
		gameBoard[2][0][3].setLocation(530, 165);
		gameBoard[2][0][3].setOpaque(false);
		gameBoard[2][0][3].addMouseListener(this);
		add(gameBoard[2][0][3]);
		setComponentZOrder(gameBoard[2][0][3], zOrder);
		zOrder++;
		
		//draws layer 3
		for(int col = 0; col < 2; col++){
			for(int row = 1; row > -1; row--){
				gameBoard[col][row][3].setLocation(60 + (6 * 70) + (col * 70), 150 + (row * 70));
				gameBoard[col][row][3].setOpaque(false);
				gameBoard[col][row][3].addMouseListener(this);
				add(gameBoard[col][row][3]);
				setComponentZOrder(gameBoard[col][row][3], zOrder);
				zOrder++;
			}	
		}
		
		//draws layer 2
		for(int col = 0; col < 4; col++){
			for(int row = 3; row > -1; row--){
				gameBoard[col][row][2].setLocation(40 + (5 * 70) + (col * 70), 100 + (row * 70));
				gameBoard[col][row][2].setOpaque(false);
				gameBoard[col][row][2].addMouseListener(this);
				add(gameBoard[col][row][2]);
				setComponentZOrder(gameBoard[col][row][2], zOrder);
				zOrder++;
			}	
		}
		
		//draws layer 1
		for(int col = 0; col < 6; col++){
			for(int row = 5; row > -1; row--){
				gameBoard[col][row][1].setLocation(20 + (4 * 70) + (col * 70), 50 + (row * 70));
				gameBoard[col][row][1].setOpaque(false);
				gameBoard[col][row][1].addMouseListener(this);
				add(gameBoard[col][row][1]);
				setComponentZOrder(gameBoard[col][row][1], zOrder);
				zOrder++;
			}	
		}
		
		//draws layer 0
		for(int col = 0; col < 12; col++){
			for(int row = 7; row > -1; row--){
				if(gameBoard[col][row][0] == null){
					continue;
				} else if (col == 11 && row == 1){
					gameBoard[col][row][0].setLocation(210 + (col * 70), (70 * 3) + 35);
					gameBoard[col][row][0].setOpaque(false);
					gameBoard[col][row][0].addMouseListener(this);
					add(gameBoard[col][row][0]);
					setComponentZOrder(gameBoard[11][1][0], getComponentZOrder(gameBoard[11][2][0]) + 1);
					zOrder++;
				} else if (col == 11 && row == 2){
					gameBoard[col][row][0].setLocation(140 + (col * 70), (70 * 3) + 35);
					gameBoard[col][row][0].setOpaque(false);
					gameBoard[col][row][0].addMouseListener(this);
					add(gameBoard[col][row][0]);
					setComponentZOrder(gameBoard[11][2][0], getComponentZOrder(gameBoard[11][3][0]) + 1);
					zOrder++;
				}else if (col == 0 && row == 1){
					gameBoard[col][row][0].setLocation(0, (70 * 3) + 35);
					gameBoard[col][row][0].setOpaque(false);
					gameBoard[col][row][0].addMouseListener(this);
					add(gameBoard[col][row][0]);
					setComponentZOrder(gameBoard[0][1][0], getComponentZOrder(gameBoard[0][4][0]) - 1);
					zOrder++;
				}	
				else{
					gameBoard[col][row][0].setLocation(70 + (col * 70), row * 70);
					gameBoard[col][row][0].setOpaque(false);
					gameBoard[col][row][0].addMouseListener(this);
					add(gameBoard[col][row][0]);
					setComponentZOrder(gameBoard[col][row][0], zOrder);
					zOrder++;
				}
			}
		}
		
	}
	
	public void mousePressed(MouseEvent e)
	{
		Tile tile = (Tile)e.getSource();
		//System.out.println(tile.getParent().getComponentZOrder(tile));
		if(e.getButton() == MouseEvent.BUTTON1){
			remove(tile);	
			revalidate();
			repaint();
		}
	}
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Board");
		
		frame.add(new MahJongBoard());
		
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
