package ie.gmit.sw.tiles;

import java.awt.image.BufferedImage;

import ie.gmit.sw.Point;

public class Tile {
	
	private Point pos;
	private BufferedImage image;
	
	public Tile() {

	}
	
	public Tile(Point p, BufferedImage i) {
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
