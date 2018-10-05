package ie.gmit.sw;

public class CypherRunner {

		public static void main(String [] args) throws CypherException{
			
			AbstractCypher cc = new CeaserCypher();
			cc.setKey(7);
			
			String s = "Happy Days!";
			String t = cc.encrypt(s);
			System.out.println(t);
			System.out.println(cc.decrypt(t));
			
		}
		

}
