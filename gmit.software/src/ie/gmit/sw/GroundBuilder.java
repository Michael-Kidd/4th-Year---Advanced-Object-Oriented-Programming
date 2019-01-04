package ie.gmit.sw;

import java.awt.image.BufferedImage;

public class GroundBuilder {

	private Position pos;
	private BufferedImage image;
	private boolean isWalkable;
	private GroundType type;
	private int x;
	private int y;
	
	public GroundBuilder() {
		
	}
	
	public GroundBuilder setPos(Position pos) {
		this.pos = pos;
		return this;
	}

	public GroundBuilder setImage(BufferedImage image) {
		this.image = image;
		return this;
	}

	public GroundBuilder setWalkable(boolean isWalkable) {
		this.isWalkable = isWalkable;
		return this;
	}
	
	public GroundBuilder setType(GroundType type) {
		this.type = type;
		return this;
	}
	
	public GroundBuilder setIndex(int x, int y) {
		this.x = x;
		this.y = y;
		return this;
	}
	
	public GroundTile build() {
		
		if(this.image == null)
			this.image = this.type.getImg();
		
			this.isWalkable = this.type.isWalkable();
		
	   return new GroundTile(pos, x, y, image, isWalkable, type);
	}

}
