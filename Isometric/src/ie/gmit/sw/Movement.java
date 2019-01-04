package ie.gmit.sw;

public class Movement {
	
	public static void move(Position pos, SpriteTile sprite, Grid grid1, Grid grid2, GameView gameView) {
		
		int []index = grid2.getIndex(pos);
		
		ItemTile itemAhead = grid2.getItemTile(index[0], index[1]);
		
		//This determines if the next tile can be walked on
		if(!grid1.getGroundTile(index[0], index[1]).isWalkable() ||  itemAhead != null) {
			
			if(itemAhead.isCollectable()) {
				grid2.getTiles().remove(itemAhead);
				gameView.setChestRemaining(-1);
			}
			
			return;
		}
		
		sprite.step();
		sprite.setPos(pos);
		
		sprite.setX(index[0]);
		sprite.setY(index[1]);
		
	}
	
}
