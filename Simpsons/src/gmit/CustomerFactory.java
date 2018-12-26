package gmit;

public class CustomerFactory {
	public static CustomerFactory cf = new CustomerFactory();
	
	private CustomerFactory(){}
	
	public static CustomerFactory getInstance(){
		return cf;
	}
	
	public Customer newCustomer(){
		return new CustomerImpl();
	}
}
