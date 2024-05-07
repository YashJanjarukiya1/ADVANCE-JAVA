import javax.swing.*;
import java.awt.event.*;

class JBtn_1 extends JFrame implements ActionListener
{
	JButton b1;
	container con;
	JBtn_1(String s)

	{
		super(s);
		setSize(400,400);
		con=getContentPane();
		con.setLayout(new FlowLayout (Flow Layout.LEFT()));

		ImageIcon img=new ImageIcon("    ");
		b1=new JButton("image display",img);
		b1.addActionListener (this);
		con.add(b1);

		addWindow Listener(new addWindowAdapter()
		{
			public void window Closing(Window Event e)
			{
				System.out.println(exit(0));
			}
		});
	}
}

public void actionperfomed(ActionEvent e)
{
	ImageIcon img=new ImageIcon("   ");
	b1.setIcon(img);
	System.out.println(e.getactionCommand());
}

class JBtn_1_img
{
	public static void main(String args[])
	{
		JBtn_1 fb=new JBtn_1("button demo");
		fb.setVisible(true);
		
	}
}