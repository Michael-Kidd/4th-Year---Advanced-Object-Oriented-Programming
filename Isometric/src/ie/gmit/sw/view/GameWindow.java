package ie.gmit.sw.view;

import java.awt.*;
import javax.swing.*;

public class GameWindow {
	
	public GameWindow() throws Exception {
		
		GameView view = new GameView();
		
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
}