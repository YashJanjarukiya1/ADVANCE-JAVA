import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Program6 extends JFrame {
	JLabel lbl;
	JPasswordField p1;

	Program6() {
		setTitle("PASSWORD PROGRAM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		lbl = new JLabel("Password:");
		p1 = new JPasswordField(10);

		p1.setEchoChar('*');

		add(lbl);
		add(p1);

		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Program6();
	}
}