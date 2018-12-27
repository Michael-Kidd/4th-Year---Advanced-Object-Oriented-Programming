package ie.gmit.sw.view;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.Timer;

import ie.gmit.sw.builders.EnemyBuilder;
import ie.gmit.sw.builders.GroundBuilder;
import ie.gmit.sw.builders.ItemBuilder;
import ie.gmit.sw.controller.Point;
import ie.gmit.sw.model.Enemy;
import ie.gmit.sw.model.Ground;
import ie.gmit.sw.model.Item;

public class GameView extends JPanel implements ActionListener, KeyListener {
	
	private static final long serialVersionUID = 777L;
	
	//Encapsulate the things that vary...
	public static final int DEFAULT_VIEW_SIZE = 1280;
	private static final int TILE_WIDTH = 128;
	private static final int TILE_HEIGHT = 64;
	private static final int OFFSET = 10;
	
	
	private ArrayList<Ground> tileList =  new ArrayList<>();
	private ArrayList<Item> objectList =  new ArrayList<>();
	private ArrayList<Enemy> enemyList =  new ArrayList<>();

	private Timer timer;
	
	public GameView() throws Exception {
		
		init();
	
		setBackground(Color.WHITE);
		setDoubleBuffered(true);
		
		timer = new Timer(100, this);
		timer.start();
		
	}
	
	private void init() throws Exception {
		 
		createGrid();
		createForest();
		createEnemies();
		 
	}

	public void actionPerformed(ActionEvent e) {
		//This is called each time the timer reaches zero
		this.repaint();
	}

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		paintGrid(g2);
		paintObjects(g2);
		paintEnemies(g2);
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
	
	public void createGrid() {
		
		File dir = new File("./resources/images/ground");
		File[] files = dir.listFiles();
		
		BufferedImage img = null;
		
		try {
			//read in the Image tile
			img = ImageIO.read(files[0]);
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		int x = DEFAULT_VIEW_SIZE / 2;
		int y = 0;
		
		for(int i = 0; i < 10; i++)
		{
			
			x = ((DEFAULT_VIEW_SIZE - TILE_WIDTH) / 2) - (TILE_WIDTH/2) * i;
			y = (TILE_HEIGHT*i) / 2;
			
			for(int j = 0; j < 10; j++)
			{
				
				GroundBuilder tBuilder = new GroundBuilder();
				tBuilder.setImage(img);
				tBuilder.setPos(new Point(x, y));
				Ground tile = tBuilder.build();
				
				tileList.add(tile);
				
				x += TILE_WIDTH/2;
				y += TILE_HEIGHT/2;
			
			}
			
		}
		
	}
	
	public void createForest() {
		
		File dir = new File("./resources/images/objects");
		File[] files = dir.listFiles();
		
		BufferedImage img = null;
		
		try {
			//read in the Image tile
			img = ImageIO.read(files[6]);
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		int x = DEFAULT_VIEW_SIZE / 2;
		int y = 0;
		
		for(int i = 0; i < 10; i++)
		{
			
			x = ((DEFAULT_VIEW_SIZE - TILE_WIDTH) / 2) - (TILE_WIDTH/2) * i + OFFSET;
			y = (TILE_HEIGHT*i) / 2 - OFFSET;
			
			for(int j = 0; j < 10; j++)
			{
				
				ItemBuilder iBuilder = new ItemBuilder();
				iBuilder.setImage(img);
				iBuilder.setPos(new Point(x, y));
				Item tile = iBuilder.build();
				
				objectList.add(tile);
				
				x += TILE_WIDTH/2;
				y += TILE_HEIGHT/2;
			
			}
			
		}
		
	}
	
	public void createEnemies() {
		
		File dir = new File("./resources/images/sprites/knight");
		File[] files = dir.listFiles();
		
		BufferedImage img = null;
		
		try {
			//read in the Image tile
			img = ImageIO.read(files[5]);
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		int x = DEFAULT_VIEW_SIZE / 2;
		int y = 0;
		
		for(int i = 0; i < 10; i++)
		{
			
			x = ((DEFAULT_VIEW_SIZE - TILE_WIDTH) / 2) - (TILE_WIDTH/2) * i + OFFSET;
			y = (TILE_HEIGHT*i) / 2 - OFFSET;
			
			for(int j = 0; j < 10; j++)
			{
				
				EnemyBuilder eBuilder = new EnemyBuilder();
				eBuilder.setImage(img);
				eBuilder.setPos(new Point(x, y));
				Enemy tile = eBuilder.build();
				
				enemyList.add(tile);
				
				x += TILE_WIDTH/2;
				y += TILE_HEIGHT/2;
			
			}
			
		}
		
	}
	
	
	public void paintGrid(Graphics2D g2) {
		
		for (Ground tile : tileList) {
			
		    g2.drawImage(tile.getImage(), tile.getPos().getX(), tile.getPos().getY(), null);
		    
		}
		
	}
	
	public void paintObjects(Graphics2D g2) {
		
		for (Item tile : objectList) {
			
		    g2.drawImage(tile.getImage(), tile.getPos().getX(), tile.getPos().getY(), null);
		    
		}
		
	}
	
	public void paintEnemies(Graphics2D g2) {
		
		for (Enemy tile : enemyList) {
			
		    g2.drawImage(tile.getImage(), tile.getPos().getX(), tile.getPos().getY(), null);
		    
		}
		
	}
	
}