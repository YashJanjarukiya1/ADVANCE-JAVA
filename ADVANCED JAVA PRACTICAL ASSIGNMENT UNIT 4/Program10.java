import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Program10 extends JFrame {
	JRadioButton rb1,rb2;
	ButtonGroup bg;
	JPanel panel;

	Program10() {
		setTitle("RADION BUTTON PROGRAM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));

		rb1 = new JRadioButton("MALE");
		rb2 = new JRadioButton("FEMALE");

		bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);

		rb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rb1.isSelected()) {
					System.out.println("Selected Gender is MALE");
				}
			}
		});

		rb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rb2.isSelected()) {
					System.out.println("Selected Gender is FEMALE");
				}
			}
		});

		panel.add(rb1);
		panel.add(rb2);

		getContentPane().add(panel,BorderLayout.CENTER);

		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Program10();
	}
}