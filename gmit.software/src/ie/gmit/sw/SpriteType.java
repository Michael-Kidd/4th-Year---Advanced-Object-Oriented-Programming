package ie.gmit.sw;

import java.awt.image.BufferedImage;

/*
 * this enum is used to identify the type of character created
 * adding more types here will make them available in the game
 * */
import java.util.List;

public enum SpriteType {

	standard(false), green(false), knight(false), person(false);

	// list of images for the type
	private List<BufferedImage> img;
	// is the sprite fighting another sprite
	private boolean isEngaged;

	// setters and getters

	SpriteType(Boolean e) {
		this.isEngaged = e;
	}

	private SpriteType(List<BufferedImage> img) {
		this.img = img;
	}

	public void setImg(List<BufferedImage> images) {
		this.img = images;
	}

	public List<BufferedImage> getImg() {
		return img;
	}

	public boolean isEngaged() {
		return isEngaged;
	}

	public void setEngaged(boolean isEngaged) {
		this.isEngaged = isEngaged;
	}

}
