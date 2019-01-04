package ie.gmit.sw;

import java.awt.image.BufferedImage;

/*
 * this is out item tiles objects,
 * used for anything that is not a character or ground tile
 * */

public class ItemTile extends Tile {

	// can the item be collected in the game eg. picked up
	private boolean isCollectable;
	// what is the item type
	private ItemType type;

	public ItemTile() {
		super();
	}

	public ItemTile(Position p, int x, int y, BufferedImage i, Boolean c, ItemType type) {
		// pass these variable to the tile super class
		super(p, i, x, y);
		this.isCollectable = c;
		this.type = type;
	}

	// Setters and getters

	public boolean isCollectable() {
		return isCollectable;
	}

	public void setCollectable(boolean isCollectable) {
		this.isCollectable = isCollectable;
	}

	public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}

}