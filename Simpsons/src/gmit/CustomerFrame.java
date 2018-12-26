package gmit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Date;
import javax.swing.*;
import java.io.*;

public class CustomerFrame extends JFrame{
	private JList list = null;
	private ListModel customerModel = new CustomerListModel();
	private JTextField nameField = new JTextField(15);
	private JTextField dobField = new JTextField(10);
	private JTextField iconField = new JTextField(20);
	private JComboBox status = new JComboBox();

	public CustomerFrame(){
	    super("Software Development - Year 4. MVC Demo");
	    Container cp = getContentPane();
	    cp.setLayout(new FlowLayout());
	    
	    createCustomers();
	    
	    list = new JList();
	    list.setModel(customerModel);
	    list.setCellRenderer(new CustomerCellRenderer());
	    list.addListSelectionListener(new CustomerListSelectionListener());
		//This should improve performance
	    list.setFixedCellWidth(520);
	    list.setFixedCellHeight(100);
	    
	    JScrollPane pane = new JScrollPane(list);
	    pane.setPreferredSize(new java.awt.Dimension(550, 300));
	    pane.setMinimumSize(new java.awt.Dimension(550, 300));
	    pane.setMaximumSize(new java.awt.Dimension(550, 300));
	    cp.add(pane, BorderLayout.CENTER);
	    
	    
	    JButton addButton = new JButton("Add");
	    addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
        		CustomerFactory cf = CustomerFactory.getInstance();
        		Customer c = cf.newCustomer();
        		c.setName(nameField.getText());
        		c.setDateOfBirth(new Date(dobField.getText()));
        		c.setStatus(getStatus());
        		c.setIcon(new ImageIcon(iconField.getText()));
        		
        		((CustomerListModel)customerModel).addCustomer(c);
            }
	    });
	    
	    JButton deleteButton = new JButton("Delete");
	    deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	Customer c = (Customer) list.getSelectedValue();
            	((CustomerListModel)customerModel).removeCustomer(c);
            }
	    });
	    
	    
	    JButton iconButton = new JButton("Icon...");
	    iconButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	setCursor(new Cursor(Cursor.WAIT_CURSOR));
            	JFileChooser fc = new JFileChooser("./");
            	
            	int returnVal = fc.showOpenDialog(CustomerFrame.this);
            	setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

            	if (returnVal == JFileChooser.APPROVE_OPTION) {
            		File file = fc.getSelectedFile();
            		iconField.setText(file.getAbsolutePath());
                	}
            }
	    });
	    
	    
	    
	    status.addItem(Status.Defaulter);
	    status.addItem(Status.New);
	    status.addItem(Status.Premium);
	    status.addItem(Status.Regular);
	    
	    cp.add(new JLabel("Customer Name:"), BorderLayout.WEST);
	    cp.add(nameField, BorderLayout.WEST);
	    cp.add(new JLabel("DOB:"), BorderLayout.WEST);
	    cp.add(dobField, BorderLayout.WEST);
	    cp.add(new JLabel("Status:"), BorderLayout.WEST);
	    cp.add(status, BorderLayout.WEST);
	    cp.add(new JLabel("Image:"), BorderLayout.WEST);
	    cp.add(iconField, BorderLayout.WEST);
	    cp.add(iconButton, BorderLayout.WEST);
	    cp.add(addButton, BorderLayout.WEST);
	    cp.add(deleteButton, BorderLayout.WEST);
	    
	    
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    //pack();
	    setSize(570, 420);
	    setVisible(true);	    
	}
	
	private void createCustomers(){
		CustomerFactory cf = CustomerFactory.getInstance();
		
		Customer c = cf.newCustomer();
		c.setName("Montgomery Burns");
		c.setDateOfBirth(new Date("7-Jul-20"));
		c.setStatus(Status.Premium);
		c.setIcon(new ImageIcon("images/burns.gif"));
		
		Customer c1 = cf.newCustomer();
		c1.setName("Bart Simpson");
		c1.setDateOfBirth(new Date("1-Jan-90"));
		c1.setStatus(Status.Defaulter);		
		c1.setIcon(new ImageIcon("images/bart.gif"));
		
		Customer c2 = cf.newCustomer();
		c2.setName("Homer Simpson");
		c2.setDateOfBirth(new Date("28-May-60"));
		c2.setStatus(Status.Regular);	
		c2.setIcon(new ImageIcon("images/homer.gif"));
		

		
		
		Customer c3 = cf.newCustomer();
		c3.setName("Moe Szyslak");
		c3.setDateOfBirth(new Date("3-Feb-55"));
		c3.setStatus(Status.Defaulter);	
		c3.setIcon(new ImageIcon("images/moe.gif"));

		Customer c4 = cf.newCustomer();
		c4.setName("Carl Carlson ");
		c4.setDateOfBirth(new Date("3-Apr-63"));
		c4.setStatus(Status.New);	
		c4.setIcon(new ImageIcon("images/karl.gif"));

		Customer c5 = cf.newCustomer();
		c5.setName("Nelson Muntz");
		c5.setDateOfBirth(new Date("12-Oct-90"));
		c5.setStatus(Status.Regular);	
		c5.setIcon(new ImageIcon("images/nelson.gif"));

		Customer c6 = cf.newCustomer();
		c6.setName("Diamond Joe Quimby");
		c6.setDateOfBirth(new Date("22-Sep-53"));
		c6.setStatus(Status.Defaulter);	
		c6.setIcon(new ImageIcon("images/quimby.gif"));

		((CustomerListModel)customerModel).addCustomer(c);
		((CustomerListModel)customerModel).addCustomer(c1);
		((CustomerListModel)customerModel).addCustomer(c2);
		((CustomerListModel)customerModel).addCustomer(c3);
		((CustomerListModel)customerModel).addCustomer(c4);
		((CustomerListModel)customerModel).addCustomer(c5);
		((CustomerListModel)customerModel).addCustomer(c6);
	}
	
	public Status getStatus(){
		String selectedStatus = status.getSelectedItem().toString();
		if (selectedStatus.equals("Premium")){
			return Status.Premium;	
		}else if (selectedStatus.equals("Regular")){
			return Status.Regular;
		}else if (selectedStatus.equals("New")){
			return Status.New;
		}else{
			return Status.Defaulter;
		}
	}
	
	public static void main(String[] args){
		new CustomerFrame();
	}
}
