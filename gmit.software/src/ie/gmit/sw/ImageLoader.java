package ie.gmit.sw;

import java.awt.image.BufferedImage;
import java.util.Iterator;

/*
 * interface used for loading images
 * */
public interface ImageLoader {

	public Iterator<BufferedImage> loadImages(String directory);

}
