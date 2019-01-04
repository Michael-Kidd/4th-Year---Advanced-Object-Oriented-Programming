package ie.gmit.sw;

public class Movement {

	/*
	 * class used for moving a character, currently is used to move the player but
	 * could also be used to move the enemies too
	 */

	public static void move(Position pos, SpriteTile sprite, Grid grid1, Grid grid2, GameView gameView) {

		// gets the index of the position provided
		int[] index = grid2.getIndex(pos);

		// attempts to find if the there is an item ahead of the character
		ItemTile itemAhead = grid2.getItemTile(index[0], index[1]);

		// This determines if the next tile can be walked on
		if (!grid1.getGroundTile(index[0], index[1]).isWalkable() || itemAhead != null) {

			// if there is an item ahead and it can be collected
			if (itemAhead.isCollectable()) {
				// to collect the item it is removed
				grid2.getTiles().remove(itemAhead);
				// the number of chests will decrease
				// with this logic an enemy can also collect a chest,
				// we will call that a feature of the game for now
				gameView.setChestRemaining(-1);
			}

			return;
		}

		// let the sprite step, to show movement
		sprite.step();
		// set the position as the next tile in the direction the sprite is facing
		sprite.setPos(pos);
		// set the position index so the tile becomes ocupied and another sprite cant
		// stand on that tile
		sprite.setX(index[0]);
		sprite.setY(index[1]);

	}

}
