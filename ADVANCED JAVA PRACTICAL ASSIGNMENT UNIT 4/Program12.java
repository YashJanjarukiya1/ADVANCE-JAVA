import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Program12 extends JFrame {
	JTextField customerName,customerEmail,customerPhone;

	Program12() {
		setTitle("CUSTOMER REGISTRATION FORM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lbl1 = new JLabel("NAME : ");
		customerName = new JTextField(20);
		JLabel lbl2 = new JLabel("EMAIL : ");
		customerEmail = new JTextField(20);
		JLabel lbl3 = new JLabel("PHONE : ");
		customerPhone = new JTextField(20);

		add(lbl1);
		add(customerName);
		add(lbl2);
		add(customerEmail);
		add(lbl3);
		add(customerPhone);

		JButton submit = new JButton("SUBMIT");

		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = customerName.getText();
				String email = customerEmail.getText();
				String phone = customerPhone.getText();

				String message = "NAME : " + name + "\n" + "EMAIL : " + email + "\n" + "PHONE : " + phone;

				JOptionPane.showMessageDialog(submit,message,"REGISTRATION DETAILS",JOptionPane.INFORMATION_MESSAGE);
			}
		});

		add(submit);
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Program12();
	}
}