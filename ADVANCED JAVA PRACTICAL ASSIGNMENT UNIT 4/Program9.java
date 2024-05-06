import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Program9 extends JFrame {
	JMenuItem item1,item2,item3,item4,item5;
	JMenu menu,subMenu;
	JMenuBar bar;

	Program9() {
		setTitle("MENU PROGRAM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		bar = new JMenuBar();
		menu = new JMenu("Menu");
		item1 = new JMenuItem("Item 1");
		item2 = new JMenuItem("Item 2");
		item3 = new JMenuItem("Item 3");
		item4 = new JMenuItem("Item 4");
		item5 = new JMenuItem("Item 5");
		subMenu = new JMenu("Sub Menu");
		
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		//menu.addSeparator();
		subMenu.add(item4);
		subMenu.add(item5);
		menu.add(subMenu);

		bar.add(menu);
		setJMenuBar(bar);
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Program9();
	}
}