package ie.gmit.sw;

import java.awt.image.BufferedImage;
import java.util.Iterator;

public interface ResourceLoader {
	
	public Iterator<BufferedImage> loadImages(String directory);
	
}
