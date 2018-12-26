package gmit;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
public class CustomerCellRenderer extends JPanel implements ListCellRenderer {
	private static final long serialVersionUID = 1L;
	private JLabel label = new JLabel();
	private JLabel name = new JLabel();
	private JLabel dob = new JLabel();
	private JLabel status = new JLabel();
	private Icon image;
	private TitledBorder panelBorder =  new TitledBorder("");
	private Dimension dimensions = new Dimension(520, 50);
	private Color selectedColor = new Color(0xFFFFCC);
	public CustomerCellRenderer(){
		super();
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.setOpaque(true);
		this.setBorder(panelBorder);
		this.setPreferredSize(dimensions);
		this.setMinimumSize(dimensions);
		this.setMaximumSize(dimensions);
		this.setBackground(Color.WHITE);
		this.add(label);
		this.add(name);
		this.add(dob);
		this.add(status);
	}
	
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
		Customer c = (Customer) value;
		panelBorder.setTitle(c.getName());
		this.setBorder(panelBorder);
		image = c.getIcon();
		label.setIcon(image);
		name.setText(c.getName());
		dob.setText(c.getDateOfBirth().toString());
		status.setText(c.getStatus().toString());
		
		if (isSelected){
			setBackground(selectedColor);
		}else{
			setBackground(Color.WHITE);
		}
		
		return this;
	}
}
