package ie.gmit.sw;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.swing.*;
import javax.swing.Timer;

public class GameView extends JPanel implements ActionListener, KeyListener {
	private static final long serialVersionUID = 777L;
	
	//Encapsulate the things that vary...
	public static final int DEFAULT_VIEW_SIZE = 1280;

	private Timer timer;
	
	public GameView(int[][] objects2, int[][] model) throws Exception {
		
		init();
		
		setBackground(Color.WHITE);
		setDoubleBuffered(true);
		
		timer = new Timer(100, this);
		timer.start();
		
	}
	
	private void init() throws Exception {

	}

	public void actionPerformed(ActionEvent e) {
		//This is called each time the timer reaches zero
		this.repaint();
	}

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;

		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}
	
}