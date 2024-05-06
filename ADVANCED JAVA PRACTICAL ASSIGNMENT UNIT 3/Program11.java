import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Program11 extends JFrame {
	JLabel lbl;
	JButton b;

	Program11() {
		setTitle("FONT CHANGES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		lbl = new JLabel("CHANGE ME");
		b = new JButton("CHANGE FONT");

		add(lbl);
		add(b);
		setVisible(true);
		setSize(400,400);

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Font currentFont = lbl.getFont();
				int currentStyle = currentFont.getStyle();
				int currentSize = currentFont.getSize();

				Font newFont = new Font("Arial",Font.BOLD | Font.ITALIC,currentSize + 2);
				lbl.setFont(newFont);
			}
		});
	}
	public static void main(String[] args) {
		new Program11();
	}
}