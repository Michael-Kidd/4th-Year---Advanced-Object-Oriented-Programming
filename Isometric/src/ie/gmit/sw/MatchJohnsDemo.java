package ie.gmit.sw;

import ie.gmit.sw.SpriteFactory.Type;

public class MatchJohnsDemo {

	// the number of tiles across
	private static int VERTCIALCELLS;
	// the number of tiles down
	private static int HORIZONTINALCELLS;

	private static GroundBuilder rockBuilder = new GroundBuilder();
	private static GroundBuilder weedBuilder = new GroundBuilder();
	private static GroundBuilder sandBuilder = new GroundBuilder();
	private static GroundBuilder waterBuilder = new GroundBuilder();
	private static GroundBuilder beachBuilder = new GroundBuilder();
	private static GroundBuilder mudBuilder = new GroundBuilder();
	private static GroundBuilder gravelBuilder = new GroundBuilder();

	private static ItemBuilder treeBuilder = new ItemBuilder();
	private static ItemBuilder signBuilder = new ItemBuilder();
	private static ItemBuilder ladderBuilder = new ItemBuilder();
	private static ItemBuilder chestBuilder = new ItemBuilder();

	private static Tile tile = null;

	public static void addGroundTiles(int v, int h, Grid g) {

		HORIZONTINALCELLS = h;
		VERTCIALCELLS = v;

		rockTiles(g);
		weedTiles(g);
		sandTiles(g);
		waterTiles(g);
		beachTiles(g);
		mudTiles(g);
		gravelTiles(g);

		fillBlankTilesWithGrass(g);

	}

	public static void addObjects(int v, int h, Grid g) {
		HORIZONTINALCELLS = h;
		VERTCIALCELLS = v;

		addTrees(g);
		addLadder(g);
		addSigns(g);
		addChests(g);

	}

	private static void addChests(Grid g2) {

		tile = chestBuilder.setType(ItemType.chest).setPos(g2.position(4, 4)).setIndex(4, 4).build();
		g2.addTile(tile);
		tile = chestBuilder.setType(ItemType.chest).setPos(g2.position(7, 9)).setIndex(7, 9).build();
		g2.addTile(tile);
		tile = chestBuilder.setType(ItemType.chest).setPos(g2.position(9, 5)).setIndex(9, 5).build();
		g2.addTile(tile);
		tile = chestBuilder.setType(ItemType.chest).setPos(g2.position(5, 0)).setIndex(5, 0).build();
		g2.addTile(tile);
	}

	private static void addSigns(Grid g2) {
		tile = signBuilder.setType(ItemType.signPost).setPos(g2.position(3, 2)).setIndex(3, 2).build();
		g2.addTile(tile);
	}

	private static void addLadder(Grid g2) {
		tile = ladderBuilder.setType(ItemType.ladder).setPos(g2.position(2, 9)).setIndex(2, 9).build();
		g2.addTile(tile);
	}

	private static void addTrees(Grid g2) {

		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(1, 0)).setIndex(1, 0).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(2, 0)).setIndex(2, 0).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(3, 0)).setIndex(3, 0).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(2, 1)).setIndex(2, 1).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(3, 1)).setIndex(3, 1).build();
		g2.addTile(tile);

		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(0, 3)).setIndex(0, 3).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(0, 4)).setIndex(0, 4).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(0, 5)).setIndex(0, 5).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(0, 6)).setIndex(0, 6).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(0, 7)).setIndex(0, 7).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(0, 8)).setIndex(0, 8).build();
		g2.addTile(tile);

		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(1, 4)).setIndex(1, 4).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(1, 5)).setIndex(1, 5).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(1, 6)).setIndex(1, 6).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(1, 7)).setIndex(1, 7).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(1, 8)).setIndex(1, 8).build();
		g2.addTile(tile);

		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(2, 5)).setIndex(2, 5).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(2, 6)).setIndex(2, 6).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(2, 7)).setIndex(2, 7).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(2, 8)).setIndex(2, 8).build();
		g2.addTile(tile);

		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(3, 6)).setIndex(3, 6).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(3, 7)).setIndex(3, 7).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(3, 8)).setIndex(3, 8).build();
		g2.addTile(tile);

		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(4, 7)).setIndex(4, 7).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(4, 8)).setIndex(4, 8).build();
		g2.addTile(tile);

		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(5, 8)).setIndex(5, 8).build();
		g2.addTile(tile);

	}

	public static void addSprites(int v, int h, Grid g) {
		HORIZONTINALCELLS = h;
		VERTCIALCELLS = v;

		Tile enemy = SpriteFactory.create(Type.knight, 9, 9);
		enemy.setPos(g.position(9, 9));
		g.addTile(enemy);

	}

	public static SpriteTile addPlayer(int v, int h, Grid g) {
		HORIZONTINALCELLS = h;
		VERTCIALCELLS = v;

		Tile player = SpriteFactory.create(Type.player, 0, 0);
		player.setPos(g.position(0, 0));
		g.addTile(player);

		return (SpriteTile) player;
	}

	private static void gravelTiles(Grid g1) {
		tile = gravelBuilder.setType(GroundType.gravel).setPos(g1.position(9, 7)).setIndex(9, 7).build();
		g1.addTile(tile);
		tile = gravelBuilder.setType(GroundType.gravel).setPos(g1.position(9, 8)).setIndex(9, 8).build();
		g1.addTile(tile);
		tile = gravelBuilder.setType(GroundType.gravel).setPos(g1.position(9, 9)).setIndex(9, 9).build();
		g1.addTile(tile);
	}

	private static void mudTiles(Grid g1) {
		tile = mudBuilder.setType(GroundType.mud).setPos(g1.position(8, 7)).setIndex(8, 7).build();
		g1.addTile(tile);
		tile = mudBuilder.setType(GroundType.mud).setPos(g1.position(8, 8)).setIndex(8, 8).build();
		g1.addTile(tile);
		tile = mudBuilder.setType(GroundType.mud).setPos(g1.position(8, 9)).setIndex(8, 9).build();
		g1.addTile(tile);
	}

	private static void beachTiles(Grid g1) {
		tile = beachBuilder.setType(GroundType.beach).setPos(g1.position(6, 0)).setIndex(6, 0).build();
		g1.addTile(tile);
		tile = beachBuilder.setType(GroundType.beach).setPos(g1.position(6, 1)).setIndex(6, 1).build();
		g1.addTile(tile);
		tile = beachBuilder.setType(GroundType.beach).setPos(g1.position(6, 2)).setIndex(6, 2).build();
		g1.addTile(tile);
		tile = beachBuilder.setType(GroundType.beach).setPos(g1.position(6, 3)).setIndex(6, 3).build();
		g1.addTile(tile);
		tile = beachBuilder.setType(GroundType.beach).setPos(g1.position(7, 3)).setIndex(7, 3).build();
		g1.addTile(tile);
		tile = beachBuilder.setType(GroundType.beach).setPos(g1.position(8, 4)).setIndex(8, 4).build();
		g1.addTile(tile);
	}

	private static void waterTiles(Grid g1) {
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(9, 4)).setIndex(9, 4).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(9, 3)).setIndex(9, 3).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(9, 2)).setIndex(9, 2).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(9, 1)).setIndex(9, 1).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(9, 0)).setIndex(9, 0).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(8, 3)).setIndex(8, 3).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(8, 2)).setIndex(8, 2).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(8, 1)).setIndex(8, 1).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(8, 0)).setIndex(8, 0).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(7, 2)).setIndex(7, 2).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(7, 1)).setIndex(7, 1).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(7, 0)).setIndex(7, 0).build();
		g1.addTile(tile);
	}

	private static void sandTiles(Grid g1) {
		tile = sandBuilder.setType(GroundType.sand).setPos(g1.position(6, 4)).setIndex(6, 4).build();
		g1.addTile(tile);
		tile = sandBuilder.setType(GroundType.sand).setPos(g1.position(7, 4)).setIndex(7, 4).build();
		g1.addTile(tile);
		tile = sandBuilder.setType(GroundType.sand).setPos(g1.position(6, 5)).setIndex(8, 4).build();
		g1.addTile(tile);
		tile = sandBuilder.setType(GroundType.sand).setPos(g1.position(7, 5)).setIndex(7, 5).build();
		g1.addTile(tile);
		tile = sandBuilder.setType(GroundType.sand).setPos(g1.position(8, 5)).setIndex(8, 5).build();
		g1.addTile(tile);
		tile = sandBuilder.setType(GroundType.sand).setPos(g1.position(9, 5)).setIndex(9, 5).build();
		g1.addTile(tile);
		tile = sandBuilder.setType(GroundType.weeds).setPos(g1.position(5, 0)).setIndex(5, 0).build();
		g1.addTile(tile);
		tile = sandBuilder.setType(GroundType.weeds).setPos(g1.position(5, 1)).setIndex(5, 1).build();
		g1.addTile(tile);
		tile = sandBuilder.setType(GroundType.weeds).setPos(g1.position(5, 2)).setIndex(5, 2).build();
		g1.addTile(tile);
		tile = sandBuilder.setType(GroundType.weeds).setPos(g1.position(5, 3)).setIndex(5, 3).build();
		g1.addTile(tile);
	}

	private static void weedTiles(Grid g1) {
		tile = weedBuilder.setType(GroundType.weeds).setPos(g1.position(2, 2)).setIndex(2, 2).build();
		g1.addTile(tile);
		tile = weedBuilder.setType(GroundType.weeds).setPos(g1.position(4, 0)).setIndex(4, 0).build();
		g1.addTile(tile);
		tile = weedBuilder.setType(GroundType.weeds).setPos(g1.position(4, 1)).setIndex(4, 1).build();
		g1.addTile(tile);
		tile = weedBuilder.setType(GroundType.weeds).setPos(g1.position(4, 2)).setIndex(4, 2).build();
		g1.addTile(tile);
		tile = weedBuilder.setType(GroundType.weeds).setPos(g1.position(4, 3)).setIndex(4, 3).build();
		g1.addTile(tile);
		tile = weedBuilder.setType(GroundType.weeds).setPos(g1.position(0, 9)).setIndex(0, 9).build();
		g1.addTile(tile);
		tile = weedBuilder.setType(GroundType.weeds).setPos(g1.position(1, 9)).setIndex(1, 9).build();
		g1.addTile(tile);
		tile = weedBuilder.setType(GroundType.weeds).setPos(g1.position(2, 9)).setIndex(2, 9).build();
		g1.addTile(tile);
		tile = weedBuilder.setType(GroundType.weeds).setPos(g1.position(3, 9)).setIndex(3, 9).build();
		g1.addTile(tile);
		tile = weedBuilder.setType(GroundType.weeds).setPos(g1.position(4, 9)).setIndex(4, 9).build();
		g1.addTile(tile);
	}

	private static void rockTiles(Grid g1) {

		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(0, 0)).setIndex(0, 0).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(1, 1)).setIndex(1, 1).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(3, 3)).setIndex(3, 3).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(4, 4)).setIndex(4, 4).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(5, 5)).setIndex(5, 5).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(5, 4)).setIndex(5, 4).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(5, 6)).setIndex(5, 6).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(6, 6)).setIndex(6, 6).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(7, 6)).setIndex(7, 6).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(8, 6)).setIndex(8, 6).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(9, 6)).setIndex(9, 6).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(5, 9)).setIndex(5, 9).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(6, 9)).setIndex(6, 9).build();
		g1.addTile(tile);
	}

	private static void fillBlankTilesWithGrass(Grid g1) {

		GroundBuilder tBuilder = new GroundBuilder();
		GroundTile tile;

		for (int i = 0; i < VERTCIALCELLS; i++) {

			for (int j = 0; j < HORIZONTINALCELLS; j++) {

				if (!g1.ocupied(i, j)) {
					tile = tBuilder.setType(GroundType.grass).setPos(g1.position(i, j)).setIndex(i, j).build();
					g1.addTile(tile);
				}
			}
		}
	}
}
