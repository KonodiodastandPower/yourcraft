package xpackage;

import javax.swing.JTextArea;

public class MyTextArea extends JTextArea {
	public void append(String str) {
		super.append("\n"+str);
	}
}
