package ie.gmit.sw;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import ie.gmit.sw.builders.EnemyBuilder;
import ie.gmit.sw.builders.GroundBuilder;
import ie.gmit.sw.builders.ItemBuilder;
import ie.gmit.sw.model.Enemy;
import ie.gmit.sw.model.Ground;
import ie.gmit.sw.model.Item;
import ie.gmit.sw.view.GameView;

public class GenerateImpl implements Generate {

	// Encapsulate the things that vary...
	private static final int DEFAULT_VIEW_SIZE = GameView.getDefaultViewSize();
	private static final int TILE_WIDTH = 128;
	private static final int TILE_HEIGHT = 64;

	public ArrayList<Ground> createGround(ArrayList<Ground> list, int offset) {

		list.clear();

		File dir = new File("./resources/images/ground");
		File[] files = dir.listFiles();

		BufferedImage img = null;

		try {
			// read in the Image tile
			img = ImageIO.read(files[0]);

		} catch (IOException e) {

			JOptionPane.showMessageDialog(null, "Image Failed to Load", "Error loading images", JOptionPane.ERROR_MESSAGE);

		}

		int x = DEFAULT_VIEW_SIZE / 2;
		int y = 0;

		for (int i = 0; i < 10; i++) {

			x = ((DEFAULT_VIEW_SIZE - TILE_WIDTH) / 2) - (TILE_WIDTH / 2) * i + offset;
			y = (TILE_HEIGHT * i) / 2 - offset;

			for (int j = 0; j < 10; j++) {

				GroundBuilder tBuilder = new GroundBuilder();
				tBuilder.setImage(img);
				tBuilder.setPos(new Point(x, y));
				Ground tile = tBuilder.build();

				list.add(tile);

				x += TILE_WIDTH / 2;
				y += TILE_HEIGHT / 2;

			}

		}

		return list;

	}

	public ArrayList<Item> createObjects(ArrayList<Item> list, int offset) {
		
		list.clear();

		File dir = new File("./resources/images/objects");
		File[] files = dir.listFiles();

		BufferedImage img = null;

		try {
			// read in the Image tile
			img = ImageIO.read(files[3]);

		} catch (IOException e) {

			JOptionPane.showMessageDialog(null, "Image Failed to Load", "Error loading images", JOptionPane.ERROR_MESSAGE);

		}

		int x = DEFAULT_VIEW_SIZE / 2;
		int y = 0;

		for (int i = 0; i < 10; i++) {

			x = ((DEFAULT_VIEW_SIZE - TILE_WIDTH) / 2) - (TILE_WIDTH / 2) * i + offset;
			y = (TILE_HEIGHT * i) / 2 - offset;

			for (int j = 0; j < 10; j++) {

				ItemBuilder iBuilder = new ItemBuilder();
				iBuilder.setImage(img);
				iBuilder.setPos(new Point(x, y));
				Item tile = iBuilder.build();

				list.add(tile);

				x += TILE_WIDTH / 2;
				y += TILE_HEIGHT / 2;

			}

		}
		
		return list;

	}

	public ArrayList<Enemy> createEnemies(ArrayList<Enemy> list, int offset) {
		
		list.clear();

		File dir = new File("./resources/images/sprites/default");
		File[] files = dir.listFiles();

		BufferedImage img = null;

		try {
			// read in the Image tile
			img = ImageIO.read(files[3]);

		} catch (IOException e) {

			JOptionPane.showMessageDialog(null, "Image Failed to Load", "Error loading images", JOptionPane.ERROR_MESSAGE);

		}

		int x = DEFAULT_VIEW_SIZE / 2;
		int y = 0;

		for (int i = 0; i < 10; i++) {

			x = ((DEFAULT_VIEW_SIZE - TILE_WIDTH) / 2) - (TILE_WIDTH / 2) * i + offset;
			y = (TILE_HEIGHT * i) / 2 - offset;

			for (int j = 0; j < 10; j++) {

				EnemyBuilder eBuilder = new EnemyBuilder();
				eBuilder.setImage(img);
				eBuilder.setPos(new Point(x, y));
				Enemy tile = eBuilder.build();

				list.add(tile);

				x += TILE_WIDTH / 2;
				y += TILE_HEIGHT / 2;

			}

		}
		
		return list;

	}

}
