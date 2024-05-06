import javax.swing.*;

class JRootpane
{
	public static void main(String args[])
	{
		JFrame f=new JFrame();
		JRootPane root=f.getRootPane();

		JMenuBar bar=new JMenuBar();

		JMenu menu=new JMenu("file");
		bar.add(menu);
		menu.add("open");
		menu.add("close");

		JMenu menu1=new JMenu("view");
		bar.add(menu1);
		menu1.add("open");
		menu1.add("close");

		root.setJMenuBar(bar);

		f.setVisible(true);
	}
}