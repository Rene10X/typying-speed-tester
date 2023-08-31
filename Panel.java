package TypingTest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Panel extends JPanel implements KeyListener{
	
	final int SCREEN_WIDTH = 1000;
	final int SCREEN_HEIGHT = 600;
	
	Keyboard keyboard;
	Text text;
	Counter counter;
	
	Panel(){
		this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		this.setLayout(null);
		this.setFocusable(true);
		this.addKeyListener(this);
		
		counter = new Counter();
		this.add(counter);
		
		text = new Text();
		this.add(text);
		
		keyboard = new Keyboard();
		keyboard.requestFocusInWindow();		
		this.add(keyboard);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		System.out.println(e.getKeyChar());
		text.highlightLetters(e.getKeyChar());
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		keyboard.highLightKey(e.getKeyChar());
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keyboard.highLightKey(e.getKeyChar());
		
	}





	
}
