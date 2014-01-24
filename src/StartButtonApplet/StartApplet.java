package StartButtonApplet;

import java.applet.Applet;

import javax.swing.JDialog;

public class StartApplet extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	StartApplet() {
//		try {
//			StartButton frame = new StartButton();
//			frame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			frame.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	public void init() {
		try {
			StartButton frame = new StartButton();
			frame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
