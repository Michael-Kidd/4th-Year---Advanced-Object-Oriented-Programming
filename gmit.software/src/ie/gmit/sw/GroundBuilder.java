package ie.gmit.sw;

import java.awt.image.BufferedImage;

public class GroundBuilder {

	/*
	 * Used to build ground tiles
	 */
	private Position pos;
	private BufferedImage image;
	private boolean isWalkable;
	private GroundType type;
	private int x;
	private int y;

	public GroundBuilder() {

	}

	//set the position of the tile
	public GroundBuilder setPos(Position pos) {
		this.pos = pos;
		return this;
	}

	//set the image used for the tile
	public GroundBuilder setImage(BufferedImage image) {
		this.image = image;
		return this;
	}
	
	//set if the tile can be walked on by a spite, this will be false by default for water etc
	public GroundBuilder setWalkable(boolean isWalkable) {
		this.isWalkable = isWalkable;
		return this;
	}

	//set the type of groundtile being used, found using an enum of types so more types could be added if need be
	public GroundBuilder setType(GroundType type) {
		this.type = type;
		return this;
	}

	//set the index the position of the object can be found at
	public GroundBuilder setIndex(int x, int y) {
		this.x = x;
		this.y = y;
		return this;
	}

	//build the ground tile and use default values that are needed if not set
	public GroundTile build() {

		if (this.image == null)
			this.image = this.type.getImg();

		this.isWalkable = this.type.isWalkable();

		return new GroundTile(pos, x, y, image, isWalkable, type);
	}

}
