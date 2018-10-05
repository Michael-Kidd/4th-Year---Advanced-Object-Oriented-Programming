package ie.gmit.sw;

public class CypherKeyImpl implements CypherKey{
	
	private String Key;

	public String getKey() {
		//CeaserCypher.this.key = 7;
		return Key;
	}

	public void setKey(String key) {
		Key = key;
	}
	
}