package ie.gmit.sw;

import java.security.*;
import javax.crypto.*;

public class AbstractCypher implements Cypherator {
	
	/* (non-Javadoc)
	 * @see ie.gmit.sw.Cypherator#getKey()
	 */
	@Override
	public Key getKey() {
		return key;
	}

	/* (non-Javadoc)
	 * @see ie.gmit.sw.Cypherator#setKey(java.security.Key)
	 */
	@Override
	public void setKey(Key key) {
		this.key = key;
	}

	private Key key;

	private Cipher cypher;

	public AbstractCypher() {
		super();
	}

	/* (non-Javadoc)
	 * @see ie.gmit.sw.Cypherator#encrypt(byte[])
	 */
	@Override
	public byte[] encrypt(byte[] plainText) throws Throwable {
		
		cypher.init(Cipher.ENCRYPT_MODE, key);
		
		return cypher.doFinal(plainText);
	
	}

	/* (non-Javadoc)
	 * @see ie.gmit.sw.Cypherator#decrypt(byte[])
	 */
	@Override
	public byte[] decrypt(byte[] cypherText) throws Throwable {
		
		cypher.init(Cipher.DECRYPT_MODE, key);
		
		return cypher.doFinal(cypherText);
	
	}

	public Cipher getCypher() {
		return cypher;
	}

	public void setCypher(Cipher cypher) {
		this.cypher = cypher;
	}
	
	

}