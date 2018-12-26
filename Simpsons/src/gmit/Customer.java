package gmit;

import java.util.Date;
import javax.swing.*;
public interface Customer {
	public void setName(String name);
	public String getName();
	public void setDateOfBirth(Date dob);
	public Date getDateOfBirth();	
	public void setStatus(Status status);
	public Status getStatus();
	public void setIcon(Icon icon);
	public Icon getIcon();
}
