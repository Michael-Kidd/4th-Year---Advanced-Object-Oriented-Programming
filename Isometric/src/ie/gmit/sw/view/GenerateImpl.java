package ie.gmit.sw.view;

import java.util.ArrayList;

import ie.gmit.sw.Point;
import ie.gmit.sw.builders.GroundBuilder;
import ie.gmit.sw.builders.ItemBuilder;
import ie.gmit.sw.enums.GroundType;
import ie.gmit.sw.enums.ItemType;
import ie.gmit.sw.tiles.Enemy;
import ie.gmit.sw.tiles.Ground;
import ie.gmit.sw.tiles.Item;

public class GenerateImpl implements Generate {

	private static final int DEFAULT_VIEW_SIZE = GameView.getDefaultViewSize();
	private static final int TILE_WIDTH = 128;
	private static final int TILE_HEIGHT = 64;

	public ArrayList<Ground> createGround(ArrayList<Ground> list, int offset) {

		list.clear();

		int x = DEFAULT_VIEW_SIZE / 2;
		int y = 0;

		for (int i = 0; i < 10; i++) {

			x = ((DEFAULT_VIEW_SIZE - TILE_WIDTH) / 2) - (TILE_WIDTH / 2) * i + offset;
			y = (TILE_HEIGHT * i) / 2 - offset;

			for (int j = 0; j < 10; j++) {

				GroundBuilder tBuilder = new GroundBuilder();
				tBuilder.setImage(GroundType.grass.getImg());
				tBuilder.setPos(new Point(x, y));
				tBuilder.setWalkable(GroundType.grass.isWalkable());
				Ground tile = tBuilder.build();
				list.add(tile);

				x += TILE_WIDTH / 2;
				y += TILE_HEIGHT / 2;

			}
		}

		return list;

	}

	public ArrayList<Item> createObjects(ArrayList<Item> list, int offset) {

		int x = DEFAULT_VIEW_SIZE / 2;
		int y = 0;

		for (int i = 0; i < 10; i++) {

			x = ((DEFAULT_VIEW_SIZE - TILE_WIDTH) / 2) - (TILE_WIDTH / 2) * i + offset;
			y = (TILE_HEIGHT * i) / 2 - offset;

			for (int j = 0; j < 10; j++) {

				ItemBuilder tBuilder = new ItemBuilder();
				tBuilder.setImage(ItemType.tree.getImg());
				tBuilder.setPos(new Point(x, y));
				tBuilder.setCollectable(ItemType.tree.isCollectable());
				Item tile = tBuilder.build();
				list.add(tile);

				x += TILE_WIDTH / 2;
				y += TILE_HEIGHT / 2;

			}
		}

		return list;

	}

	public ArrayList<Enemy> createEnemies(ArrayList<Enemy> list, int offset) {

		return list;

	}

}