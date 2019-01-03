package ie.gmit.sw.view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.Timer;

import ie.gmit.sw.enums.Direction;
import ie.gmit.sw.Grid;
import ie.gmit.sw.models.Position;
import ie.gmit.sw.models.SpriteTile;
import ie.gmit.sw.models.Tile;

public class GameView extends JPanel implements ActionListener, KeyListener {

	private static final long serialVersionUID = 777L;
	
	private Timer timer;

	private Grid grid1;
	private Grid grid2;
	
	private static SpriteTile player;
	protected Position nextPos;
	
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

	public SpriteTile getPlayer() {
		return player;
	}

	public void setPlayer(SpriteTile p) {
		
		p.setDirection(Direction.DOWN);
		nextPos = grid2.getPositions()[p.getX() +1][p.getY()];
		player = p;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) 
		{
			player.setDirection(Direction.RIGHT);
			move(grid2.getPositions()[player.getX()][player.getY()+1]);
		}
		else if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			player.setDirection(Direction.LEFT);
			move(grid2.getPositions()[player.getX()][player.getY()-1]);
		}
		else if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			player.setDirection(Direction.UP);
			move(grid2.getPositions()[player.getX()-1][player.getY()]);
		}
		else if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			player.setDirection(Direction.DOWN);
			move(grid2.getPositions()[player.getX()+1][player.getY()]);
		}
		else {
			return;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
	
	private void move(Position pos) {
		
		nextPos = pos;
		
		player.step();
		player.setPos(nextPos);
		
		int []index = grid2.getIndex(nextPos);
		player.setX(index[0]);
		player.setY(index[1]);
		
	}
	
}