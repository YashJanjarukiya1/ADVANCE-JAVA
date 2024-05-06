import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Program16 extends JFrame {
	JButton b;
	JLabel lbl;

	Program16() {
		setTitle("FONT CHANGER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		b = new JButton("CHANGE FONT");

		lbl = new JLabel("FONT");
		lbl.setFont(new Font("Arial",Font.PLAIN,24));
		lbl.setHorizontalAlignment(JLabel.CENTER);

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Font currentFont = lbl.getFont();
				String fontName = currentFont.getFontName();
				int fontStyle = currentFont.getStyle();
				int fontStze = currentFont.getSize();

				lbl.setFont(new Font(fontName,Font.BOLD,fontStze + 1));
			}
		});

		add(b);
		add(lbl);

		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Program16();
	}
}