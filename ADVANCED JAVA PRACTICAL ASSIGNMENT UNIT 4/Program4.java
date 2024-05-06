import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program4 extends JFrame {
    JScrollBar scrollBar;
    JLabel label;

    Program4() {
        setTitle("ScrollBar Program");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        scrollBar = new JScrollBar(JScrollBar.VERTICAL, 0, 0, 0, 100);
        scrollBar.addAdjustmentListener(new AdjustmentListener(){
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("Vertical ScrollBar Value is: " + scrollBar.getValue());
            }
        });

        label = new JLabel("Vertical Scrollbar Value is: " + scrollBar.getValue(), JLabel.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(scrollBar, BorderLayout.NORTH);
        panel.add(label, BorderLayout.CENTER);

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Program4();
    }
}
