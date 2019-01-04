package ie.gmit.sw;

/*This method is used to change the direction of the sprites
 * it can be used for any character sprite and could be included with ground tiles if needed
 * this would allow the tiles to be rotated, but possibly could be performed in a better way
 * */
public enum Direction {

	UP(0), DOWN(1), LEFT(2), RIGHT(3);

	private final int orientation;

	private Direction(int orientation) {
		this.orientation = orientation;
	}

	public int getOrientation() {
		return this.orientation;
	}
}