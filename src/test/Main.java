package test;

import tkinter.Master;
import tkinter.widgets.*;
import javax.swing.*;

public class Main {
	public static int i = 0;
	
	public static void main(String[] args) {
		Master master = new Master();
		Button exitBtn = new Button(master, "Exit", () -> System.exit(0));
		Entry inputEntry = new Entry(master);
		inputEntry.bind("\n", () -> System.out.println("Ran"));
		Text outputText = new Text(master);
		// outputText.setEditable();
		Button clearInputBtn = new Button(master, "Clear Input", () -> ((JTextField) inputEntry.component).setText(""));
		Button clearOutputBtn = new Button(master, "Clear Output", () -> ((JTextArea) outputText.component).setText(""));
		Button runBtn = new Button(master, "Run", () -> System.out.println("Ran"));
		
		exitBtn.grid(0, 0);
		clearInputBtn.grid(0, 1);
		clearOutputBtn.grid(0, 2);
		inputEntry.grid(0, 3);
		runBtn.grid(0, 4);
		outputText.grid(1, 0, 5, 1);
		master.pack("MultiClip (test)");
	}
}
