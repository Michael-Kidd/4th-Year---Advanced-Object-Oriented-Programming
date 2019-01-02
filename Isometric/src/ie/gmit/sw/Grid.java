package ie.gmit.sw;

import java.util.ArrayList;

import ie.gmit.sw.models.Position;
import ie.gmit.sw.models.Tile;

public interface Grid {
	
	ArrayList<Tile> getTiles();
	
	void setTiles(ArrayList<Tile> t);
	
	void addTile(Tile t);

	Position[][] getPositions();
	
	void setPositions(Position[][] p);
}
