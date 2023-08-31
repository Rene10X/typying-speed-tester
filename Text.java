package TypingTest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Text extends JPanel{
	
	List<String> words = new ArrayList<>();
	int MIN_WORD_LENGTH = 3;
	int MAX_WORD_LENGTH = 8;
	
	JLabel label;
	
	int currentIndex = 0;
	
	int cursorPosX = 0;
	int cursorPosXUntil = 0;
	int cursorPosY = 13;
	int cursorPosYUntil = 40;
	
	String finalLabelText;
	
	Text(){
		this.setBounds(160, 110, 750, 200);		
		
		generateNewText();			
	}

	private void generateNewText() {
		Random random = new Random();		
		
		
		String characters = "aaaaabbccddeeeeefffgghhhiiiiijjjkkllllkmmmnnnooooopqrrrsssttuuuuuvwxyz";
				
		StringBuilder word = new StringBuilder();
		for(int j = 0; j < 30; j++) {
			int wordLength = random.nextInt(MIN_WORD_LENGTH, MAX_WORD_LENGTH);
			for(int i = 0; i < wordLength; i++) {
				int randomIndex = random.nextInt(characters.length());
	            char randomChar = characters.charAt(randomIndex);
	            word.append(randomChar);
			}
			
			words.add(word.toString());
			word.setLength(0);
		}
		
		System.out.println(words);
		
		String labelText = words.toString();
		
		finalLabelText = labelText.replaceAll("[,\\[\\]]", "");
		
		label = new JLabel("<html>" + finalLabelText + "<html>");
		label.setPreferredSize(new Dimension(750, 200));
		label.setFont(new Font("Monospaced", Font.BOLD, 30));
		label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.LEFT);
        
        
		this.add(label);
	}
	
	public void highlightLetters(char letter) {				
		
		String currentText = finalLabelText;	
		
		if(currentText.charAt(currentIndex) == letter) {
			System.out.println("made it herre");
			String newText = "<html>" + "<font color='blue'>" + currentText.substring(0, currentIndex + 1) + "</font>" + currentText.substring(currentIndex + 1) + "</html>";
			label.setText(newText);
			currentIndex++;
			cursorPosX += 18;
			cursorPosXUntil += 18;
			System.out.println(cursorPosX);
			repaint();
		}
		
		
		
		
	}
	
	
	public void paintComponent(Graphics g)
	 {
	 super.paintComponent(g);
     
	 g.drawLine(cursorPosX, cursorPosY, cursorPosXUntil, cursorPosYUntil);
	}
	

	
}
