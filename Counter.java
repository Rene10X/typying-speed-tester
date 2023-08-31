package TypingTest;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Counter extends JPanel{
	
	JLabel speed;
	
	Counter(){
		this.setBackground(Color.blue);
		this.setBounds(400, 0, 200, 100);
		
		speed = new JLabel("0");		
		this.add(speed);
		
	}
	
}
