package ie.gmit.sw;

import java.awt.image.BufferedImage;

public class ItemBuilder {

	private Position pos;
	private BufferedImage image;
	private boolean isCollectable;
	private ItemType type;
	private int x;
	private int y;
	
	public ItemBuilder() {
		
	}
	
	public ItemBuilder setPos(Position pos) {
		this.pos = pos;
		return this;
	}
	
	public ItemBuilder setCollectable(boolean isCollectable) {
		this.isCollectable = isCollectable;
		return this;
	}
	
	public ItemBuilder setType(ItemType type) {
		this.type = type;
		return this;
	}
	
	public ItemBuilder setIndex(int x, int y) {
		this.x = x;
		this.y = y;
		return this;
	}

   public ItemTile build() {
	   
		if(this.image == null)
			this.image = this.type.getImg();

			this.isCollectable = this.type.isCollectable();
		
	   return new ItemTile(pos, x, y, image, isCollectable, type);
	}
	
}
