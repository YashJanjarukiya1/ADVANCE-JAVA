import javax.swing.*;

class Jrootpane1
{
    public static void main(String args[])
    {
        JFrame f=new JFrame("yash java");
        JRootPane root=new JRootPane();

        JMenuBar bar= new JMenuBar();
        JMenu menu1=new JMenu("view");
        bar.add(menu1);
        menu1.add("open");
        menu1.add("close");

        JMenu menu2=new JMenu("contact us");
        bar.add(menu2);
        menu2.add("9106236281");

        JMenu menu3=new JMenu("about us");
        bar.add(menu3);
        menu3.add("hello everyone welcome back our site");

        root.setJMenuBar(bar);

        f.setVisible(true);
    }
}