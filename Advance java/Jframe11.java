import javax.swing.*;
import java.awt.event.*;

class winClose extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
	   System.exit(0);
	}
}

class Jframe11
{
	public static void main(String args[])
	{
		JFrame fb=new JFrame();
		windowClose wc=new windowClose();
		fb.addwindowListener(wc);

		fb.setSize(400,450);
		fb.setVisible(true);
	}

}