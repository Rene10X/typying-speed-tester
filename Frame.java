package TypingTest;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame implements KeyListener{
	
	Panel panel;
	
	Frame(){
		panel = new Panel();
		
		panel.addKeyListener(this);
		
		panel.requestFocus();
		this.add(panel);
		this.pack();
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//System.out.println(e.getKeyChar());
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
