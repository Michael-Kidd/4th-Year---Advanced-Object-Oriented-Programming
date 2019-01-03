package ie.gmit.sw.view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.Timer;

import ie.gmit.sw.enums.Direction;
import ie.gmit.sw.Grid;
import ie.gmit.sw.models.ItemTile;
import ie.gmit.sw.models.Position;
import ie.gmit.sw.models.SpriteTile;
import ie.gmit.sw.models.Tile;

public class GameView extends JPanel implements ActionListener, KeyListener {

	private static final long serialVersionUID = 777L;
	
	private Timer timer;

	private Grid grid1;
	private Grid grid2;
	
	private static SpriteTile player;
	
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
		player = p;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		try {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) 
			{
				player.setDirection(Direction.RIGHT);
				move(grid2.getPositions()[player.getX()][player.getY()+1], player, grid1, grid2);
			}
			else if (e.getKeyCode() == KeyEvent.VK_LEFT)
			{
				player.setDirection(Direction.LEFT);
				move(grid2.getPositions()[player.getX()][player.getY()-1], player, grid1, grid2);
			}
			else if (e.getKeyCode() == KeyEvent.VK_UP)
			{
				player.setDirection(Direction.UP);
				move(grid2.getPositions()[player.getX()-1][player.getY()], player, grid1, grid2);
			}
			else if (e.getKeyCode() == KeyEvent.VK_DOWN)
			{
				player.setDirection(Direction.DOWN);
				move(grid2.getPositions()[player.getX()+1][player.getY()], player, grid1, grid2);
			}
			else {
				return;
			}
		}
		catch(Exception ex) {
			//no reason to have a stack trace here as nothing will happen if the player attempts to walk off the edge
			//here we could end the game as if the player walked off the end of the map
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
	
	private void move(Position pos, SpriteTile sprite, Grid grid1, Grid grid2) {
		
		int []index = grid2.getIndex(pos);
		
		ItemTile itemAhead = grid2.getItemTile(index[0], index[1]);
		
		//This determines if the next tile can be walked on
		if(!grid1.getGroundTile(index[0], index[1]).isWalkable() ||  itemAhead != null) {
			
			if(itemAhead.isCollectable()) {
				grid2.getTiles().remove(itemAhead);
			}
			
			return;
		}
		
		player.step();
		player.setPos(pos);
		
		player.setX(index[0]);
		player.setY(index[1]);
		
	}
	
}