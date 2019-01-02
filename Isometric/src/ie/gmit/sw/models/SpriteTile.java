package ie.gmit.sw.models;

import java.awt.image.BufferedImage;
import java.util.List;

import ie.gmit.sw.enums.Direction;
import ie.gmit.sw.enums.SpriteType;

public class SpriteTile extends Tile{
	
	private Direction direction = Direction.DOWN;
	private boolean engaged;
	private SpriteType type;
	private List<BufferedImage> images;

	public SpriteTile() {
		super();
	}
	
	public SpriteTile(Position p, List<BufferedImage> images, boolean e, SpriteType t) {
		super(p, images.get(0));
		this.engaged = e;
		this.type = t;
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
	
	public void move() {
		
		step(direction);
		
		switch(direction.getOrientation()) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			break;
		}
	}

    public Direction getDirection() {
        return this.direction;
    }
    
	public void setDirection(Direction d) {
		direction = d;
	}
	
	public BufferedImage step(Direction d) {
		return null;
	}

	public BufferedImage getImage(int i) {
		return images.get(i);
	}

	public void setImage(List<BufferedImage> images) {
		this.images = images;
	}
	
}