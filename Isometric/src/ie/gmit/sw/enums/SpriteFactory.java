package ie.gmit.sw.enums;

import ie.gmit.sw.builders.SpriteBuilder;
import ie.gmit.sw.models.Tile;

public class SpriteFactory {
	
	private static SpriteBuilder builder = new SpriteBuilder();

    public enum Type {
        player, green, knight, person ;
    }

    public static Tile create(Type type, int x, int y) {

        switch (type) {
	        case player:
	            return builder.setType(SpriteType.standard).setIndex(x, y).build();    
	        case green:
	            return builder.setType(SpriteType.green).setIndex(x, y).build();
	        case knight:
	            return builder.setType(SpriteType.knight).setIndex(x, y).build();
	        case person:
	            return builder.setType(SpriteType.person).setIndex(x, y).build();  
	        default:
	            throw new RuntimeException("Unsupported object type!");
        }

    }
}