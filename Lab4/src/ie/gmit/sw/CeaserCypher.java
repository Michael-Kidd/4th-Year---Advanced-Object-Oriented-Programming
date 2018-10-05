package ie.gmit.sw;


public class CeaserCypher extends AbstractCypher {

	public CeaserCypher() throws CypherException {
		this(0);
	}
	
	public CeaserCypher(int key) throws CypherException {
		super();
		setKey(key);
	}
	
	
	public CeaserCypher(CypherKey key) throws NumberFormatException, CypherException {
		super();
		super.setKey(Integer.parseInt(key.getKey()));
	}

	public byte[] encrypt(byte[] plainText) throws CypherException {

		for (int i = 0; i < plainText.length; i++) {
			plainText[i] = (byte) (plainText[i] + getKey());
		}

		return plainText;
	}

	public byte[] decrypt(byte[] cypherText) throws CypherException {

		for (int i = 0; i < cypherText.length; i++) {
			cypherText[i] = (byte) (cypherText[i] - getKey());
		}

		return cypherText;
	}

}
