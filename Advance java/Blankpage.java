import javax.swing.*;

class Blankpage
{
	public static void main(String args[])
	{
		JFrame f=new JFrame("blank page");
		f.setSize(400,400);
		f.setVisible(true);

		JRootPane root=f.getRootPane();
		JMenuBar bar=new JMenuBar();

		JMenu menu=new JMenu("file");
		bar.add(menu);
		menu.add("open");
		menu.add("close");

		JMenu menu1=new JMenu("aboutus");
		bar.add(menu1);
		menu1.add("open");
		menu1.add("close");

		JMenu menu2=new JMenu("contectus");
		bar.add(menu2);
		menu2.add("open");
		menu2.add("close");

		root.setJMenuBar(bar);


	}
}