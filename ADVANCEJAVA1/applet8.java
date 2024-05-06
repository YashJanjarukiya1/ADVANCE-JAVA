/*<applet code="applet8.java" width="500" height="500">
</applet>*/


import java.awt.*;
import javax.swing.*;

public class applet8 extends JApplet
{
    public void init()
    {
        Container Cntnr=getContentPane();
        Cntnr.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel label1=new JLabel("select the fruits:",JLabel.RIGHT);

        ButtonGroup bg=new ButtonGroup();

        JRadioButton rb1=new JRadioButton("APPLE");
        JRadioButton rb2=new JRadioButton("BANANAN");
        JRadioButton rb3=new JRadioButton("KIWI");

        Cntnr.add(label1);
        Cntnr.add(rb1);
        Cntnr.add(rb2);
        Cntnr.add(rb3);

        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);


    }
}