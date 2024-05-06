import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Program1 {
	JFrame frame;
	JToggleButton tb;

	Program1() {
		frame = new JFrame();

		frame.setTitle("ON AND OFF PROGRAM");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tb = new JToggleButton("OFF");
		tb.setBounds(100,50,100,50);

		frame.setLayout(new FlowLayout(FlowLayout.CENTER));

		tb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if (tb.isSelected()) {
					System.out.println("BUTTON IS ON");
				}
				else {
					System.out.println("BUTTON IS OFF");
				}
			}
		});

		frame.setSize(300,300);
		frame.add(tb);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Program1();
	}
}