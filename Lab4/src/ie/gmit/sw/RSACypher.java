package ie.gmit.sw;

import java.security.KeyPair;
import java.security.KeyPairGenerator;

import javax.crypto.Cipher;

public class RSACypher extends AbstractCypher {

	private KeyPair keyRing;

	public RSACypher() throws Throwable {

		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
		keyGen.initialize(2048);
		setKeyRing(keyGen.generateKeyPair());
		super.setCypher(Cipher.getInstance("RSA/ECB/PKCS1Padding"));

	}
	
	@Override
	public byte[] encrypt(byte[] plainText) throws Throwable {
		
		super.setKey(keyRing.getPublic());
		
		return super.encrypt(plainText);
	
	}

	@Override
	public byte[] decrypt(byte[] cypherText) throws Throwable {
		
		super.setKey(keyRing.getPrivate());
		
		return super.encrypt(cypherText);
	
	}

	public KeyPair getKeyRing() {
		return keyRing;
	}

	public void setKeyRing(KeyPair keyRing) {
		this.keyRing = keyRing;
	}

	@Override
	protected void finalize() {

	}
}
