package ie.gmit.sw;

import java.util.ArrayList;

/*This interface is used to access methods used for the creation of the grids
 * it is also used for setting and retrieving info from those grids
 * */

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
