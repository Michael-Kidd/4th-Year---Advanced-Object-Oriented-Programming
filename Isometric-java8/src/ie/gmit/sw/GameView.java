package ie.gmit.sw;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.Timer;

public class GameView extends JPanel implements ActionListener, KeyListener {

	private static final long serialVersionUID = 777L;

	private boolean gameOver = false;

	private Timer timer;

	private Grid grid1;
	private Grid grid2;

	private int chestRemaining = 4;

	private static SpriteTile player;

	public GameView() {

		setBackground(Color.WHITE);
		setDoubleBuffered(true);

		JOptionPane.showMessageDialog(null,
				"Control the player with the Arrow keys\nCollect the 4 chests to complete the game", "Game Rules",
				JOptionPane.DEFAULT_OPTION);

		timer = new Timer(100, this);
		timer.start();

	}

	public void actionPerformed(ActionEvent e) {

		if (chestRemaining == 0)
			gameOver = true;

		if (gameOver) {
			JOptionPane.showMessageDialog(null, "You have completed the game", "Game Over", JOptionPane.DEFAULT_OPTION);

			System.exit(0);
		}

		this.repaint();
	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		paint(g2, grid1);
		paint(g2, grid2);

	}

	public void paint(Graphics2D g2, Grid grid) {
		for (Tile t : grid.getTiles()) {
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
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				player.setDirection(Direction.RIGHT);
				Movement.move(grid2.getPositions()[player.getX()][player.getY() + 1], player, grid1, grid2, this);
			} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				player.setDirection(Direction.LEFT);
				Movement.move(grid2.getPositions()[player.getX()][player.getY() - 1], player, grid1, grid2, this);
			} else if (e.getKeyCode() == KeyEvent.VK_UP) {
				player.setDirection(Direction.UP);
				Movement.move(grid2.getPositions()[player.getX() - 1][player.getY()], player, grid1, grid2, this);
			} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				player.setDirection(Direction.DOWN);
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

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	public void addEnemy(Object addSprites) {
		// TODO Auto-generated method stub

	}

	public boolean isGameOver() {
		return gameOver;
	}

	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}

	public int getChestRemaining() {
		return chestRemaining;
	}

	public void setChestRemaining(int chestRemaining) {
		this.chestRemaining += chestRemaining;
	}

}