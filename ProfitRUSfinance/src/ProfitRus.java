import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Sonal Sharma
 */
public class ProfitRus extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ProfitRus frame = new ProfitRus();
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
    public ProfitRus() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(Color.ORANGE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnNewButton = new JButton("Sign In");
        btnNewButton.setBounds(69, 172, 100, 30);
        contentPane.add(btnNewButton);

        JButton button = new JButton("Sign Up");
        button.addMouseListener(new MouseAdapter() {


            public void mouseClicked(MouseEvent arg0) {
            }
        });
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Registration.main(null);
            }
        });
        button.setBounds(245, 172, 100, 30);
        contentPane.add(button);

        JLabel lblWelcomeToProfit = new JLabel("Welcome to Profit RUS");
        lblWelcomeToProfit.setBounds(143, 26, 206, 30);
        contentPane.add(lblWelcomeToProfit);

        JLabel lblNewUser = new JLabel("New User ?");
        lblNewUser.setBounds(266, 143, 79, 14);
        contentPane.add(lblNewUser);

        JLabel lblForgotPassword = new JLabel("Forgot Password?");
        lblForgotPassword.setBounds(155, 213, 108, 14);
        contentPane.add(lblForgotPassword);
    }
}
