package ie.gmit.sw;

import java.security.Key;

public interface Cypherator {

	Key getKey();

	void setKey(Key key);

	byte[] encrypt(byte[] plainText) throws Throwable;

	byte[] decrypt(byte[] cypherText) throws Throwable;

}