package ie.gmit.sw.builders;

import java.awt.image.BufferedImage;

import ie.gmit.sw.tiles.SpriteTile;
import ie.gmit.sw.tiles.Position;

public class EnemyBuilder {

	private Position pos;
	private BufferedImage image;
	private boolean engaged;
	
	public EnemyBuilder() {
		
	}
	
	public EnemyBuilder setPos(Position pos) {
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

   public SpriteTile build() {
	   return new SpriteTile(pos, image, engaged);
	}

}
