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
	private int index = 3;
	private int dirIndex = 3;

	public SpriteTile() {
		super();
	}
	
	public SpriteTile(Position p, List<BufferedImage> images, boolean e, SpriteType t) {
		super(p, images.get(3));
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
		
		step();
		
		switch(direction.getOrientation()) {
		case 1:
			//down
			break;
		case 2:
			//left
			break;
		case 3:
			//right
			break;
		default:
			//up
			break;
		}
	}

    public Direction getDirection() {
        return this.direction;
    }
    
	public void setDirection(Direction d) {
		
		direction = d;
		
		switch(direction.getOrientation()) {
		case 1:
			//down
			index = 3;
			dirIndex = index;
			this.setImage(type.getImg().get(index));
			break;
		case 2:
			//left
			index = 6;
			dirIndex = index;
			this.setImage(type.getImg().get(index));
			break;
		case 3:
			index = 9;
			dirIndex = index;
			this.setImage(type.getImg().get(index));
			//right
			break;
		default:
			index = 0;
			dirIndex = index;
			this.setImage(type.getImg().get(index));
			//up
			break;
		}
		
	}
	
	public BufferedImage step() {
		
		index ++;
		
		if(index == dirIndex+3) {
			index = dirIndex;
		}
		
		BufferedImage image =  type.getImg().get(index);
		this.setImage(image);
		
		return image;
	}

	public BufferedImage getImage(int i) {
		return images.get(i);
	}

	public void setImage(List<BufferedImage> images) {
		this.images = images;
	}
	
}