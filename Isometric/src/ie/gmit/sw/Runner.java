package ie.gmit.sw;

import javax.swing.JOptionPane;

import ie.gmit.sw.view.GameWindow;

public class Runner {
	
	public static void main(String[] args) throws Exception {

		//Running the GUI in a seperate Thread
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				
                try {
                	
                	//Using the Game window as a Singleton
                	GameWindow.getInstance();
					
				} catch (Exception e) {
					//If the GUI fails to load
					JOptionPane.showMessageDialog(null, "Failed to start program", "Failure", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
	}
	
}