package ie.gmit.sw.model;

import java.awt.image.BufferedImage;

import ie.gmit.sw.controller.Point;

public class Item {
	
	private Point pos;
	private BufferedImage image;
	
	public Item() {
		
	}
	
	public Item(Point p, BufferedImage i) {
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
	
}