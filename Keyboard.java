package TypingTest;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Keyboard extends JPanel{
	
	final int WIDTH = 618;
	final int HEIGHT = 240;
	
	final int KEY_WIDTH = 60;
	final int KEY_HEIGHT = 60;
	
	Color keyColor = Color.LIGHT_GRAY;
	Color keyHighlightColor = Color.gray;
	

	
	JLabel keyQ = new JLabel("Q");
	JLabel keyW = new JLabel("W");
	JLabel keyE = new JLabel("E");
	JLabel keyR = new JLabel("R");
	JLabel keyT = new JLabel("T");
	JLabel keyY = new JLabel("Y");
	JLabel keyU = new JLabel("U");
	JLabel keyI = new JLabel("I");
	JLabel keyO = new JLabel("O");
	JLabel keyP = new JLabel("P");
	JLabel keyA = new JLabel("A");
	JLabel keyS = new JLabel("S");
	JLabel keyD = new JLabel("D");
	JLabel keyF = new JLabel("F");
	JLabel keyG = new JLabel("G");
	JLabel keyH = new JLabel("H");
	JLabel keyJ = new JLabel("J");
	JLabel keyK = new JLabel("K");
	JLabel keyL = new JLabel("L");
	JLabel keyZ = new JLabel("Z");
	JLabel keyX = new JLabel("X");
	JLabel keyC = new JLabel("C");
	JLabel keyV = new JLabel("V");
	JLabel keyB = new JLabel("B");
	JLabel keyN = new JLabel("N");
	JLabel keyM = new JLabel("M");
	JLabel spacebar = new JLabel();
	JLabel Enter = new JLabel("ENTER");		


	
	Keyboard(){		
		this.setBounds(200, 340, WIDTH, HEIGHT);
		this.setLayout(null);
		
		initializeKeys();
	}

	private void initializeKeys() {	
		
		//first row
		keyQ.setBounds(0, 0, KEY_WIDTH, KEY_HEIGHT);
		keyQ.setBackground(keyColor);
		keyQ.setOpaque(true);
		keyQ.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyQ);
		
		keyW.setBounds(62, 0, KEY_WIDTH, KEY_HEIGHT);
		keyW.setBackground(keyColor);
		keyW.setOpaque(true);
		keyW.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyW);
		
		keyE.setBounds(124, 0, KEY_WIDTH, KEY_HEIGHT);
		keyE.setBackground(keyColor);
		keyE.setOpaque(true);
		keyE.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyE);
		
		keyR.setBounds(186, 0, KEY_WIDTH, KEY_HEIGHT);
		keyR.setBackground(keyColor);
		keyR.setOpaque(true);
		keyR.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyR);
		
		keyT.setBounds(248, 0, KEY_WIDTH, KEY_HEIGHT);
		keyT.setBackground(keyColor);
		keyT.setOpaque(true);
		keyT.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyT);
		
		keyY.setBounds(310, 0, KEY_WIDTH, KEY_HEIGHT);
		keyY.setBackground(keyColor);
		keyY.setOpaque(true);
		keyY.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyY);
		
		keyU.setBounds(372, 0, KEY_WIDTH, KEY_HEIGHT);
		keyU.setBackground(keyColor);
		keyU.setOpaque(true);
		keyU.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyU);
		
		keyI.setBounds(434, 0, KEY_WIDTH, KEY_HEIGHT);
		keyI.setBackground(keyColor);
		keyI.setOpaque(true);
		keyI.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyI);
		
		keyO.setBounds(496, 0, KEY_WIDTH, KEY_HEIGHT);
		keyO.setBackground(keyColor);
		keyO.setOpaque(true);
		keyO.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyO);
		
		keyP.setBounds(558, 0, KEY_WIDTH, KEY_HEIGHT);
		keyP.setBackground(keyColor);
		keyP.setOpaque(true);
		keyP.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyP);
		
		// second row
		int xOffset = 20;
		int yOffset = 2;
		
		keyA.setBounds(0 + xOffset, 60 + yOffset, KEY_WIDTH, KEY_HEIGHT);
		keyA.setBackground(keyColor);
		keyA.setOpaque(true);
		keyA.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyA);

		keyS.setBounds(62 + xOffset, 60 + yOffset, KEY_WIDTH, KEY_HEIGHT); // Adjusted position
		keyS.setBackground(keyColor);
		keyS.setOpaque(true);
		keyS.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyS);

		keyD.setBounds(124 + xOffset, 60 + yOffset, KEY_WIDTH, KEY_HEIGHT);
		keyD.setBackground(keyColor);
		keyD.setOpaque(true);
		keyD.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyD);

		keyF.setBounds(186 + xOffset, 60 + yOffset, KEY_WIDTH, KEY_HEIGHT); // Adjusted position
		keyF.setBackground(keyColor);
		keyF.setOpaque(true);
		keyF.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyF);

		keyG.setBounds(248 + xOffset, 60 + yOffset, KEY_WIDTH, KEY_HEIGHT);
		keyG.setBackground(keyColor);
		keyG.setOpaque(true);
		keyG.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyG);

		keyH.setBounds(310 + xOffset, 60 + yOffset, KEY_WIDTH, KEY_HEIGHT);
		keyH.setBackground(keyColor);
		keyH.setOpaque(true);
		keyH.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyH);

		keyJ.setBounds(372 + xOffset, 60 + yOffset, KEY_WIDTH, KEY_HEIGHT);
		keyJ.setBackground(keyColor);
		keyJ.setOpaque(true);
		keyJ.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyJ);

		keyK.setBounds(434 + xOffset, 60 + yOffset, KEY_WIDTH, KEY_HEIGHT);
		keyK.setBackground(keyColor);
		keyK.setOpaque(true);
		keyK.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyK);

		keyL.setBounds(496 + xOffset, 60 + yOffset, KEY_WIDTH, KEY_HEIGHT);
		keyL.setBackground(keyColor);
		keyL.setOpaque(true);
		keyL.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyL);
		
		//third row
		xOffset = 70;
		yOffset = 4;
		
		keyZ.setBounds(0 + xOffset, 120 + yOffset, KEY_WIDTH, KEY_HEIGHT);
		keyZ.setBackground(keyColor);
		keyZ.setOpaque(true);
		keyZ.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyZ);		
		
		keyX.setBounds(62 + xOffset, 120 + yOffset, KEY_WIDTH, KEY_HEIGHT);
		keyX.setBackground(keyColor);
		keyX.setOpaque(true);
		keyX.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyX);	
		
		keyC.setBounds(124 + xOffset, 120 + yOffset, KEY_WIDTH, KEY_HEIGHT);
		keyC.setBackground(keyColor);
		keyC.setOpaque(true);
		keyC.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyC);	
		
		keyV.setBounds(186 + xOffset, 120 + yOffset, KEY_WIDTH, KEY_HEIGHT);
		keyV.setBackground(keyColor);
		keyV.setOpaque(true);
		keyV.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyV);		
		
		keyB.setBounds(248 + xOffset, 120 + yOffset, KEY_WIDTH, KEY_HEIGHT);
		keyB.setBackground(keyColor);
		keyB.setOpaque(true);
		keyB.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyB);		
		
		keyN.setBounds(310 + xOffset, 120 + yOffset, KEY_WIDTH, KEY_HEIGHT);
		keyN.setBackground(keyColor);
		keyN.setOpaque(true);
		keyN.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyN);	
		
		keyM.setBounds(372 + xOffset, 120 + yOffset, KEY_WIDTH, KEY_HEIGHT);
		keyM.setBackground(keyColor);
		keyM.setOpaque(true);
		keyM.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(keyM);	
		
		
		Enter.setBounds(434 + xOffset, 120 + yOffset, KEY_WIDTH + 12, KEY_HEIGHT);
		Enter.setBackground(keyColor);
		Enter.setOpaque(true);
		Enter.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(Enter);	
		
		//fourth row
		xOffset = 155;
		yOffset = 6;
		
		spacebar.setBounds(0 + xOffset, 180 + yOffset, KEY_WIDTH * 5, KEY_HEIGHT);
		spacebar.setBackground(keyColor);
		spacebar.setOpaque(true);
		spacebar.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(spacebar);	

	}


	
	
	public void highLightKey(char key) {
		switch(key) {
			case 'q':
				if(keyQ.getBackground() != keyHighlightColor) {
					keyQ.setBackground(keyHighlightColor);
				} else {
					keyQ.setBackground(keyColor);
				}				
				break;
			case 'w':
				if(keyW.getBackground() != keyHighlightColor) {
					keyW.setBackground(keyHighlightColor);
				} else {
					keyW.setBackground(keyColor);
				}				
				break;
			case 'e':
				if(keyE.getBackground() != keyHighlightColor) {
					keyE.setBackground(keyHighlightColor);
				} else {
					keyE.setBackground(keyColor);
				}				
				break;
			case 'r':
				if(keyR.getBackground() != keyHighlightColor) {
					keyR.setBackground(keyHighlightColor);
				} else {
					keyR.setBackground(keyColor);
				}				
				break;
			case 't':
				if(keyT.getBackground() != keyHighlightColor) {
					keyT.setBackground(keyHighlightColor);
				} else {
					keyT.setBackground(keyColor);
				}				
				break;
			case 'y':
				if(keyY.getBackground() != keyHighlightColor) {
					keyY.setBackground(keyHighlightColor);
				} else {
					keyY.setBackground(keyColor);
				}				
				break;
			case 'u':
				if(keyU.getBackground() != keyHighlightColor) {
					keyU.setBackground(keyHighlightColor);
				} else {
					keyU.setBackground(keyColor);
				}				
				break;
			case 'i':
				if(keyI.getBackground() != keyHighlightColor) {
					keyI.setBackground(keyHighlightColor);
				} else {
					keyI.setBackground(keyColor);
				}				
				break;
			case 'o':
				if(keyO.getBackground() != keyHighlightColor) {
					keyO.setBackground(keyHighlightColor);
				} else {
					keyO.setBackground(keyColor);
				}				
				break;
			case 'p':
				if(keyP.getBackground() != keyHighlightColor) {
					keyP.setBackground(keyHighlightColor);
				} else {
					keyP.setBackground(keyColor);
				}				
				break;
			case 'a':
				if(keyA.getBackground() != keyHighlightColor) {
					keyA.setBackground(keyHighlightColor);
				} else {
					keyA.setBackground(keyColor);
				}				
				break;
			case 's':
				if(keyS.getBackground() != keyHighlightColor) {
					keyS.setBackground(keyHighlightColor);
				} else {
					keyS.setBackground(keyColor);
				}				
				break;
			case 'd':
				if(keyD.getBackground() != keyHighlightColor) {
					keyD.setBackground(keyHighlightColor);
				} else {
					keyD.setBackground(keyColor);
				}				
				break;
			case 'f':
				if(keyF.getBackground() != keyHighlightColor) {
					keyF.setBackground(keyHighlightColor);
				} else {
					keyF.setBackground(keyColor);
				}				
				break;
			case 'g':
				if(keyG.getBackground() != keyHighlightColor) {
					keyG.setBackground(keyHighlightColor);
				} else {
					keyG.setBackground(keyColor);
				}				
				break;
			case 'h':
				if(keyH.getBackground() != keyHighlightColor) {
					keyH.setBackground(keyHighlightColor);
				} else {
					keyH.setBackground(keyColor);
				}				
				break;
			case 'j':
				if(keyJ.getBackground() != keyHighlightColor) {
					keyJ.setBackground(keyHighlightColor);
				} else {
					keyJ.setBackground(keyColor);
				}				
				break;
			case 'k':
				if(keyK.getBackground() != keyHighlightColor) {
					keyK.setBackground(keyHighlightColor);
				} else {
					keyK.setBackground(keyColor);
				}				
				break;
			case 'l':
				if(keyL.getBackground() != keyHighlightColor) {
					keyL.setBackground(keyHighlightColor);
				} else {
					keyL.setBackground(keyColor);
				}				
				break;
			case 'z':
				if(keyZ.getBackground() != keyHighlightColor) {
					keyZ.setBackground(keyHighlightColor);
				} else {
					keyZ.setBackground(keyColor);
				}				
				break;
			case 'x':
				if(keyX.getBackground() != keyHighlightColor) {
					keyX.setBackground(keyHighlightColor);
				} else {
					keyX.setBackground(keyColor);
				}				
				break;
			case 'c':
				if(keyC.getBackground() != keyHighlightColor) {
					keyC.setBackground(keyHighlightColor);
				} else {
					keyC.setBackground(keyColor);
				}				
				break;
			case 'v':
				if(keyV.getBackground() != keyHighlightColor) {
					keyV.setBackground(keyHighlightColor);
				} else {
					keyV.setBackground(keyColor);
				}				
				break;
			case 'b':
				if(keyB.getBackground() != keyHighlightColor) {
					keyB.setBackground(keyHighlightColor);
				} else {
					keyB.setBackground(keyColor);
				}				
				break;
			case 'n':
				if(keyN.getBackground() != keyHighlightColor) {
					keyN.setBackground(keyHighlightColor);
				} else {
					keyN.setBackground(keyColor);
				}				
				break;
			case 'm':
				if(keyM.getBackground() != keyHighlightColor) {
					keyM.setBackground(keyHighlightColor);
				} else {
					keyM.setBackground(keyColor);
				}				
				break;
			case ' ':
				if(spacebar.getBackground() != keyHighlightColor) {
					spacebar.setBackground(keyHighlightColor);
				} else {
					spacebar.setBackground(keyColor);
				}				
				break;
			
		
		}
	}
	
}
	
	
	

