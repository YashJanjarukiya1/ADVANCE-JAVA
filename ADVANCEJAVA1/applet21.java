/*<applet code="applet21.class" width="500" height="500">
</applet>*/

import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;
import java.applet.Applet;

public class applet21 extends Applet
{
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.drawOval(40,50,30,180);
        g.fillOval(40,50,30,180);
        g.setColor(Color.green);
        g.drawLine(70,80,50,30);
        g.setColor(Color.black);
        g.fillRect(180,120,50,30);
        g.drawRect(180,120,50,30);
    }
}
