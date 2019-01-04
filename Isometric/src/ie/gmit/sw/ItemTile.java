package ie.gmit.sw;

import java.awt.image.BufferedImage;

public class ItemTile extends Tile{
	
	private boolean isCollectable;
	private ItemType type;
	
	public ItemTile() {
		super();
	}
	
	public ItemTile(Position p, int x, int y, BufferedImage i, Boolean c, ItemType type) {
		super(p, i, x, y);
		this.isCollectable = c;
		this.type = type;
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