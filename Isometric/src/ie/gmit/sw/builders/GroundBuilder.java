package ie.gmit.sw.builders;

import java.awt.image.BufferedImage;

import ie.gmit.sw.enums.GroundType;
import ie.gmit.sw.tiles.GroundTile;
import ie.gmit.sw.tiles.Position;

public class GroundBuilder {

	private Position pos;
	private BufferedImage image;
	private boolean isWalkable;
	private GroundType type;
	
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

	public GroundTile build() {
		
		if(this.image == null)
			this.image = this.type.getImg();
		if(this.isWalkable)
			this.isWalkable = this.type.isWalkable();
		
	   return new GroundTile(pos, image, isWalkable, type);
	}

}
