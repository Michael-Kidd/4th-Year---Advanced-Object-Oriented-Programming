package ie.gmit.sw.builders;

import java.awt.image.BufferedImage;

import ie.gmit.sw.controller.Point;
import ie.gmit.sw.model.Enemy;

public class EnemyBuilder {

	private Point pos;
	private BufferedImage image;
	
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

   public Enemy build() {
	   return new Enemy(pos, image);
	}

}