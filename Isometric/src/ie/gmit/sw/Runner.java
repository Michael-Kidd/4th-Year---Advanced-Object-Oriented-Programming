package ie.gmit.sw;

import ie.gmit.sw.view.GameWindow;

public class Runner {
	public static void main(String[] args) throws Exception {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				try {
						
					new GameWindow();
						
				} catch (Exception e) {
					
					e.printStackTrace();
					
				}
			}
		});
	}
}