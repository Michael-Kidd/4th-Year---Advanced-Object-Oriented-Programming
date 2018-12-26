package ie.gmit.sw;

import java.awt.image.BufferedImage;

public class Ground {
	
	private Point pos;
	private BufferedImage image;
	
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
	
}