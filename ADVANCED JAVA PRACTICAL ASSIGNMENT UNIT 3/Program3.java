import javax.swing.*;
import java.awt.event.*;

public class Program3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame Demo");
        JButton button = new JButton("CLICK ME");
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("WELCOME TO ADVANCED JAVA");
            }
        });
        
        frame.getContentPane();
        frame.add(button);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
