package ie.gmit.sw.models;

import java.util.ArrayList;

import ie.gmit.sw.Grid;
import ie.gmit.sw.models.Position;

public class GridImpl implements Grid {
	
	private static int DEFAULT_SIZE;
	private int offset;
	private static int tileHeight;
	private static int tileWidth;
	
	private static Position positions[][];
	private ArrayList <Tile> tiles = new ArrayList<>();
	
	private Position currentPos = new Position(DEFAULT_SIZE / 2, 0);
	
	public GridImpl(int size, int v, int h, int tileH, int tileW, int offset) {
		
		positions = new Position[v][h];
		
		DEFAULT_SIZE = size;
		tileHeight = tileH;
		tileWidth = tileW;
		this.offset = offset;
		
		createStartingPositions(v, h);
		
	}
	
	private void createStartingPositions(int v, int h) {
		
		for(int i = 0; i < v; i++) {
			
			this.currentPos.setX( ((DEFAULT_SIZE - tileWidth) / 2) - (tileWidth / 2) * i + offset);
			this.currentPos.setY((tileHeight * i) / 2 - offset);
			
			for(int j = 0; j < v; j++) {
				
				positions[i][j] = new Position(this.currentPos.getX(),this.currentPos.getY());
				this.currentPos.setX(tileWidth * j);
				
				this.currentPos.setX(this.currentPos.getX() + tileWidth / 2);
				this.currentPos.setY(this.currentPos.getY() + tileHeight / 2);
				
			}
			
		}
		
	}

	public ArrayList<Tile> getTiles() {
		return tiles;
	}

	public void setTiles(ArrayList<Tile> t) {
		tiles = t;
	}
	
	public void addTile(Tile t) {
		tiles.add(t);
	}

	public Position[][] getPositions() {
		return positions;
	}

	public void setPositions(Position[][] p) {
		positions = p;
	}
}
