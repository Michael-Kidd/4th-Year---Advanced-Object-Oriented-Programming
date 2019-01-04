package ie.gmit.sw;

import java.awt.image.BufferedImage;

public class ItemBuilder {

	/*
	 * used to build item objects, this can be any object that is not a character or
	 * a groundtile
	 */
	private Position pos;
	private BufferedImage image;
	private boolean isCollectable;
	private ItemType type;
	private int x;
	private int y;

	public ItemBuilder() {

	}

	// set the position of the tile
	public ItemBuilder setPos(Position pos) {
		this.pos = pos;
		return this;
	}

	// set id the item can be collected by a character
	public ItemBuilder setCollectable(boolean isCollectable) {
		this.isCollectable = isCollectable;
		return this;
	}

	// set the type of item
	public ItemBuilder setType(ItemType type) {
		this.type = type;
		return this;
	}

	// set the index of the position the tile will be placed
	public ItemBuilder setIndex(int x, int y) {
		this.x = x;
		this.y = y;
		return this;
	}

	// build the object, using the default image if it is not set manually
	// the default collectable is determined by type
	public ItemTile build() {

		if (this.image == null)
			this.image = this.type.getImg();

		this.isCollectable = this.type.isCollectable();

		return new ItemTile(pos, x, y, image, isCollectable, type);
	}

}
