package ie.gmit.sw.model;

import java.awt.image.BufferedImage;

import ie.gmit.sw.Point;

public class Enemy extends Tile{
	
	private boolean engaged;
	
	public Enemy() {
		super();
	}
	
	public Enemy(Point p, BufferedImage i, boolean e) {
		super(p, i);
		this.engaged = e;
	}
	
	public boolean isEngaged() {
		return engaged;
	}

	public void setEngaged(boolean engaged) {
		this.engaged = engaged;
	}

	
}