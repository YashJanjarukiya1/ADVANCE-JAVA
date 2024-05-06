/*<applet code="applet2.class" width="500" height="500">
    </applet>*/

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class applet2 extends Applet
{
    public void paint(Graphics g)
    {
        SetBackground(Color.red);
        g.SetColor(Color.yellow);
        g.drawString("foreground color set to yellow",50,50);
        g.drawString("foreground color set to yellow",50,150);
    }
}
