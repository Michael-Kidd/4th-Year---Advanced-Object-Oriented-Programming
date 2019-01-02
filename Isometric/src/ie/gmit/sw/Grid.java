package ie.gmit.sw;

import java.util.ArrayList;

import ie.gmit.sw.models.Tile;

public interface Grid {
	
	ArrayList<Tile>[][] getGrid();
	void setGrid(ArrayList<Tile>[][] gridTiles); 
	
	int getHeight();
	void setHeight(int height);
	int getWidth();
	void setWidth(int width);
	
	void moveTileLeft();
	void moveTileRight();
	void moveTileUp();
	void moveTileDown();
	
	void emptyTile();

}
