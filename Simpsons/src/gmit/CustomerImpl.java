package gmit;

import java.util.*;
import javax.swing.*;
public class CustomerImpl implements Customer{
	private String name;
	private Date dob;
	private Status status;
	private Icon icon;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getDateOfBirth() {
		return dob;
	}
	
	public void setDateOfBirth(Date dob) {
		this.dob = dob;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public void setIcon(Icon icon){
		this.icon = icon;
	}
	
	public Icon getIcon(){
		return this.icon;		
	}
}
