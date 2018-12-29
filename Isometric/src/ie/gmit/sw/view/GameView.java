package ie.gmit.sw.view;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.Timer;

import ie.gmit.sw.builders.GroundBuilder;
import ie.gmit.sw.enums.GroundType;
import ie.gmit.sw.tiles.GroundTile;
import ie.gmit.sw.tiles.Position;
import ie.gmit.sw.tiles.Tile;

public class GameView extends JPanel implements ActionListener, KeyListener {

	private static final long serialVersionUID = 777L;

	// Encapsulate the things that vary...
	private static final int DEFAULT_VIEW_SIZE = 1280;
	private static final int TILE_WIDTH = 128;
	private static final int TILE_HEIGHT = 64;

	private Timer timer;
	
	private Position pos = new Position(DEFAULT_VIEW_SIZE / 2, 0);
	
	private ArrayList<GroundTile> groundList = new ArrayList<>();
	private ArrayList<Tile> objectList = new ArrayList<>();
	private ArrayList<Tile> spriteList = new ArrayList<>();

	public ArrayList<GroundTile> createTiles(ArrayList<GroundTile> groundList, int offset) {

		groundList.clear();

		for (int i = 0; i < 10; i++) {
			
			offsetPositions(i, offset);
			
			for (int j = 0; j < 10; j++) {
				
				GroundBuilder tBuilder = new GroundBuilder();
				tBuilder.setType(GroundType.grass);
				tBuilder.setPos(new Position(pos.getX(), pos.getY()));
				GroundTile tile = tBuilder.build();
				
				groundList.add(tile);

				nextPosition();
			}
		}

		return groundList;

}

	public GameView() {
		groundList = createTiles(groundList, 0);

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

		paint(g2, groundList);
		paint(g2, objectList);
		paint(g2, spriteList);
	}

	public void paint(Graphics2D g2, ArrayList<? extends Tile> list) {
		for (Tile tile : list) {
			
			g2.drawImage(tile.getImage(), tile.getPos().getX(), tile.getPos().getY(), null);
			
		}
	}

	public static int getDefaultViewSize() {
		return DEFAULT_VIEW_SIZE;
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
	
	private void offsetPositions(int i, int offset) {
		pos.setX( ((DEFAULT_VIEW_SIZE - TILE_WIDTH) / 2) - (TILE_WIDTH / 2) * i + offset);
		pos.setY((TILE_HEIGHT * i) / 2 - offset);
	}
	
	private void nextPosition() {
		pos.setX(pos.getX() + TILE_WIDTH / 2);
		pos.setY(pos.getY() + TILE_HEIGHT / 2);
	}

}