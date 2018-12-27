package ie.gmit.sw.view;

import java.awt.*;
import javax.swing.*;

public class GameWindow {
	
	private static GameWindow window_instance = null;
	
	public GameWindow() {
		
		GameView view;
		
			try {
				
				view = new GameView();
				
				Dimension d = new Dimension(GameView.getDefaultViewSize(), GameView.getDefaultViewSize()/2);
			
				view.setPreferredSize(d);
				view.setMinimumSize(d);
				view.setMaximumSize(d);
		
				JFrame f = new JFrame("GMIT - B.Sc. in Computing (Software Development)");
				
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.getContentPane().setLayout(new FlowLayout());
				f.add(view);
				f.addKeyListener(view);
				f.setSize(1000, 1000);
				f.setLocation(100, 100);
				f.pack();
				f.setVisible(true);
				
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog(null, "User Interface Failed to Start", "Failed to Start", JOptionPane.ERROR_MESSAGE);
			}
		
	}
	
    public static GameWindow getInstance() 
    { 
        if (window_instance == null) 
        	window_instance = new GameWindow(); 
  
        return window_instance; 
    }
    
}