package tkinter.widgets;

import javax.swing.JButton;
import tkinter.*;

public final class Button extends Widget {
	public Function function;
	public JButton component;
	
	public Button(Master master, String text, Function function) {
		super(master);
		this.function = function;
		this.component = new JButton(text);
		this.component.addActionListener(e -> this.function.call());
	}
	
	public void trigger() {
		this.function.call();
	}

}
