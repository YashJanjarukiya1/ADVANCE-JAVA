/*<applet code="applet22.class" width="500" height="500">
</applet>*/

import java.awt.*;
import java.awt.Color;
import java.applet.Applet;
import java.awt.Graphics;

public class applet22 extends Applet
{
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.drawOval(40,40,120,150);
        g.setColor(Color.green);
        g.drawOval(57,75,30,20);
        g.drawOval(110,75,30,20);
        g.drawOval(85,100,30,30);
        g.drawOval(25,92,15,30);
        g.drawOval(160,92,15,30);
        g.fillArc(60,125,80,40,180,180);
    }
}
