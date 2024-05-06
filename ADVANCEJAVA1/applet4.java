/*<applet code="applet4.class" width="500" height="500">
    </applet>*/ 

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class applet4 extends Applet
{
    public void paint(Graphics g)
    {
        g.setColor(Color.green);
        g.drawString("welcome",50,50);
        g.setColor(Color.red);
        g.drawLine(20,20,20,300);
        g.setColor(Color.green);
        g.drawRect(70,100,30,50);
        g.setColor(Color.blue);
        g.fillRect(70,180,30,30);
    }
}
