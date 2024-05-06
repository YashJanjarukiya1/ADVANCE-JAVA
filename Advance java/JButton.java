import javax.swing.*;
import java.awt.event.*;

class JButton extends JFrame
{
	JButton b1,b2,b3;
	Container con;
	JButn_1 (String s)
	{
	  super (s);
	  setSize(400,450);
	  con=getContentPane();
	  con.setLayout(new FlowLayout(FlowLayout.LEFT));
	  b1=new JButton("one");
	  b2=new JButton("two");
	  b3=new JButton("three");

	  con.add(b1);
	  con.add(b2);
	  con.add(b3);

	  addwindowListener(new windowAdapter()
	  {
          public void windowClosing(windowevent we)
          {
          	System.exit(0);
          }
	  });
	}
}
class JButton
{
	public static void main(String args[])
	{
		JButn_1 bt=new JButn_1("button demo");
		bt.setVisible(true);
	}
}