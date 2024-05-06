import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Program6 extends JFrame {
	JButton b1,b2;

	Program6() {
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		ImageIcon img1 = new ImageIcon("img1.png");
		ImageIcon img2 = new ImageIcon("img2.jpeg");

		b1 = new JButton(img1);
		b2 = new JButton(img2);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(b1);
				add(b2);
				revalidate();
				repaint();
			}
		});
		add(b1);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Program6();
	}
}