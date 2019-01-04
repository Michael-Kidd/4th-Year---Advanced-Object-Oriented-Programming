package ie.gmit.sw;

import java.util.ArrayList;

import ie.gmit.sw.Position;

public class GridImpl implements Grid {

	// the size of the grid
	private static int DEFAULT_SIZE;
	// how much to offset the grid by
	// the first grid should be set to 0 and offset any further grids by the value
	// you choose
	private int offset;
	// the height of individual tiles
	private int TILE_HEIGHT;
	// the width of tiles
	private int TILE_WIDTH;

	// an array of positions available in the grid
	private Position positions[][];
	// a list of tiles used in the grid
	// by default it will be empty and populated when game starts
	private ArrayList<Tile> tiles = new ArrayList<>();

	// set a position to a pixel at the center of the screen at the very top
	private Position pos = new Position(DEFAULT_SIZE / 2, 0);

	public GridImpl(int size, int down, int across, int tileH, int tileW, int offset) {
		// set the array size
		positions = new Position[down][across];

		DEFAULT_SIZE = size;
		TILE_HEIGHT = tileH;
		TILE_WIDTH = tileW;
		this.offset = offset;

		// this will create an array of available positions
		createStartingPositions(down, across);

	}

	/*
	 * This method will populate the default positions of the tiles so that we can
	 * quickly get the position if needed
	 */
	private void createStartingPositions(int down, int across) {

		for (int i = 0; i < down; i++) {

			offsetPositions(i, this.offset);

			for (int j = 0; j < across; j++) {
				this.positions[i][j] = new Position(this.pos.getX(), this.pos.getY());
				nextPosition();
			}
		}
	}

	// get a specific position
	public Position position(int down, int across) {
		return positions[down][across];
	}

	// offset this position
	// called using the loop each time a row is started
	public void offsetPositions(int i, int offset) {
		pos.setX(((DEFAULT_SIZE - TILE_WIDTH) / 2) - (TILE_WIDTH / 2) * i + offset);
		pos.setY((TILE_HEIGHT * i) / 2 - offset);
	}

	// set the next position in the array
	public void nextPosition() {
		pos.setX(pos.getX() + TILE_WIDTH / 2);
		pos.setY(pos.getY() + TILE_HEIGHT / 2);
	}

	// retrieve tiles used in displaying a grid
	public ArrayList<Tile> getTiles() {
		return tiles;
	}

	// set the list of tiles
	public void setTiles(ArrayList<Tile> t) {
		tiles = t;
	}

	// add tile to the list
	public void addTile(Tile t) {
		tiles.add(t);
	}

	// find if a tile is ocupied
	public boolean ocupied(int a, int b) {
		return tiles.stream().filter(o -> o.getPos().equals(positions[a][b])).findFirst().isPresent();
	}

	// retrieve a ground tile
	public GroundTile getGroundTile(int a, int b) {

		return (GroundTile) tiles.stream().filter(o -> o.getPos().equals(positions[a][b])).findFirst().get();
	}

	public ItemTile getItemTile(int a, int b) {

		if (tiles.stream().filter(o -> o.getPos().equals(positions[a][b])).findFirst().isPresent()) {

			return (ItemTile) tiles.stream().filter(o -> o.getPos().equals(positions[a][b])).findFirst().get();

		}

		return null;
	}

	// get the array of positions
	public Position[][] getPositions() {
		return this.positions;
	}

	// set the array of positions
	public void setPositions(Position[][] p) {
		this.positions = p;
	}

	// retrieve the indecies of a specific position
	public int[] getIndex(Position p) {

		int[] index = { 0, 0 };

		for (int i = 0; i < positions.length; i++) {

			index[0] = i;

			for (int j = 0; j < positions[0].length; j++) {

				index[1] = j;

				if (p.getX() == positions[i][j].getX() && p.getY() == positions[i][j].getY()) {
					return index;
				}
			}

		}

		return index;
	}
}
