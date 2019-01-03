package ie.gmit.sw.models;

import java.awt.image.BufferedImage;

import ie.gmit.sw.enums.GroundType;

public class GroundTile extends Tile{
	
	private boolean isWalkable;
	private GroundType type;
	
	public GroundTile() {
		super();
	}
	
	public GroundTile(Position p, int x, int y, BufferedImage i, boolean w, GroundType type) {
		super(p, i, x, y);
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