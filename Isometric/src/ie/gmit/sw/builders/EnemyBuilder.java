package ie.gmit.sw.builders;

import java.awt.image.BufferedImage;

import ie.gmit.sw.Point;
import ie.gmit.sw.model.Enemy;

public class EnemyBuilder {

	private Point pos;
	private BufferedImage image;
	private boolean engaged;
	
	public EnemyBuilder() {
		
	}
	
	public EnemyBuilder setPos(Point pos) {
		this.pos = pos;
		return this;
	}

	public EnemyBuilder setImage(BufferedImage image) {
		this.image = image;
		return this;
	}
	
	public EnemyBuilder setEngaged(boolean e) {
		this.engaged = e;
		return this;
	}

   public Enemy build() {
	   return new Enemy(pos, image, engaged);
	}

}
