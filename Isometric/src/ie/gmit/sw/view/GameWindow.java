package ie.gmit.sw.view;

import java.awt.*;
import javax.swing.*;

import ie.gmit.sw.Grid;
import ie.gmit.sw.MatchJohnsDemo;
import ie.gmit.sw.models.GridImpl;

public class GameWindow {

	private static GameWindow window_instance = null;
	
	//default size of the scene
	private static final int DEFAULT_SIZE = 1280;
	//the number of tiles across
	private static final int VERTCIALCELLS = 10;
	//the number of tiles down
	private static final int HORIZONTINALCELLS = 10;
	//the width of each tile measured in pixels
	private static final int TILEHEIGHT = 128;
	//the height of each tile measured in pixels
	private static final int TILEWIDTH = 64;
	
	//Lower Grid
	private Grid g1 = new GridImpl(DEFAULT_SIZE, VERTCIALCELLS, HORIZONTINALCELLS, TILEWIDTH, TILEHEIGHT, 0);
	//UpperGrid
	private Grid g2 = new GridImpl(DEFAULT_SIZE, VERTCIALCELLS, HORIZONTINALCELLS, TILEWIDTH, TILEHEIGHT, 10);
	
	//the panel we will show in the window - eg. Game area
	private GameView view;

	public GameWindow() {
		
		try {
			
			view = new GameView();
			
			view.setGrid1(g1);
			view.setGrid2(g2);
			
			Dimension d = new Dimension(DEFAULT_SIZE, DEFAULT_SIZE/2);
		
			view.setPreferredSize(d);
			view.setMinimumSize(d);
			view.setMaximumSize(d);
	
			JFrame f = new JFrame("GMIT - B.Sc. in Computing (Software Development)");
			
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.getContentPane().setLayout(new FlowLayout());
			f.add(view);
			f.addKeyListener(view);
			f.setSize(1000, 1000);
			f.setLocation(100, 100);
			f.pack();
			f.setVisible(true);
			
			MatchJohnsDemo.addGroundTiles(VERTCIALCELLS, HORIZONTINALCELLS, g1);
			MatchJohnsDemo.addSprites(VERTCIALCELLS, HORIZONTINALCELLS, g1);
			
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "User Interface Failed to Start \n +"+ e +"", "Failed to Start", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}

	}

	public static GameWindow getInstance() 
    {
        if (window_instance == null) 
        	window_instance = new GameWindow();
  
        return window_instance;
    }

	public static int getHorizontinalcells() {
		return HORIZONTINALCELLS;
	}
	
	public static int getVertcialcells() {
		return VERTCIALCELLS;
	}
	
	public Grid getG1() {
		return g1;
	}

	public void setG1(Grid g1) {
		this.g1 = g1;
	}

	public Grid getG2() {
		return g2;
	}

	public void setG2(Grid g2) {
		this.g2 = g2;
	}

    
}