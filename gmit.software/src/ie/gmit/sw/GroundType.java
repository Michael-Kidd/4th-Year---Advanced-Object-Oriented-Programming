package ie.gmit.sw;

import java.awt.image.BufferedImage;

/*
 * These are the type of ground tiles available
 * when called or loaded, they will store an image for each type so that the images do not need to be loaded multiple times.
 * they also contain the variable to tell if the object can be walked on, this is because tiles like water cannot be walked on
 * adding more types here will make it available in the game
 * */

public enum GroundType {

	grass(null, true), rocks(null, true), weeds(null, true), sand(null, true), water(null, false), beach(null, false),
	mud(null, true), gravel(null, true);

	// an image for the tile
	private BufferedImage img;
	// if the tile can be walked on
	private final boolean isWalkable;

	private GroundType(BufferedImage img, boolean isWalkable) {
		this.isWalkable = isWalkable;
		this.img = img;
	}

	// getters and setters

	public void setImg(BufferedImage img) {
		this.img = img;
	}

	public BufferedImage getImg() {
		return img;
	}

	public boolean isWalkable() {
		return isWalkable;
	}

}
