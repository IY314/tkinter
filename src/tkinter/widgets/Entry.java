package tkinter.widgets;

import tkinter.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public final class Entry extends Widget {

	public Entry(Master master, String text) {
		super(master);
		this.component = new JTextField(text, 20);
	}
	
	public Entry(Master master, String text, int columns) {
		super(master);
		this.component = new JTextField(text, columns);
	}
	
	public Entry(Master master) {
		super(master);
		this.component = new JTextField(20);
	}
	
	public Entry(Master master, int columns) {
		super(master);
		this.component = new JTextField(columns);
	}
	
	public void bind(String key, Function function) {
		((JTextField) this.component).addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				if (key.equals(String.valueOf(e.getKeyChar()))) {
					function.call();
				}
			}

			public void keyPressed(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
		});
	}
	
	public String get() {
		return ((JTextField) this.component).getText();
	}
}
