package Views;
import javax.swing.*;

public class HomeView {
	public HomeView() {
		JFrame HomeView = new JFrame();
		
		JLabel minLabel = new JLabel("Welcome to MyHotel");
		minLabel.setBounds(120,120, 180,90);
		
		HomeView.add(minLabel);
		
		HomeView.setTitle("Home");
		HomeView.setSize(300,300);
		HomeView.setLayout(null); //To be in the z-index principal
		HomeView.setVisible(true);
		
	}
}
