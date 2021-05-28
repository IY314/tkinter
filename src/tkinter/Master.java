package tkinter;

import java.awt.GridBagLayout;
import javax.swing.*;

public class Master {
	public JPanel panel = new JPanel(new GridBagLayout());
	
	public void pack(String title) {
		JFrame frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this.panel);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void pack() {
		JFrame frame = new JFrame("Swing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this.panel);
		frame.pack();
		frame.setVisible(true);
	}
}
