import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class MahJong extends JFrame{

	public MahJong(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new MahJongBoard());
		setSize(1500, 1000);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new MahJong();
	}
}