package ie.gmit.sw.tiles;

import java.awt.image.BufferedImage;

public class Tile {
	
	private Position pos;
	private BufferedImage image;
	
	public Tile() {
		
	}
	
	public Tile(Position p, BufferedImage i) {
		this.pos = p;
		this.image = i;
	}
	
	public Position getPos() {
		return pos;
	}
	
	public BufferedImage getImage() {
		return image;
	}
	
	public void setPos(Position pos) {
		this.pos = pos;
	}
	
	public void setImage(BufferedImage image) {
		this.image = image;
	}
	
}
