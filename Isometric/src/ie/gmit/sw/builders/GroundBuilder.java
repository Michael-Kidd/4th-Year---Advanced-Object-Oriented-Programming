package ie.gmit.sw.builders;

import java.awt.image.BufferedImage;

import ie.gmit.sw.controller.Point;
import ie.gmit.sw.model.Ground;

public class GroundBuilder {

	private Point pos;
	private BufferedImage image;
	private boolean isWalkable;
	
	public GroundBuilder() {
		
	}
	
	public GroundBuilder setPos(Point pos) {
		this.pos = pos;
		return this;
	}

	public GroundBuilder setImage(BufferedImage image) {
		this.image = image;
		return this;
	}

	public void setWalkable(boolean isWalkable) {
		this.isWalkable = isWalkable;
	}

	public Ground build() {
	   return new Ground(pos, image, isWalkable);
	}

}
