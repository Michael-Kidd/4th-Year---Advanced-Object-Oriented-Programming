package ie.gmit.sw.view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.Timer;

import ie.gmit.sw.enums.Direction;
import ie.gmit.sw.Grid;
import ie.gmit.sw.models.SpriteTile;
import ie.gmit.sw.models.Tile;

public class GameView extends JPanel implements ActionListener, KeyListener {

	private static final long serialVersionUID = 777L;
	
	private Timer timer;

	private Grid grid1;
	private Grid grid2;
	
	private SpriteTile player;

	public GameView() {

		setBackground(Color.WHITE);
		setDoubleBuffered(true);

		timer = new Timer(100, this);
		timer.start();
		
	}

	public void actionPerformed(ActionEvent e) {
		this.repaint();
	}

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		paint(g2, grid1);
		paint(g2, grid2);
		
	}

	public void paint(Graphics2D g2, Grid grid) {
		for(Tile t: grid.getTiles()) {
			g2.drawImage(t.getImage(), t.getPos().getX(), t.getPos().getY(), null);	
		}
	}
	
	public Grid getGrid1() {
		return grid1;
	}

	public void setGrid1(Grid g1) {
		this.grid1 = g1;
	}

	public Grid getGrid2() {
		return grid2;
	}

	public void setGrid2(Grid g2) {
		this.grid2 = g2;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			player.setDirection(Direction.RIGHT);
		}
		else if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			player.setDirection(Direction.LEFT);
		}
		else if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			player.setDirection(Direction.UP);
		} 
		else if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			player.setDirection(Direction.DOWN);
		} 
		else if (e.getKeyCode() == KeyEvent.VK_X)
		{	
			player.move();
		} else {
			return;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
	
}