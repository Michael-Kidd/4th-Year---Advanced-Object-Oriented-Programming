package ie.gmit.sw.model;

import java.awt.image.BufferedImage;

import ie.gmit.sw.Point;

public class Ground extends Tile{
	
	private boolean isWalkable;
	
	public Ground() {
		super();
	}
	
	public Ground(Point p, BufferedImage i, boolean w) {
		super(p, i);
		this.isWalkable = w;
	}

	public boolean isWalkable() {
		return isWalkable;
	}

	public void setWalkable(boolean isWalkable) {
		this.isWalkable = isWalkable;
	}
	
}