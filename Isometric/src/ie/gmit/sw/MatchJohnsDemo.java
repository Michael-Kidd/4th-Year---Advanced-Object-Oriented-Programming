package ie.gmit.sw;

import ie.gmit.sw.builders.GroundBuilder;
import ie.gmit.sw.builders.SpriteBuilder;
import ie.gmit.sw.enums.GroundType;
import ie.gmit.sw.enums.SpriteType;
import ie.gmit.sw.models.GroundTile;
import ie.gmit.sw.models.Tile;

public class MatchJohnsDemo {
	
	//the number of tiles across
	private static int VERTCIALCELLS;
	//the number of tiles down
	private static int HORIZONTINALCELLS;
	
	private static GroundBuilder rockBuilder = new GroundBuilder();
	private static GroundBuilder weedBuilder = new GroundBuilder();
	private static GroundBuilder sandBuilder = new GroundBuilder();
	private static GroundBuilder waterBuilder = new GroundBuilder();
	private static GroundBuilder beachBuilder = new GroundBuilder();
	private static GroundBuilder mudBuilder = new GroundBuilder();
	private static GroundBuilder gravelBuilder = new GroundBuilder();
	
	private static SpriteBuilder playerBuilder = new SpriteBuilder();
	
	private static Tile tile = null;
	
	private static Grid g1;
	private static Grid g2;

    public static void addGroundTiles(int v, int h, Grid g) {
    	
    	HORIZONTINALCELLS = h;
    	VERTCIALCELLS = v;
    	
    	g1 = g;
		
		rockTiles();
		weedTiles();
		sandTiles();
		waterTiles();
		beachTiles();
		mudTiles();
		gravelTiles();
		
    	fillBlankTilesWithGrass();

	}
    
    public static void addObjects(int v, int h, Grid g) {
    	HORIZONTINALCELLS = h;
    	VERTCIALCELLS = v;
    	
    	g2 = g;

	}
    
    public static void addSprites(int v, int h, Grid g) {
    	HORIZONTINALCELLS = h;
    	VERTCIALCELLS = v;
    	
    	g2 = g;
    	
    	addPlayer();
	}
    
	private static void addPlayer() {
		tile = playerBuilder.setType(SpriteType.standard).setPos(g1.position(0, 0)).build();
		g2.addTile(tile);
	}

	private static void gravelTiles() {
		tile = gravelBuilder.setType(GroundType.gravel).setPos(g1.position(9, 7)).build();
		g1.addTile(tile);
		tile = gravelBuilder.setType(GroundType.gravel).setPos(g1.position(9, 8)).build();
		g1.addTile(tile);
		tile = gravelBuilder.setType(GroundType.gravel).setPos(g1.position(9, 9)).build();
		g1.addTile(tile);
	}

	private static void mudTiles() {
		tile = mudBuilder.setType(GroundType.mud).setPos(g1.position(8, 7)).build();
		g1.addTile(tile);
		tile = mudBuilder.setType(GroundType.mud).setPos(g1.position(8, 8)).build();
		g1.addTile(tile);
		tile = mudBuilder.setType(GroundType.mud).setPos(g1.position(8, 9)).build();
		g1.addTile(tile);
	}

	private static void beachTiles() {
		tile = beachBuilder.setType(GroundType.beach).setPos(g1.position(6, 0)).build();
		g1.addTile(tile);
		tile = beachBuilder.setType(GroundType.beach).setPos(g1.position(6, 1)).build();
		g1.addTile(tile);
		tile = beachBuilder.setType(GroundType.beach).setPos(g1.position(6, 2)).build();
		g1.addTile(tile);
		tile = beachBuilder.setType(GroundType.beach).setPos(g1.position(6, 3)).build();
		g1.addTile(tile);
		tile = beachBuilder.setType(GroundType.beach).setPos(g1.position(7, 3)).build();
		g1.addTile(tile);
		tile = beachBuilder.setType(GroundType.beach).setPos(g1.position(8, 4)).build();
		g1.addTile(tile);
	}

	private static void waterTiles() {
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(9, 4)).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(9, 3)).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(9, 2)).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(9, 1)).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(9, 0)).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(8, 3)).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(8, 2)).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(8, 1)).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(8, 0)).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(7, 2)).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(7, 1)).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(7, 0)).build();
		g1.addTile(tile);
	}

	private static void sandTiles() {
		tile = sandBuilder.setType(GroundType.sand).setPos(g1.position(6, 4)).build();
		g1.addTile(tile);
		tile = sandBuilder.setType(GroundType.sand).setPos(g1.position(7, 4)).build();
		g1.addTile(tile);
		tile = sandBuilder.setType(GroundType.sand).setPos(g1.position(6, 5)).build();
		g1.addTile(tile);
		tile = sandBuilder.setType(GroundType.sand).setPos(g1.position(7, 5)).build();
		g1.addTile(tile);
		tile = sandBuilder.setType(GroundType.sand).setPos(g1.position(8, 5)).build();
		g1.addTile(tile);
		tile = sandBuilder.setType(GroundType.sand).setPos(g1.position(9, 5)).build();
		g1.addTile(tile);
    	tile = sandBuilder.setType(GroundType.weeds).setPos(g1.position(5, 0)).build();
    	g1.addTile(tile);
    	tile = sandBuilder.setType(GroundType.weeds).setPos(g1.position(5, 1)).build();
    	g1.addTile(tile);
    	tile = sandBuilder.setType(GroundType.weeds).setPos(g1.position(5, 2)).build();
    	g1.addTile(tile);
    	tile = sandBuilder.setType(GroundType.weeds).setPos(g1.position(5, 3)).build();
    	g1.addTile(tile);
	}
	
    private static void weedTiles() {
    	tile = weedBuilder.setType(GroundType.weeds).setPos(g1.position(2, 2)).build();
    	g1.addTile(tile);
    	tile = weedBuilder.setType(GroundType.weeds).setPos(g1.position(4, 0)).build();
    	g1.addTile(tile);
    	tile = weedBuilder.setType(GroundType.weeds).setPos(g1.position(4, 1)).build();
    	g1.addTile(tile);
    	tile = weedBuilder.setType(GroundType.weeds).setPos(g1.position(4, 2)).build();
    	g1.addTile(tile);
    	tile = weedBuilder.setType(GroundType.weeds).setPos(g1.position(4, 3)).build();
    	g1.addTile(tile);
    	tile = weedBuilder.setType(GroundType.weeds).setPos(g1.position(0, 9)).build();
    	g1.addTile(tile);
    	tile = weedBuilder.setType(GroundType.weeds).setPos(g1.position(1, 9)).build();
    	g1.addTile(tile);
    	tile = weedBuilder.setType(GroundType.weeds).setPos(g1.position(2, 9)).build();
    	g1.addTile(tile);
    	tile = weedBuilder.setType(GroundType.weeds).setPos(g1.position(3, 9)).build();
    	g1.addTile(tile);
    	tile = weedBuilder.setType(GroundType.weeds).setPos(g1.position(4, 9)).build();
    	g1.addTile(tile);
	}

	private static void rockTiles() {
    	
    	tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(0, 0)).build();
    	g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(1, 1)).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(3, 3)).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(4, 4)).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(5, 5)).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(5, 4)).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(5, 6)).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(6, 6)).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(7, 6)).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(8, 6)).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(9, 6)).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(5, 9)).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(6, 9)).build();
		g1.addTile(tile);
	}

	private static void fillBlankTilesWithGrass() {
    	
    	GroundBuilder tBuilder = new GroundBuilder();
    	GroundTile tile;
    	
    	for(int i = 0; i < VERTCIALCELLS; i++) {
			
    		for(int j = 0; j< HORIZONTINALCELLS; j++) {
    			
    			if(!g1.ocupied(i, j)) {
        			tile = tBuilder.setType(GroundType.grass).setPos(g1.position(i, j)).build();
        			g1.addTile(tile);	
    			}
    		}
    	}
    }
}
