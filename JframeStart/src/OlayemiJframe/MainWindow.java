package OlayemiJframe;
import javax.awt
import javax.swing.JFrame;

public class MainWindow {
	
	private JFrame window;
	
	public MainWindow() {
		window = new JFrame();
		window.setTitle("My First JFrame Window");
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setSize(650, 700);
		window.setLocationRelativeTo(null);
		showWindow();
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//	}
	public void showWindow() {
		window.setVisible(true)
	}

}
