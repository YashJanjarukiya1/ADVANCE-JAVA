import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Program11 extends JFrame {
	JTextField tf1,tf2;
	JButton b1;

	Program11() {
		setTitle("COMPARE PROGRAM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		b1 = new JButton("COMPARE");

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == b1) {
					String str1 = tf1.getText();
					String str2 = tf2.getText();

					if (str1.equals(str2)) {
						JOptionPane.showMessageDialog(b1,"STRINGS ARE EQUAL");
					}
					else {
						JOptionPane.showMessageDialog(b1,"STRINGS ARE NOT EQUAL");
					}
				}
			}
		});

		add(tf1);
		add(tf2);
		add(b1);

		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Program11();
	}
}