import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Program14 extends JFrame {
	JTextField tf1,tf2;

	Program14() {
		setTitle("STRING CONCATENATION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		tf1 = new JTextField(10);
		tf2 = new JTextField(10);

		JButton b = new JButton("CONCATENATE");

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("CONCATENATE")) {
					String str1 = tf1.getText();
					String str2 = tf2.getText();
					String con = str1 + " " + str2;
					JOptionPane.showMessageDialog(b,"CONCATENATED STRING : " + con);
				}
			}
		});

		add(tf1);
		add(tf2);
		add(b);

		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Program14();
	}
}