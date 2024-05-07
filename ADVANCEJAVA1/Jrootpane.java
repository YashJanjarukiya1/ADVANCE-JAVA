import javax.Swing.*;

class Jrootpane
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
        menu1.add("add");
        menu1.add("sub");
        root.setJMenuBar(bar);

        f.setVisible(true); 
    }
}