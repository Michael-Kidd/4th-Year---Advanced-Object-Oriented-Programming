package ie.gmit.sw;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class ImageLoaderImpl implements ImageLoader {

	/*
	 * class used to load images from a given directory and return the as an
	 * iterator
	 */

	public Iterator<BufferedImage> loadImages(String directory) {

		// directory where the files can be found
		File dir = new File(directory);
		// a list of all files in the directory
		File[] files = dir.listFiles();

		// a list of the images
		List<BufferedImage> images = new ArrayList<>();

		// loop through the files
		for (File f : files) {

			try {

				// read in the file as an image
				BufferedImage img = ImageIO.read(f);
				// add the image to the list of images
				images.add(img);

			} catch (IOException e) {

				// inform the user if the images fail to load
				JOptionPane.showMessageDialog(null, "Failed to Load Images", "Error", JOptionPane.ERROR_MESSAGE);

			}

		}

		// return the images as an iterator
		return images.iterator();

	}

}
