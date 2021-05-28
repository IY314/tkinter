package tkinter.widgets;

import java.awt.*;
import tkinter.Master;

public class Widget {
	public Master master;
	public GridBagConstraints constraints = new GridBagConstraints();
	public Component component;
	
	public Widget(Master master) {
		this.master = master;
		this.constraints.fill = GridBagConstraints.BOTH;
	}
	
	public void grid(int row, int column, int rowspan, int columnspan) {
		this.constraints.gridx = column;
		this.constraints.gridy = row;
		this.constraints.gridwidth = rowspan;
		this.constraints.gridheight = columnspan;
		this.master.panel.add(this.component, this.constraints);
	}
	
	public void grid(int row, int column) {
		this.constraints.gridx = column;
		this.constraints.gridy = row;
		this.constraints.gridwidth = 1;
		this.constraints.gridheight = 1;
		this.master.panel.add(this.component, this.constraints);
	}
}
