package ie.gmit.sw.view;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.Timer;

import ie.gmit.sw.builders.GroundBuilder;
import ie.gmit.sw.builders.ItemBuilder;
import ie.gmit.sw.enums.GroundType;
import ie.gmit.sw.enums.ItemType;
import ie.gmit.sw.models.GroundTile;
import ie.gmit.sw.models.ItemTile;
import ie.gmit.sw.models.Position;
import ie.gmit.sw.models.SpriteTile;
import ie.gmit.sw.models.Tile;

public class GameView extends JPanel implements ActionListener, KeyListener {

	private static final long serialVersionUID = 777L;
	
	private Timer timer;
	
	private static final int DEFAULT_SIZE = 1280;
	private static final int TILE_WIDTH = 128;
	private static final int TILE_HEIGHT = 64;
	
	private Position pos = new Position(DEFAULT_SIZE / 2, 0);
	
	private ArrayList<GroundTile> groundList = new ArrayList<>();
	private ArrayList<ItemTile> itemList = new ArrayList<>();
	private ArrayList<SpriteTile> spriteList = new ArrayList<>();

	public GameView() {

		setBackground(Color.WHITE);
		setDoubleBuffered(true);
		
		for (int i = 0; i < 10; i++) {
			
			offsetPositions(i, 0);
			
			for (int j = 0; j < 10; j++) {
				
				GroundBuilder tBuilder = new GroundBuilder();
				tBuilder.setType(GroundType.grass);
				tBuilder.setPos(new Position(pos.getX(), pos.getY()));
				GroundTile tile = tBuilder.build();
				
				groundList.add(tile);

				nextPosition();
				
			}
			
		}
		
		for (int i = 0; i < 10; i++) {
			
			offsetPositions(i, 10);
			
			for (int j = 0; j < 10; j++) {
				
				ItemBuilder tBuilder = new ItemBuilder();
				tBuilder.setType(ItemType.chest);
				tBuilder.setPos(new Position(pos.getX(), pos.getY()));
				ItemTile tile = tBuilder.build();
				
				itemList.add(tile);

				nextPosition();
				
			}
			
		}

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
		paint(g2, itemList);
		paint(g2, spriteList);
		
	}

	public void paint(Graphics2D g2, ArrayList<? extends Tile> list) {
		for (Tile tile : list) {
			g2.drawImage(tile.getImage(), tile.getPos().getX(), tile.getPos().getY(), null);
		}
	}
	public void offsetPositions(int i, int offset) {
		pos.setX( ((DEFAULT_SIZE - TILE_WIDTH) / 2) - (TILE_WIDTH / 2) * i + offset);
		pos.setY((TILE_HEIGHT * i) / 2 - offset);
	}
	
	public void nextPosition() {
		pos.setX(pos.getX() + TILE_WIDTH / 2);
		pos.setY(pos.getY() + TILE_HEIGHT / 2);
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
	
}