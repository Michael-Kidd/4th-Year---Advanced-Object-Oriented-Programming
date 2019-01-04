package ie.gmit.sw;

import java.awt.image.BufferedImage;

public class GroundTile extends Tile {

	// can the tile be walked on
	private boolean isWalkable;
	// the type of tile used
	private GroundType type;

	public GroundTile() {
		super();
	}

	public GroundTile(Position p, int x, int y, BufferedImage i, boolean w, GroundType type) {
		// pass these variables to the Tile Super class
		super(p, i, x, y);
		this.isWalkable = w;
		this.type = type;
	}

	// getters and setters

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