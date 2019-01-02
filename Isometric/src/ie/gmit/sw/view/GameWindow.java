package ie.gmit.sw.view;

import java.awt.*;
import javax.swing.*;

import ie.gmit.sw.Grid;
import ie.gmit.sw.builders.GroundBuilder;
import ie.gmit.sw.enums.GroundType;
import ie.gmit.sw.models.GridImpl;
import ie.gmit.sw.models.GroundTile;
import ie.gmit.sw.models.Position;
import ie.gmit.sw.models.Tile;

public class GameWindow {

	private static GameWindow window_instance = null;
	
	private static final int DEFAULT_SIZE = 1280;
	private static final int VERTCIALCELLS = 10;
	private static final int HORIZONTINALCELLS = 10;
	private static final int TILEHEIGHT = 128;
	private static final int TILEWIDTH = 64;
	
	//Lower Grid
	private Grid g1 = new GridImpl(DEFAULT_SIZE, VERTCIALCELLS, HORIZONTINALCELLS, TILEHEIGHT, TILEWIDTH, 0);
	
	//UpperGrid
	private Grid g2 = new GridImpl(DEFAULT_SIZE, VERTCIALCELLS, HORIZONTINALCELLS, TILEHEIGHT, TILEWIDTH, 10);
	
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
			
			GroundBuilder tBuilder = new GroundBuilder();
			tBuilder.setType(GroundType.grass);
			tBuilder.setPos(g1.getPositions()[0][0]);
			GroundTile tile = tBuilder.build();
			
			g1.addTile(tile);
			
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
    
}