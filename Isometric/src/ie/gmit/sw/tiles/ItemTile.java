package ie.gmit.sw.tiles;

import java.awt.image.BufferedImage;

import ie.gmit.sw.enums.ItemType;

public class ItemTile extends Tile{
	
	private boolean isCollectable;
	private ItemType type;
	
	public ItemTile() {
		super();
	}
	
	public ItemTile(Position p, BufferedImage i, Boolean c) {
		super(p, i);
		this.isCollectable = c;
	}

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