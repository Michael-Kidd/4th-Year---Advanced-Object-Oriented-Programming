package ie.gmit.sw.builders;

import java.awt.image.BufferedImage;
import java.util.List;

import ie.gmit.sw.enums.SpriteType;
import ie.gmit.sw.models.Position;
import ie.gmit.sw.models.SpriteTile;

public class SpriteBuilder {

	private Position pos;
	private List<BufferedImage> images;
	private boolean engaged;
	private SpriteType type;
	
	public SpriteBuilder() {
		
	}
	
	public SpriteBuilder setPos(Position pos) {
		this.pos = pos;
		return this;
	}

	public SpriteBuilder setImage(List<BufferedImage> images) {
		this.images = images;
		return this;
	}
	
	public SpriteBuilder setEngaged(boolean e) {
		this.engaged = e;
		return this;
	}

	public SpriteBuilder setType(SpriteType type) {
		this.type = type;
		return this;
	}

	public SpriteTile build() {
		
		if(this.images == null)
			this.images = this.type.getImg();
		
		this.engaged = this.type.isEngaged();
		
	   return new SpriteTile(pos, images, engaged, type);
	}

}
