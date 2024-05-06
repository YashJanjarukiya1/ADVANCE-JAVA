import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Program4 extends JFrame {
	JButton b1,b2,b3;

	Program4() {
		setTitle("BUTTON TEXT PRINTING PROGRAM");

		setLayout(new FlowLayout(FlowLayout.LEFT));

		b1 = new JButton("BUTTON 1");
		b2 = new JButton("BUTTON 2");
		b3 = new JButton("BUTTON 3");

		b1.setBounds(50,50,100,30);
		b2.setBounds(50,100,100,30);
		b3.setBounds(50,150,100,30);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton clickedButton = (JButton) e.getSource();
				String buttonText = clickedButton.getText();
				System.out.println(buttonText);
			}
		});

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton clickedButton = (JButton) e.getSource();
				String buttonText = clickedButton.getText();
				System.out.println(buttonText);
			}
		});

		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton clickedButton = (JButton) e.getSource();
				String buttonText = clickedButton.getText();
				System.out.println(buttonText);
			}
		});

		add(b1);
		add(b2);
		add(b3);

		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Program4();
	}
}