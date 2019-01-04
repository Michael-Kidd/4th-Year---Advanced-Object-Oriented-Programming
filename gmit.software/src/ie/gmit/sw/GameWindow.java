package ie.gmit.sw;

import java.awt.*;
import javax.swing.*;

public class GameWindow {

	private static GameWindow window_instance = null;

	// default size of the scene
	private static final int DEFAULT_SIZE = 1280;
	// the number of tiles across
	private static final int VERTCIALCELLS = 10;
	// the number of tiles down
	private static final int HORIZONTINALCELLS = 10;
	// the width of each tile measured in pixels
	private static final int TILEHEIGHT = 128;
	// the height of each tile measured in pixels
	private static final int TILEWIDTH = 64;

	// Lower Grid
	private Grid g1 = new GridImpl(DEFAULT_SIZE, VERTCIALCELLS, HORIZONTINALCELLS, TILEWIDTH, TILEHEIGHT, 0);
	// UpperGrid
	private Grid g2 = new GridImpl(DEFAULT_SIZE, VERTCIALCELLS, HORIZONTINALCELLS, TILEWIDTH, TILEHEIGHT, 10);

	// the panel we will show in the window - eg. Game area
	private GameView view;

	public GameWindow() {

		try {

			view = new GameView();

			// set the upper and lower grids in the game
			view.setGrid1(g1);
			view.setGrid2(g2);

			// sets the panel dimensions
			Dimension d = new Dimension(DEFAULT_SIZE, DEFAULT_SIZE / 2);

			// set the sizes of the panel, so it can be resized, stretched etc
			view.setPreferredSize(d);
			view.setMinimumSize(d);
			view.setMaximumSize(d);

			// add a new frame with title
			JFrame f = new JFrame("GMIT - B.Sc. in Computing (Software Development)");

			// set the default action if window closed, to end the frame
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// set the layout type used in the frame
			f.getContentPane().setLayout(new FlowLayout());
			// add the game panel to the frame
			f.add(view);
			// add a listener to the game view
			f.addKeyListener(view);
			// set the size of the frame
			f.setSize(1000, 1000);
			// set the on screen location of the window
			f.setLocation(100, 100);
			f.pack();
			// make the frame seen on screen
			f.setVisible(true);

			
			//These are used simply to populate the grid with tiles to match the demo given by the lecturer
			//not really needed, just used to demo the game
			//adding tiles for the ground grid
			MatchJohnsDemo.addGroundTiles(VERTCIALCELLS, HORIZONTINALCELLS, g1);
			//adding objects to the map
			MatchJohnsDemo.addObjects(VERTCIALCELLS, HORIZONTINALCELLS, g2);
			//set the player variable
			view.setPlayer(MatchJohnsDemo.addPlayer(VERTCIALCELLS, HORIZONTINALCELLS, g2));
			//add enemy sprites to the game
			//these will not move now, but they could be made to automatically move using the same manner as the player
			//and randomising the direction, using the movement class, no sprite will walk off the map or enter a tile 
			//with an object or sprite ocupying the tile
			MatchJohnsDemo.addSprites(VERTCIALCELLS, HORIZONTINALCELLS, g2);

		} catch (Exception e) {
			//let the user know if the game fails to load.
			JOptionPane.showMessageDialog(null, "User Interface Failed to Start \n +" + e + "", "Failed to Start",
					JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}

	}
	
	//Keep the window as a singleton.
	public static GameWindow getInstance() {
		if (window_instance == null)
			window_instance = new GameWindow();

		return window_instance;
	}

}