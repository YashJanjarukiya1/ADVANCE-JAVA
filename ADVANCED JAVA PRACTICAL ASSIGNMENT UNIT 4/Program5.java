import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Program5 extends JFrame {
	JTextField tf1,tf2,tf3;
	JToggleButton b1,b2;

	Program5() {
		setTitle("CACULATOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);

		b1 = new JToggleButton("+");
		b2 = new JToggleButton("-");

		tf3.setEditable(false);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(tf1.getText());
				int num2 = Integer.parseInt(tf2.getText());

				int result = num1 + num2;

				tf3.setText(String.valueOf(result));
			}
		});

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(tf1.getText());
				int num2 = Integer.parseInt(tf2.getText());

				int result = num1 - num2;

				tf3.setText(String.valueOf(result));
			}
		});

		add(tf1);
		add(tf2);
		add(tf3);
		add(b1);
		add(b2);
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Program5();
	}
}