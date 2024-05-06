import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Program7 extends JFrame {
	JTextArea ta;
	JLabel lbl;

	Program7() {
		setTitle("JTEXTAREA PROGRAM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		ta = new JTextArea(4,5);
		lbl = new JLabel("LABEL:");

		add(lbl);
		add(ta);

		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Program7();
	}
}