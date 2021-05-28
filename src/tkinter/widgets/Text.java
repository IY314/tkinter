package tkinter.widgets;

import tkinter.*;
import java.awt.event.*;
import javax.swing.*;

public final class Text extends Widget {
	public JScrollPane scrollPane;
	
	public Text(Master master, String text, int rows, int columns) {
		super(master);
		this.component = new JTextArea(text, rows, columns);
		this.scrollPane = new JScrollPane(this.component);
	}
	
	public Text(Master master, String text) {
		super(master);
		this.component = new JTextArea(text, 20, 50);
		this.scrollPane = new JScrollPane(this.component);
	}
	
	public Text(Master master, int rows, int columns) {
		super(master);
		this.component = new JTextArea(rows, columns);
		this.scrollPane = new JScrollPane(this.component);
	}
	
	public Text(Master master) {
		super(master);
		this.component = new JTextArea(20, 50);
		this.scrollPane = new JScrollPane(this.component);
	}
	
	public void setEditable(boolean b) {
		((JTextArea) this.component).setEditable(b);
	}
	
	public void setEditable() {
		((JTextArea) this.component).setEditable(!((JTextArea) this.component).isEditable());
	}
	
	public void bind(String key, Function function) {
		((JTextArea) this.component).addKeyListener(new KeyListener() {
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
		return ((JTextArea) this.component).getText();
	}
	
	public void write(String string) {
		((JTextArea) this.component).append(string + "\n");
	}
	
	public void grid(int row, int column, int rowspan, int columnspan) {
		this.constraints.gridx = column;
		this.constraints.gridy = row;
		this.constraints.gridwidth = rowspan;
		this.constraints.gridheight = columnspan;
		this.master.panel.add(this.scrollPane, this.constraints);
	}
	
	public void grid(int row, int column) {
		this.constraints.gridx = column;
		this.constraints.gridy = row;
		this.constraints.gridwidth = 1;
		this.constraints.gridheight = 1;
		this.master.panel.add(this.scrollPane, this.constraints);
	}
}
