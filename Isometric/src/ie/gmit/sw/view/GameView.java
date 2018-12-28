package ie.gmit.sw.view;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.Timer;

import ie.gmit.sw.tiles.Enemy;
import ie.gmit.sw.tiles.Ground;
import ie.gmit.sw.tiles.Item;
import ie.gmit.sw.tiles.Tile;

public class GameView extends JPanel implements ActionListener, KeyListener {

	private static final long serialVersionUID = 777L;

	// Encapsulate the things that vary...
	private static final int DEFAULT_VIEW_SIZE = 1280;

	private ArrayList<Ground> tileList = new ArrayList<>();
	private ArrayList<Item> objectList = new ArrayList<>();
	private ArrayList<Enemy> enemyList = new ArrayList<>();

	private Generate world = new GenerateImpl();

	private Timer timer;

	public GameView() {

		try {

			init();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Game Objects Failed to Initialise", "View Failed",
					JOptionPane.ERROR_MESSAGE);
		}

		setBackground(Color.WHITE);
		setDoubleBuffered(true);

		timer = new Timer(100, this);
		timer.start();

	}

	private void init() throws Exception {

		tileList = world.createGround(tileList, 0);
		objectList = world.createObjects(objectList, 10);
		enemyList = world.createEnemies(enemyList, 10);

	}

	public void actionPerformed(ActionEvent e) {
		this.repaint();
	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		paint(g2, tileList);
		paint(g2, objectList);
		paint(g2, enemyList);

	}

	public static int getDefaultViewSize() {
		return DEFAULT_VIEW_SIZE;
	}

	public void paint(Graphics2D g2, ArrayList<? extends Tile> list) {
		for (Tile tile : list) {
			g2.drawImage(tile.getImage(), tile.getPos().getX(), tile.getPos().getY(), null);
		}
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