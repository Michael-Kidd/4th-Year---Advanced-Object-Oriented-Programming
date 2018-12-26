package gmit;

import javax.swing.*;
import javax.swing.event.*;
public class CustomerListModel implements ListModel{
	private DefaultListModel model = new DefaultListModel();
	
	public CustomerListModel(){
		model.addListDataListener(new CustomerListDataListener());
	}
	
	public void addCustomer(Customer c){
		model.addElement(c);
	}

	public void removeCustomer(Customer c){
		model.removeElement(c);
	}
	
	public Object getElementAt(int index) {
		return model.elementAt(index);
	}

	public int getSize() {
		return model.size();
	}

	public void addListDataListener(ListDataListener dl) {
		model.addListDataListener(dl);
		
	}

	public void removeListDataListener(ListDataListener dl) {
		model.removeListDataListener(dl);
	}
}
