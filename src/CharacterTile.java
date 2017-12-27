import	java.awt.*;
import 	java.util.HashMap;

import	javax.swing.*;

public class CharacterTile extends Tile{

	private String mySymbol;
	protected char symbol;
	
	private static HashMap<String, String> chineseCharacters;
	static
	{
		chineseCharacters = new HashMap<String, String>();
		chineseCharacters.put("1", "\u4E00");
		chineseCharacters.put("2", "\u4E8C");
		chineseCharacters.put("3", "\u4E09");
		chineseCharacters.put("4", "\u56DB");
		chineseCharacters.put("5", "\u4E94");
		chineseCharacters.put("6", "\u516D");
		chineseCharacters.put("7", "\u4E03");
		chineseCharacters.put("8", "\u516B");
		chineseCharacters.put("9", "\u4E5D");
		chineseCharacters.put("N", "\u5317");
		chineseCharacters.put("E", "\u6771");
		chineseCharacters.put("W", "\u897F");
		chineseCharacters.put("S", "\u5357");
		chineseCharacters.put("C", "\u4E2D");
		chineseCharacters.put("F", "\u767C");
		chineseCharacters.put("wan", "\u842C");
	}
	
	public CharacterTile(char symbol){
		this.symbol = symbol;
		setToolTipText(toString());
		mySymbol = chineseCharacters.get(Character.toString(symbol));
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		g.setColor(Color.RED);
		g.drawString(Character.toString(symbol), 75, 15);
		
		drawSymbol(g, Color.BLACK);
	}
	
	public void drawSymbol(Graphics g, Color color) {
		Font f = g.getFont();
		FontMetrics fm = g.getFontMetrics();
		int symbolWidth = fm.stringWidth(mySymbol);
		
		if(Character.getNumericValue(symbol) < 10){
			g.setColor(color);
			f = f.deriveFont(f.getSize2D() * 2F);
			g.setFont(f);
			g.drawString(mySymbol, 40, 30);
			g.setColor(Color.RED);
			g.drawString(chineseCharacters.get("wan"), 40, 60);
		}
		else {
			if(symbol == 'C'){
				g.setColor(Color.RED);
			}else if (symbol == 'F'){
				g.setColor(Color.green);
			}else {
				g.setColor(color);
			}
			f = f.deriveFont(f.getSize2D() * 4F);
			g.setFont(f);
			g.drawString(mySymbol, 30, 55);
		}
	}
	
	public boolean matches(Tile other){
		if(!(super.matches(other))){
			return false;
		}
		
		CharacterTile tile = (CharacterTile) other;
		
		if(this.symbol == tile.symbol){
			return true;
		}
		
		return false;
	}
	
	public String toString(){
		switch(symbol){
			case '1' : return "Character " + symbol;
			case '2' : return "Character " + symbol;
			case '3' : return "Character " + symbol;
			case '4' : return "Character " + symbol;
			case '5' : return "Character " + symbol;
			case '6' : return "Character " + symbol;
			case '7' : return "Character " + symbol;
			case '8' : return "Character " + symbol;
			case '9' : return "Character " + symbol;
			case 'N' : return "North Wind";
			case 'E' : return "East Wind";
			case 'W' : return "West Wind";
			case 'S' : return "South Wind";
			case 'C' : return "Red Dragon";
			case 'F' : return "Green Dragon";
			default : return "Invalid CharacterTile";
		}
	}
	
	public static void main(String[] args)
	{
		JFrame		frame = new JFrame();
		JPanel		tiles = new JPanel();
		JScrollPane	scroller = new JScrollPane(tiles);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Character Tiles");
		frame.add(scroller);

		// Try something like this if your tiles don't fit on the screen.
		// Replace "tile width" and "tile height" with your values.
		//scroller.setPreferredSize(new Dimension(8 * tile width, 40 + tile height));

		tiles.add(new CharacterTile('1'));
		tiles.add(new CharacterTile('2'));
		tiles.add(new CharacterTile('3'));
		tiles.add(new CharacterTile('4'));
		tiles.add(new CharacterTile('5'));
		tiles.add(new CharacterTile('6'));
		tiles.add(new CharacterTile('7'));
		tiles.add(new CharacterTile('8'));
		tiles.add(new CharacterTile('9'));
		tiles.add(new CharacterTile('N'));
		tiles.add(new CharacterTile('E'));
		tiles.add(new CharacterTile('W'));
		tiles.add(new CharacterTile('S'));
		tiles.add(new CharacterTile('C'));
		tiles.add(new CharacterTile('F'));
		
		frame.pack();
		frame.setVisible(true);
	}
}
