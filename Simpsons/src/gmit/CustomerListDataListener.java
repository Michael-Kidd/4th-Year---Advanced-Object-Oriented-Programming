package gmit;

import javax.swing.event.*;
public class CustomerListDataListener implements ListDataListener{
	//Called when the contents of one or more items in the list have changed.
	public void contentsChanged(ListDataEvent e) {
		System.out.println("Contents of list changed: " + e.getSource().toString());
    }

	//Called when one or more items have been added to the list.
	public void intervalAdded(ListDataEvent e) {
		System.out.println("Item added to list: " + e.getSource().toString());
    }
	
	//Called when one or more items ahve been removed from the list.
	public void intervalRemoved(ListDataEvent e) {
		System.out.println("Item removed from list: " + e.getSource().toString());
    }
}
