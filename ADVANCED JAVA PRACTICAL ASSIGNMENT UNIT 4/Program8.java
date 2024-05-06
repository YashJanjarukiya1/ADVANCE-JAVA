import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Program8 extends JFrame {
	Program8() {
		setTitle("COMBOBOX PROGRAM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		String[] options = {"India","Aus","U.S.A","England","Newzealand"};
		JComboBox<String> box = new JComboBox<>(options);
		box.setSelectedIndex(2);

		add(box);

		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Program8();
	}
}