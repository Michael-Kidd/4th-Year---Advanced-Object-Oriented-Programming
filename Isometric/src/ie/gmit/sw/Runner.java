package ie.gmit.sw;

public class Runner {
	public static void main(String[] args) throws Exception {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() { //Template method....
				try {
						
					new GameWindow();
						
				} catch (Exception e) {
					
					e.printStackTrace();
					
				}
			}
		});
	}
}