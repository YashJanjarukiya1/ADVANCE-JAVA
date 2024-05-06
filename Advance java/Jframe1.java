import javax.swing.*;

class Jframe1
{
	public static void main(String[] args)
	{
		JFrame f=new JFrame("blank page");
		JRootPane root=f.getRootPane();

		JMenuBar bar=new JMenuBar();
		JMenu menu=new JMenu("file");
		bar.add(menu);
		menu.add("open");
		menu.add("close");


		JMenu menu1=new JMenu("view");
		bar.add(menu1);
		menu1.add("add");
		menu1.add("sub");

		JMenu menu2=new JMenu("contect us");
		bar.add(menu2);
		menu2.add("9106236281");

		root.setJMenuBar(bar);

		f.setVisible(true);
	}
}
