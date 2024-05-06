/*<applet code="applet7.java" width="500" height="500">
</applet>*/

import java.applet.Applet;
import javax.swing.*;
import java.awt.*;

public class applet7 extends JApplet
{
    public void init()
    {
        Container Cntnr=getContentPane();
        Cntnr.setLayout (new FlowLayout(FlowLayout.LEFT));

        JLabel label1=new JLabel("enter your name:",JLabel.RIGHT);
        JTextField jtf=new JTextField(15);
        JButton btn=new JButton("APPLY");

        Cntnr.add(label1);
        Cntnr.add(jtf);
        Cntnr.add(btn);
    }
}

