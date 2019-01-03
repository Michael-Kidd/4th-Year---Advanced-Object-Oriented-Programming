package ie.gmit.sw;

import java.util.ArrayList;

import ie.gmit.sw.models.GroundTile;
import ie.gmit.sw.models.ItemTile;
import ie.gmit.sw.models.Position;
import ie.gmit.sw.models.Tile;

public interface Grid {
	
	ArrayList<Tile> getTiles();
	
	void setTiles(ArrayList<Tile> t);
	
	void addTile(Tile t);

	Position[][] getPositions();
	
	void setPositions(Position[][] p);
	
	Position position(int down, int across);
	
	boolean ocupied(int a, int b);
	
	int[] getIndex(Position p);
	
	GroundTile getGroundTile(int a, int b);
	
	ItemTile getItemTile(int a, int b);
	
}
