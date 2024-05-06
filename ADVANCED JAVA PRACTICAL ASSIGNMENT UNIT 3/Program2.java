import javax.swing.*;
import java.awt.event.*;

public class Program2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BUTTON PROGRAM");
        JButton cancelButton = new JButton("CANCEL");
        
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Frame is closed");
                System.exit(0);
            }
        });
        
        frame.getContentPane();
        frame.add(cancelButton);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
