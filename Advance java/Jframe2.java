import javax.swing.*;
import java.awt.event.*;

class Windowclose extends WindowAdapter
{
	public void Windowclosing(WindowEvent we)
	{
	   System.exit(0);
	}

}

class Jframe2
{
	public static void main(String args[])
	{
		JFrame j=new JFrame("hello");
		Windowclose w=new Windowclose();
		j.addWindowListener(w);

		j.setSize(400,400);
		j.setVisible(true);

	}
}