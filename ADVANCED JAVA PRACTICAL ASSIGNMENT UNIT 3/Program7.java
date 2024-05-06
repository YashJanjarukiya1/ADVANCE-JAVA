import java.awt.*;
import java.awt.event.*;

public class Program7 extends Frame implements MouseListener {
    
    public Program7() {
        addMouseListener(this);
        setSize(300, 300);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Program7();
    }
    
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked");
    }
    
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
    }
    
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
    }
    
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
    }
    
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
    }
}
