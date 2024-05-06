/*<applet code="applet24.class" width="500" height="500">
</applet>*/

import java.awt.*;
import javax.swing.*;

public class Applet1 extends JApplet
{
    public void init()
    {
        Container Cntnr=getContainPane();
        Cntnr.setLayout(new FlowLayout(FlowLayout.RIGHT));

        JLabel label1=new JLabel("select the fruits:",JLabel.RIGHT);

        ButtonGroup bg=new ButtoGroup();

        JRadioButton rb1=new JRadioButton("apple");
        JRadioButton rb2=new JRadioButton("banana");
        JRadioButton rb3=new JRadioButton("guvava");

        Cntnr.add(label1);
        Cntnr.add(rb1);
        Cntnr.add(rb2);
        Cntnr.add(rb3);

        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);


    }
}
