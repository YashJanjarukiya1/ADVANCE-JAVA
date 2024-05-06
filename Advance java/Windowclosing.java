import javax.swing.*;
import java.awt.event.*;

class winClose extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
	    System.exit(0);
	}
}

class windowclosing
{
	public static void main(String args[])
	{
        JFrame f=new JFrame();
        winClose wc=new winClose();
        f.addWindowListener(wc);
        f.setTitle("Jframe can close");
        f.setSize(400,400);
        f.setVisible(true);
	}
}

