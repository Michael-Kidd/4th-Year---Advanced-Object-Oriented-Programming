package ie.gmit.sw.builders;

import java.awt.image.BufferedImage;

import ie.gmit.sw.tiles.ItemTile;
import ie.gmit.sw.tiles.Position;

public class ItemBuilder {

	private Position pos;
	private BufferedImage image;
	private boolean isCollectable;
	
	public ItemBuilder() {
		
	}
	
	public ItemBuilder setPos(Position pos) {
		this.pos = pos;
		return this;
	}
	
	public void setCollectable(boolean isCollectable) {
		this.isCollectable = isCollectable;
	}

	public ItemBuilder setImage(BufferedImage image) {
		this.image = image;
		return this;
	}

   public ItemTile build() {
	   return new ItemTile(pos, image, isCollectable);
	}
	
}
