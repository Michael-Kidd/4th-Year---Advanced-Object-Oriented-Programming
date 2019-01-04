package ie.gmit.sw;

import java.awt.image.BufferedImage;
import java.util.List;

/*
 * used to build character sprites
 * to add more characters, they must be added to the spritetype class, they may also be added to the sprite factory
 * images must be added to the needed folders in resources
 * */
public class SpriteBuilder {

	private Position pos;
	private List<BufferedImage> images;
	private boolean engaged;
	private SpriteType type;
	private int x;
	private int y;

	public SpriteBuilder() {

	}

	//set the postion of the tile
	public SpriteBuilder setPos(Position pos) {
		this.pos = pos;
		return this;
	}

	//set the image used for the tile
	public SpriteBuilder setImage(List<BufferedImage> images) {
		this.images = images;
		return this;
	}

	//set this if the sprite is fighting another sprite
	public SpriteBuilder setEngaged(boolean e) {
		this.engaged = e;
		return this;
	}

	//set the type of sprite
	public SpriteBuilder setType(SpriteType type) {
		this.type = type;
		return this;
	}

	//set the index for the position of the object
	public SpriteBuilder setIndex(int x, int y) {
		this.x = x;
		this.y = y;
		return this;
	}

	//build the characters and set the default image for its type if not specified
	public SpriteTile build() {

		if (this.images == null)
			this.images = this.type.getImg();
		
		//set ot enagegd by default
		this.engaged = this.type.isEngaged();

		return new SpriteTile(pos, x, y, images, engaged, type);
	}

}
