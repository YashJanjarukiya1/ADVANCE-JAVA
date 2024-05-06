import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program10 extends JFrame {
	Program10() {
		setTitle("MOUSE EVENT");
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Graphics g = getGraphics();
				g.setColor(Color.BLUE);
				g.fillOval(e.getX(),e.getY(),30,30);
			}
		});
	}

	public static void main(String[] args) {
		new Program10();
	}
}