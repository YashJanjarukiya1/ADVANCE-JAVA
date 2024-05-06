/*<applet code="applet1.class" width="500" height="500">
    </applet>*/

    import java.awt.*;
    import java.applet.*;

    public class applet1 extends Applet

    {
        String msg=" ";
        public void init()
        {
            msg="hello sybca:";
        }

        public void start()
        {
            msg=msg+"well come applet";
        }

        public void paint(Graphics g)
        {
            g.drawString (msg,100,100);
        }
    }
