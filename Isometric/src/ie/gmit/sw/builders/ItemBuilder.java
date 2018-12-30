package ie.gmit.sw.builders;

import java.awt.image.BufferedImage;

import ie.gmit.sw.enums.ItemType;
import ie.gmit.sw.models.ItemTile;
import ie.gmit.sw.models.Position;

public class ItemBuilder {

	private Position pos;
	private BufferedImage image;
	private boolean isCollectable;
	private ItemType type;
	
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

   public ItemTile build() {
	   
		if(this.image == null)
			this.image = this.type.getImg();

			this.isCollectable = this.type.isCollectable();
		
	   return new ItemTile(pos, image, isCollectable, type);
	}
	
}
