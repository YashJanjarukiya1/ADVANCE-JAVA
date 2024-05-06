import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Program5 extends JFrame {
	JButton image;

	Program5() {
		setTitle("IMAGE BUTTON");

		setLayout(new FlowLayout(FlowLayout.LEFT));

		image = new JButton("IMAGE");

		image.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("WELCOME TO ADVANCED JAVA");
            }
        });

		add(image);

		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Program5();
	}
}