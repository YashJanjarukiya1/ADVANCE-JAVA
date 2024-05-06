import javax.swing.*;

public class Program3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Example");

        DefaultListModel<String> model = new DefaultListModel<>();

        model.addElement("Item 1");
        model.addElement("Item 2");
        model.addElement("Item 3");
        model.addElement("Item 4");

        JList<String> list = new JList<>(model);

        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));

        frame.add(new JScrollPane(list));

        frame.setSize(300, 200);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
