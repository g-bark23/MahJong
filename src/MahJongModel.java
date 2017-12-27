import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class MahJongModel {
	
	private ArrayList<Tile> deck = new ArrayList<Tile>();
	
	public MahJongModel(){
		buildDeck();
	}
	
	public void buildDeck(){
		for(int i = 1; i < 10; i++){
            for(int j = 0; j < 4; j++){
            	deck.add(new CharacterTile(Character.forDigit(i, 10))); 
            }
        }
        
        for(int i = 1; i < 10; i++){
        	
            for(int j = 0; j < 4; j++){
            	deck.add(new CircleTile(i));
            }
        }
        
        for(int i = 2; i < 10; i++){
            for(int j = 0; j < 4; j++){
            	deck.add(new BambooTile(i));
            }
        }
        
        for(int j = 0; j < 4; j++){
        	deck.add(new Bamboo1Tile());
        }
        
        for(int i=0; i < 4; i++){
        	deck.add(new CharacterTile('N'));
        	deck.add(new CharacterTile('E'));
        	deck.add(new CharacterTile('W'));
        	deck.add(new CharacterTile('S'));
        	deck.add(new CharacterTile('C'));
        	deck.add(new CharacterTile('F'));
        	deck.add(new WhiteDragonTile());
        }
        
        deck.add(new FlowerTile("Chrysanthemum"));
        deck.add(new FlowerTile("Orchid"));
        deck.add(new FlowerTile("Plum"));
        deck.add(new FlowerTile("Bamboo"));
        
        deck.add(new SeasonTile("Spring"));
        deck.add(new SeasonTile("Summer"));
        deck.add(new SeasonTile("Fall"));
        deck.add(new SeasonTile("Winter"));
	}
	
	public ArrayList<Tile> getDeck(){
		Collections.shuffle(deck);
		return deck;
	}
}
