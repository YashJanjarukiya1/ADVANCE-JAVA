import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Program13 extends JFrame {
	JTextField empName,empId,empDep;

	Program13() {
		setTitle("EMPLOYEE REGISTRATION FORM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lbl1 = new JLabel("NAME : ");
		empName = new JTextField(20);
		JLabel lbl2 = new JLabel("ID : ");
		empId = new JTextField(20);
		JLabel lbl3 = new JLabel("DEPARTMENT : ");
		empDep = new JTextField(20);

		add(lbl1);
		add(empName);
		add(lbl2);
		add(empId);
		add(lbl3);
		add(empDep);

		JButton submit = new JButton("SUBMIT");

		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = empName.getText();
				String id = empId.getText();
				String dep = empDep.getText();

				String message = "NAME : " + name + "\n" + "ID : " + id + "\n" + "DEPARTMENT : " + dep;

				JOptionPane.showMessageDialog(submit,message,"EMPLOYEE DETAILS",JOptionPane.INFORMATION_MESSAGE);
			}
		});

		add(submit);
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Program13();
	}
}