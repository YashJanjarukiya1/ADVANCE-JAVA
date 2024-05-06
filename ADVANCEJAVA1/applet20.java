/*<applet code="applet20.class" width="500" height="500">
</applet>*/

import java.awt.*;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class applet20 extends Applet
{
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.drawString("wellcome applet...............",50,50);
        g.setColor(Color.red);
        g.drawLine(20,20,20,500);
        g.setColor(Color.green);
        g.drawRect(70,100,30,50);
        g.setColor(Color.blue);
        g.fillRect(70,180,30,30);
    }
}
