package ie.gmit.sw;

import java.awt.image.BufferedImage;

public class GroundBuilder {

	private Point pos;
	private BufferedImage image;
	
	public GroundBuilder() {
		
	}
	
	public GroundBuilder setPos(Point pos) {
		this.pos = pos;
		return this;
	}

	public GroundBuilder setImage(BufferedImage image) {
		this.image = image;
		return this;
	}
	
   public Ground createGround() {
      return new Ground(pos, image);
   }

}
