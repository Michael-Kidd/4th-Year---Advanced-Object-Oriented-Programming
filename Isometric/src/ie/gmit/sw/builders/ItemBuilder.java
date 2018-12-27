package ie.gmit.sw.builders;

import java.awt.image.BufferedImage;

import ie.gmit.sw.controller.Point;
import ie.gmit.sw.model.Item;

public class ItemBuilder {

	private Point pos;
	private BufferedImage image;
	
	public ItemBuilder() {
		
	}
	
	public ItemBuilder setPos(Point pos) {
		this.pos = pos;
		return this;
	}

	public ItemBuilder setImage(BufferedImage image) {
		this.image = image;
		return this;
	}

   public Item build() {
	   return new Item(pos, image);
	}

}
