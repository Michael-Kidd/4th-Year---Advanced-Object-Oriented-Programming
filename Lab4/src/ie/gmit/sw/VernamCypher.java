package ie.gmit.sw;


public class VernamCypher extends AbstractCypher{

	@Override
	public byte[] encrypt(byte[] plainText) throws CypherException {
		
		for (int i = 0; i < plainText.length; i++) {
			plainText[i] = (byte) (plainText[i] ^ getKey());
		}

		return decrypt(plainText);
	}

	@Override
	public byte[] decrypt(byte[] cypherText) throws CypherException {
		return encrypt(cypherText);
	}


}
