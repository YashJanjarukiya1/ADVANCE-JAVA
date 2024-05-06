import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program17 extends JFrame {

    JTextField firstNameField, lastNameField, jobTitleField;
    JButton searchButton;
    JLabel firstNameLabel, lastNameLabel, jobTitleLabel;

    Program17() {
        setTitle("Employee Information");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        firstNameLabel = new JLabel("First Name:");
        lastNameLabel = new JLabel("Last Name:");
        jobTitleLabel = new JLabel("Job Title:");
        firstNameField = new JTextField();
        lastNameField = new JTextField();
        jobTitleField = new JTextField();
        searchButton = new JButton("Search");

        add(firstNameLabel);
        add(firstNameField);
        add(lastNameLabel);
        add(lastNameField);
        add(jobTitleLabel);
        add(jobTitleField);
        add(new JLabel());
        add(searchButton);

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();

                String jobTitle = getJobTitleFromDataSource(firstName, lastName);

                jobTitleField.setText(jobTitle);
            }
        });

        setVisible(true);
    }

    private String getJobTitleFromDataSource(String firstName, String lastName) {
        return "Software Engineer";
    }

    public static void main(String[] args) {
    	new Program17();
    }
}
