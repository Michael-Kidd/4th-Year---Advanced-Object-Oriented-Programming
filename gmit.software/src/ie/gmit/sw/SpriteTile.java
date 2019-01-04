package ie.gmit.sw;

import java.awt.image.BufferedImage;
import java.util.List;

public class SpriteTile extends Tile {

	private Direction direction = Direction.DOWN;
	private boolean engaged;
	private SpriteType type;
	private List<BufferedImage> images;
	private int index = 3;
	private int dirIndex = 3;
	private boolean canMove;

	public SpriteTile() {
		super();
	}

	public SpriteTile(Position p, int x, int y, List<BufferedImage> images, boolean e, SpriteType t) {
		super(p, images.get(3), x, y);
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

	public Direction getDirection() {
		return this.direction;
	}

	public void setDirection(Direction d) {

		direction = d;

		switch (direction.getOrientation()) {
		case 1:
			// down
			if (index > 3 && index < 6) {
				return;
			}
			changeImage(3);
			break;
		case 2:
			// left
			if (index > 6 && index < 9) {
				return;
			}
			changeImage(6);
			break;
		case 3:
			if (index > 9 && index < 11) {
				return;
			}
			changeImage(9);
			// right
			break;
		default:
			if (index > 0 && index < 3) {
				return;
			}
			changeImage(0);
			// up
			break;
		}

	}

	public BufferedImage step() {

		index++;

		if (index == dirIndex + 3) {
			index = dirIndex;
		}

		BufferedImage image = type.getImg().get(index);
		this.setImage(image);

		return image;
	}

	public BufferedImage getImage(int i) {
		return images.get(i);
	}

	public void setImage(List<BufferedImage> images) {
		this.images = images;
	}

	private void changeImage(int i) {
		index = i;
		dirIndex = index;
		this.setImage(type.getImg().get(index));
	}

	public boolean moveable() {

		return canMove;
	}

}