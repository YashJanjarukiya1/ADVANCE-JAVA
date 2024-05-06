/*<applet code="applet3.class" width="500" height="500">
    </applet>*/ 

    import java.applet.Applet;
    import java.awt.Graphics;

    public class applet3 extends Applet
    {
        public void paint(Graphics g)
        {
            g.drawString("applet started:",100,100);
            ShowStatus("this is shown in the status window..........");
        }
    }
