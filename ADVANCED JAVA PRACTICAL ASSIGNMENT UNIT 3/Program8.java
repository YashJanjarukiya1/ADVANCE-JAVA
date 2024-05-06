import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program8 extends JFrame {
	private int squareSize = 50;

	Program8() {
		setTitle("MOUSE EVENT");
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Graphics g = getGraphics();

				int mouseX = e.getX();
				int mouseY = e.getY();

				g.setColor(Color.BLUE);
				g.fillRect(mouseX - squareSize/2,mouseY - squareSize/2,squareSize,squareSize);
			}
		});
	}

	public static void main(String[] args) {
		new Program10();
	}
}