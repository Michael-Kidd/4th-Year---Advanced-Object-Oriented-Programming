package ie.gmit.sw;

import java.security.*;
import javax.crypto.*;

public class AESCypher extends AbstractCypher {

	public AESCypher() throws NoSuchAlgorithmException, NoSuchPaddingException {
		super();
		
		KeyGenerator keyGen = KeyGenerator.getInstance("AES");
		keyGen.init(128);
		super.setCypher(Cipher.getInstance("AES/ECB/PKCS5Padding"));
		super.setKey(keyGen.generateKey());
		
	}

}
