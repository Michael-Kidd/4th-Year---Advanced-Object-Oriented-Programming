package ie.gmit.sw;


public class Runner {

	public Runner() throws Throwable {
		
		CypheratorFactory cf = CypheratorFactory.getInstance();
		
		Cypherator cypher = cf.newCypherator(CypherType.AES);
		
		String s = "Happy Days";
		
		String t = new String(cypher.encrypt(s.getBytes()));
		
		System.out.println("Encrypted : " + t);
		System.out.println("\n\nDecrypted : ");
		
		String u = new String(cypher.decrypt(t.getBytes()));
		System.out.println(u);
		
	}

}
