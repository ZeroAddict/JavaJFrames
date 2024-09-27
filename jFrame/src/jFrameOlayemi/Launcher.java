package jFrameOlayemi;

//import jFrameOlayemi.MainWindow;
//import jFrameOlayemi.Runnable;
import javax.swing.*;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainWindow main = new MainWindow();
				main.showWindow();
			}

		});
	}

}



