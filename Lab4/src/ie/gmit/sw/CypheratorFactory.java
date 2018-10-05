package ie.gmit.sw;

public class CypheratorFactory {

	private static CypheratorFactory cf = new CypheratorFactory();
	
	private CypheratorFactory() {
		
	}
	
	public static CypheratorFactory getInstance() {
		return cf;
	}
	
	public Cypherator newCypherator(CypherType type) throws Throwable {
		
		if(type == CypherType.RSA) {
			
			return new RSACypher();
			
		} else if(type == CypherType.DES) {
			
			return new DESCypher();
			
		} else {
			
			return new AESCypher();
			
		}
	
	}

}
