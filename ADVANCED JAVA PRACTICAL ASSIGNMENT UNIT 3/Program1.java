import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Program1 extends JFrame {
	Program1() {
		setTitle("WELCOME TO GLS UNIVERSITY");

		JLabel lbl = new JLabel("WELCOME TO GLS UNIVERSITY");
		add(lbl);

		setVisible(true);
		setSize(200,200);
	}

	public static void main(String[] args) {
		new Program1();
	}
}