import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Program9 extends JFrame {
	JButton b1;
	JLabel lbl1;

	Program9() {
		setTitle("LABEL PROGRAM");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b1 = new JButton("CLICK ME");

		lbl1 = new JLabel("");

		setLayout(new FlowLayout(FlowLayout.LEFT));

		add(b1);
		add(lbl1);
		setVisible(true);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == b1) {
					lbl1.setText("PARTH");
				}
			}
		});
	}

	public static void main(String[] args) {
		new Program9();
	}
}