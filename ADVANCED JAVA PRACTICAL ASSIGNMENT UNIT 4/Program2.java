import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Program2 extends JFrame {
	JCheckBox box1,box2;

	Program2() {
		setTitle("CHECKBOX PROGRAM");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER));

		box1 = new JCheckBox("C++");
		box2 = new JCheckBox("Java");

		box1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JCheckBox source = (JCheckBox) e.getSource();
				String choice = source.getText();

				if (source.isSelected()) {
					System.out.println(choice + " is selected.");
				}
				else {
					System.out.println(choice + " is deselected.");
				}
			}
		});
		box2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JCheckBox source = (JCheckBox) e.getSource();
				String choice = source.getText();

				if (source.isSelected()) {
					System.out.println(choice + " is selected.");
				}
				else {
					System.out.println(choice + " is deselected.");
				}
			}
		});

		add(box1);
		add(box2);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Program2();
	}
}