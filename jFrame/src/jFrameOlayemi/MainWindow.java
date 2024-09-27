package jFrameOlayemi;

import javax.swing.JFrame;

public class MainWindow {

	private JFrame window;
	
	public  MainWindow () {
		window = new JFrame();
		
		window.setTitle("My first JFrame");
//		JFrame window("My first j-frame");
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setSize(500, 650);
		window.setLocationRelativeTo(null);
		showWindow();
	}
	
	public void showWindow () {
		window.setVisible(false);
	}
}
