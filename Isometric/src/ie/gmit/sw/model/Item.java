package ie.gmit.sw.model;

import java.awt.image.BufferedImage;

import ie.gmit.sw.Point;

public class Item extends Tile{
	
	private boolean isCollectable;
	
	public Item() {
		super();
	}
	
	public Item(Point p, BufferedImage i, Boolean c) {
		super(p, i);
		this.isCollectable = c;
	}

	public boolean isCollectable() {
		return isCollectable;
	}

	public void setCollectable(boolean isCollectable) {
		this.isCollectable = isCollectable;
	}
	
}