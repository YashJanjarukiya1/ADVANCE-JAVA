import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Program15 extends JFrame {
	JButton b;
	JLabel lbl;

	Program15() {
		setTitle("DISPLAY FAVOURITE CRICKET TEAM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		b = new JButton("DISPLAY FAVOURITE CRICKET TEAM");

		lbl = new JLabel();
		lbl.setFont(new Font("Arial",Font.BOLD,24));

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl.setText("INDIAN CRICKET TEAM");
			}
		});

		add(b);
		add(lbl);

		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Program15();
	}
}