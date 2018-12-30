package ie.gmit.sw.models;

import java.awt.image.BufferedImage;

import ie.gmit.sw.enums.SpriteType;

public class SpriteTile extends Tile{
	
	private boolean engaged;
	private SpriteType type;
	
	public SpriteTile() {
		super();
	}
	
	public SpriteTile(Position p, BufferedImage i, boolean e) {
		super(p, i);
		this.engaged = e;
	}
	
	public boolean isEngaged() {
		return engaged;
	}

	public void setEngaged(boolean engaged) {
		this.engaged = engaged;
	}

	public SpriteType getType() {
		return type;
	}

	public void setType(SpriteType type) {
		this.type = type;
	}

	
}