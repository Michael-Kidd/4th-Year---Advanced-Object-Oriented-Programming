package ie.gmit.sw;

public abstract class AbstractCypher implements Cypherator {
	
	private CypherKey key;

	public AbstractCypher() {
		super();
	}

	/* (non-Javadoc)
	 * @see ie.gmit.sw.Cypherator#encrypt(java.lang.String)
	 */
	@Override
	public String encrypt(String plainText) throws CypherException {
		return new String(encrypt(plainText.getBytes()));
	}

	/* (non-Javadoc)
	 * @see ie.gmit.sw.Cypherator#decrypt(java.lang.String)
	 */
	@Override
	public String decrypt(String cypherText) throws CypherException {
		return new String(decrypt(cypherText.getBytes()));
	}

	public int getKey() {
		return Integer.parseInt(key.getKey());
	}

	public void setKey(int k) throws CypherException {
		this.key = new CypherKeyImpl();
		this.key.setKey("" + k);
	}
	
	/* (non-Javadoc)
	 * @see ie.gmit.sw.Cypherator#encrypt(byte[])
	 */
	@Override
	public abstract byte[] encrypt(byte[] plainText) throws CypherException;
	/* (non-Javadoc)
	 * @see ie.gmit.sw.Cypherator#decrypt(byte[])
	 */
	@Override
	public abstract byte[] decrypt(byte[] plainText) throws CypherException;

}