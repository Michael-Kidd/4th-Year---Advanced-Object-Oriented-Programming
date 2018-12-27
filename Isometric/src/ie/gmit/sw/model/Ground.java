package ie.gmit.sw.model;

import java.awt.image.BufferedImage;

import ie.gmit.sw.controller.Point;

public class Ground {
	
	private Point pos;
	private BufferedImage image;
	private boolean isWalkable;
	
	public Ground() {
		
	}
	
	public Ground(Point p, BufferedImage i) {
		this.pos = p;
		this.image = i;
	}
	
	public Point getPos() {
		return pos;
	}
	public BufferedImage getImage() {
		return image;
	}
	public void setPos(Point pos) {
		this.pos = pos;
	}
	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public boolean isWalkable() {
		return isWalkable;
	}

	public void setWalkable(boolean isWalkable) {
		this.isWalkable = isWalkable;
	}
	
}