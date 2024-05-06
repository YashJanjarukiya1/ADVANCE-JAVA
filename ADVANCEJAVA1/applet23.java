/*<applet code="applet23.class" width="500" height="500">
</applet>*/

import java.awt.*;
import javax.swing.*;

public class Applet extends JApplet
{
    public void init()
    {
        Container Cntnr=getContainPane();
        Cntnr.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel label1=new JLabel("enter your name:",JLabel.RIGHT);
        JTextField jtf=new JTextField(15);
        JButtton btn=new JButtton("apply");

        Cntnr.add(label1);
        Cntnr.add(jtf);
        Cntnr.add(btn);
    }
}

