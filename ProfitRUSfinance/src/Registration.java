import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Sonal Sharma
 */
public class Registration extends JFrame {

    private JPanel contentPane;
    private JPasswordField passwordField;
    private JPasswordField passwordField_1;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Registration frame = new Registration();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Registration() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(Color.ORANGE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblProfitRus = DefaultComponentFactory.getInstance().createTitle("Profit RUS");
        lblProfitRus.setBounds(160, 11, 88, 14);
        contentPane.add(lblProfitRus);

        JLabel lblFirstName = DefaultComponentFactory.getInstance().createLabel("First Name ");
        lblFirstName.setBounds(36, 55, 88, 14);
        contentPane.add(lblFirstName);

        JLabel lblLastName = DefaultComponentFactory.getInstance().createLabel("Last Name");
        lblLastName.setBounds(36, 80, 88, 14);
        contentPane.add(lblLastName);

        JLabel lblEmailAddress = DefaultComponentFactory.getInstance().createLabel("Email Address");
        lblEmailAddress.setBounds(36, 105, 88, 14);
        contentPane.add(lblEmailAddress);

        JLabel lblPassword = DefaultComponentFactory.getInstance().createLabel("Password");
        lblPassword.setBounds(36, 137, 88, 14);
        contentPane.add(lblPassword);

        JLabel lblConfirmPassword = DefaultComponentFactory.getInstance().createLabel("Confirm Password");
        lblConfirmPassword.setBounds(36, 162, 113, 14);
        contentPane.add(lblConfirmPassword);

        passwordField = new JPasswordField();
        passwordField.setBounds(159, 134, 73, 20);
        contentPane.add(passwordField);

        passwordField_1 = new JPasswordField();
        passwordField_1.setBounds(159, 159, 73, 20);
        contentPane.add(passwordField_1);

        textField = new JTextField();
        textField.setBounds(160, 78, 114, 17);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(160, 52, 114, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(158, 102, 179, 20);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        JButton btnNewButton = new JButton("SUBMIT");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // code after
            }
        });
        btnNewButton.setBounds(108, 203, 89, 23);
        contentPane.add(btnNewButton);
    }
}
