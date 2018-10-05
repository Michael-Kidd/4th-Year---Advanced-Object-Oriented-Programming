package ie.gmit.sw;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

public class DESCypher extends AbstractCypher {

	public DESCypher() throws Throwable {
		
		KeyGenerator keyGen = KeyGenerator.getInstance("DES");
		keyGen.init(56);
		super.setCypher(Cipher.getInstance("DES/ECB/PKCS5Padding"));
		super.setKey(keyGen.generateKey());
		
	}

}

