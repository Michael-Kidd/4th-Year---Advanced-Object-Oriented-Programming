package ie.gmit.sw.models;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import ie.gmit.sw.ImageLoader;

public class ImageLoaderImpl implements ImageLoader {

	
	public Iterator<BufferedImage> loadImages(String directory) {

		File dir = new File(directory);
		File[] files = dir.listFiles();

		List<BufferedImage> images = new ArrayList<>();

		for (File f : files) {

			try {

				BufferedImage img = ImageIO.read(f);
				images.add(img);
				
			} catch (IOException e) {
				
				JOptionPane.showMessageDialog(null, "Failed to Load Images", "Error", JOptionPane.ERROR_MESSAGE);
				
			}

		}

		return images.iterator();

	}
	
}
