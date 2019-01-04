package ie.gmit.sw;

public class SpriteFactory {

    public enum Type {
        player, green, knight, person ;
    }

    public static Tile create(Type type, int x, int y) {

        switch (type) {
	        case player:
	            return new SpriteBuilder().setType(SpriteType.standard).setIndex(x, y).build();    
	        case green:
	            return new SpriteBuilder().setType(SpriteType.green).setIndex(x, y).build();
	        case knight:
	            return new SpriteBuilder().setType(SpriteType.knight).setIndex(x, y).build();
	        case person:
	            return new SpriteBuilder().setType(SpriteType.person).setIndex(x, y).build();  
	        default:
	            throw new RuntimeException("Unsupported object type!");
        }

    }
}