package ie.gmit.sw;

public class SpriteFactory {

	/*
	 * this is a factory calss which will tell which type of character to create
	 * when called
	 */

	public enum Type {
		player, green, knight, person;
	}

	public static Tile create(Type type, int x, int y) {

		switch (type) {
		case player:
			// return a standard type
			return new SpriteBuilder().setType(SpriteType.standard).setIndex(x, y).build();
		case green:
			// return a green type
			return new SpriteBuilder().setType(SpriteType.green).setIndex(x, y).build();
		case knight:
			// return a knight
			return new SpriteBuilder().setType(SpriteType.knight).setIndex(x, y).build();
		case person:
			// return a person
			return new SpriteBuilder().setType(SpriteType.person).setIndex(x, y).build();
		default:
			throw new RuntimeException("Unsupported object type!");
		}

	}
}