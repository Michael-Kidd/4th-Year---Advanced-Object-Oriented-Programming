package ie.gmit.sw.tiles;

import java.awt.image.BufferedImage;

import ie.gmit.sw.enums.GroundType;

public class GroundTile extends Tile{
	
	private boolean isWalkable;
	private GroundType type;
	
	public GroundTile() {
		super();
	}
	
	public GroundTile(Position p, BufferedImage i, boolean w, GroundType type) {
		super(p, i);
		this.isWalkable = w;
		this.type = type;
	}

	public boolean isWalkable() {
		return isWalkable;
	}

	public void setWalkable(boolean isWalkable) {
		this.isWalkable = isWalkable;
	}

	public GroundType getType() {
		return type;
	}

	public void setType(GroundType type) {
		this.type = type;
	}
	
}