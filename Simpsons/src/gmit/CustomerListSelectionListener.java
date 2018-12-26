package gmit;

import javax.swing.event.*;
public class CustomerListSelectionListener implements ListSelectionListener{
    public void valueChanged(ListSelectionEvent evt) {
    	System.out.println("\t** " + evt.toString());
	}
}
