package ie.gmit.sw;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.Timer;

public class GameView extends JPanel implements ActionListener, KeyListener {

	private static final long serialVersionUID = 777L;

	// To determine if the game has ended
	private boolean gameOver = false;
	// Timer used for repainting the panel
	private Timer timer;
	// Grids to store the tiles.
	// This grid will be the lower grid, the first grid painted and should contain
	// ground tiles
	private Grid grid1;
	// This will be the second grid painted and contains objects and character
	// sprites
	// this grid will also be offset to give the isometric appearance
	private Grid grid2;
	// the number of chests remianing, used as a game condition
	private int chestRemaining = 4;
	// the character that the user will control
	private static SpriteTile player;

	public GameView() {

		setBackground(Color.WHITE);
		setDoubleBuffered(true);

		// Show a message that tells the user the conditions of the game
		JOptionPane.showMessageDialog(null,
				"Control the player with the Arrow keys\nCollect the 4 chests to complete the game", "Game Rules",
				JOptionPane.DEFAULT_OPTION);

		// set the timer to a 1/10 of a second
		timer = new Timer(100, this);
		// start the timer
		timer.start();

	}

	public void actionPerformed(ActionEvent e) {

		// if all chests have been collected, the game has ended
		if (chestRemaining == 0)
			gameOver = true;

		// if the game ends show the user a message that they have won
		if (gameOver) {
			JOptionPane.showMessageDialog(null, "You have completed the game", "Game Over", JOptionPane.DEFAULT_OPTION);

			// here we exit the game, we could choose to start the game again instead, but I
			// have went with the simpler option.
			System.exit(0);
		}

		this.repaint();
	}

	public void paintComponent(Graphics g) {

		// pass the graphics variable to the super class
		super.paintComponent(g);

		// set our graphics to a 2D
		Graphics2D g2 = (Graphics2D) g;

		// Paint both grids
		paint(g2, grid1);
		paint(g2, grid2);

	}

	public void paint(Graphics2D g2, Grid grid) {
		// go through the tiles attahced to the incoming grid and draw them
		for (Tile t : grid.getTiles()) {
			// Draw the tile using the tile image and its position
			g2.drawImage(t.getImage(), t.getPos().getX(), t.getPos().getY(), null);
		}
	}

	// To get the first grid, there should only ever be two grids with each game
	// view
	public Grid getGrid1() {
		return grid1;
	}

	// to set the first grid
	public void setGrid1(Grid g1) {
		this.grid1 = g1;
	}

	// get the second of 2 grids, this will be the grid that contains the objects
	// and characters
	public Grid getGrid2() {
		return grid2;
	}

	// set the second grid
	public void setGrid2(Grid g2) {
		this.grid2 = g2;
	}

	// retreive the user controlled player
	public SpriteTile getPlayer() {
		return player;
	}

	// set the user control player
	public void setPlayer(SpriteTile p) {
		// set the default position to down, so that the character is facing the user
		p.setDirection(Direction.DOWN);
		// set the player as the incoming sprite
		player = p;
	}

	// if a key is pressed
	@Override
	public void keyPressed(KeyEvent e) {

		try {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
//right Arrow	
				// change the player direction
				player.setDirection(Direction.RIGHT);
				// move the player one tile to the right
				Movement.move(grid2.getPositions()[player.getX()][player.getY() + 1], player, grid1, grid2, this);
			} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
//left arrow
				// change the player direction to left
				player.setDirection(Direction.LEFT);
				// move the pplayer one tile to the left
				Movement.move(grid2.getPositions()[player.getX()][player.getY() - 1], player, grid1, grid2, this);
			} else if (e.getKeyCode() == KeyEvent.VK_UP) {
//up arrow
				// set the player to face away from the user
				player.setDirection(Direction.UP);
				// move the player one tile up
				Movement.move(grid2.getPositions()[player.getX() - 1][player.getY()], player, grid1, grid2, this);
			} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
//down arrow
				// set the player direction down
				player.setDirection(Direction.DOWN);
				// move the player one tile down
				Movement.move(grid2.getPositions()[player.getX() + 1][player.getY()], player, grid1, grid2, this);
			} else {
				return;
			}
		} catch (Exception ex) {
			// no reason to have a stack trace here as nothing will happen if the player
			// attempts to walk off the edge
			// here we could end the game as if the player walked off the end of the map
		}

	}

	// used upon a key being depressed
	@Override
	public void keyReleased(KeyEvent e) {
	}

	// used when key typed
	@Override
	public void keyTyped(KeyEvent e) {
	}

	// Adds an enemy to a list of enemies, not using at the moment
	public void addEnemy(Object addSprites) {
		// TODO Auto-generated method stub

	}

	// retrieves the game over boolean
	public boolean isGameOver() {
		return gameOver;
	}

	// sets the game over variable
	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}

	// retreives the number of chests currently in play
	public int getChestRemaining() {
		return chestRemaining;
	}

	// adds or removes from the remianing chests
	public void setChestRemaining(int chestRemaining) {
		this.chestRemaining += chestRemaining;
	}

}