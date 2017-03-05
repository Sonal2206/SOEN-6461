import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * @author Sonal Sharma
 */
public class Login extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login frame = new Login();
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
    public Login() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(Color.ORANGE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblProfitRus = new JLabel("Profit RUS");
        lblProfitRus.setBounds(176, 11, 72, 14);
        contentPane.add(lblProfitRus);

        JLabel lblLogin = new JLabel("LOGIN");
        lblLogin.setBounds(40, 68, 46, 14);
        contentPane.add(lblLogin);

        JLabel lblEmail = new JLabel("Email");
        lblEmail.setBounds(40, 113, 46, 14);
        contentPane.add(lblEmail);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(40, 163, 100, 14);
        contentPane.add(lblPassword);

        textField = new JTextField();
        textField.setBounds(159, 110, 162, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        JButton btnSignIn = new JButton("SIGN IN");
        btnSignIn.setBounds(106, 207, 89, 23);
        contentPane.add(btnSignIn);

        passwordField = new JPasswordField();
        passwordField.setBounds(159, 160, 120, 20);
        contentPane.add(passwordField);
    }

}
